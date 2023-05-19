import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args)  throws Exception {
        //instance
        WebDriver driver=new ChromeDriver();
        //Fb.com
        driver.get("https://www.facebook.com");
        //send dome text in the email
        driver.findElement(By.id("email")).sendKeys("moncef.belgas@gmail.com");  //id locator
//sendKeys keyword used to send sth
        driver.findElement(By.name("pass")).sendKeys("asfafdasdas");
        Thread.sleep(5000);
        driver.quit();
    }
}
