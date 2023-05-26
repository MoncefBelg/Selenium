package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton3 extends commonMethods{
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //u need to select the user option
        String option="5 - 15";

     List<WebElement> ageGroup=driver.findElements(By.xpath("//input[@name='ageGroup']"));
     for (WebElement ageGroups:ageGroup){
        String value=ageGroups.getAttribute("value");
            if(value.equals(option)){
                ageGroups.click();
                break;
            }
     }

    }
}
