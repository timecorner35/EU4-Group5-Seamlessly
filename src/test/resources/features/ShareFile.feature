Feature: Share file/folder
@wip
  Scenario: User should share file
    Given the user logged in as "jolbek"
    When user clicks share button and click new share-link button
    And user clicks home button
    Then user should locate shared icon next to file from home page
@wip
  Scenario: User should locate shared file on ALl files tab
      Given the user logged in as "jolbek"
      When user clicks all files menu and clicks shares option
      Then user should locate shared files
@wip
    Scenario: User should unshare file
      Given the user logged in as "jolbek"
      When user clicks share button and clicks share-link menu button
      And user clicks unshare button from share-link menu
      And user clicks home button
      Then user should locate unshared icon next to file from home page


      






