@SEAM-220
Feature: 

	#{color:#00875a}*User Story:*{color}
	# 
	#{color:#172b4d}As a user I should be able to login{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	# 
	#*{color:#de350b}AC1: user can log in with valid credentials{color}*
	#AC2: user cannot login with any invalid credentials
	@SEAM-170 @SEAM-225
	Scenario: Verify that user should be able to login with valid credentials
		    Given the user is on the login page
		    When the user enters valid username and password
		    Then the user should be on the home(files module) page	

	#*+User Story+*
	#
	#A user should be able to logout of his/her profile
	#
	#+*Acceptance Criteria*+
	#
	#A.C user can log out and ends up in login page
	@SEAM-187 @SEAM-225
	Scenario: successfully logout
		
		 Given the user logged in as "fatma"
		 When the user navigates to "Settings" tab and clicks
		
		 And the user should be able to logout
		 Then the user should be able to back into the login page

