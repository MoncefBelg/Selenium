package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends commonMethods{
    public static void main(String[] args) throws InterruptedException {
        driver.get("www.fb.com");

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement days=driver.findElement(By.xpath("//select[@id='day']"));
        days.click();
        //create object
       Select sel=new Select(days);
       //use method provided in select class
       sel.deselectByVisibleText("8");
       //another method
        //for observation purposes
        Thread.sleep(2000);
        sel.selectByValue("26");
    }
}
