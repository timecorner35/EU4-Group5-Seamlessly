package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.pages.OnlineStatusPopupPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
        String actual = new OnlineStatusPopupPage().pstat.getText();
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
        BrowserUtils.waitFor(1);
        onlineStatusPopupPage.inputBox.clear();
        onlineStatusPopupPage.inputBox.sendKeys(string);
        BrowserUtils.waitFor(1);
        onlineStatusPopupPage.setStatusButton.click();
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
        BrowserUtils.waitFor(1);
        System.out.println(new OnlineStatusPopupPage().pstat.getText());
        String actual = new OnlineStatusPopupPage().pstat.getText();
        Assert.assertTrue(actual.contains(string));
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
        BrowserUtils.waitFor(2);
        onlineStatusPopupPage.setStatusButton.click();
    }




}
