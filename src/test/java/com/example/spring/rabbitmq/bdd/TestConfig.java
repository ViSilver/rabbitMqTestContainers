package com.example.spring.rabbitmq.bdd;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.RabbitMQContainer;

@TestConfiguration
public class TestConfig {

//    private static final RabbitMQContainer rabbitMqContainer;
//
//    static {
//        rabbitMqContainer = new RabbitMQContainer();
//        rabbitMqContainer.start();
//    }

    @Bean
    public RabbitMQContainer rabbitMQContainer() {
        return new RabbitMQContainer();
    }



}
