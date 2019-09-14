package com.example.spring.rabbitmq.bdd;

import com.example.spring.rabbitmq.bdd.container.CustomRabbitMqContainer;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.RabbitMQContainer;

@Configuration
@EnableAutoConfiguration
public class TestConfig {

    private static final RabbitMQContainer rabbitMQContainer = CustomRabbitMqContainer.CONTAINER;

    static {
        rabbitMQContainer.start();
    }

    @Bean
    public ConnectionFactory rabbitMqConnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses("localhost:" + rabbitMQContainer.getMappedPort(5672));
        connectionFactory.setCacheMode(CachingConnectionFactory.CacheMode.CONNECTION);
        return connectionFactory;
    }
}
