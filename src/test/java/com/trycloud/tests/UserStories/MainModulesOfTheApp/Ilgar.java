package com.trycloud.tests.UserStories.MainModulesOfTheApp;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ilgar extends TestBase {

    @Test(description = "2-US-Test case #1 - verify users access to the main modules")
    public void verify_Users_Access_Main_Modules(){

        //1. Login as a user

        //2. Verify the user see the following modules:
        //Files
        WebElement files = driver.findElement(By.className("app-icon"));
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
        WebElement talk = driver.findElement(By.xpath("//a[@href='http://qa.trycloud.net/index.php/apps/spreed/']"));
        talk.click();
        BrowserUtils.sleep(2);

        //Contacts
        WebElement contacts = driver.findElement(By.xpath("//a[@href='/index.php/apps/contacts/']"));
        contacts.click();
        BrowserUtils.sleep(2);

        //Calendar
        WebElement calendar = driver.findElement(By.xpath("//a[@href='/index.php/apps/calendar/']"));
        calendar.click();
        BrowserUtils.sleep(2);

        //Note
        WebElement note = driver.findElement(By.xpath("//a[@href='/index.php/apps/notes/']"));
        note.click();
        BrowserUtils.sleep(2);
/*
        // ( Expected module name: Galleries
        String expectedModuleName = "Galleries";
        // Actual module name : Photos )
        String actualModuleName = driver.findElement(By.xpath("")).getText();
*/

        String expextedModuleName = "Galleries";
        WebElement actualModuleName =driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Photos']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]"));
        //String file = driver.findElement(By.xpath("//ul[@id='appmenu']//span[contains(text(),'Photos')]")).getText();
        //System.out.println(file);

        BrowserUtils.sleep(4);
        //Assert.assertTrue(file.contains(expextedFilesName));
        Assert.assertEquals(actualModuleName, expextedModuleName);

        //ul[@id='appmenu']//span[contains(text(),'Files')]

        //String expextedFilesName = "Files";
        //Web actualFilesName =driver.findElement(By.xpath("//ul[@id='appmenu']//span[contains(text(),'Files')]")).getText();
        //Assert.assertEquals(actualFilesName, expextedFilesName);
        //ul[@id='appmenu']//span[contains(text(),'Files')]


    }
}
