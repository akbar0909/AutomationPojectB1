package com.loop.test.day10_jsexutor_pom;

import com.loop.pages.LoopPracticeDragDropPage;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropExampleTAsk1 {
    /*
    1. Open a chrome browser
        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
        3. Click and hold small circle
        4. Move it on top of the big circle
        5. Verify “Now drop…” text appears on big circ

        1. Open a chrome browser
        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
                3. Click and hold small circle
        4. Dropped anywhere outside of big circle
        5. Verify “Try again!” text appears on big circle
         */

    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions actions;



    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
         actions = new Actions(Driver.getDriver());
    }

        @Test
    public void verifyMethod(){
        actions.moveToElement(loopPracticeDragDropPage.smallCircle)
                .clickAndHold().moveToElement(loopPracticeDragDropPage.bigCircle).pause(6000).perform();
            Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(),"Now drop...");
        }

        @Test
    public void tryAgain(){
        actions.moveToElement(loopPracticeDragDropPage.smallCircle).clickAndHold().moveByOffset(50,50).pause(2000).release().perform();
        Assert.assertEquals(loopPracticeDragDropPage.bigCircle.getText(),"Try again!");
        }


}







