
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
	Scenario: Verify user able to change file name
		When the user clicks on rename on files
		Then the user should able to see changed file name

  	#*User Story:*
	#As a user, I should be able to leave comments for a file/folder under the Details side-page (Automated)
	#
	#*Acceptance Criteria:*
	#AC1: a comment box is displayed when Comments is selected under Details
	#AC2: when click to the arrow, entered comment should be saved, comment owner username should be seen and comment box should be emptied for new comments.
	#AC3: Previously made comments can be edited or deleted.
	@SEAM-210
	Scenario: Verify user able to leave a comment for folder
		When the user leaves comments for a "Cybertek"
		Then the user should able to see that comment
	@SEAM-211
	Scenario: Verify comment can be edited for a folder which was created earlier
		When the user clicks Edit comment for a "Cybertek"
		Then the user should able to see changes
	@SEAM-219
	Scenario: Verify comment can be deleted for a folder which was created earlier
		When the user clicks Delete comment for a "Cybertek"
		Then the user should not see any comments

	@SEAM-221 @wip
	Scenario: Verify user able to leave a comment for file
		When the user leaves comments for a "Always"
		Then the user should able to see that comment
	@SEAM-222 @wip
	Scenario: Verify comment can be edited for a file which was created earlier
		When the user clicks Edit comment for a "Always"
		Then the user should able to see changes
	@SEAM-223 @wip
	Scenario: Verify comment can be deleted for a file which was created earlier
		When the user clicks Delete comment for a "Always"
		Then the user should not see any comments
