package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPopupPage extends BasePage {
    public OnlineStatusPopupPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void chooseStatus(String status){
        String statusPath = "//*[contains(.,'"+status+"')][@class='user-status-online-select']";
        Driver.get().findElement(By.xpath(statusPath)).click();
    }

    @FindBy(xpath = "//*[contains(@placeholder,'s your status?')]")
    public WebElement inputBox;

    @FindBy(xpath = "//*[contains(text(),'Set status message')]")
    public WebElement setStatusButton;

}
