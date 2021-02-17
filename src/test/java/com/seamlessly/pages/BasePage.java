package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    Actions actions = new Actions(Driver.get());
    @FindBy(id = "nextcloud")
    public WebElement homeButton;
    @FindBy(xpath = "//*[@*='active']")
    public WebElement filesButton;
    @FindBy(xpath = "//*[@*='activity']")
    public WebElement activityButton;
    @FindBy(xpath = "//*[@*='contacts']")
    public WebElement contactsButton;
    @FindBy(xpath = "//*[@*='calendar']")
    public WebElement calendarButton;
    @FindBy(xpath = "//*[@*='notes']")
    public WebElement notesButton;
    @FindBy(xpath = "//*[@*='desk']")
    public WebElement deskButton;
    @FindBy(xpath = "//*[@*='tasks']")
    public WebElement tasksButton;
    @FindBy(className = "header-menu__trigger")
    public WebElement searchButton;
    @FindBy(xpath = "//*[@*='Notifications']")
    public WebElement notificationsButton;
    @FindBy(xpath = "//*[@*='contactsmenu-menu']")
    public WebElement ContactsButton;
    @FindBy(xpath = "//*[@*='expanddiv']")
    public WebElement profile;
    @FindBy(id = "view-toggle")
    public WebElement viewToggle;
    @FindBy(xpath = "//*[@data-id='settings']")
    public WebElement pset;
    @FindBy(className = "user-status-menu-item__toggle")
    public WebElement pstat;
    @FindBy(xpath = "//*[@data-id='help']")
    public WebElement help;
    @FindBy(xpath = "//*[@data-id='logout']")
    public WebElement logut;



    public void navigateTo(String s) {
        Driver.get().findElement(By.xpath("//*[@aria-label='" + s + "']")).click();

    }
    public void clickSettingsModule(String module){
        if(module.equals("Status")){
            pstat.click();
        }else{
        String path = "//*[@data-id='"+module.toLowerCase()+"']";
        Driver.get().findElement(By.xpath(path)).click();}
    }

}
