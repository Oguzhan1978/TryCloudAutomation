package com.trycloud.tests.UserStories.ContactsModule;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UserCanSeeAllContactsNameInContactsList_Aibek extends TestBase {

    @Test(description = "US-5, TC-3: user can see all contacts name in contacts list")
    public void adding_1_new_contact() {

        //locating contact link
        BrowserUtils.sleep(3);
        WebElement ContactsLink = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        ContactsLink.click();

        //locating on '+' new contact link
        BrowserUtils.sleep(3);
        WebElement newContactLink = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContactLink.click();

        //creating object of faker
        Faker faker = new Faker();

        //locating and send keys to homePhone box
        BrowserUtils.sleep(3);
        WebElement homePhoneBox = driver.findElement(By.xpath("(//input[@class='property__value'])[1]"));
        //creating fake homePhone number and enter to box
        String homePhoneNumber = faker.phoneNumber().phoneNumber();
        homePhoneBox.sendKeys(homePhoneNumber);

        //locating and send keys to homeEmail box
        BrowserUtils.sleep(3);
        WebElement homeEmailBox = driver.findElement(By.xpath("//input[@inputmode='email']"));
        //creating fake homeEmail enter to box
        String homeEmail = faker.internet().emailAddress();
        homeEmailBox.sendKeys(homeEmail);

        //locating and send keys to post office box
        BrowserUtils.sleep(3);
        WebElement postOfficeBox = driver.findElement(By.xpath("(//div//input)[13]"));
        //creating fake post office box
        String postOffice = faker.address().zipCode();
        postOfficeBox.sendKeys(postOffice);

        //locating and send keys to address
        BrowserUtils.sleep(3);
        WebElement addressBox = driver.findElement(By.xpath("(//div//input)[14]"));
        //creating fake address
        String fakeAddress = faker.address().fullAddress();
        addressBox.sendKeys(fakeAddress);

        //locating and send keys to extended address
        BrowserUtils.sleep(3);
        WebElement extendedAddressBox = driver.findElement(By.xpath("(//div//input)[15]"));
        //creating fake extended address
        String fakeExtendedAddress = faker.address().secondaryAddress();
        extendedAddressBox.sendKeys(fakeExtendedAddress);

        //locating and send keys to postal code box
        BrowserUtils.sleep(3);
        WebElement postalCodeBox = driver.findElement(By.xpath("(//div//input)[16]"));
        //creating fake postal code
        String fakePostalCode = faker.address().zipCode();
        postalCodeBox.sendKeys(fakePostalCode);

        //locating and send keys to city box
        BrowserUtils.sleep(3);
        WebElement cityBox = driver.findElement(By.xpath("(//div//input)[17]"));
        //creating fake city
        String fakeCity = faker.address().city();
        cityBox.sendKeys(fakeCity);

        //locating and send keys to state box
        BrowserUtils.sleep(3);
        WebElement stateBox = driver.findElement(By.xpath("(//div//input)[18]"));
        //creating fake state
        String fakeState = faker.address().state();
        stateBox.sendKeys(fakeState);

        //locating and send keys to country box
        BrowserUtils.sleep(3);
        WebElement countryBox = driver.findElement(By.xpath("(//div//input)[19]"));
        //creating fake country
        String fakeCountry = faker.address().country();
        countryBox.sendKeys(fakeCountry);
/*
        //locating on new contact link
        WebElement newContactLink = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContactLink.click();*/
    }

    @Test(description = "US-5, TC-3: user can see all contacts name in contacts list")
    public void adding_2_new_contact() {

        //locating contact link
        BrowserUtils.sleep(3);
        WebElement ContactsLink = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        ContactsLink.click();

        //locating on '+' new contact link
        BrowserUtils.sleep(3);
        WebElement newContactLink = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContactLink.click();

        //creating object of faker
        Faker faker = new Faker();

        //locating and send keys to homePhone box
        BrowserUtils.sleep(3);
        WebElement homePhoneBox = driver.findElement(By.xpath("(//input[@class='property__value'])[1]"));
        //creating fake homePhone number and enter to box
        String homePhoneNumber = faker.phoneNumber().phoneNumber();
        homePhoneBox.sendKeys(homePhoneNumber);

        //locating and send keys to homeEmail box
        BrowserUtils.sleep(3);
        WebElement homeEmailBox = driver.findElement(By.xpath("//input[@inputmode='email']"));
        //creating fake homeEmail enter to box
        String homeEmail = faker.internet().emailAddress();
        homeEmailBox.sendKeys(homeEmail);

        //locating and send keys to post office box
        BrowserUtils.sleep(3);
        WebElement postOfficeBox = driver.findElement(By.xpath("(//div//input)[13]"));
        //creating fake post office box
        String postOffice = faker.address().zipCode();
        postOfficeBox.sendKeys(postOffice);

        //locating and send keys to address
        BrowserUtils.sleep(3);
        WebElement addressBox = driver.findElement(By.xpath("(//div//input)[14]"));
        //creating fake address
        String fakeAddress = faker.address().fullAddress();
        addressBox.sendKeys(fakeAddress);

        //locating and send keys to extended address
        BrowserUtils.sleep(3);
        WebElement extendedAddressBox = driver.findElement(By.xpath("(//div//input)[15]"));
        //creating fake extended address
        String fakeExtendedAddress = faker.address().secondaryAddress();
        extendedAddressBox.sendKeys(fakeExtendedAddress);

        //locating and send keys to postal code box
        BrowserUtils.sleep(3);
        WebElement postalCodeBox = driver.findElement(By.xpath("(//div//input)[16]"));
        //creating fake postal code
        String fakePostalCode = faker.address().zipCode();
        postalCodeBox.sendKeys(fakePostalCode);

        //locating and send keys to city box
        BrowserUtils.sleep(3);
        WebElement cityBox = driver.findElement(By.xpath("(//div//input)[17]"));
        //creating fake city
        String fakeCity = faker.address().city();
        cityBox.sendKeys(fakeCity);

        //locating and send keys to state box
        BrowserUtils.sleep(3);
        WebElement stateBox = driver.findElement(By.xpath("(//div//input)[18]"));
        //creating fake state
        String fakeState = faker.address().state();
        stateBox.sendKeys(fakeState);

        //locating and send keys to country box
        BrowserUtils.sleep(3);
        WebElement countryBox = driver.findElement(By.xpath("(//div//input)[19]"));
        //creating fake country
        String fakeCountry = faker.address().country();
        countryBox.sendKeys(fakeCountry);
/*
        //locating on new contact link
        WebElement newContactLink = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContactLink.click();*/
    }

    @Test
    public void contacts_list_name_verification() {
        //locating and finding contacts name and locating in List of WebElements

        List<WebElement> contactsNames = driver.findElements(By.xpath("//div[@class='app-content-list-item-line-one']"));
        String contactName = "Jack Ma";
        for (WebElement eachContact : contactsNames) {
            Assert.assertTrue(eachContact.equals(contactName), "Contact name verification FAILED!");
        }
    }

}
