import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw04 {
    //HW1:
    //Open chrome browser
    //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    //fill in the complete form
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D");
//Ajax Form
       WebElement ajax=driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
       ajax.sendKeys("Admin");
       //comment
     WebElement   comment=driver.findElement(By.xpath("//textarea[@name=\"description\"]"));
     comment.sendKeys("oow eowekow ewdwkdw");
     //submit
      WebElement submit= driver.findElement(By.xpath("//input[@name='btn-submit']"));
      submit.click();
     // ------------------------------------------
              //Single Checkbox Demo
       WebElement singleCheckBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
singleCheckBox.click();
//Multiple Checkbox Demo

    }
}