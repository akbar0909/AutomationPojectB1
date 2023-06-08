package com.loop.test.practicetask4;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_Day4 {

    public static void main(String[] args) throws InterruptedException {

        /**
         * 1. go to docuport
         * 2. sign as adviser
         * 3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List
         * 4. iterate and print out href values
         *
         * optional step:
         * 5. Validate that expected matching to actual
         *
         * Home, Received docs, My uploads, Clients, Invitations, Users, Leads, Bookkeeping, 1099 form, Reconciliation
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //  go to docuport app
        driver.get(DocuportConstants.ADRESS_DOCUPORT);
        WebElement userName = driver.findElement(By.xpath("//input[@id='input-14']"));
        userName.sendKeys(DocuportConstants.USERNAME_ADVISER);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement login = driver.findElement(By.xpath("//span[@class='v-btn__content']"));
        login.click();

        Thread.sleep(3000);
        //store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List

        List<WebElement> leftItems = driver.findElements(By.xpath("//div[@role='listbox']/a"));
        Thread.sleep(3000);

        //iterate and print out href values
        for (WebElement eachElement : leftItems) {
            if(!eachElement.getText().equals("")){
                System.out.println( "href value of = " + eachElement.getText());

                System.out.println( "link of Element =  " + eachElement.getAttribute("href"));

                List<String>expected = new ArrayList<>(Arrays.asList("Home", "Received", "docs", "My uploads"," Clients", "Invitations",
                        "Users", "Leads", "Bookkeeping"," 1099 form", "Reconciliation"));


                for (String expectedValue : expected) {
                    boolean valueMatch =false;
                    for (WebElement actualValue : leftItems){
                        if(actualValue.getText().equalsIgnoreCase(expectedValue)) {
                            valueMatch = true;
                            System.out.println("TEST PASS; value Expected;  => " + expectedValue + " mathes the value Actual: => " + actualValue.getText());
                        }

                        }
                    if (!valueMatch){
                        System.err.println(" Test FAIl:  Expected "+ expectedValue + " value DOES NOT match with the actual");



                    }




                }
            }

            }


        }







    }

