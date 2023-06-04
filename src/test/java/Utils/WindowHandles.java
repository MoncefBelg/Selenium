package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles extends commonMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        driver.manage().window();
        //click on the help button and privacy button
       WebElement helpButton=driver.findElement(By.linkText("Help"));
       helpButton.click();

      WebElement privacyButton=driver.findElement(By.xpath("//a[text()='Privacy']"));
      privacyButton.click();
      //get the window handle of the main page and print on console
   String     mainPageHandle=driver.getWindowHandle();
        System.out.println("main page handle is: "+mainPageHandle);

        //get all the window handles and print the titles associated with each window handle on the console

       Set<String> allWindowHandles=driver.getWindowHandles();
       for(String handle:allWindowHandles){
           driver.switchTo().window(handle);
         String  titleOfHandles=driver.getTitle();
          // System.out.println("the title of "+handle+"is :"+titleOfHandles);
           if (titleOfHandles.equalsIgnoreCase("Google Account Help")){
               break;
           }
       }
        System.out.println("The current page under focus is :"+driver.getTitle());
       //after switching to the page google account help , we can deal with any element we want

        //switch back focus to main page
        driver.switchTo().window(mainPageHandle);
        //check focus
        System.out.println("The focus is on:"+driver.getTitle());

    }

}
