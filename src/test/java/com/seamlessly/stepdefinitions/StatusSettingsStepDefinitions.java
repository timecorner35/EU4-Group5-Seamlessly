package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.pages.OnlineStatusPopupPage;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StatusSettingsStepDefinitions {
    @Given("User logged in as {string}")
    public void user_logged_in_as(String string) {
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
        Assert.assertEquals(string, actual);
        System.out.println(actual);
    }
    @Given("clicks {string} module")
    public void clicks_module(String string) {
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.clickSettingsModuleOptions(string);


    }


}
