import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw01 {
    /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
****/
    public static void main(String[] args) throws Exception  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.fistName")).sendKeys("Amine");
        driver.findElement(By.id("customer.lastName")).sendKeys("Meddi");
        driver.findElement(By.id("customer.address.street")).sendKeys("78 Bd. Anfa ");
        driver.findElement(By.id("customer.address.city")).sendKeys("Casa Anfa");
        driver.findElement(By.id("customer.address.state")).sendKeys("Grand Casablanca");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("30040");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0384839920020");
        driver.findElement(By.id("customer.ssn")).sendKeys("yy66");

        driver.findElement(By.id("customer.username")).sendKeys("Amben");
        driver.findElement(By.id("customer.password")).sendKeys("njwns@@");
        driver.findElement(By.id("customer.repeatedPassword")).sendKeys("njwns@@");

        Thread.sleep(5000);
        driver.quit();
    }

}


