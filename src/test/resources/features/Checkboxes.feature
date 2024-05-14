Feature: Checkboxes funcionality
  As user I want to be able to check checkboxes

  @Test
  Scenario: Check and uncheck checkboxes
    Given I am on the checkboxes page
    When I click on checkboxes
    Then Checkboxes are selected
    And I uncheck checkboxes
    Then Checkboxes are not selected
