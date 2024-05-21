Feature: Drag and drop functionality

  @Test
  Scenario: User drag and drop element on page
    Given I am on the drag and drop page
    When I drag box A and drop on column B
    Then Box A is on second place
    And I drag box A and drop on column A
    Then Box A is on first place
