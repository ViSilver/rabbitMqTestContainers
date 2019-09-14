package com.example.spring.rabbitmq.bdd.container;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomRabbitMqContainer {

    private static final GenericContainer CONTAINER;

    static {
        CONTAINER = new GenericContainer("rabbitmq:management")
                .withExposedPorts(5672)
                .waitingFor(Wait.forLogMessage("", 1));
    }

}
