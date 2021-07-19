package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedInTest extends BaseClass {

    /** test for Login Page
     and also check actual result and expected result */
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException
    {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }
}
