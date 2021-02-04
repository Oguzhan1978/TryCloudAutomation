package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase4_Oguzhan extends TestBase {

    @BeforeClass
    @Override
    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @Test(description = "verify users can remove a file from favorites.  ")
    public void Tc04(){
        driver.findElement(By.id("user")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.cssSelector("#password")).sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(2);
        driver.findElement(By.id("submit-form")).click();
        BrowserUtils.sleep(5);

        // clicking file module
        driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Files']//*[local-name()='svg']//*[name()='image' and contains(@class,'app-icon')]")).click();
        // clicking favorite module
        driver.findElement(By.xpath("//a[@class='nav-icon-favorites svg']")).click();
        BrowserUtils.sleep(3);
        //clicking (...) button
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]/span[3]/a[2]/span[1]")).click();
        BrowserUtils.sleep(3);
        //clicking remove from favorite.
        driver.findElement(By.xpath("//span[normalize-space()='Remove from favorites']")).click();
        BrowserUtils.sleep(5);

    }


}
