@wip
Feature: Files / Folders

	Background:
		 #@SEAM-173
		Given the user has already logged in as "asel"
		

	#*User Story:*
	#As a user, I should be able to change the name of a file/folder (Automated)
	#
	#*Acceptance Criteria:*
	#AC1: User should be able to change file/folder name and update correctly when using Rename option
	@SEAM-186
	Scenario: Verify user able to change folder name
		When the user clicks on "Rename"
		Then the user should able to see changed folder name

	@SEAM-189
	Scenario: Verify user able to change folder name
		When the user clicks on rename on files
		Then the user should able to see changed file name
