import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw06 {
    public static void main(String[] args) {
        //hw2:
        //goto facebook.com
        // click on create account
        //and select  your  date of birth using select class
     WebDriver driver=new ChromeDriver();
        driver.get("www.facebook.com");
        driver.manage().window().maximize();
       WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
                 createAccount.click();

                WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
               Select sel=new Select(day);
               sel.selectByValue("28");
        WebElement month=driver.findElement(By.xpath("//select[@id='day']"));
              sel.selectByValue("//select[@title=\"Month\"]\n");
        WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        sel.selectByVisibleText("1994");

    }
}
