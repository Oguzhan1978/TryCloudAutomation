package com.trycloud.tests.UserStories.MainModulesOfTheApp;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ilgar extends TestBase {

    @Test(description = "2-US-Test case #1 - verify users access to the main modules")
    public void verify_Users_Access_Main_Modules(){

        //Files
        WebElement files = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        files.click();
        BrowserUtils.sleep(2);

        //Galleries
        WebElement galleries = driver.findElement(By.xpath("//a[@href='/index.php/apps/photos/']"));
        galleries.click();
        BrowserUtils.sleep(2);

        //Activity
        WebElement activity = driver.findElement(By.xpath("//a[@href='/index.php/apps/activity/']"));
        activity.click();
        BrowserUtils.sleep(2);

        //Talk
        WebElement talk = driver.findElement(By.xpath("//a[@href='http://qa3.trycloud.net/index.php/apps/spreed/']"));
        talk.click();
        BrowserUtils.sleep(2);

        //mail
        WebElement mail = driver.findElement(By.xpath("//a[@href='/index.php/apps/mail/']"));
        mail.click();
        BrowserUtils.sleep(2);

        //contacts
        WebElement contacts = driver.findElement(By.xpath("//a[@href='/index.php/apps/contacts/']"));
        contacts.click();
        BrowserUtils.sleep(2);

        //Note
        WebElement calendar = driver.findElement(By.xpath("//a[@href='/index.php/apps/calendar/']"));
        calendar.click();
        BrowserUtils.sleep(2);


        List<WebElement> eachElement = driver.findElements(By.xpath("//ul[@id='appmenu']//a"));

        for (WebElement each : eachElement){
            Assert.assertTrue(each.isDisplayed(), "Displayed wrong module name");
        }
/*
        // ( Expected module name: Galleries
        String expectedModuleName = "Galleries";
        // Actual module name : Photos )
        String actualModuleName = driver.findElement(By.xpath("")).getText();
*/



    }
}
