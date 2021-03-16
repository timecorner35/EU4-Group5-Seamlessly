package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.FileSharePage;
import com.seamlessly.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileSharingStepDefs {

    FileSharePage fileSharePage = new FileSharePage();

    @When("user clicks share button and click new share-link button")
    public void user_clicks_share_button_and_click_new_share_link_button() {
        fileSharePage.shareIcon_Line1.click();
        BrowserUtils.waitFor(3);
        fileSharePage.NewshareButton.click();


    }

    @When("user clicks home button")
    public void user_clicks_home_button() {
        fileSharePage.homeButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should locate shared icon next to file from home page")
    public void user_should_locate_shared_icon_next_to_file_from_home_page() {

        BrowserUtils.waitFor(3);
        String expectedIcon= "Shared";
        Assert.assertTrue(expectedIcon,fileSharePage.fileLine1.getText().contains(expectedIcon));

    }


    @When("user clicks all files menu and clicks shares option")
    public void user_clicks_all_files_menu_and_clicks_shares_option() {

        fileSharePage.allFilesMenu.click();
        BrowserUtils.waitFor(2);
        fileSharePage.allFileShareBUtton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should locate shared files")
    public void user_should_locate_shared_files() {
        String expected="Shared";
        Assert.assertTrue(fileSharePage.SharedFIleTable.getText().contains(expected));
    }


    @When("user clicks share button and clicks share-link menu button")
    public void user_clicks_share_button_and_clicks_share_link_menu_button() {



        if(fileSharePage.fileLine1.getText().contains("Shared")){
            fileSharePage.shareIcon_Line1.click();
            BrowserUtils.waitFor(2);
            fileSharePage.Share_link_menu.click();
        }else {fileSharePage.nextSharedFile.click();
            BrowserUtils.waitFor(2);
            fileSharePage.Share_link_menu.click();
        }

    }

    @When("user clicks unshare button from share-link menu")
    public void user_clicks_unshare_button_from_share_link_menu() {
        BrowserUtils.waitFor(2);
        fileSharePage.unshareButton.click();
        fileSharePage.allFilesMenu.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user should locate unshared icon next to file from home page")
    public void user_should_locate_unshared_icon_next_to_file_from_home_page() {

        if(fileSharePage.fileLine1.getText().contains("Shared")){
            BrowserUtils.waitFor(3);
            String expectedIcon= "Share";
            Assert.assertEquals(expectedIcon,fileSharePage.fileLine2.getText());
        }



    }



}
