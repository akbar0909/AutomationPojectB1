package com.loop.test.home_practicetasks.day5hometask;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class task3_day5 {

    /*go to https://app.docuport.app/company-formation/resident
What type of business do you want to start? - choose corporation //input[@id='input-92']"
Validate that corporation has been selected
Formation State - choose Virginia
Validate Virginia is selected
Validate order summer as below:
 State registration fee $100
 * Payment processing $6
 * Service fee $150
 * Total $256


     */
    WebDriver driver;
    String expected;
    String actual;

    @BeforeMethod
    public void SetUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
       //driver.close();
    }

    @Test
    public void CorporationTest() {

        WebElement corporationButton = driver.findElement(By.xpath("//label[contains(text(),'Corporation')]"));
        corporationButton.click();
        WebElement corporationStatus = driver.findElement(By.xpath(" (//input[@role='radio'])[2]"));
        Assert.assertTrue(corporationStatus.isSelected()," Corporation has not been selected");
    }

    @Test
    public void formationState() {
/** Payment processing $6
 * Service fee $150
 * Total $256
 *
 */

    WebElement VirginaRadioButton = driver.findElement(By.xpath("//label[contains(text(),'Virginia')]"));
    VirginaRadioButton.click();
    WebElement VirginiaButtonStatus = driver.findElement(By.xpath(" (//input[@role='radio'])[5]"));
    Assert.assertTrue(VirginiaButtonStatus.isSelected(),"Virginia is not selected");

    WebElement registrationFee = driver.findElement(By.xpath("//p[contains(text(),' State registration fee')]/following-sibling::p"));
    Assert.assertEquals(registrationFee.getText(),"$100");

    WebElement paymentProcessing = driver.findElement(By.xpath("//p[contains(text(),' Payment processing ')]/following-sibling::p"));
    Assert.assertEquals(paymentProcessing.getText(),"$6");

    WebElement serviceFee = driver.findElement(By.xpath("//p[contains(text(),'  Service fee ')]/following-sibling::p"));
    Assert.assertEquals(serviceFee.getText(),"$150");

    WebElement totalFee = driver.findElement(By.xpath("//p[contains(text(),'   Total  ')]/following-sibling::p"));
    Assert.assertEquals(totalFee.getText(),"$256");


    }

    @Test
    public void formationState2(){


    }




//        if (corporationRadio.isSelected()) {
//            System.out.println("Corporation Selected");
//        }else {
//            System.out.println("Corporation Does Not Selected");
//        }
//        WebElement VirginaButton = driver.findElement(By.xpath("//label[contains(text(),'Virginia')]"));
//        VirginaButton.click();
//        Select validateVirginia = new Select(driver.findElement(By.xpath("(//input[@role='radio'])[5]")));







    }

