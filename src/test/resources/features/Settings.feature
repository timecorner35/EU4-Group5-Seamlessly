Feature:    Changing profile settings


  @wip
  Background:
    Given the user logged in as "Ritesh"
    When the user navigates to "Settings" tab
    And clicks "Settings" module

  Scenario: Verify that user can change and save the settings
    When the user add a name into the box
    Then the name changed to a new given name