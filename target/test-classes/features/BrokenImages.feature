Feature: Broken Images
  As tester I want to be able to
  test if images are broken or not

  @Test
  Scenario: Check if images are broken
    Given I am on the broken images page
    When I check all the images
    Then Images are broken
