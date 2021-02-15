package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("user is in login page")
    public void user_is_in_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));;

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.userInput.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
        String expected = "http://qa.seamlessly.net/index.php/apps/files/";
        String actual = Driver.get().getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }

}
