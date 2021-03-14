@SEAM-191
Feature: user should be able to Delete and restore the files

Background:
@SEAM-205
Given the user has already logged in as "fatma"

@SEAM-213
  Scenario: verify that user should be able to delete the file
  Given the user is on "All files" page
  When the creates folder named "Folder1"
  And the user click on 3 dots
  Then the user should be able to "Delete folder"

@SEAM-214
Scenario: Verify that user should be able to restore the deleted file
Given the user click the "Deleted files"
When the user "restore" the deleted folder
Then the user should be able to see the restore folder on "All files"page





