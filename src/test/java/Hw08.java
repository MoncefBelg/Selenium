import Utils.CMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw08 extends CMethod {
    //goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
    //click on get new user
    //print the firstname of user
    public static void main(String[] args) {
        openBrowser("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php","chrome");
      WebElement NewUser= driver.findElement(By.xpath("//button[text()='Get New User']"));
                         NewUser.click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        implicitWait(20); //method extended from CMethod
WebElement userName= driver.findElement(By.xpath("//*[@id=\"First-Name\"]/p"));
String name=userName.getText();
        System.out.println(name);

        driver.close();


    }
}
