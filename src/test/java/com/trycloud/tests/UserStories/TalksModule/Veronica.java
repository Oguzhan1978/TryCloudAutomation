package com.trycloud.tests.UserStories.TalksModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Veronica extends TestBase {

    @Test(description = "User Story #4: As a user, I should be able to access to Talk module")
    public void tc01_verify_users_can_access_to_Talk_module(){
        //1. Login as a user

        //2. Click Talks module
        WebElement talkIcon = driver.findElement(By.xpath("(//a[@aria-label='Talk'])[1]"));
        talkIcon.click();

        //3. Verify the page tile is Talk module’s title
        String expectedTitle = "Talk";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
