package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.pages.ProfileSettingsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StatusSettingsStepDefinitions {
    @Given("User logged in")
    public void user_logged_in() {
        new LoginPage().login();

    }

    @When("the user navigates to {string} and clicks")
    public void the_user_navigates_to_and_clicks(String string) {
        new ProfileSettingsPage().navigateTo(string);

    }

    @Then("the user should be able to see status")
    public void the_user_should_be_able_to_see_status() {

        System.out.println(new ProfileSettingsPage().pstat.getText());
        Assert.assertTrue(new ProfileSettingsPage().pstat.isDisplayed());
    }

}
