Feature: User should be able to login
@wip
  Scenario: login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be on the home(files module) page