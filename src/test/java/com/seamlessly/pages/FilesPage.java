package com.seamlessly.pages;

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

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> folderFileList;

    @FindBy(xpath = "//*[@data-action='Rename']")
    public WebElement rename;

    @FindBy(xpath = "//*[@data-action='Delete']")
    public WebElement delete;

    @FindBy(className = "innernametext")
    public List<WebElement> fileFolderText;



}


