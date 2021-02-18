package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user has already logged in as {string}")
    public void the_user_has_already_logged_in_as(String user) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username=null;
        String password="Employee123";
        if(user.equals("yusuf")){
            username=ConfigurationReader.get("yusuf");
        }else if(user.equals("asel")){
            username=ConfigurationReader.get("asel");
        }else if(user.equals("ritesh")){
            username=ConfigurationReader.get("ritesh");
        }else if(user.equals("fatma")){
            username=ConfigurationReader.get("fatma");
        }else if(user.equals("elif")){
            username=ConfigurationReader.get("elif");
        }else if(user.equals("jolbek")){
            username=ConfigurationReader.get("jolbek");
        }
        new LoginPage().login(username,password);
    }


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
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertEquals(" ", "http://qa.seamlessly.net/index.php/apps/files/?dir=/&fileid=1531", actualTitle);


    }

}
