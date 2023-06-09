package com.loop.test.day10_jsexutor_pom;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_explicit_wait {

    LoopPracticeDynamicLoadingPage loopPracticeDynamicLoadingPage;
    WebDriverWait wait;
    @BeforeMethod
    public void setUpMethod(){
        loopPracticeDynamicLoadingPage = new LoopPracticeDynamicLoadingPage();
        Driver.getDriver().get("https://loopcamp.vercel.app/dynamic_loading/7.html");
    }

    @Test
    public void explicit_wait_test(){
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dynamic title");
        Assert.assertTrue(loopPracticeDynamicLoadingPage.doneMessage.isDisplayed());
        Assert.assertTrue(loopPracticeDynamicLoadingPage.image.isDisplayed());

    }

}