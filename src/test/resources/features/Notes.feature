
Feature: Notes Page

	Background:
		#@SEAM-173
		Given the user has already logged in as "asel"
		

	#*User Story:*
	#As a user, I should be able to navigate to the home page (Files module page) with one click (on the logo)
	#
	#*Acceptance Criteria:*
	#AC1: Regardless the page, a user can navigate to the home (Files module) page by clicking on the App logo
	@SEAM-174
	Scenario: Verify user can navigate to home page by clicking on the logo
		When the user navigates to "Notes"
		And the user navigates back "Home"
		Then the title contains "Files-Seamlessly-QA"