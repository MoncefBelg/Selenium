import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw09 {
    //please make sure that ur code is dynamic enough to cater if another row gets deleted , it still prints the row correctly
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
    //goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
    //click on PIM
        WebElement pim=driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();
        //find the id 56767A and print the row number of the id
        List<WebElement> ids = driver.findElements(By.xpath("//tbody/tr"));
        for (int i = 0; i <ids.size(); i++) {
            String printID = ids.get(i).getText();
            if (printID.equalsIgnoreCase("56767A")){
            System.out.println("Print the row number of id:56767A ==> "+(i+1));
          }
        }
     }
  }
