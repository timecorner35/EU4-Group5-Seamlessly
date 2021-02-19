@wip
Feature: Upload file

  Scenario: Upload new file
    Given the user logged in as "jolbek"
    When the user upload new file
    Then the user should locate uploaded file

  Scenario: Create new folder
    Given the title contains "jolbek"
    When the user create new folder
    Then the user should locate new folder

  Scenario: Create new text file
    Given the user logged in as "jolbek"
    When the user create new text file
    Then the user should locate new text file




