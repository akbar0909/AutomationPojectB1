package com.loop.test.home_practicetasks.day2hometask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task3 {
    /**
     * 1. Open Docuport app
     * 2. Send UserName
     * 3. Send password
     * 4. Click login
     */
    public static void main(String[] args) throws InterruptedException{
        // set up the driver
        WebDriverManager.chromedriver().setup();
        // create driver object
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(" b1g1_supervisor@gmail.com");

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys("Group1");
        Thread.sleep(1000);
      ;
        //driver.findElement(By.className("v-btn__content") ).click();
        WebElement login= driver.findElement(By.className("v-btn__content") );
        login.click();
        Thread.sleep(1000);
        driver.quit();






    }
}
