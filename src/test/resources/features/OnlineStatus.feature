@SEAM-183
Feature: Online Status Changing

  Background:
		#@SEAM-181
    Given the user logged in as "yusuf"
    When the user navigates to "Settings" tab and clicks
    And clicks "Status" module
		

	#{color:#FF0000}AC1: User can see his/her online status{color}
	#AC2: user can change/select one of four different online status
	#AC3: user sets up a generic status message
	#AC4: user chooses one of five different status messages
	#AC5: user sets a deadline for the status message
	#AC6: user can delete a status message
  @SEAM-167
  Scenario: Verify that user can see online status
    Then the user should be able to see status

	#AC1: User can see his/her online status
	#{color:#FF0000}AC2: user can change/select one of four different online status{color}
	#AC3: user sets up a generic status message
	#AC4: user chooses one of five different status messages
	#AC5: user sets a deadline for the status message
	#AC6: user can delete a status message
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
			

	#AC1: User can see his/her online status
	#AC2: user can change/select one of four different online status
	#{color:#FF0000}AC3: user sets up a generic status message{color}
	#AC4: user chooses one of five different status messages
	#AC5: user sets a deadline for the status message
	#AC6: user can delete a status message
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
			

	#AC1: User can see his/her online status
	#AC2: user can change/select one of four different online status
	#AC3: user sets up a generic status message
	#{color:#FF0000}AC4: user chooses one of five different status messages{color}
	#AC5: user sets a deadline for the status message
	#AC6: user can delete a status message
	# 
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
			

	#AC1: User can see his/her online status
	#AC2: user can change/select one of four different online status
	#AC3: user sets up a generic status message
	#AC4: user chooses one of five different status messages
	#{color:#FF0000}AC5: user sets a deadline for the status message{color}
	#AC6: user can delete a status message
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

	#AC1: User can see his/her online status
	#AC2: user can change/select one of four different online status
	#AC3: user sets up a generic status message
	#AC4: user chooses one of five different status messages
	#AC5: user sets a deadline for the status message
	#{color:#FF0000}AC6: user can delete a status message{color}
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