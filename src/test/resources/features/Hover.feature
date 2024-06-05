Feature: Hover functionality

  @Test
  Scenario: Hover over images and check if caption and link appeared
    Given I am on the hovers page
    When I hover over image box
    Then The title and link are correct