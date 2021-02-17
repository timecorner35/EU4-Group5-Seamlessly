package com.seamlessly.pages;

import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    public void login(String username){
        Driver.get().get(ConfigurationReader.get("url"));
        userInput.sendKeys(ConfigurationReader.get(username));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }
    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;
}
