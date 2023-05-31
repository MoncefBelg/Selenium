package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHw01 {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
       WebElement clickForPromptBox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
       clickForPromptBox.click();
       Thread.sleep(2000);

       //switch focus
       Alert alert=driver.switchTo().alert();
       alert.sendKeys("Admin");
       alert.accept();
       Thread.sleep(2000);
                  driver.close();
    }
}

