package com.loop.test.home_practicetasks.day3hometask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task1 {
    /**
     * 1. login to docuport application
     * 2. logout from docuport application
     * 3. Validate successful login
     * 4. Validate successful logout
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
        userName.sendKeys(" b1g1_supervisor@gmail.com");
        //userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys("Group1");
        //password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement login = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        login.click();

        Thread.sleep(3000);
        WebElement groupName = driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3'"));
        groupName.click();
        Thread.sleep(3000);
        WebElement homeIcon = driver.findElement(By.cssSelector("[class='v-icon notranslate mdi mdi-home theme--light']"));


        if (homeIcon.isDisplayed()) {
            System.out.println("Login was successful");
        } else {
            System.out.println("Login failed");
        }

        WebElement logout = driver.findElement(By.xpath("//*[@id='list-item-107']/div"));
        logout.click();
        Thread.sleep(200);

        WebElement loginIcon = driver.findElement(By.cssSelector("span[class='v-btn__content']"));

        if (loginIcon.isDisplayed()) {
            System.out.println("Logout was successful");
        } else {
            System.out.println("Logout failed");
        }
    }
}
/*
driver.findElement(By.cssSelector("a[href='/reset-password']"));
        resetPassword.click();
        WebElement resetPasswordText = driver.findElement(By.cssSelector("[class='text-h5 font-weight-medium mb-6']"));

        if (resetPasswordText.isDisplayed()) {
            System.out.println("\"Reset Password Text\" is displayed  TEST PASSED");
        } else {
            System.out.println("\"Reset PasswordText\" is not displayed  TEST FAILED");
        }
    }i[class='v-icon notranslate mdi mdi-home theme--light']

    driver.findElement(By.cssSelector("span[class='body-1']"));

        if (homeButton.isEnabled()) {
            System.out.println("Button is clickable");
        } else {
            System.out.println("Button is not clickable");
        }
 */