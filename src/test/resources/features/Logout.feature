@fatma
Feature: User should be able to logout

  Background: user has already logged in
    Given the user logged in as "fatma"
    When the user navigates to "Settings" tab and clicks

  Scenario: Logout functionality
    And the user should be able to logout
    Then the user should be able to back into the login page