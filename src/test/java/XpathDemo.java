import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //instance of webDriver

        WebDriver driver=new ChromeDriver();
        //driver.get to navigate to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //userName text Box through xpath
        WebElement UserName=driver.findElement(By.xpath("//input[id='txtUsername']"));
        UserName.sendKeys("Admin");

       WebElement password=driver.findElement(By.xpath("//input[name=\"txtPassword\"]"));
       password.sendKeys("Hum@nhrm123");
       //login button
      WebElement login  =driver.findElement(By.xpath("//input[contains(@value, \"LOGIN\")]"));
      login.click();
      //click on the PIM Tab
       WebElement pimTab= driver.findElement(By.xpath("//a[id=\"menu_pim_viewPimModule\"]"));
       pimTab.click();

    }
}
