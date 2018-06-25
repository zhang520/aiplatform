package com.xuanwu.xtion.rabbitmq.impl;

import com.xuanwu.xtion.common.RabbitConfig;
import com.xuanwu.xtion.rabbitmq.ConnectionFactoryInitializer;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;

public class SimpleConnectionFactoryInitializer implements ConnectionFactoryInitializer {

    @Override
    public ConnectionFactory initialConnectionFactory(RabbitConfig rabbitConfig) {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(rabbitConfig.getHost());
        connectionFactory.setPort(rabbitConfig.getPort());
        connectionFactory.setUsername(rabbitConfig.getUsername());
        connectionFactory.setPassword(rabbitConfig.getPassword());
        connectionFactory.setPublisherConfirms(rabbitConfig.getPublisherConfirms() == null ? false : rabbitConfig.getPublisherConfirms());
        return connectionFactory;
    }
}
