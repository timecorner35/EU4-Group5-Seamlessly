Feature: login feature
  @wip
  Scenario: login with valid credentials
  Given user is in login page
    When user enters valid credentials
    Then user should be able to login