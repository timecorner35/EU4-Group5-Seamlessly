@SEAM-208
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
	@SEAM-204
	Scenario: Verify that user can add a file to Favourites 
		And the user creates text file named "text"
		When the user added "text" to Favourites
		Then the "text" can be seen on Favourites tab


	#{color:#00875a}*User Story:*{color}
	#As a user I should be able to add a file/folder into my favorites and see them under {color:#172b4d}Favorites tab.{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	#AC1: user can add a file/folder to favorites 
	#AC2: the file/folder can be seen under Favorites tab
	@SEAM-207
	Scenario: Verify that user can add a folder to Favourites
		And the user creates folder named "Folder1"
		When the user added "Folder1" to Favourites
		Then the "Folder1" can be seen on Favourites tab