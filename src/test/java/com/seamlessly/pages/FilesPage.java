package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//a[@data-templatename='New text document.md']")
    public WebElement newFile;

    @FindBy(xpath = "//div//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public  WebElement newFilePageCloseIcon;

    @FindBy(xpath = "//a[@title='close']")
    public WebElement newFileTitleCloseIcon;

    @FindBy(xpath = "//ul/li/a[.='All files']")
    public WebElement allFiles;

    @FindBy(xpath = "//span[@class='fileactions']//span[@class='icon icon-more']")
    public WebElement folderFile3dot;

    @FindBy(className = "innernametext")
    public List<WebElement> fileFolderText;

    @FindBy(css = ".icon.icon-details")
    public WebElement details;

    @FindBy (id = "app-sidebar-vue")
    public WebElement sidePage;

    @FindBy(css = ".app-sidebar-tabs__tab-icon.icon-activity")
    public WebElement sidePageActivity;

    @FindBy(id = "commentsTabView")
    public WebElement sidePageComments;

    @FindBy(id ="sharing")
    public WebElement sidePageSharing;

    @FindBy(id = "versionsTabView")
    public WebElement sidePageVersions;

    @FindBy(css = "div[class='message']")
    public WebElement commentMsgInputBox;

    @FindBy(css = "input[class='submit icon-confirm has-tooltip']")
    public WebElement submitComment;

    @FindBy(xpath = "//li[@class='comment']")
    public WebElement comments;

    public void createTextFile(String s){
        plusIcon.click();
        newFile.click();
        actions.sendKeys(s, Keys.ENTER).perform();
    }

    public void createFolder(String s){
        plusIcon.click();
        newFolder.click();
        actions.sendKeys(s,Keys.ENTER).perform();
    }

    public void fileFolder3dotOptions(String option){
        folderFile3dot.click();
        Driver.get().findElement(By.xpath("//*[@data-action='" + option + "']")).click();
    }

    public void fileFolderDetailsOption(String s){
        String xpath="//a[@id='"+s+"TabView']";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    public void leaveComment(String str){
        commentMsgInputBox.sendKeys(str);
        submitComment.click();
    }



}


