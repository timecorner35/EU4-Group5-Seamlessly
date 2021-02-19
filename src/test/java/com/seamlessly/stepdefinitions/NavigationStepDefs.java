package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FilesPage;
import com.seamlessly.pages.NotesPage;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationStepDefs {
    @When("the user navigates to {string}")
    public void the_user_navigates_to(String module) {
        new FilesPage().navigateToTab(module);
    }
    @And("the user navigates back {string}")
    public void the_user_navigates_back(String module) {
        new NotesPage().navigateToTab(module);
    }
    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}