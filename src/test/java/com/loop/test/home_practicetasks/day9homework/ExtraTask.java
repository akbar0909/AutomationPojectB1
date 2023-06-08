package com.loop.test.home_practicetasks.day9homework;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExtraTask {
    /*
    1. login docuport as a advisor
2. go to my loads
3. try to upload a file
(do not spend more than 20 mins, if you can not, can not)

     */
    @Test
    public void uploadDocuport(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@id='input-14']"));
        userName.sendKeys(ConfigurationReader.getProperty("advisor") );
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='input-15']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        WebElement login = Driver.getDriver().findElement(By.xpath("//span[@class='v-btn__content']"));
        login.click();
        WebElement uploadButton =Driver.getDriver().findElement(By.xpath("//button[contains(@class,'v-btn v-btn--has-bg')]"));
        uploadButton.click();
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//*[starts-with(@class,'v-btn v-btn--text')]"));
        chooseFile.click();
        String path = "C:/Users/akbar/OneDrive/Desktop/jira.odt";
        chooseFile.sendKeys(path);
        WebElement chooseFile1 = Driver.getDriver().findElement(By.xpath("//*[starts-with(@class,'v-btn v-btn--text')]"));
        chooseFile1.click();







    }
}
