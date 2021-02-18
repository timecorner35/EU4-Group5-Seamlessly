Feature: Changing Status

  Scenario: User can see its online status
    Given the user logged in as "yusuf"
    When the user navigates to "Settings" tab and clicks
    Then the user should be able to see status

  Scenario Outline: User can select one of four Status options
    Given the user logged in as "yusuf"
    And the user navigates to "Settings" tab and clicks
    And clicks "Status" module
    When the user chooses "<Status>"
    Then status changes to "<Status>"
    Examples:
      | Status         |
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |

  Scenario Outline: User can set up a generic status message
    Given the user logged in as "yusuf"
    And the user navigates to "Settings" tab and clicks
    And clicks "Status" module
    When user enters "<Status Message>" into inputbox
    Then status changes to "<Status Message>"
    Examples:
      | Status Message  |
      | hola            |
      | i'm really busy |
      | lunch break     |
      | back in 15 mins |
