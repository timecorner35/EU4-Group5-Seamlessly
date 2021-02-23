package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.pages.OnlineStatusPopupPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatusSettingsStepDefinitions {
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(string);
    }


    @When("the user navigates to {string} tab and clicks")
    public void the_user_navigates_to_tab_and_clicks(String string) {
        new OnlineStatusPopupPage().navigateToTab(string);

    }

    @Then("the user should be able to see status")
    public void the_user_should_be_able_to_see_status() {

        System.out.println(new OnlineStatusPopupPage().pstat.getText());
        Assert.assertTrue(new OnlineStatusPopupPage().pstat.isDisplayed());
    }

    @When("the user chooses {string}")
    public void the_user_chooses(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.chooseStatus(string);
    }

    @Then("status changes to {string}")
    public void status_changes_to(String string) {
        Driver.get().navigate().refresh();
        new OnlineStatusPopupPage().profile.click();

        String actual = new OnlineStatusPopupPage().statusIcon.getAttribute("class");
        if (string.equals("")){
            Assert.assertEquals(string+actual,actual);
        }else
        Assert.assertTrue(actual.contains(string));
        System.out.println(actual);
    }

    @Given("clicks {string} module")
    public void clicks_module(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.clickSettingsModuleOptions(string);

    }

    @When("user enters {string} into inputbox")
    public void user_enters_into_inputbox(String string) throws InterruptedException {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.clearStatusMessage.click();
        Actions actions = new Actions(Driver.get());
        onlineStatusPopupPage.profile.click();
        onlineStatusPopupPage.clickSettingsModuleOptions("Status");
        onlineStatusPopupPage.inputBox.sendKeys(string);
//        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
//        wait.until(ExpectedConditions.elementToBeClickable(onlineStatusPopupPage.setStatusButton));
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.elementToBeClickable(onlineStatusPopupPage.setStatusButton));
        actions.moveToElement(onlineStatusPopupPage.setStatusButton).click().perform();

    }

    @When("the user chooses messages from {string}")
    public void the_user_chooses_messages_from(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.chooseMessage(string);
    }

    @Then("status message changes to {string}")
    public void status_message_changes_to(String string) {
        Driver.get().navigate().refresh();
        new OnlineStatusPopupPage().profile.click();

        System.out.println(new OnlineStatusPopupPage().pstat.getText());
        String actual = new OnlineStatusPopupPage().pstat.getText();
        System.out.println(string);
        Assert.assertTrue(actual.contains(string));;
        System.out.println(actual);


    }
    @When("the user chooses deadline from {string}")
    public void the_user_chooses_deadline_from(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.chooseDeadline(string);

    }
    @Then("clear status message changes to {string}")
    public void clear_status_message_changes_to(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        System.out.println(onlineStatusPopupPage.clearOptions.getText());
        if (string.equals("1 hour")){
            Assert.assertEquals("an hour",onlineStatusPopupPage.clearOptions.getText());
        }else
        Assert.assertEquals(string,onlineStatusPopupPage.clearOptions.getText());

    }

    @When("the user deletes the message")
    public void the_user_deletes_the_message() {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.profile.click();
        onlineStatusPopupPage.pstat.click();
        onlineStatusPopupPage.inputBox.clear();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", onlineStatusPopupPage.setStatusButton);
        executor.executeScript("arguments[0].click();", onlineStatusPopupPage.setStatusButton);
    }



}
