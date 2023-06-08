package com.loop.test.home_practicetasks.day3hometask;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_Task2 {
    /**
     * 1. navigate to docuport application
     * 2. validate placeholders for user name and password
     * 3. without sending username and password click login button
     * 4. validate username and password error messages
     */


    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(DocuportConstants.ADRESS_DOCUPORT);

        WebElement userNamePlaceholder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualPlaceHolderUsername = userNamePlaceholder.getText();
        driver.get(DocuportConstants.EXPECTED_PLACEHOLDER_USER_NAME);
        String expectedPlaceHolderUsername = "UserName and Email";

        if (actualPlaceHolderUsername.equalsIgnoreCase(expectedPlaceHolderUsername)) {
            System.out.println("Expected password placeholder; " + expectedPlaceHolderUsername + "matches actual placeholder: " + actualPlaceHolderUsername);

        } else {
            System.out.println("Expected password placeholder; " + expectedPlaceHolderUsername + " DOES NOT matches actual placeholder: " + actualPlaceHolderUsername);
        }
        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceholderName = passwordPlaceholder.getText();
        String expectedPasswordPlaceholderName = "Password";
        if (actualPasswordPlaceholderName.equals(expectedPasswordPlaceholderName)) {
            System.out.println("Actual login placeholder name " + actualPasswordPlaceholderName + " matches to expected login placeholder name " + expectedPasswordPlaceholderName + "TEST PASSED!");
        } else {
            System.out.println("Actual login placeholder name " + actualPasswordPlaceholderName + " DOESN'T MATCH to expected login placeholder name " + expectedPasswordPlaceholderName + "");
        }

            WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
            loginButton.click();

            WebElement userNameError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
            String actualUserNameErrorMessage = userNameError.getText();
            String expectedLoginErrorMessage = "Please enter your username or email address";
            if (actualUserNameErrorMessage.equals(expectedPlaceHolderUsername)) {
                System.out.println("Actual login placeholder name " + actualUserNameErrorMessage + " matches to expected login placeholder name " + expectedLoginErrorMessage + "TEST PASSED!");
            } else {
                System.out.println("Actual login placeholder name " + actualUserNameErrorMessage + " DOESN'T MATCH to expected login placeholder name " + expectedLoginErrorMessage + "");
            }


                WebElement passwordNameError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
                String actualPasswordNameErrorMessage = passwordNameError.getText();
                String expectedPasswordErrorMessage = "Please enter your username or email address";
                if (actualPasswordNameErrorMessage.equals(expectedPlaceHolderUsername)) {
                    System.out.println("Actual login placeholder name " + actualPasswordNameErrorMessage + " matches to expected login placeholder name " + expectedPasswordErrorMessage + "TEST PASSED!");
                } else {
                    System.out.println("Actual login placeholder name " + actualPasswordNameErrorMessage + " DOESN'T MATCH to expected login placeholder name " + expectedPasswordErrorMessage + "");
                }

            }
        }

