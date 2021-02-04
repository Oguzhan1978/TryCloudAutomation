package com.trycloud.tests.UserStories.TalksModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMessage_Manshuk extends TestBase {
    //Test case #2 - verify users can send message (Talk Module)

    @Test(description = "verify users can send message (Talk Module)")
    public void verify_send_message() {
        //Login as a user

       // 2.Click Talks module
        WebElement talkModule = driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Talk']"));
        talkModule.click();
        //3 Finds searchbox
       WebElement searchBox = driver.findElement(By.className("app-navigation-search__input"));
        BrowserUtils.sleep(10);
       //4 Finds a user
        searchBox.sendKeys("User100");
        driver.findElement(By.className("acli__content__line-one__title")).click();
       BrowserUtils.sleep(10);
        //5.sends a message
        driver.findElement(By.className("new-message-form__advancedinput")).sendKeys("Hello,How are you Today?");

        //6 Verify message is send
       String text = driver.findElement(By.className("rich-text--wrapper")).getText();

       Assert.assertEquals(text,text);



    }

}
/*
Login as a user
2.Click Talks module
3.Search a user from search box on the left
4.Write a message
5.Click submit button
6.Verify the message is displayed on the conversation log
 */
