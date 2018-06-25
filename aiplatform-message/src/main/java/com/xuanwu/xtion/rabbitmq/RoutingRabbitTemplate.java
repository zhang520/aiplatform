package com.xuanwu.xtion.rabbitmq;

import com.xuanwu.xtion.common.RabbitConfig;
import org.springframework.amqp.rabbit.connection.SimpleResourceHolder;
import org.springframework.amqp.rabbit.core.RabbitOperations;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RoutingRabbitTemplate {

    private final Map<String, RabbitOperations> rabbitOperationsHolder = new ConcurrentHashMap<>();

    public RoutingRabbitTemplate(RabbitRoutingConnectionFactory rabbitRoutingConnectionFactory) {
        rabbitTemplate = new RabbitTemplate(rabbitRoutingConnectionFactory);
    }
    private final RabbitTemplate rabbitTemplate;

    /**
     * 获取原始RabbitTemplate
     * 使用：
     * SimpleResourceHolder.bind(rabbitTemplate.getConnectionFactory(), rabbitConfig);
     * rabbitTemplate.  //TODO 做相关操作
     * SimpleResourceHolder.unbind(rabbitTemplate.getConnectionFactory()); // 必须
     * @return
     */
    public RabbitTemplate getOriginalRabbitTemplate() {
        return this.rabbitTemplate;
    }

    /**
     * 获取rabbitOperations
     * @param rabbitConfig
     * @return
     */
    public RabbitOperations getRabbitOperations(RabbitConfig rabbitConfig) {
        RabbitOperations rabbitOperations = rabbitOperationsHolder.get(rabbitConfig.toString());
        if (rabbitOperations == null) {
            synchronized (rabbitOperationsHolder) {
                rabbitOperations = rabbitOperationsHolder.get(rabbitConfig.toString());
                if (rabbitOperations == null) {
                    rabbitOperations = (RabbitOperations) Proxy.newProxyInstance(rabbitTemplate.getClass().getClassLoader(), new Class[]{RabbitOperations.class}, (proxy, method, args) -> {
                        SimpleResourceHolder.bind(rabbitTemplate.getConnectionFactory(), rabbitConfig);
                        Object result = method.invoke(rabbitTemplate, args);
                        SimpleResourceHolder.unbind(rabbitTemplate.getConnectionFactory());
                        return result;
                    });
                    rabbitOperationsHolder.put(rabbitConfig.toString(), rabbitOperations);
                }
            }
        }
        return rabbitOperations;
    }
}
