package com.loop.test.home_practicetasks.day5hometask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class task1_day5 {

  /*  1. go to http://the-internet.herokuapp.com/dropdown
      2. validate "Please select an option" is selected by default
      3. Choose option 1 and validate that it is selected
      4. Choose option 2 and validate that it is selected
      5. Validate dropdown name is "Dropdown List"

   */
    WebDriver driver;
    String actual;
    String expected;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){

      //  driver.close();
    }
    @Test
    public void Validation(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
       //. validate "Please select an option" is selected by default
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Please select an option");

        // 3. Choose option 1 and validate that it is selected
        dropdown.selectByIndex(1);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Option 1");


//        4. Choose option 2 and validate that it is selected
        dropdown.selectByValue("2");


//       5. Validate dropdown name is "Dropdown List"

        WebElement dropdownList = driver.findElement(By.xpath("//h3[text()='Dropdown List']"));
        Assert.assertEquals(dropdownList.getText(),"Dropdown List");
    }
}








