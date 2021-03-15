@SEAM-203 @yus
Feature:File/Folder Details

  Background:
		#@SEAM-173
    Given the user has already logged in as "yusuf"
		#@SEAM-202
    When the user creates text file named "text"
    And the user creates folder named "Folder1"


  @SEAM-201
  Scenario: Verify that details side page is shown when clicked 3 dots
    Given the user is on "Files" page
    When the user clicks on 3 dots
    Then details side page should show up


  @SEAM-206
  Scenario:Verify that details reflects correct information
    Given the user is on "Files" page
    When the user clicks on 3 dots
    Then the title should match file name


  @SEAM-209
  Scenario:Verify that options on side page are shown accordingly based on file type
    Given the user is on "Files" page
    When the user clicks on 3 dots
    Then side page should show following for folders
      | Activity |
      | Comments |
      | Sharing  |
      | Versions |