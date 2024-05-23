Feature: Horizontal Slider functionality

  @Test
  Scenario: Move horizontal slider
    Given I am on the horizontal slider page
    When Move horizontal slider to right by 5 points
    Then Horizontal slider is on value 5