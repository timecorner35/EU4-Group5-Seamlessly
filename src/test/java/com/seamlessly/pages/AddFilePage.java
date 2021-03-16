package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFilePage extends BasePage{

    @FindBy(css = "span.icon.icon-add")
    public WebElement addButton;

    @FindBy(css = "#file_upload_start")
    public WebElement UploadFile;
//#file_upload_start
    @FindBy(css= "a[data-action='folder']")
    public WebElement NewFolder;

    @FindBy(css = "a[data-action='file']")
    public WebElement NewTextDocument;
////*[@id="controls"]/div[2]/div[2]/ul/li[1]/label

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement NewfolderConfrim;

    @FindBy(id="view13-input-folder")
    public WebElement FolderName;

    @FindBy (xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]")
    public WebElement uploadedFolder;


    @FindBy(linkText = "New text document")
    public WebElement NewtextDocument;

    @FindBy(id = "view13-input-file")
    public WebElement textName;

    @FindBy(xpath = "//*[@id=\"editor\"]/div[2]/div[2]/div")
    public WebElement textInput;

    @FindBy(xpath= "//*[@id=\"app-sidebar-vue\"]/header/a")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[1]")
    public WebElement newCreatedText;

    @FindBy(xpath="//*[@id=\"fileList\"]/tr")
    public WebElement fileTable;

}
