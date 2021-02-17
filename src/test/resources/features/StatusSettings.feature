@wip
Feature: Changing Status

  Scenario: User can see its online status
    Given User logged in as "yusuf"
    When the user navigates to "Settings" and clicks
    Then the user should be able to see status

  Scenario Outline: User can select one of four Status options
    Given User logged in as "yusuf"
    And the user navigates to "Settings" and clicks
    And clicks "Status" module
    When the user chooses "<Status>"
    Then status changes to "<Status>"
    Examples:
      | Status         |
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |
