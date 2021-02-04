package com.trycloud.tests.UserStories.ContactsModule;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase2_Oguzhan extends TestBase {

    @BeforeClass
    @Override
    public void setup() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url")) ;
    }

    @Test(description = " verify users can add contacts")
    public void Tc04() {
        driver.findElement(By.id("user")).sendKeys(ConfigurationReader.getProperty("username"));
        driver.findElement(By.cssSelector("#password")).sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(2);
        driver.findElement(By.id("submit-form")).click();
        BrowserUtils.sleep(5);

        //clicking contact module
        driver.findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='Contacts']")).click();
        //clicking new contact
        driver.findElement(By.xpath("//button[normalize-space()='New contact']")).click();

        //locating info webElements
        WebElement phoneHomeInput = driver.findElement(By.xpath("//input[@inputmode='tel']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@inputmode='email']"));
        WebElement addressInput = driver.findElement(By.xpath("//div[@class='property-masonry']//div[3]//input[1]"));
        WebElement postalCode = driver.findElement(By.xpath("//div[@class='property-masonry']//div[5]//input[1]"));
        WebElement cityAddress = driver.findElement(By.xpath("//div[@class='property-masonry']//div[6]//input[1]"));
        WebElement stateInput = driver.findElement(By.xpath("//div[7]//input[1]"));
        WebElement country = driver.findElement(By.xpath("//div[8]//input[1]"));


        //filling info
        Faker faker = new Faker();
        phoneHomeInput.sendKeys(faker.phoneNumber().phoneNumber());
        emailInput.sendKeys(faker.internet().emailAddress());
        BrowserUtils.sleep(2);
        addressInput.sendKeys(faker.address().streetAddress());
        BrowserUtils.sleep(2);
        postalCode.sendKeys(faker.address().zipCode());
        cityAddress.sendKeys(faker.address().city());
        stateInput.sendKeys(faker.address().stateAbbr());
        country.sendKeys(faker.address().country());
        BrowserUtils.sleep(2);

    }
}