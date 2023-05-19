import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws Exception {

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
    WebElement findTextBox=driver.findElement(By.name("txtUsername"));
    findTextBox.sendKeys(("YYYYYY"));
    //slow down
        Thread.sleep(4000);
//after sending the username to the textBox clear the textBox
        findTextBox.clear();
        //sending the username again
        findTextBox.sendKeys("Admin");
        //find the password
       WebElement pass=driver.findElement(By.name("txtPassword"));
       pass.sendKeys("jadka@@242");
       //find the login button
       WebElement log=driver.findElement(By.className("button"));
       log.click();
       //get the welcome message
       WebElement message=driver.findElement(By.linkText("Welcome Admin,"));
    String text=message.getText();
        System.out.println(text);
        driver.findElement(By.partialLinkText("Recru")).click();
    }
}
