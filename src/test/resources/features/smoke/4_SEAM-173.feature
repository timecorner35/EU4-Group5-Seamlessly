@SEAM-220
Feature: 

	Background:
		#@SEAM-173
		Given the user has already logged in as "asel"
		

	#*User Story:*
	#As a user, I should be able to navigate to the home page (Files module page) with one click (on the logo)
	#
	#*Acceptance Criteria:*
	#AC1: Regardless the page, a user can navigate to the home (Files module) page by clicking on the App logo
	@SEAM-174 @SEAM-225
	Scenario Outline: Verify user can navigate to home page by clicking on the logo
		When the user clicks on logo from <menu>
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

	#*User Story:*
	#As a user, I should be able to leave comments for a file/folder under the Details side-page (Automated)
	#
	#*Acceptance Criteria:*
	#AC1: a comment box is displayed when Comments is selected under Details
	#AC2: when click to the arrow, entered comment should be saved, comment owner username should be seen and comment box should be emptied for new comments. 
	#AC3: Previously made comments can be edited or deleted.
	@SEAM-211 @SEAM-225
	Scenario: Verify comment can be edited for a folder which was created earlier
		When the user clicks Edit comment
		Then the user should able to see changes