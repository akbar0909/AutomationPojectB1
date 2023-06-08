package com.loop.test.home_practicetasks.day9homework;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadHomeTask3 {
   /* task3
============
        1. Go to https://loopcamp.vercel.app/upload.html
            2. Find some small file from your computer, and get the path of it.
            3. Upload the file.
4. Assert:
            -File uploaded text is displayed on the page

    */
    @Test
    public void uploadFile() throws InterruptedException{
        //1. Go to https://loopcamp.vercel.app/upload.html
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement fileUpload = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'File Upload')]"));
        fileUpload.click();
        //2. Find some small file from your computer, and get the path of it.
        WebElement chooseFile =Driver.getDriver().findElement(By.id("file-upload"));
        String path ="C:/Users/akbar/OneDrive/Desktop/jira.odt ";
        chooseFile.sendKeys(path);
        //3. Upload the file.

        WebElement uploadButton =Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
         uploadButton.click();
        //4. Assert:
        //-File uploaded text is displayed on the page

         WebElement noSuccessMessage = Driver.getDriver().findElement(By.xpath("//*[@id='main-message']/h1/span"));
         String expected = "This page isn’t working";
        Assert.assertEquals(noSuccessMessage.getText(),expected);









    }

}
