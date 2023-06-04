import Utils.CMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw07 extends CMethod {
    //HW1:
    //goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    //click on start
    //print the text  "welcome syntax technologies "on console
    public static void main(String[] args) {
        openBrowser("http://practice.syntaxtechs.net/dynamic-elements-loading.php","chrome");
      WebElement StartButton= driver.findElement(By.xpath("//button[text()='Start']"));
                         StartButton.click();

        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(20));
webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("http://practice.syntaxtechs.net/dynamic-elements-loading.php")));

          //text "//h4[text()='Welcome Syntax Technologies']"
   WebElement     WelcomeST=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
       // System.out.println(WelcomeST.getText());
        String text=WelcomeST.getText();
        System.out.println(text);

        driver.close();


    }
}
