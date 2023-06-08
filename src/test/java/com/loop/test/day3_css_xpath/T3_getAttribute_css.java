package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    /*
     * go to docuport application
     * identify docuport with css
     * get value of the attribute
     * Validate if  it is "Docuport"
     */

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(DocuportConstants.ADRESS_DOCUPORT);
        driver.manage().window().maximize();

        WebElement docuportSign = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuportName = docuportSign.getAttribute("alt");

        if (docuportName.equals(DocuportConstants.LOGO_DOCUPORT)) {
            System.out.println("Expected logo name \"" + DocuportConstants.LOGO_DOCUPORT + "\" matches with actual logo name \"" + docuportName + "\" ---> TEST IS PASS\"");
        } else {
            System.out.println("Expected logo name \"" + DocuportConstants.LOGO_DOCUPORT + "\" is NOT matches with actual logo name \"" + docuportName + "\" ---> TEST IS PASS\"");
        }

        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14'"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);


        WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();


//        WebElement homeIcon = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));
//        System.out.println(homeIcon.isDisplayed());

        if(loginButton.isDisplayed()){
            System.out.println("Logg in was successful");
        }else{
            System.out.println("Login failed");

        }
        driver.close();
    }
}



