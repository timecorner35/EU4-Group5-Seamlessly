package com.seamlessly.pages;

import com.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusPopupPage {
    public OnlineStatusPopupPage(){
        PageFactory.initElements(Driver.get(),this);
    }





    public void chooseStatus(String status){
        String statusPath = "//*[contains(.,'"+status+"')][@class='user-status-online-select']";
        Driver.get().findElement(By.xpath(statusPath)).click();
    }

}
