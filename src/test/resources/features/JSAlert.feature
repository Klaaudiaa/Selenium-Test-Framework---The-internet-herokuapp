Feature: JavaScript alerts

  @Test
  Scenario: Accept alert in JavaScript
    Given I am on the JavaScript alerts page
    When I click for JS alert
    And I accept alert
    Then Alert is not visible

  @Test
  Scenario: Accept confirmation alert in JavaScript
    Given I am on the JavaScript alerts page
    When I click for JS confirmation alert
    And I dismiss confirmation alert
    Then Confirmation alert is canceled
    When I click for JS confirmation alert
    And I accept confirmation alert
    Then Confirmation alert is accepted

  @Test
  Scenario: Accept JavaScript prompt
    Given I am on the JavaScript alerts page
    When I click for JS prompt
    And I write text in the prompt
    And I accept alert
    Then Results are correct
