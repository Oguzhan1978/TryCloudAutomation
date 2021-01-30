package com.trycloud.tests.base;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
        loginTryCloud();

    }

    public static void loginTryCloud(){
        driver.findElement(By.id("user")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.cssSelector("#password")).sendKeys(ConfigurationReader.getProperty("password"));
        driver.findElement(By.id("submit-form")).click();
    }



    @AfterClass
    public void teardown() {
        driver.close();
    }
}
