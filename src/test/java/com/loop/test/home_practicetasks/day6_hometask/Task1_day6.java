package com.loop.test.home_practicetasks.day6_hometask;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Task1_day6 extends TestBase {


/*  1. go to https://demoqa.com/alerts
 2. click - click button to see alert
3. handle alert
4. click - On button click, alert will appear after 5 seconds
5. handle alert
6. click - On button click, confirm box will appear
7. click ok and validate - You selected Ok
8. after that do it again this time cancel and validate - You selected Cancel
9. click - On button click, prompt box will appear
10. enter "Loop Academy" and validate You entered Loop Academy

 */
      String actual;
      String expected;

    @Test
    public void iframeSeUp() throws InterruptedException {
        // 1. go to https://demoqa.com/alerts
        driver.get("https://demoqa.com/alerts");
        //2 click - click button to see alert
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickButton.click();
        //3 handle alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 4 click - On button click, alert will appear after 5 seconds
        WebElement clickAlertWillButton =driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickAlertWillButton.click();
        //Thread.sleep(3000);
        //5 handle alert
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        //6 click - On button click, confirm box will appear
        WebElement boxOnButton =driver.findElement(By.xpath("//button[@id='confirmButton']"));
        boxOnButton.click();
        Alert clickOk =driver.switchTo().alert();
        clickOk.accept();

        //7. click ok and validate - You selected Ok
        WebElement conformation = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        actual = conformation.getText();
        expected = "You selected Ok";
        assertEquals(actual, expected, "actual does not match with expected");

        // 8. after that do it again this time cancel and validate - You selected Cancel
        boxOnButton.click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); // will click cancel - will dismiss
        String actual = conformation.getText();
        String expected = "You selected Cancel";
        assertEquals(actual, expected,"actual does not match the ext");


       // 9. click - On button click, prompt box will appear
        WebElement promptBoxButton =driver.findElement(By.xpath("//button[@id ='promtButton']"));
        promptBoxButton.click();

       // 10. enter "Loop Academy" and validate You entered Loop Academy
       String text = "loop Academy";
        Alert  enterMessage = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();


























    }




}
