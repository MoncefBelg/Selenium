package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends commonMethods {
    public static void main(String[] args) {
        String url = "http://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //click on enable button after 10sc
        //and then click on the button
        //assumption we don't know that what is the time for it to get enabled


        //click on the enable button
       WebElement button1=driver.findElement(By.xpath("//button[@id='enable-button']"));
            button1.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));

            //click on the button
    WebElement    eBtn=driver.findElement(By.xpath("//button[text()='Button']"));
    eBtn.click();
    //click on Alert button
       WebElement alertBtn=driver.findElement(By.xpath("//button[@id='alert']"));
       alertBtn.click();

       wait.until(ExpectedConditions.alertIsPresent());
       alertBtn.click();


    }
}
