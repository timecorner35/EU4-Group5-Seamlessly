package com.seamlessly.pages;

import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void login(){
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

    @FindBy(id = "user")
    WebElement userInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit-form")
    WebElement loginButton;




}
