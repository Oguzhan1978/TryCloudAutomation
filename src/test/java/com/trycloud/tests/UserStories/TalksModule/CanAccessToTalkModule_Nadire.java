package com.trycloud.tests.UserStories.TalksModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CanAccessToTalkModule_Nadire extends TestBase {

    //Test case #1 - verify users can access to Talks module

    @Test(description = "verify users can access to Talks module")
    public void accessToTalkModule(){

        // 1.Login as a user

        // 2.Click Talks module
        WebElement talks = driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Talk']"));
        talks.click();

        BrowserUtils.sleep(5);


        // 3.Verify the page tile is Talks module’s tile
        String expectedTitle = "Talk";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


}
