package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{

    @FindBy(xpath = "//ul/li/a[.='All files']")
    public WebElement allFiles;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement folder;

    @FindBy(xpath = "//div[@id='rightClickMenu']/ul/li[3]")
    public WebElement rightClickMenu;
}


//span[@class='nametext']