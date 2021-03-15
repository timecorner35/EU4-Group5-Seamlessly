@SEAM-220
Feature: 

	Background:
		#@SEAM-205
		Given the user has already logged in as "elif"
		
		

	#{color:#00875a}*User Story:*{color}
	#As a user I should be able to add a file/folder into my favorites and see them under {color:#172b4d}Favorites tab.{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	#AC1: user can add a file/folder to favorites 
	#AC2: the file/folder can be seen under Favorites tab
	@SEAM-204 @SEAM-225
	Scenario: Verify that user can add a file to Favourites 
		And the user creates text file named "text"
		When the user added "text" to "Favourites"
		Then the "text" can be seen on "Favourites" tab	

	#* 
	#h4. Description
	# 
	#
	#A user should be able to delete a file or folder and also restore a deleted one using Restore option
	# 
	#*Acceptance criteria*
	# 
	#AC1: a file/folder can be deleted and then it is shown inside Deleted Files tab
	#AC2: a previously deleted file/folder inside the Deleted Files Tab can be restored and then shown in All Files tab.
	# 
	@SEAM-213 @SEAM-225
	Scenario: User should be able to delete file
		    Given the user is on "All files" page
		    When the user creates folder named "Folder1"
		    When the user click on 3 dots
		    Then the user should be able to "Delete folder"