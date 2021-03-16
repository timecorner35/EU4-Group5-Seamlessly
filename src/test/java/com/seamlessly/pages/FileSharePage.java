package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileSharePage extends BasePage{

    @FindBy(xpath= "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[1]")
    public WebElement shareIcon_Line1;

    @FindBy(css=".action-item.action-item--single.sharing-entry__actions")
    public WebElement NewshareButton;

    @FindBy(xpath="//*[@id=\"fileList\"]/tr[1]")
    public WebElement fileLine1;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]")
    public WebElement fileLine2;

    @FindBy(css = ".nav-icon-files.svg.active")
    public WebElement allFilesMenu;

    @FindBy(css= ".nav-icon-shareoverview")
    public WebElement allFileShareBUtton;

    @FindBy(xpath = "//div[10]/table/tbody")
    public WebElement SharedFIleTable;

    @FindBy (xpath = "//*[@id=\"sharing\"]/ul[1]/li/div[3]/div/div")
    public WebElement Share_link_menu;

    @FindBy(xpath = "//span[text()='Unshare']")
    public WebElement unshareButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[3]/a[1]")
    public WebElement nextSharedFile;








}
