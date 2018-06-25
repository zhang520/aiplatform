package com.xuanwu.xtion;

import com.xuanwu.xtion.common.RabbitConfig;
import com.xuanwu.xtion.rabbitmq.RoutingRabbitTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit4Test {

    @Autowired
    private RoutingRabbitTemplate routingRabbitTemplate;

    @Test
    public void testSend() {

        RabbitConfig rabbitConfig = new RabbitConfig("127.0.0.1", 5672, "guest", "guest", "/api/");

        RabbitOperations rabbitOperations = routingRabbitTemplate.getRabbitOperations(rabbitConfig);

        rabbitOperations.convertAndSend("hello-queue", "nihao");
    }

    @Test
    public void testRecive() {
        RabbitConfig rabbitConfig = new RabbitConfig("127.0.0.1", 5672, "guest", "guest", "/api/");

        RabbitOperations rabbitOperations = routingRabbitTemplate.getRabbitOperations(rabbitConfig);

        Object object = rabbitOperations.receiveAndConvert("hello-queue");
        System.out.println(object.toString());
    }

    @Test
    public void testX() {
        int x = 1, y = 3;
        x = x ^ y;
        System.out.print(x);
    }
}
