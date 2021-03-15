@SEAM-220
Feature: 

	Background:
		#@SEAM-173
		Given the user has already logged in as "asel"
		#@SEAM-202
		When the user creates text file named "text"
		And the user creates folder named "Folder1"
		Then created files shown on the page
		

	#AC1: Details side page should be shown when clicked.
	# {color:#FF0000}{color:#ff0000}AC2: Details should reflect the correct information.{color}{color}
	# AC3: Activity-Comments-Sharing-Versions view options should be present for a file. Chat-Versions options are not shown for a folder
	@SEAM-206
	Scenario: Verify that details reflects correct information
		Given the user is on "Files" page
		When the user clicks on 3 dots
		Then the title should match file name	

	#{color:#FF0000}AC1:Details side page should be shown when clicked.{color}
	#AC2: Details should reflect the correct information.
	#AC3: Activity-Comments-Sharing-Versions view options should be present for a file. Chat-Versions options are not shown for a folder
	# 
	@SEAM-201 @SEAM-225
	Scenario: Verify that details side page is shown when clicked 3 dots
		Given the user is on "Files" page
		When the user clicks on 3 dots
		Then details side page should show up	

	#AC1: Details side page should be shown when clicked.
	# AC2: Details should reflect the correct information.
	# {color:#FF0000}AC3: Activity-Comments-Sharing-Versions view options should be present for a file. Chat-Versions options are not shown for a folder{color}
	@SEAM-209
	Scenario: Verify that options on side page are shown accordingly based on file type
		
		    Given the user is on "Files" page
		    When the user clicks on 3 dots
		    Then side page should show following for folders
		      | Activity |
		      | Comments |
		      | Sharing  |
		      | Versions |