package com.seamlessly.stepdefinitions;
import com.seamlessly.pages.SettingsPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class LogoutStepsDefs {

    @Then("the user should be able to back into the login page")
    public void the_user_should_be_able_to_back_into_the_login_page() {
        String actual = Driver.get().getCurrentUrl();
        String expected = "http://qa.seamlessly.net/index.php/login?clear=1";
        Assert.assertEquals(expected,actual);
    }
    @And("the user should be able to logout")
    public void theUserShouldBeAbleToLogout() {
        SettingsPage settingsPage=new SettingsPage();
        settingsPage.clickSettingsModuleOptions("logout");
    }
}