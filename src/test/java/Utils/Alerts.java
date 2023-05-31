package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.commonMethods.driver;
import static Utils.commonMethods.openBrowserAndLaunchApplication;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
       WebElement alerts1Btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
alerts1Btn.click();
Thread.sleep(2000);
//switch the focus of the driver to the alert
    Alert confirmationAlert  =driver.switchTo().alert();
    confirmationAlert.accept();
    //find the Alert button and click on it
      WebElement  alerts2Btn=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']\n"));
      alerts2Btn.click();
      //too observe
        Thread.sleep(3000);
        //switch the alert
        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.dismiss();
    }
}
