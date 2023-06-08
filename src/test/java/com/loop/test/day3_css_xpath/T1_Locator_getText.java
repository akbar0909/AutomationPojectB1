package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locator_getText {
    /**
     * go to docuport
     * enter userName
     * dont enter pasword
     * click on login button
     * verify error message
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

//        WebElement userName = driver.findElement(By.tagName("input"));
//        userName.sendKeys("b1g3_supervisor@gmail.com");
//
//        userName.clear();
//        driver.navigate().refresh();
//        WebElement password = driver.findElement(By.tagName("input"));
//        password.sendKeys("password");

        WebElement userName =driver.findElement(By.id("input-14"));
        userName.sendKeys((DocuportConstants.USERNAME_CLIENT));

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__messages"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + ". Test PASSED");
        } else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT match actual error message: " + actualErrorMessage + ". Test FAILED");
        }
        driver.quit();


    }

}
