package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class FilesStepDefs {

    FilesPage filesPage=new FilesPage();
    Actions actions = new Actions(Driver.get());

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
        filesPage.plusIcon.click();
        filesPage.newFolder.click();
        actions.sendKeys("New World",Keys.ENTER).perform();
        filesPage.folderFile3dot.click();
        filesPage.rename.click();
        actions.sendKeys("Cybertek",Keys.ENTER).perform();
        BrowserUtils.waitFor(2);

    }

    @Then("the user should able to see changed folder name")
    public void the_user_should_able_to_see_changed_folder_name(){
        String actual ="Cybertek";
        String expected=filesPage.fileFolderText.get(0).getText();
        Assert.assertEquals(expected,actual);
        filesPage.folderFile3dot.click();
        filesPage.delete.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks on rename on files")
    public void the_user_clicks_on_rename_on_files() {
        filesPage.plusIcon.click();
        filesPage.newFile.click();
        actions.sendKeys("New Puppy",Keys.ENTER).perform();
        filesPage.newFilePageCloseIcon.click();
        BrowserUtils.waitFor(5);
        filesPage.newFileTitleCloseIcon.click();
        filesPage.folderFile3dot.click();
        filesPage.rename.click();
        actions.sendKeys("Always",Keys.ENTER).perform();
        BrowserUtils.waitFor(2);
    }

    @Then("the user should able to see changed file name")
    public void the_user_should_able_to_see_changed_file_name() {
        String actual ="Always";
        String expected=filesPage.fileFolderText.get(0).getText();
        Assert.assertEquals(expected,actual);
        filesPage.folderFile3dot.click();
        filesPage.delete.click();
        BrowserUtils.waitFor(2);
    }


}
