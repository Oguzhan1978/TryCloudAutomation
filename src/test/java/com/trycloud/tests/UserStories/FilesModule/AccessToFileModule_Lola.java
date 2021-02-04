package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessToFileModule_Lola extends TestBase {

    // Test case #1 - Verify user can access to File module

    @Test
        public void Tc_01(){

        //  1. Login as a user

        //  2. Verify the page tile is Files module’s tile
        String expectedFileModule = "Files - Trycloud - QA";
        WebElement fileModule = driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']"));
        fileModule.click();
        String actualFileModule = driver.getTitle();

        Assert.assertNotEquals(actualFileModule, expectedFileModule);




    }

}
