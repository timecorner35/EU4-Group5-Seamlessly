package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("user is in login page")
    public void user_is_in_login_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();




    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
