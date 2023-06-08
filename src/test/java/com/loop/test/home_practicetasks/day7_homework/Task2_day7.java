package com.loop.test.home_practicetasks.day7_homework;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_day7 extends TestBase {

    @Test
    public void SecondValidateTestTable(){
        /*1. login as an advisor
        2. go to users
        3. validate that full name for b1g1_supervisor@gmail.com is Alex De Souza
        4. validate that user name for alex.de.souza@gmail.com is alexdesouze
        5. validate that phone number for alex.de.souza@gmail.com is +994512060042
        6. validate that role for alex.de.souza@gmail.com is client
        7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1

        repeat the same thing for
        - 	b1g1_supervisor@gmail.com
        -   b1g1_advisor@gmail.com`

         */
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement user =driver.findElement(By.xpath(DocuportConstants.USERS));
        user.click();

       String actual = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.SUPER_ADDRESS,DocuportConstants.ACTUAL_FULL_NAME);
       String expected = (DocuportConstants.EXPECTED_GROUP);
       System.out.println("ActualName  =  " + actual);
       assertEquals(actual, expected);

        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.SUPER_ADDRESS, DocuportConstants.ACTUAL_USName);
        String expected1 = (DocuportConstants.SUPER_ADDRESS);
        System.out.println("actualUserName =  "  + actual1);
        assertEquals(actual1,expected1);

        String actual2 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.SUPER_ADDRESS, DocuportConstants.ACTUAL_PHONE_NUM);
        String expected2 = (DocuportConstants.EXPECTED_PHONE_NUM);
        System.out.println("actualPhoneNumber = " + actual2);
        assertEquals(actual2,expected2);


        String actual3 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.SUPER_ADDRESS,DocuportConstants.ACTUAL_ROLE);
        String expected3 = (DocuportConstants.EXPECTED_SUP_ROLE);
        System.out.println("actualRole = " + actual3);
        assertEquals(actual3, expected3);

        String actual4 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.SUPER_ADDRESS, DocuportConstants.ACTUAL_ADVISOR);
        String expected4 = (DocuportConstants.EXPECTED_EMPTY);
        System.out.println("actualPhoneNumber = " + actual4);
        assertEquals(actual4,expected4);


    }

}
