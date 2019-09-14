package com.example.spring.rabbitmq.bdd.stepdef;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.RabbitMQContainer;

@Slf4j
@RequiredArgsConstructor
public class BaseSteps {

    private final RabbitMQContainer rabbitMQContainer;

    @Before
    public void beforeScenario() {
        rabbitMQContainer.start();
    }

    @When("User sends a message")
    public void userSendsAMessage() {
        log.info("Sending message");
    }

    @Then("A message is received")
    public void aMessageIsReceived() {
        log.info("Receiving message");
    }
}
