@afa
Feature: Changing Status

  Background: User has already logged in and navigated to Online status module
    Given the user logged in as "yusuf"
    When the user navigates to "Settings" tab and clicks
    And clicks "Status" module


  Scenario: User can see its online status
    Then the user should be able to see status

  Scenario Outline: User can select one of four Status options
    When the user chooses "<Status>"
    Then status changes to "<Status>"
    Examples:
      | Status         |
      | Online         |
      | Away           |
      | Do not disturb |
      | Invisible      |


  Scenario Outline: User can set up a generic status message
    When user enters "<Status Message>" into inputbox
    Then status changes to "<Status Message>"
    Examples:
      | Status Message  |
      | hola            |
      | i'm really busy |
      | lunch break     |
      | back in 15 mins |


  Scenario Outline: User can select one of five pre-defined statuses
    When the user chooses messages from "<pre-defined statuses>"
    Then status message changes to "<pre-defined statuses>"
    Examples:
      | pre-defined statuses |
      | In a meeting         |
      | Commuting            |
      | Working remotely     |
      | Out sick             |
      | Vacationing          |


  Scenario Outline: User can set a deadline for the status message
    When the user chooses deadline from "<pre-defined deadlines>"
    Then clear status message changes to "<pre-defined deadlines>"
    Examples:
      | pre-defined deadlines |
      | 30 minutes            |
      | 1 hour                |
      | 4 hours               |
      | Today                 |
      | This week             |


    Scenario Outline: User can delete a status message
    When user enters "<Status Message>" into inputbox
    When the user deletes the message
    Then status changes to ""
    Examples:
      | Status Message  |
      | hola            |
      | i'm really busy |
      | lunch break     |
      | back in 15 mins |