@SEAM-220
Feature: 

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
	@SEAM-167 @SEAM-225
	Scenario: Verify that user can see online status
		    Then the user should be able to see status	

	#AC1: User can see his/her online status
	#AC2: user can change/select one of four different online status
	#AC3: user sets up a generic status message
	#{color:#FF0000}AC4: user chooses one of five different status messages{color}
	#AC5: user sets a deadline for the status message
	#AC6: user can delete a status message
	# 
	@SEAM-178 @SEAM-225
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
		