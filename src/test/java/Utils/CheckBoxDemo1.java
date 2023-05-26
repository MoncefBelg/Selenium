package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxDemo1 extends commonMethods{
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //check if checkBox is not checked

     WebElement checkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected'] "));
     if ( !checkBox.isSelected()){
         checkBox.click();

     }
//checking option 3 from the checkBoxes
    List<WebElement> option=driver.findElements(By.xpath("//input[@class='cb1-element'] "));
     for(WebElement Options:option){
        String value=Options.getAttribute("value");
         if(value.equals("Option-3")){
             Options.click();
             break;
         }
     }
    }
}
