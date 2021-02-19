package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }



    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("username");
       String password = ConfigurationReader.get("password");
       loginPage.userInput.sendKeys(username);
       loginPage.passwordInput.sendKeys(password);
       loginPage.loginButton.click();


    }

    @Then("the user should be on the home\\(files module) page")
    public void the_user_should_be_on_the_home_files_module_page() {
        BrowserUtils.waitFor(2);
        String actualTitle=Driver.get().getCurrentUrl();
        Assert.assertEquals(" ","http://qa.seamlessly.net/index.php/apps/files/?dir=/&fileid=1531",actualTitle);

    }


    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
       // String userName = ConfigurationReader.get("username");
       // String passWord = ConfigurationReader.get("password");
        loginPage.userInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }


    @Then("the title should contains {string}")
    public void the_title_should_contains(String expectedTitle) {
        BrowserUtils.waitFor(2);
        String actualTitle=Driver.get().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
