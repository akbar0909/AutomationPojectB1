package com.loop.test.home_practicetasks.day9homework;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class FillFormHomeTask {
    /*task1
============
1. go to url: https://loopcamp.vercel.app/registration_form.html
2. fill the form
3. use faker


     */


    @Test
    public void fillForm(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.registration"));
        Faker faker = new Faker();
        WebElement fistName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        fistName.sendKeys(faker.name().firstName());
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName = Driver.getDriver().findElement(By.xpath("//*[@name='username']"));
        userName.sendKeys(faker.bothify("???###"));
        WebElement emailAddress =Driver.getDriver().findElement(By.xpath("//*[@name ='email']"));
        emailAddress.sendKeys(faker.internet().emailAddress());
        WebElement password =Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = Driver.getDriver().findElement(By.name("phone"));
        phoneNumber.sendKeys(faker.numerify("571-###-####"));
        WebElement otherRadio = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        otherRadio.click();

        SimpleDateFormat dob = new SimpleDateFormat("MM/dd/yyyy");
       Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(dob.format(faker.date().birthday()));
        Select depOf = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        depOf.selectByIndex(1);
        Select title = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        title.selectByIndex(4);
        WebElement loginButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
        loginButton.click();
        WebElement noSuccessMessage = Driver.getDriver().findElement(By.xpath("//span[.='This page isn’t working']"));
        String expected ="This page isn’t working";
        Assert.assertEquals(noSuccessMessage.getText(),expected);





    }
}
