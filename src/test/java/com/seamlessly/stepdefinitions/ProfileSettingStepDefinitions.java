package com.seamlessly.stepdefinitions;

import io.cucumber.java.en.When;

public class ProfileSettingStepDefinitions {

    @When("the user add a name into the box")
    public void theUserAddANameIntoTheBox() {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.nameInput.clear();
        settingsPage.nameInput.sendKeys("Ritesh");
    }

    @Then("the name changed to a new given name")
    public void theNameChangedToANewGivenName() {
        SettingsPage settingsPage = new SettingsPage();
        String expected = "Ritesh";
        String actual = settingsPage.nameInput.getAttribute("value");
        Assert.assertEquals(expected, actual);
    }
}


