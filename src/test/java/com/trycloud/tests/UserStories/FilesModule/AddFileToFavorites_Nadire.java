package com.trycloud.tests.UserStories.FilesModule;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class AddFileToFavorites_Nadire extends TestBase {

    //Test case #3 - verify users can add a file to favorites.


    @Test(description = "verify users can add a file to favorites")
    public void AddFile() {

        //1.Login as a user

        // 2.Click action-icon from any file on the page
        WebElement actionIcon = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/a[1]/span[3]/a[2]/span[1]"));
        actionIcon.click();


        // 3.Choose “Add to Favorites” option
        WebElement AddToFavorites = driver.findElement(By.xpath("//span[normalize-space()='Add to favorites']"));
        AddToFavorites.click();


        // 4.Click “Favorites” sub-module on the lest side
        WebElement Favorites = driver.findElement(By.xpath("//a[normalize-space()='Favorites']"));
        Favorites.click();

        BrowserUtils.sleep(5);

        // 5.Verify the chosen file is listed on the table
        Assert.assertNotNull( driver.findElement(By.id("//span[@class='nametext']")) ); //verify driver is able to find the expected file



       










    }






}
