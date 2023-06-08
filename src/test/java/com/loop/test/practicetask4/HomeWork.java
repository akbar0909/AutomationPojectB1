package com.loop.test.practicetask4;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/add_remove_elements/%22");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElement= driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addElement.click();

        WebElement delete = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (delete.isDisplayed()){
            System.out.println("Clicked delete button");
            delete.click();
        } else {
            System.out.println("DOES NOT click button");
        }
    }
}
