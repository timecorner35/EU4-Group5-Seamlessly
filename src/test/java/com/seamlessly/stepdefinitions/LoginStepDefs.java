package com.seamlessly.stepdefinitions;

import com.seamlessly.pages.LoginPage;
import com.seamlessly.utilities.ConfigurationReader;
import com.seamlessly.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    @Given("the user has already logged in as {string}")
    public void the_user_has_already_logged_in_as(String user) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username=null;
        String password="Employee123";
        if(user.equals("yusuf")){
            username=ConfigurationReader.get("yusuf");
        }else if(user.equals("asel")){
            username=ConfigurationReader.get("asel");
        }else if(user.equals("ritesh")){
            username=ConfigurationReader.get("ritesh");
        }else if(user.equals("fatma")){
            username=ConfigurationReader.get("fatma");
        }else if(user.equals("elif")){
            username=ConfigurationReader.get("elif");
        }else if(user.equals("jolbek")){
            username=ConfigurationReader.get("jolbek");
        }
        new LoginPage().login(username,password);
    }

}
