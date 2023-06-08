package com.loop.test.home_practicetasks.day7_homework;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3_day7 extends TestBase {

    @Test
    public void ValidateAdvisor(){

        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        WebElement users = driver.findElement(By.xpath(DocuportConstants.USERS));
        users.click();
        String actual = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.USERNAME_ADVISOR, DocuportConstants.ACTUAL_FULL_NAME);
        String expected = DocuportConstants.EXPECTED_GROUP;
        System.out.println("actualName = " +actual);
        assertEquals(actual, expected);

        String actual1 = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.USERNAME_ADVISOR, DocuportConstants.ACTUAL_USName);
        String expected1 = (DocuportConstants.USERNAME_ADVISOR);
        System.out.println("actualUserName =  "  + actual1);
        assertEquals(actual1,expected1);

        String actual2 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.USERNAME_ADVISER, DocuportConstants.ACTUAL_PHONE_NUM);
        String expected2 = (DocuportConstants.EXPECTED_PHONE_NUM);
        System.out.println("actualPhoneNumber = " + actual2);
        assertEquals(actual2,expected2);


        String actual3 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.USERNAME_ADVISOR,DocuportConstants.ACTUAL_ROLE);
        String expected3 = (DocuportConstants.EXPECTED_ADVISOR_ROLE);
        System.out.println("actualRole = " + actual3);
        assertEquals(actual3, expected3);

        String actual4 = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.USERNAME_ADVISOR, DocuportConstants.ACTUAL_ADVISOR);
        String expected4 = (DocuportConstants.EXPECTED_EMPTY);
        System.out.println("actualPhoneNumber " + actual4);
        assertEquals(actual4,expected4);



    }


}
