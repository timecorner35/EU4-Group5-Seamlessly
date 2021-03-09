package com.seamlessly.pages;


import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;

import com.seamlessly.utilities.BrowserUtils;
import com.seamlessly.utilities.Driver;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//a[@data-templatename='New text document.md']")
    public WebElement newFile;

    @FindBy(xpath = "//div//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement newFilePageCloseIcon;

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

    @FindBy(id = "app-sidebar-vue")
    public WebElement sidePage;

    @FindBy(css = ".app-sidebar-tabs__tab-icon.icon-activity")
    public WebElement sidePageActivity;

    @FindBy(id = "commentsTabView")
    public WebElement sidePageComments;

    @FindBy(id = "sharing")
    public WebElement sidePageSharing;

    @FindBy(id = "versionsTabView")
    public WebElement sidePageVersions;

    @FindBy(xpath = "(//*[@class='nametext'])[2]")
    public WebElement favfolder;

    @FindBy(xpath ="//span[text()='Add to favourites']")
    public WebElement addToFav;

    @FindBy(css = ".nav-icon-favorites.svg")
    public WebElement favTab;

    @FindBy(xpath = "(//span[text()='Folder1'])[3]")
    public WebElement favTabFolder;




    @FindBy(xpath = "(//div[@class='message'])[1]")
    public WebElement commentMsgInputBox;

    @FindBy(xpath = "(//input[@class='submit icon-confirm has-tooltip'])[1]")
    public WebElement submitComment;

    @FindBy(xpath = "//li[@class='comment']")
    public WebElement comments;

    @FindBy(css = ".app-sidebar-header__maintitle")
    public WebElement sidePageTitle;

    @FindBy(xpath = "//*[@data-action='Delete']")
    public WebElement delete;

    @FindBy(xpath = "//*[@id='app-sidebar-vue']//*[contains(@style,'folder.svg')]")
    public WebElement folderIcon;

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> folderFileList;

    @FindBy(xpath = "//*[@class='app-sidebar-tabs__nav']//ul/li")
    public List<WebElement> sidePageSideTab;

    @FindBy(css = "a[class='action more icon icon-more has-tooltip']")
    public WebElement comment3dot;

    @FindBy(css = "a[class='menuitem action edit permanent']")
    public WebElement editComment;

    @FindBy(xpath = "(//form/div[@class='message' ])[2]")
    public WebElement editCommentInputBox;

    @FindBy(xpath = "(//input[@class='submit icon-confirm has-tooltip'])[2]")
    public WebElement editCommentSubmit;

    public void createTextFile(String s) {
        plusIcon.click();
        newFile.click();
        actions.sendKeys(s, Keys.ENTER).perform();
    }

    public void createFolder(String s) {
        plusIcon.click();
        newFolder.click();
        actions.sendKeys(s, Keys.ENTER).perform();
    }


    public void fileFolder3dotOptions(String option) {
        folderFile3dot.click();
        Driver.get().findElement(By.xpath("//*[@data-action='" + option + "']")).click();
    }

    public void fileFolderDetailsOption(String s) {
        String xpath = "//a[@id='" + s + "TabView']";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    public void leaveComment(String str) {
        commentMsgInputBox.sendKeys(str);
        submitComment.click();
    }

    public void checkNamesAndDelete() {
        Driver.get().navigate().refresh();

        while (folderFileList.size() > 0) {
            folderFile3dot.click();
            details.click();
            BrowserUtils.waitFor(3);
            Assert.assertTrue(sidePageTitle.getText().contains(fileFolderText.get(0).getText()));
            folderFile3dot.click();
            delete.click();
            Driver.get().navigate().refresh();
        }

    }

    public void checkAvailableOptions(List<String>s) {
        while (folderFileList.size() > 0) {
            folderFile3dot.click();
            details.click();
            BrowserUtils.waitFor(3);
            List<String> tabs = new ArrayList<>();
            for (WebElement o : sidePageSideTab) {
                tabs.add(o.getText());
            }
            try {
                Assert.assertTrue(folderIcon.isDisplayed());
                Assert.assertTrue(!tabs.contains(s.get(3)) && tabs.size() == 3);
            } catch (NoSuchElementException e) {
                Assert.assertTrue(tabs.containsAll(s));
            } finally {
                folderFile3dot.click();
                delete.click();
                Driver.get().navigate().refresh();
            }


        }
    }

    public void setEditComment(String comment){
        comment3dot.click();
        editComment.click();
        editCommentInputBox.clear();
        editCommentInputBox.sendKeys(comment);
        editCommentSubmit.click();
    }



}



