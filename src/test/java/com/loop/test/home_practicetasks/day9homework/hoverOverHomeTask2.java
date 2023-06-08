package com.loop.test.home_practicetasks.day9homework;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hoverOverHomeTask2 {
    /*1. Go to https://loopcamp.vercel.app/hovers.html
2. Hover over to first image
3. Assert:
	a. “name: user1” is displayed
	b. “view profile” is displayed
4. Hover over to second image
5. Assert:
	a. “name: user2” is displayed
	b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
	a. “name: user3” is displayed
	b. “view profile” is displayed

    */

    @Test
    public void HoverOver () throws InterruptedException{

        Driver.getDriver().get(ConfigurationReader.getProperty("loop.practice"));
        WebElement hoveRow = Driver.getDriver().findElement(By.xpath("//a[@href='hovers.html']"));
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(hoveRow).click().perform();
      //  2. Hover over to first image
        WebElement firstImage=Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
        action.moveToElement(firstImage).perform();
       // a. “name: user1” is displayed
        WebElement nameUser1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        action.moveToElement(nameUser1).perform();
        Assert.assertTrue(nameUser1.isDisplayed(),"“name: user1” is not displayed");
        WebElement viewProfile =Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/1.html')]"));
        Assert.assertTrue(viewProfile.isDisplayed(),"“name: user2” is not displayed");

        //4. Hover over to second image
        WebElement secondImage =Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
        action.moveToElement(secondImage).perform();
        WebElement nameUser2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        action.moveToElement(nameUser2).perform();
        Assert.assertTrue(nameUser2.isDisplayed(),"“view profile” is not displayed");
        Thread.sleep(3000);
        WebElement  secondViewProfile = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/2.html')]"));
        action.moveToElement(secondViewProfile).perform();
        Assert.assertTrue(secondViewProfile.isDisplayed(),"view profile” is not displayed");

        //  6. Hover over to third image
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
        action.moveToElement(thirdImage).perform();
        WebElement nameUser3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));
        action.moveToElement(nameUser3) .perform();
        Assert.assertTrue(nameUser3.isDisplayed(),"“name: user3” is not displayed");
        WebElement thirdViewProfile = Driver.getDriver().findElement(By.xpath("//a[contains(@href,'users/3.html')]"));
        action.moveToElement(thirdViewProfile).perform();
        Assert.assertTrue(thirdViewProfile.isDisplayed(),"“view profile” is not displayed");









    }

}

