package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.AddFilePage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UploadFile {

    AddFilePage addFilePage = new AddFilePage();

    @When("the user upload new file")
    public void the_user_upload_new_file() {
        addFilePage.addButton.click();
        String projectPath=System.getProperty("user.dir");
        String Filepath="/src/test/resources/Test test.docx";
        String fullPath=projectPath+Filepath;

        BrowserUtils.waitFor(4);
        addFilePage.UploadFile.sendKeys(fullPath);
        BrowserUtils.waitFor(4);



    }

    @Then("the user should locate uploaded file")
    public void the_user_should_locate_uploaded_file() {

        addFilePage.homeButton.click();
        BrowserUtils.waitFor(2);
        String expectednewFile="docx";
       Assert.assertTrue(addFilePage.uploadedFolder.getText().contains(expectednewFile));
    }

    @When("the user create new folder")
    public void the_user_create_new_folder() {

        BrowserUtils.waitFor(4);
        addFilePage.addButton.click();
        BrowserUtils.waitFor(4);
        addFilePage.NewFolder.click();
        addFilePage.FolderName.sendKeys("folder3");
        BrowserUtils.waitFor(3);
        addFilePage.NewfolderConfrim.click();
    }

    @Then("the user should locate new folder")
    public void the_user_should_locate_new_folder() {
        BrowserUtils.waitFor(3);
       String expectedFolderName = "folder3";
        Assert.assertEquals(expectedFolderName,addFilePage.uploadedFolder.getText());
    }

    @When("the user create new text file")
    public void the_user_create_new_text_file() {
        addFilePage.addButton.click();
        addFilePage.NewTextDocument.click();
        BrowserUtils.waitFor(3);
        addFilePage.textName.sendKeys("Text test11" );
        addFilePage.NewfolderConfrim.click();
        addFilePage.textInput.sendKeys("deneme deneme");
        addFilePage.closeButton.click();



    }

    @Then("the user should locate new text file")
    public void the_user_should_locate_new_text_file() {
        BrowserUtils.waitFor(2);
        String expectedtextName = addFilePage.newCreatedText.getText();
        Assert.assertEquals(expectedtextName,addFilePage.newCreatedText.getText());

    }

}
