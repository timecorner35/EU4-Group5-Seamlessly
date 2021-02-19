package com.seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFilePage extends BasePage{

    @FindBy(css = "span.icon.icon-add")
    public WebElement addButton;

    @FindBy(css = "label[data-action='upload']")
    public WebElement UploadFile;

    @FindBy(css= "a[data-action='folder']")
    public WebElement NewFolder;

    @FindBy(css = "a[data-action='file']")
    public WebElement NewTextDocument;

}
