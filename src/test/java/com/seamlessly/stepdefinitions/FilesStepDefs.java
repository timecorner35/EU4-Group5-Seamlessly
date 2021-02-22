package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FilesStepDefs {

    FilesPage filesPage=new FilesPage();
    WebDriverWait wait=new WebDriverWait(Driver.get(),10);
    @When("the user clicks on {string}")
    public void the_user_clicks_on(String string) {
//        for (WebElement listOfFolder : filesPage.listOfFolderFiles) {
//            if (listOfFolder.getText().equals("New folder1")) {
//               listOfFolder.click();
//                for (WebElement rightClickMenuOptions : filesPage.rightClickMenu) {
//                    if (rightClickMenuOptions.getText().contains(string)) {
//                        rightClickMenuOptions.click();
//                        listOfFolder.sendKeys("Cybertek");
//                    }
//                }
//            }
//        }
//        wait.until(ExpectedConditions.elementToBeClickable(filesPage.folder));
//        filesPage.folder.click();
//        System.out.println("filesPage.rightClickMenu.isDisplayed() = " + filesPage.rightClickMenu.isDisplayed());
//        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
//        jse.executeScript("arguments[0].click();", filesPage.rightClickMenu);
//        filesPage.folder.sendKeys("Cybertek");

    }


    @Then("the user should able to see changed folder name")
    public void the_user_should_able_to_see_changed_folder_name(){

    }


}
