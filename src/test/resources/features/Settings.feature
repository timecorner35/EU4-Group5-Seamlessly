Feature:    Changing profile settings


  Background:
    Given the user logged in as "Ritesh"
    When the user navigates to "Settings" tab and clicks
    And clicks "Settings" module
  @rits
  Scenario: Verify that user can change and save the settings
    When the user add a name into the box
    Then the name changed to a new given name
    When the user add a email into the box
    Then the email changed to a new email

