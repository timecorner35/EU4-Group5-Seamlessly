package com.seamlessly.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage{
    @FindBy(id ="displayname" )
    public WebElement nameInput;
    @FindBy(id = "email")
    public WebElement emailInput;
    @FindBy(id = "language")
    public WebElement languageInput;
    @FindBy(id = "Phone")
    public WebElement phoneNumberInput;
    @FindBy(id = "address")
    public WebElement addressInput;
    @FindBy(id = "website")
    public WebElement websiteInput;
    @FindBy(id = "twitter")
    public WebElement twitterInput;
    @FindBy(id = "locale")
    public WebElement localeInput;

}

