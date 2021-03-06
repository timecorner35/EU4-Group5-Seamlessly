package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FilesStepDefs {

    FilesPage filesPage = new FilesPage();
    Actions actions = new Actions(Driver.get());

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
        filesPage.createFolder("New Folder");
        filesPage.fileFolder3dotOptions("Rename");
        actions.sendKeys("Cybertek",Keys.ENTER).perform();

        BrowserUtils.waitFor(2);

    }

    @Then("the user should able to see changed folder name")
    public void the_user_should_able_to_see_changed_folder_name() {
        String actual = "Cybertek";
        String expected = filesPage.fileFolderText.get(0).getText();
        Assert.assertEquals(expected, actual);
        filesPage.fileFolder3dotOptions("Delete");
        BrowserUtils.waitFor(2);
    }


    @When("the user clicks on rename on files")
    public void the_user_clicks_on_rename_on_files() {
        filesPage.createTextFile("New puppy");
        filesPage.newFilePageCloseIcon.click();
        BrowserUtils.waitFor(3);
        filesPage.newFileTitleCloseIcon.click();
        BrowserUtils.waitFor(3);
        filesPage.fileFolder3dotOptions("Rename");
        actions.sendKeys("Always",Keys.ENTER).perform();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should able to see changed file name")
    public void the_user_should_able_to_see_changed_file_name() {

        String actual = "Always";
        String expected = filesPage.fileFolderText.get(0).getText();
        Assert.assertEquals(expected, actual);
        filesPage.fileFolder3dotOptions("Delete");
        BrowserUtils.waitFor(2);
    }


    @Then("details side page should show up")
    public void detailsSidePageShouldShowUp() {
        Assert.assertTrue(filesPage.sidePage.isDisplayed());

    }

    @When("the user clicks on {int} dots")
    public void theUserClicksOnDots(int arg0) {
        filesPage.folderFile3dot.click();
        filesPage.details.click();


    }

    @Given("the user is on {string} page")
    public void theUserIsOnPage(String s) {
        Driver.get().get("https://qa.seamlessly.net/index.php/apps/files/?dir=/&fileid=19391");

    }

    @When("the user creates text file named {string}")
    public void theUserCreatesTextFileNamed(String s) {
        filesPage.createTextFile(s);
        Driver.get().navigate().refresh();

    }

    @And("the user creates folder named {string}")
    public void theUserCreatesFolderNamed(String s) {
        filesPage.createFolder(s);
        Driver.get().navigate().refresh();

    }

    @Then("created files shown on the page")
    public void createdFilesShownOnThePage() {
        System.out.println(filesPage.fileFolderText.size());
        Assert.assertTrue(filesPage.fileFolderText.size() >= 2);
    }

    @When("the user leaves comments for a folder")
    public void theUserLeavesCommentsForA() {
       filesPage.fileFolder3dotOptions("Details");
       filesPage.fileFolderDetailsOption("comments");
       filesPage.leaveComment("Hi there");

    }

    @Then("the user should able to see that comment")
    public void the_user_should_able_to_see_that_comment() {
        Assert.assertTrue(filesPage.comments.isDisplayed());
    }


    @Then("the title should match file name")
    public void theTitleShouldMatchFileName() {
        filesPage.checkNamesAndDelete();

    }

    @Then("side page should show following for folders")
    public void sidePageShouldShowFollowingForFolders(List<String>s) {
       filesPage.checkAvailableOptions(s);

    }




    @When("the user added {string} to {string}")
    public void the_user_added_to(String string,String string2) throws InterruptedException {

        BrowserUtils.waitFor(3);
        filesPage.folderFile3dot.click();
        Thread.sleep(3000);
        filesPage.addToFav.click();


    }

    @Then("the {string} can be seen on {string} tab")
    public void the_can_be_seen_on_tab(String string,String string2) {

        filesPage.favTab.click();
        Assert.assertTrue(filesPage.favfolder.getText().contains(string));
        filesPage.navigateToTab("Home");
        filesPage.folderFile3dot.click();
        filesPage.delete.click();

    }
    @When("the user clicks Edit comment")
    public void the_user_clicks_edit_comment() {
        filesPage.fileFolder3dotOptions("Details");
        filesPage.fileFolderDetailsOption("comments");
        filesPage.setEditComment("change comment");
    }

    @Then("the user should able to see changes")
    public void the_user_should_able_to_see_changes() {
        Assert.assertTrue(filesPage.comments.isDisplayed());
    }

    @When("the user clicks Delete comment")
    public void the_user_clicks_Delete_comment() {
        //filesPage.chooseFileFolder("Notes","Details");
        filesPage.fileFolder3dotOptions("Details");
        filesPage.fileFolderDetailsOption("comments");
        filesPage.setDeleteComment();
    }
    @Then("the user should not see any comments")
    public void the_user_should_not_see_any_comments() {
        Assert.assertTrue(filesPage.noComments.size() != 0);
    }



}

