package com.loop.test.home_practicetasks.day8hometask;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task_Registration extends TestBase {

    /* 1. navigate to link "https://app.docuport.app/company-formation/resident"
           2.select Corporation from radio buttons ,
           3. Select Washington D.C. as Formation State
           4.sendkeys for all Legal Company Names & DBA & Industry
           5. Fill out all contact details on the form

           6. select company , input company name ,
           7. input all other address fields & including too add a new business address
    
           8. select member managed option and select treasurer option
           9. input first & last name and put the share % at 38
           10.check the "Are you the director?" box
           11.enter ssn and first and last name and go to payment//input[@id='input-78']

           12. input card number , MM/YY , CVC and click on "Pay"
           13. Validate Card Decline has popped up //input[contains(@type,'radio')])[5]//following-sibling::div
         */
    @Test
    public void automate_payment() throws InterruptedException{

        driver.get("https://app.docuport.app/company-formation/resident");
        driver.findElement(By.xpath("(//span[.=' Next '])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//label[.='Member managed']")).click();
        driver.findElement(By.xpath("(//label[.='First name *']/following-sibling::input)[3]")).sendKeys("Ivanovich");
        driver.findElement(By.xpath("(//label[.='Last name *']/following-sibling::input)[3]")).sendKeys("Ivanka");

    }
}
