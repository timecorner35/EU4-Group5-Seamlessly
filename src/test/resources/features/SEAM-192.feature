@SEAM-208
Feature: 

	Background:
		#@SEAM-205
		Given the user has already logged in as "elif"
		
		#@SEAM-202
		When the user creates text file named "text"
		And the user creates folder named "Folder1"
		Then created files shown on the page
		

	#{color:#00875a}*User Story:*{color}
	#As a user I should be able to add a file/folder into my favorites and see them under {color:#172b4d}Favorites tab.{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	#AC1: user can add a file/folder to favorites 
	#AC2: the file/folder can be seen under Favorites tab
	@SEAM-204
	Scenario: Verify that user can add a file to Favourites 
		When the user added "file" to "Favourites"
		Then the "file" can be seen on "Favourites" tab	

	#{color:#00875a}*User Story:*{color}
	#As a user I should be able to add a file/folder into my favorites and see them under {color:#172b4d}Favorites tab.{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	#AC1: user can add a file/folder to favorites 
	#AC2: the file/folder can be seen under Favorites tab
	@SEAM-207
	Scenario: Verify that user can add a folder to Favourites
		When the user added "folder" to "Favourites"
		Then the "folder" can be seen on "Favourites" tab