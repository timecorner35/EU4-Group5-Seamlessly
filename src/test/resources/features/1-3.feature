@SEAM-177
Feature: 

	#{color:#00875a}*User Story:*{color}
	# 
	#{color:#172b4d}As a user I should be able to login{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	# 
	#*{color:#de350b}AC1: user can log in with valid credentials{color}*
	#AC2: user cannot login with any invalid credentials
	@SEAM-170
	Scenario: Verify that user should be able to login with valid credentials
		    Given the user is on the login page
		    When the user enters valid username and password
		    Then the user should be on the home(files module) page	

	#{color:#00875a}*User Story:*{color}
	# 
	#{color:#172b4d}As a user I should be able to login{color}
	# 
	#{color:#00875a}*Acceptance Criteria:*{color}
	# 
	#{color:#172b4d}AC1: user can log in with valid credentials{color}
	#{color:#de350b}*AC2: user cannot login with any invalid credentials*{color}
	@SEAM-176
	Scenario Outline: Verify that user should not be able to login with invalid credentials
		Given the user is on the login page
		When the user enters "<username>" and "<password>"
		Then the title should contains "login"
		
		  Examples:
		    |   username    |   password      |
		    |   Employee13  |   Emploo12      |
		    |   Emplooe1    |   Employee123   |
		    |   Emploo9     |   Emplo987      |
		    |               |                 |
		    |   Emplo       |                 |
		    |               |   Emplooyee     |