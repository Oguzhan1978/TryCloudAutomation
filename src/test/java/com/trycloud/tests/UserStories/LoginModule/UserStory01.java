package com.trycloud.tests.UserStories.LoginModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory01 extends TestBase {

    @BeforeClass
    @Override
    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @Test(description = "verify user cannot login with invalid credentials")
    public void Tc01() {

        driver.findElement(By.id("user")).sendKeys(ConfigurationReader.getProperty("invalidUsername"));
        driver.findElement(By.cssSelector("#password")).sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        BrowserUtils.sleep(1);
        driver.findElement(By.id("submit-form")).click();
        BrowserUtils.sleep(10);

        String expectedMessage = "Wrong username or password.";
        String actualMessage = driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']")).getText();

        String expectedTitle = "Trycloud - QA";
        String actualTitle = driver.getTitle();


        Assert.assertEquals(actualMessage, expectedMessage);
        Assert.assertEquals(actualTitle, expectedTitle);

    }


}
