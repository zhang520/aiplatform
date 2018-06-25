package com.xuanwu.xtion;

import com.xuanwu.xtion.rabbitmq.RabbitRoutingConnectionFactory;
import com.xuanwu.xtion.rabbitmq.RoutingRabbitTemplate;
import com.xuanwu.xtion.rabbitmq.impl.SimpleConnectionFactoryInitializer;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Mr.zhang on 2018/6/24.
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    @Bean
    public Queue initQueue() {
        return new Queue("hello-world");
    }

    @Bean
    public RoutingRabbitTemplate initRoutingRabbitTemplate() {
        return new RoutingRabbitTemplate(new RabbitRoutingConnectionFactory(new SimpleConnectionFactoryInitializer()));
    }

    public static void main(String... arg) {
        SpringApplication.run(Application.class, arg);
    }
}
