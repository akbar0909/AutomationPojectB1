package com.loop.test.home_practicetasks.day3hometask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task0 {


    public static void main(String[] args) throws InterruptedException {
        /** 1. go to http://the-internet.herokuapp.com/forgot_password
         2. locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
         3. use css
         4. verify those elements are displayed
         */


        // got ot the url
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
       WebElement forgetPassword = driver.findElement(By.tagName("h2"));
       WebElement emailLabel = driver.findElement(By.cssSelector("label[for ='email']"));
       WebElement emailInput = driver.findElement(By.cssSelector("input[name='email'] "));
       WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
       WebElement powerSelenium = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
//        System.out.println("forgetPassword.isDisplayed() = " + forgetPassword.isDisplayed());
//        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
//        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
//        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
//        Thread.sleep(2000);
//        System.out.println("powerSelenium.isDisplayed() = " + powerSelenium.isDisplayed());

        if (forgetPassword.isDisplayed()) {
            System.out.println("Forgot password header is displayed");
        } else {
            System.out.println("Forgot Password header is not displayed");
        }

        if(emailLabel.isDisplayed()){
            System.out.println("Email input displayed");

        }else{
            System.out.println("Email input DOES NOT displayed");

        }
         if(retrievePassword.isDisplayed()){
             System.out.println("Retrieve Password is displayed");
         }else {
             System.out.println("Retrieve Password DOES NOT displayed");
         }
         if(powerSelenium.isDisplayed()){
             System.out.println("Elements are displayed");
         }else {
             System.out.println("elements DO NOT displayed");
         }

        driver.quit();
    }

}
