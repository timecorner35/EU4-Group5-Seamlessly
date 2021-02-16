Feature: Changing Status
  Scenario: User can see its online status
    Given User logged in
    When the user navigates to "Settings" and clicks
    Then the user should be able to see status