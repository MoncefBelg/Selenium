package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits extends commonMethods{
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//declaring it in the beginning  as it is global wait;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       WebElement createNewAccountButton=driver.findElement(By.xpath("//a[]text()='Create new account'"));
          createNewAccountButton.click();
          //send first name
      WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
         // firstName.sendKeys("Moncef");
          sendKeyz("Moncef",firstName);




















    }

    }
