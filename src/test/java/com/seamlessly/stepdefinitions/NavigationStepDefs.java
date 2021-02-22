package com.seamlessly.stepdefinitions;


import com.seamlessly.pages.FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationStepDefs {
    FilesPage filesPage=new FilesPage();

    @When("the user clicks on logo from {string}")
    public void the_user_clicks_on_logo_from_Files(String string) {
        filesPage.navigateToTab(string);
        filesPage.navigateToTab("Home");
    }

    @Then("the user should landing on Files page")
    public void the_user_should_landing_on_page() {
        Assert.assertEquals(filesPage.allFiles.getText(),"All files");
    }



}