import Utils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class radioButtons extends commonMethods{
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

//        find the radio btn male and click on it
        WebElement r1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();
        //        check if the radio button r1 is selected
        boolean r1isSelected = r1.isSelected();
        System.out.println("the radio button Male is selected :"+r1isSelected);
        //        check if the radio button is displayed
        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("the radio button Male is displayed : "+r1isDisplayed);
        // check if the radiobutton is enabled
        r1.isEnabled();
        boolean r1isEnabled = r1.isEnabled();
        System.out.println(r1isDisplayed);
        //deselect the male r1 button
        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();
        //check if the button r1 has been deselected
        r1isSelected=r1.isSelected();
        System.out.println("The Male radio is selected :"+r1isSelected);

    }
}