package com.seamlessly.pages;

import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    public void login(String username){
        userInput.sendKeys(ConfigurationReader.get(username));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void login(String username,String password){
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
