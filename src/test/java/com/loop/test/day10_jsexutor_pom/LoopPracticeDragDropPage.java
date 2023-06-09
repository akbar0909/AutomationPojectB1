package com.loop.test.day10_jsexutor_pom;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDragDropPage {



        @FindBy(id="draggable")
        public WebElement smallCircle;

        @FindBy (id="droptarget")
        public WebElement bigCircle;

        public LoopPracticeDragDropPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }
    }

