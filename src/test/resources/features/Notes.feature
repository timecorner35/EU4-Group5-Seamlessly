
Feature: Notes Page
	@wip
	Scenario: Verify user can navigate to home page by clicking on the logo
		Given the user has already logged in as "asel"
		When the user navigates to "Notes"
		And the user navigates back "Home"
		Then the title contains "Files-Seamlessly-QA"