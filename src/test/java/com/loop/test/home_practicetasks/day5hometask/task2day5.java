package com.loop.test.home_practicetasks.day5hometask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class task2day5 {
    /* 1. go to https://www.etsy.com/
 2. search for rings
 3. validate that Estimated Arrival shows any time
 3. click Estimated Arrival dropdown
 4. click Select custom date
 5. choose may 30 from dropdown
 6. validate Estimated Arrival shows may 30

     */
    WebDriver driver;
    String  validate;

    @BeforeClass
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethod(){
       // driver.close();

    }
    @Test
    public void SearchRing(){
        driver.get("https://www.etsy.com/");
        WebElement searchIcon = driver.findElement(By.xpath("//input{@id='global-enhancements-search-query'"));
        searchIcon.sendKeys("rings");
        WebElement EstimatedArrival =driver.findElement(By.xpath("//button[@value='Search"));
        EstimatedArrival.click();
        WebElement dropdownArrEstimate = driver.findElement(By.xpath("//span[contains(text(),'Estimated Arrival')]"));
        Assert.assertEquals(dropdownArrEstimate.getText(),"Estimated arrival any time");
        dropdownArrEstimate.click();
        Select customDate= new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
        customDate.selectByVisibleText("By May 30");
        validate= customDate.getFirstSelectedOption().getText();
        Assert.assertEquals(customDate, "By May 30");
   //     Assert.assertTrue(customDate.getFirstSelectedOption().getText().equals("By May 30"),"GO HOME");



/**
 * State registration fee $100
 * Payment processing $6
 * Service fee $150
 * Total $256
 *
 * Formation State - choose Maryland
 * Validate Maryland is selected
 * Validate order summer as below:
 *
 * State registration fee $170
 * Payment processing $10.20
 * Service fee $150
 * Total $330.20
 */










    }



}
