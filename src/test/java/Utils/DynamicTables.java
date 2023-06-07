package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables extends  commonMethods{
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/admin/viewSystemUsers";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        //click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        //print the row number of the row that has the id 56247A
        List<WebElement> allID = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
//looking for 56247A
        for (int i = 0; i <allID.size() ; i++) {
           String id=allID.get(i).getText();
           if (id.equalsIgnoreCase("56247A")){
               System.out.println("the id is on the row number :"+(i+1));
           }

        }
    }
}
