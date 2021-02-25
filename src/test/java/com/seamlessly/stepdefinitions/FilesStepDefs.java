package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.List;

public class FilesStepDefs {

    FilesPage filesPage=new FilesPage();
    WebDriverWait wait=new WebDriverWait(Driver.get(),10);
    Actions actions = new Actions(Driver.get());
    @When("the user chooses a {string}")
    public void the_user_chooses_a(String string) {
        List<WebElement> filesFolders = wait.until(ExpectedConditions.visibilityOfAllElements(filesPage.folderFileList));
        for (WebElement filesFolder : filesFolders) {
            if (filesFolder.getText().equals(string)) {
                filesPage.folderFile3dot.get(0).click();
        }
        }
    }

    @And("the user clicks on Rename")
    public void the_user_clicks_on_Rename() {
        filesPage.rename.click();
        actions.sendKeys("Cybertek", Keys.ENTER).perform();

    }


    @Then("the user should able to see changed folder name")
    public void the_user_should_able_to_see_changed_folder_name(){
        String actual ="Cybertek";
        String expected=filesPage.fileFolderText.get(0).getText();
        Assert.assertEquals(expected,actual);
    }


}
