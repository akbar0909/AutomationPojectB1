package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_xpath_getText_staleElement {

   /*
    1. Open Chrome browser
    2. Go to docuport
    3. Click on forgot password
    4. validate URL contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate cancel button is displayed
    8. validate send button is displayed
    9. click send button
    10. validate - We've sent you an email with a link to reset your password. Please check your email
            */
   public static void main(String[] args) throws InterruptedException {
//       1. Open Chrome browser
//       2. Go to docuport

       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://beta.docuport.app");

//       3. Click on forgot password
       WebElement forgetPassword = driver.findElement(By.xpath("//a[@href='/reset-password']"));
       forgetPassword.click();

       //  4. validate URL contains: reset-password
       String actualUrlForResetPassword = driver.getCurrentUrl();
       if(actualUrlForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)){
           System.out.println("Actual url: " + actualUrlForResetPassword + " contains ");
       }else{
           System.out.println("Actual url: " + actualUrlForResetPassword + " DES NOT contains ");
       }


       // validate - Enter the email address associated with your account
       WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
       String actualValidateMessage = validateMessage.getText();

       if(actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)){
           System.out.println("actualValidateMessage = " + actualValidateMessage + " contains expected message " + DocuportConstants.RESET_PASSWORD_MESSAGE);
       }else{
           System.out.println("actualValidateMessage = " + actualValidateMessage +" DES NOT contains expected message " + DocuportConstants.RESET_PASSWORD_MESSAGE);
       }
       // 6 enter forgotpasswordg1@gmail.com to email box
       WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='email']"));
       emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

       //  7. validate cancel button is displayed
       //  8. validate send button is displayed
       WebElement cancelButton =driver.findElement(By.xpath("//span[.=' Cancel ']"));
       WebElement sendButton =driver.findElement(By.xpath("//span[.=' Send ']"));
       if(cancelButton.isDisplayed()){
           System.out.println("TEST PASSED =>  Cancel button is displayed");

       }else{
           System.out.println("TEST FAILED =>  Cancel button is displayed");

       }
       //  8. validate send button is displayed
       if(sendButton.isDisplayed()){
           System.out.println("TEST PASSED =>  Send  button is displayed");

       }else{
           System.out.println("TEST FAILED =>  Send  button is displayed");

       }
       sendButton.click();
       Thread.sleep(3000);

       //10. validate - We've sent you an email with a link to reset your password. Please check your email
       WebElement successMessage =driver.findElement(By.xpath("//span[@class='body-1']"));
       Thread.sleep(5000);


       try {

           System.out.println(successMessage.getText() + " we successfully got the message");

       } catch (StaleElementReferenceException e){
           System.out.println("Element is not accessible anymore");
           e.printStackTrace();

       }
       driver.quit();



       //  List<WebElement> lefSideList = driver.findElements(By.xpath("//a[contains(@class,'py-x-2')]"));
//        for (int i = 0; i < lefSideList.size(); i++) {
//            if (!lefSideList. get(i).getText().equals("")){
//               System.out.println("left side " + lefSideList.get(i).getText()+ " : " +lefSideList.get(i).getAttribute("href"));
//           }
//        for (WebElement eachLink : lefSideList) {
//             if (!eachLink.getText().equals("")) {
//                 System.out.println("left side " + eachLink.getText() + " : " + eachLink.getAttribute("href"));
//             }








   }

}
