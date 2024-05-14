Feature: Add/Remove functionality
  As a user,
  I want to be able to add and remove elements on page

  @Test
  Scenario: Add and remove element
    Given I am on the add remove element page
    When I add element
    Then Element is visible
    And I delete element
    Then Element is not visible
