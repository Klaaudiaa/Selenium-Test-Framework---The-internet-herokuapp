Feature: Login functionality
  As user I need to be able to log in to my account

  @Test
  Scenario: Login with username and password
    Given I am on the login page
    When I enter username and password
    Then I am redirected to secure area page
    And I log out
    Then I am back on login page