@SEAM-190
Feature: 

	#*+User Story+*
	#
	#A user should be able to logout of his/her profile
	#
	#+*Acceptance Criteria*+
	#
	#A.C user can log out and ends up in login page
	@SEAM-187
	Scenario: successfully logout
		
		 Given the user logged in as "fatma"
		 When the user navigates to "Settings" tab and clicks
		
		 And the user should be able to logout
		 Then the user should be able to back into the login page