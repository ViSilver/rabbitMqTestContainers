package com.example.spring.rabbitmq.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerEndpoint;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableRabbit
@Configuration
@RequiredArgsConstructor
public class RabbitMqConfig implements RabbitListenerConfigurer {

    @Override
    public void configureRabbitListeners(final RabbitListenerEndpointRegistrar registrar) {
//        SimpleRabbitListenerEndpoint endpoint = new SimpleRabbitListenerEndpoint();
//        endpoint.setQueueNames("hello");
//        endpoint.setId("hello-id");
//        endpoint.setMessageListener();
//        registrar.registerEndpoint(endpoint, myRabbitListenerContainerFactory(connectionFactory));
    }

    @Bean
    public RabbitListenerContainerFactory myRabbitListenerContainerFactory(final ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory containerFactory = new SimpleRabbitListenerContainerFactory();
        containerFactory.setConnectionFactory(connectionFactory);
        return containerFactory;
    }

//    @Bean
//    public ConnectionFactory rabbitMqConnectionFactory() {
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//        connectionFactory.setAddresses("localhost:5672");
//        connectionFactory.setCacheMode(CachingConnectionFactory.CacheMode.CONNECTION);
//        return connectionFactory;
//    }
}
