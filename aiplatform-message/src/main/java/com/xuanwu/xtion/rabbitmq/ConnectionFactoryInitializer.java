package com.xuanwu.xtion.rabbitmq;

import com.xuanwu.xtion.common.RabbitConfig;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

public interface ConnectionFactoryInitializer {

    public ConnectionFactory initialConnectionFactory(RabbitConfig rabbitConfig);

}
