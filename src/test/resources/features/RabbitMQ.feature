Feature: Testing Spring RabbitMQ integration

  Scenario: Testing the receiving of a simple message
    When User sends a message
    Then A message is received