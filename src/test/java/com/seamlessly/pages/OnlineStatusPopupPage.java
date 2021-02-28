package com.seamlessly.pages;

import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        String messagePath="//span[contains(text(),'"+string+"')]";
        Driver.get().findElement(By.xpath(messagePath)).click();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", onlineStatusPopupPage.setStatusButton);
        executor.executeScript("arguments[0].click();", onlineStatusPopupPage.setStatusButton);
    }

    public void chooseDeadline(String string){
        OnlineStatusPopupPage onlineStatusPopupPage = new OnlineStatusPopupPage();
        onlineStatusPopupPage.clearOptions.click();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        String messagePath="//div[@*='"+string+"']";
        executor.executeScript("arguments[0].scrollIntoView(true);",Driver.get().findElement(By.xpath(messagePath)));
        executor.executeScript("arguments[0].click();", Driver.get().findElement(By.xpath(messagePath)));
        executor.executeScript("arguments[0].scrollIntoView(true);", onlineStatusPopupPage.setStatusButton);
        executor.executeScript("arguments[0].click();", onlineStatusPopupPage.setStatusButton);

    }
    public void enterInputbox(String string){
        clearStatusMessage.click();
        Actions actions = new Actions(Driver.get());
        profile.click();
        clickSettingsModuleOptions("Status");
        inputBox.sendKeys(string);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(setStatusButton));
        actions.moveToElement(setStatusButton).click().perform();
    }
    public void deleteMessage(){
        profile.click();
        pstat.click();
        inputBox.clear();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", setStatusButton);
        executor.executeScript("arguments[0].click();", setStatusButton);
    }

    @FindBy(xpath = "//*[contains(@placeholder,'s your status?')]")
    public WebElement inputBox;

    @FindBy(xpath = "//*[contains(text(),'Set status message')]")
    public WebElement setStatusButton;

    @FindBy(css = ".multiselect__single")
    public WebElement clearOptions;

    @FindBy(css = ".status-buttons__select")
    public WebElement clearStatusMessage;


}
