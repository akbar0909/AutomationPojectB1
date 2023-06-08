package com.loop.test.home_practicetasks.day7_homework;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


   /*1. login as an advisor
        2. go to users


        3. validate that full name for b1g1_supervisor@gmail.com is Batch1 Group1
        4. validate that user name for ab1g1_supervisor@gmail.com is b1g1_supervisor@gmail.com
        5. validate that phone number for b1g1_supervisor@gmail.com is 0000000000
        6. validate that role for b1g1_supervisor@gmail.com is Supervisor
        7. validate that advisor for b1g1_supervisor@gmail.com is  " "

        repeat the same thing for
        -
        -   b1g1_advisor@gmail.com
         */
   public class Task1_day7 extends TestBase {

       @Test
       public void validateTestTable() {

        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath(DocuportConstants.USERS));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.ALEX_ADDRESS, DocuportConstants.ACTUAL_FULL_NAME);
        String expected = DocuportConstants.EXPECTED;
        System.out.println("actualFullName = " + actual);
        assertEquals(actual, expected);

        //    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.ALEX_ADDRESS, DocuportConstants.ACTUAL_USName);
        String expected1 = (DocuportConstants.EXPECTED_USName);
        System.out.println("actualUserName = " + actual1);
        assertEquals(actual1, expected1);

        // 5. validate that phone number for alex.de.souza@gmail.com is +994512060042
        String actual2 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.ALEX_ADDRESS, DocuportConstants.ACTUAL_PHONE_NUM);
        String expected2 = (DocuportConstants.EXPECTED_ALEX_PH_NUM);
        System.out.println("actualPhoneNumber = " + actual2);
        assertEquals(actual2, expected2);
        // 6. validate that role for alex.de.souza@gmail.com is client
        String actual3 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.ALEX_ADDRESS, DocuportConstants.ACTUAL_ROLE);
        String expected3 = (DocuportConstants.EXPECTED_CLIENT);
        System.out.println("actualRole =    " + actual3);
        assertEquals(actual3, expected3);

       // 7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
        String actual4 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.USERNAME_ADVISOR, DocuportConstants.ACTUAL_ADVISOR);
        String expected4 = (DocuportConstants.EXPECTED_GROUP);
        System.out.println("actualAdvisor = " + actual4);
        assertEquals(actual4, expected4);










    }
}
