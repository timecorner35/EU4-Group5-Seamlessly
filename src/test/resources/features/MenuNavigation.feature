
Feature: Menu Options

	Background:
		#@SEAM-173
		Given the user has already logged in as "asel"
		
	@SEAM-174
	Scenario Outline: Verify user can navigate to home page by clicking on the logo
		When the user clicks on logo from "<menu>"
		Then the user should landing on Files page
		
		Examples:
		|menu|
		|Files|
		|Photos|
		|Activity|
		|Contacts|
		|Calendar|
		|Notes|
		|Deck|
		|Tasks|