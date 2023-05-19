import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) throws Exception{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();
//get all links from amazon and print them on the console
      List<WebElement> allLinks=driver.findElements(By.tagName("a"));
      for (WebElement link:allLinks){
         String linko=link.getAttribute("href");
          System.out.println(linko);
      }
    }
}
