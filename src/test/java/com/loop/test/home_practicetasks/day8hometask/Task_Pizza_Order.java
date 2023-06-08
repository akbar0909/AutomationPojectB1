package com.loop.test.home_practicetasks.day8hometask;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task_Pizza_Order extends TestBase {
    @Test
    public void validate_card_for_alexandra(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedCardNumber = "321456789012";
        String actualCardNumber = driver.findElement(By.xpath("//td[contains(text(),'321456789012')]")).getText();
        assertEquals(actualCardNumber, expectedCardNumber);

        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver,name,"Card Number"),expectedCardNumber);
    }
    @Test
    public void test_pizza_type(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Pizza type"), expectedPizzaType);

    }

    @Test

    public void test_amount(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "John Doe";
        String expectedAccount = "3";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Amount"), expectedAccount);
    }


    @Test
    public void test_date(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Stewart Dawidson";
        String expectedAccount = "03/29/2021";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Date"), expectedAccount);
    }


    @Test
    public void test_street(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Bart Fisher";
        String expectedAccount = "35, Rock st.";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Street"), expectedAccount);

    }

    @Test
    public void test_city(){

            driver.get ("https://loopcamp.vercel.app/web-tables.html");
            String name = "Ned Stark";
            String expectedAccount = "Newcastle";
            assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "City"), expectedAccount);


        }

    @Test
    public void test_state(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Bob Martin";
        String expectedAccount = "US";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "State"), expectedAccount);

    }

    @Test
    public void test_zip(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Samuel Jackson";
        String expectedAccount = "53665";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Zip"), expectedAccount);
    }

    @Test
    public void test_card(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Robert Baratheon";
        String expectedAccount = "MasterCard";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Card"), expectedAccount);
    }

    @Test
    public void test_card_number(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedAccount = "321456789012";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Card Number"), expectedAccount);
    }

    @Test
    public void test_exp(){
        driver.get ("https://loopcamp.vercel.app/web-tables.html");
        String name = "John Doe";
        String expectedAccount = "01/23";
        assertEquals(PizzaOrderWebTableUtils.returnAnyFieldValue(driver, name, "Exp"), expectedAccount);
    }


}



