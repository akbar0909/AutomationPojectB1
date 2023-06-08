package com.loop.test.home_practicetasks.day9homework;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollHomeTask4 {
    /*
    1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/
3. Scroll down to “Powered by LOOPCAMP”
4. Scroll using Actions class “moveTo(element)” method
     */

    @Test
    public void ScrollDown() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        Actions actions = new Actions(Driver.getDriver());
        WebElement PoweredBy = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'LOOPCAMP')]"));
        actions.scrollToElement(PoweredBy).perform();

       /* task5
                ============
        1. Continue from where the Task 4 is left in the same test.
        2. Scroll back up to Loop Academy link/picture using PageUP button
                */



            Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));

            WebElement press = Driver.getDriver().findElement(By.xpath("//a[@href='index.html']"));
            actions.moveToElement(press).perform();

        }
    }
