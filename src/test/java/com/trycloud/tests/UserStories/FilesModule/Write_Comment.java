package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Write_Comment extends TestBase {
    @Test(description = "Test case #8 - verify users can write comments to files/folders.")
    public void TC09() {


//        Click action-icon from any file on the page
        WebElement actionIcon = driver.findElement(By.xpath("//a[@href='/index.php/apps/files?dir=//Java']//span[@class='fileactions']//a[@class='action action-menu permanent']"));

        actionIcon.click();


//        Click details
        WebElement details = driver.findElement(By.xpath("//span[normalize-space()='Details']"));
        details.click();
//        Write a comment inside to the input box
        WebElement comments = driver.findElement(By.xpath("//a[normalize-space()='Comments']"));
        comments.click();

        WebElement inputBox = driver.findElement(By.xpath("//div[@class='message']"));
        inputBox.sendKeys("Hello");
//        Click the submit button to post it

        WebElement submitButton = driver.findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));
        submitButton.click();
//        Verify the comment is displayed in the comment section

        WebElement verifyComment = driver.findElement(By.xpath("//ul[@class='comments']//div[.='Hello']"));

        Assert.assertTrue(verifyComment.isDisplayed());

    }

}
