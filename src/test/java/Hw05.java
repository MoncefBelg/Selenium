import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw05 {
    public static void main(String[] args) throws InterruptedException {
        //HW1:
        //goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        //select , tuesday, thursday and friday one by one

       WebDriver driver =new ChromeDriver();
       driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
       driver.manage().window().maximize();
 WebElement SelectListDemo=driver.findElement(By.xpath("//select[@id='select-demo']"));
      Select select=new Select(SelectListDemo);
      //select Tuesday
        select.selectByValue("//option[@value='Tuesday']");
        Thread.sleep(2000);
        //select Thursday
        select.deselectByVisibleText("//option[text()='Tuesday']");
        Thread.sleep(2000);
        //select Friday
        select.selectByIndex(6);
    }
}
