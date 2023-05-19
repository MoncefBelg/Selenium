import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw02 {
    /*navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
enter the username "Tester"
enter the password "test"
get the title of the webPage and confirm that it is  "Web Orders Login"
------------------__------__**happy coding */
    public static void main(String[] args) throws Exception  {
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
       String tile =driver.getTitle();
       if(tile.equals("Web Orders Login")){
           System.out.println("you are int the right page");

       } else {
           System.out.println("This title does no Exist");
       }
        driver.quit();

    }
}
