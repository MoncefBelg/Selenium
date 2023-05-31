package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHw01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame3");
      WebElement checkBox=driver.findElement(By.xpath("//input[@id='a' and @type='checkbox']"));
      checkBox.click();

       driver.switchTo().frame("frame2");
     WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));

      Select select=new Select(animal);
      select.selectByVisibleText("Baby Cat");
       driver.switchTo().defaultContent();

       driver.switchTo().frame("frame1");
     WebElement  textBox=driver.findElement(By.xpath("/html/body/input"));
     textBox.sendKeys("Hi Selenium");
     Thread.sleep(20000);

     driver.close();
    }
}
