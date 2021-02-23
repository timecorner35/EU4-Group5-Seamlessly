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

    @FindBy(xpath = "//div[@id='rightClickMenus']/ul/li")
    public List<WebElement> rightClickMenu;

    @FindBy(xpath = "//div[@id='rightClickDetector']")
    public WebElement hiddenBtn;


}


//span[@class='nametext']