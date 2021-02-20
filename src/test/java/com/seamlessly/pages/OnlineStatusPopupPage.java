package com.seamlessly.pages;

import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnlineStatusPopupPage extends BasePage {
    public OnlineStatusPopupPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void chooseStatus(String status){
        String statusPath = "//*[contains(.,'"+status+"')][@class='user-status-online-select']";
        Driver.get().findElement(By.xpath(statusPath)).click();
    }

    public void chooseMessage(String string){
        String messagePath="//span[contains(text(),'"+string+"')]";
        Driver.get().findElement(By.xpath(messagePath)).click();
        new OnlineStatusPopupPage().setStatusButton.click();
    }

    public void chooseDeadline(String string){
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.clearOptions.click();
        BrowserUtils.waitFor(1);
        String messagePath="//div[@*='"+string+"']";
        Driver.get().findElement(By.xpath(messagePath)).click();
        new OnlineStatusPopupPage().setStatusButton.click();
    }

    @FindBy(xpath = "//*[contains(@placeholder,'s your status?')]")
    public WebElement inputBox;

    @FindBy(xpath = "//*[contains(text(),'Set status message')]")
    public WebElement setStatusButton;

    @FindBy(css = ".multiselect__single")
    public WebElement clearOptions;


}
