package com.loop.test.home_practicetasks.day2hometask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task1 {

    /**
     * Task 1
     * ================
     * 1- Open a chrome browser
     * 2- Go to: https://google.com
     * 3- Click to Gmail from top right.
     * 4- Verify title contains:
     * Expected: Gmail
     * 5- Go back to Google by using the .back();
     * 6- Verify title equals:
     * Expected: Google
     */
    public static void main(String[] args) {
        // set up the driver
        WebDriverManager.chromedriver().setup();
        // create driver object
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // navigate to google page
        driver.get("https://google.com");

        driver.navigate(). to ("https://mail.google.com/mail/&ogbl");

        String expectedTittle = "Gmail";
        String actualTittle = driver.getTitle();

        if ( actualTittle.contains(expectedTittle)){
            System.out.println("Actual title " + actualTittle + "matches expected title " + expectedTittle + " , => TEST PASS ");
        }else {
            System.out.println( "Actual title " + actualTittle+ "DOES NOT matches expected title " +expectedTittle + " , => TEST FAILED");
        }

            // navigate back
        driver.navigate().back() ;

        String expectedTittle1 = "Google";
        String actualTittle1 = driver.getTitle();

        if (actualTittle1.equals(expectedTittle1)) {
            System.out.println("Actual tittle: " + actualTittle1 + ", matched expected tittle: " + expectedTittle1 + " => TEST PASS");
        } else {
            System.out.println("Actual tittle: " + actualTittle1 + ", DOES NOT match expected tittle: " + expectedTittle1 + " => TEST FAIL");
        }
        driver.quit();
    }}


