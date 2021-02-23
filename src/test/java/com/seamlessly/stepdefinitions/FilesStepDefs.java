package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.et.Ja;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FilesStepDefs {

    FilesPage filesPage=new FilesPage();
    WebDriverWait wait=new WebDriverWait(Driver.get(),10);
    JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
    @When("the user chooses a {string}")
    public void the_user_chooses_a(String string) {
        List<WebElement> filesFolders = wait.until(ExpectedConditions.visibilityOfAllElements(filesPage.folderFileList));
        for (WebElement filesFolder : filesFolders) {
            if (filesFolder.getText().equalsIgnoreCase(string)) {
                filesPage.folderFile3dot.get(0).click();
            }
        }
    }

    @And("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
    jse.executeScript("arguments[0].click();",filesPage.hiddenBtn);
        List<WebElement> menuOptions = wait.until(ExpectedConditions.visibilityOfAllElements(filesPage.rightClickMenu));


    }


    @Then("the user should able to see changed folder name")
    public void the_user_should_able_to_see_changed_folder_name(){

    }


}
