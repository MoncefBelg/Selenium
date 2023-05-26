package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton2 extends commonMethods{
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
openBrowserAndLaunchApplication(url,browser);

        //find the radio button Male and click on it
       WebElement radioButtonMale=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
                      radioButtonMale.click();

                      //check if the radio button radioButtonMale isSelected
       Boolean isMaleRadioButtonSelected=radioButtonMale.isSelected();
        System.out.println("isMaleRadioButtonSelected : "+isMaleRadioButtonSelected);
        //check if the radio button radioButtonMale isDisplayed
       Boolean isMaleRadioButtonDisplayed=radioButtonMale.isDisplayed();
        System.out.println("isMaleRadioButtonDisplayed : "+isMaleRadioButtonDisplayed);

    }
}
