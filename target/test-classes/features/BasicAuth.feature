Feature: Basic Authorization functionality
  As a user,
  I want to be able to do authorization

  @Test
  Scenario: Authorize by filling alert with username and password
    Given I am on the basic authorization page
    When I fill popup with username and password
    Then Authorization is finished
