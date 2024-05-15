Feature: Dropdown list functionality
  As user I want to be able to choose option from dropdown list

  @Test
  Scenario: Select option from dropdown list
    Given I am on the dropdown page
    When I choose first option
    Then First option is chosen
    And I choose second option
    Then Second option is chosen