import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw03 {
    public static void main(String[] args) throws Exception {
        /*HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account
*/
        WebDriver driver=new ChromeDriver();
        driver.get("fb.com"); //Navigate facebook.com
        driver.manage().window().maximize();
        driver.findElement(By.xpath("a[@role='button'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Moncef");
        driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Belg");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("moncefbe@gmail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("jdkdqksmsmq@89");
        //Date of birth section
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("20");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1997");
        //Gender
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        driver.quit();


    }
}
