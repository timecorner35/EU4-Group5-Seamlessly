package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileSettingsPage extends BasePage {
    @FindBy(id = "displayname")
    public WebElement nameInput;
    @FindBy(id = "email")
    public WebElement emailInput;
    @FindBy(id = "phone")
    public WebElement phoneInput;
    @FindBy(id = "address")
    public WebElement addressInput;
    @FindBy(id = "website")
    public WebElement websiteInput;
    @FindBy(id = "twitter")
    public WebElement twitterInput;
    @FindBy(id = "languageinput")
    public WebElement language;
    @FindBy(id = "localeinput")
    public WebElement locale;
}
