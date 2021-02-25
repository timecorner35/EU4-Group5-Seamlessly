package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(xpath = "//ul/li/a[.='All files']")
    public WebElement allFiles;

    @FindBy(xpath = "//span[@class='fileactions']//span[@class='icon icon-more']")
    public List<WebElement> folderFile3dot;

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> folderFileList;

    @FindBy(xpath = "//*[@data-action='Rename']")
    public WebElement rename;

    @FindBy(className = "innernametext")
    public List<WebElement> fileFolderText;


//span[@class='icon icon icon-rename']
//*[@data-action='Rename']
}


//span[@class='nametext']