@SEAM-183
Feature: Online Status Changing

  Background:
		#@SEAM-181
    Given the user logged in as "yusuf"
    When the user navigates to "Settings" tab and clicks
    And clicks "Status" module
		

  @SEAM-167
  Scenario: Verify that user can see online status
    Then the user should be able to see status



  @SEAM-171
  Scenario Outline: Verify that user can change online status
    When the user chooses "<Status>"
    Then status changes to "<Statuss>"
    Examples:
      | Status         | Statuss   |
      | Online         | online    |
      | Away           | away      |
      | Do not disturb | dnd       |
      | Invisible      | invisible |
			


  @SEAM-172
  Scenario Outline: Verify that user can setup a status message
    When user enters "<Status Message>" into inputbox
    Then status message changes to "<Status Message>"
    Examples:
      | Status Message  |
      | hola            |
      | i'm really busy |
      | lunch break     |
      | back in 15 mins |
			


  @SEAM-178
  Scenario Outline: Verify that user can choose  pre-defined online statuses
    When the user chooses messages from "<pre-defined statuses>"
    Then status message changes to "<pre-defined statuses>"
    Examples:
      | pre-defined statuses |
      | In a meeting         |
      | Commuting            |
      | Working remotely     |
      | Out sick             |
      | Vacationing          |
			


  @SEAM-179
  Scenario Outline: Verify that user can set deadline for status message
    When the user chooses deadline from "<pre-defined deadlines>"
    Then clear status message changes to "<pre-defined deadlines>"
    Examples:
      | pre-defined deadlines |
      | 30 minutes            |
      | 1 hour                |
      | 4 hours               |
      | Today                 |
      | This week             |


  @SEAM-180
  Scenario Outline: Verify that user can delete a status message
    When user enters "<Status Message>" into inputbox
    When the user deletes the message
    Then status changes to ""
    Examples:
      | Status Message  |
      | hola            |
      | i'm really busy |
      | lunch break     |
      | back in 15 mins |