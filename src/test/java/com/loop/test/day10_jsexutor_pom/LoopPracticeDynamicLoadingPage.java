package com.loop.test.day10_jsexutor_pom;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoadingPage {


        public LoopPracticeDynamicLoadingPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath="//div[@id='alert']")
        WebElement doneMessage;

        @FindBy(xpath="//img[@src='/img/a-few-moments.jpg']")
        WebElement image;


    }

