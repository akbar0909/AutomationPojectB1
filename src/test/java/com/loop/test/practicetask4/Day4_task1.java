package com.loop.test.practicetask4;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. go to docuport app
         * 2. validate that Home, Received docs, My uploads, Invitations are displayed
         * 3. press three lines
         * 4. Home, Received docs, My uploads, Invitations will disappear
         * 5. Validate the buttons are not displayed
         */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //  go to docuport app
        driver.get(DocuportConstants.ADRESS_DOCUPORT);

        WebElement userName = driver.findElement(By.xpath("//input[@id='input-14']"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement login = driver.findElement(By.xpath("//span[@class='v-btn__content']"));
        login.click();

        Thread.sleep(3000);

        WebElement homeIcon = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        if (homeIcon.isDisplayed()) {
            System.out.println("Home is displayed");
        } else {
            System.out.println("Home is NOT displayed");
        }

        WebElement receivedDocs = driver.findElement(By.xpath("//span[contains(text(),'Received docs')]"));
        if (receivedDocs.isDisplayed()) {
            System.out.println("ReceiveDocs is displayed");
        } else {
            System.out.println("ReceiveDocs is NOT displayed");
        }

        WebElement myUploads = driver.findElement(By.xpath("//span[contains(text(),'My uploads')]"));

        if (myUploads.isDisplayed()) {
            System.out.println("MyUpload is displayed");
        } else {
            System.out.println("MyUpload is NOT displayed");
        }

        WebElement invitations = driver.findElement(By.xpath("//span[contains(text(),'Invitations')]"));

        if (invitations.isDisplayed()) {
            System.out.println("Invitation is displayed");
        } else {
            System.out.println("Invitation is NOT displayed");
        }
        // press three lines

        WebElement threeLines = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();
        System.out.println(" ===========================after press three lines click================================");
        Thread.sleep(3000);
        if (homeIcon.isDisplayed()) {
            System.out.println("Home is displayed");
        } else {
            System.out.println("Home is NOT displayed");
        }
        if (receivedDocs.isDisplayed()) {
            System.out.println("ReceiveDocs is displayed");
        } else {
            System.out.println("ReceiveDocs is NOT displayed");
        }
        if (myUploads.isDisplayed()) {
            System.out.println("MyUpload is displayed");
        } else {
            System.out.println("MyUpload is NOT displayed");
        }
        if (invitations.isDisplayed()) {
            System.out.println("Invitation is displayed");
        } else {
            System.out.println("Invitation is NOT displayed");
        }






    }
}

