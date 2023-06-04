package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CMethod {
    public static WebDriver driver;

    public static void openBrowser(String url,String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "Safari":
                driver=new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);



    }
    public static void  implicitWait(int bySeconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(bySeconds));
    }
}
