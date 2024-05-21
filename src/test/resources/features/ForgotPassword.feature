Feature: Forgot password functionality
  As a user,
  I want to be able to retrieve my password

  @Test
  Scenario: Retrieve forgotten password
    Given I am on the forgot password page
    When I write my e-mail
    Then Email is correct