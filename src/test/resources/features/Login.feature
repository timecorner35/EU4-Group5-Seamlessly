
Feature: User should be able to login

  Scenario: login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be on the home(files module) page
  @wip
  Scenario Outline: login with invalid credentials
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