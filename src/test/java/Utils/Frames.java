package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends commonMethods{
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //task1: print animal on screen
        //and select babycat from drop down

        //as the webElement is inside an iframe we need to switch to it
        driver.switchTo().frame(1);
        //find the webElement animal
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        //select baby cat
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel =new Select(dd);
        sel.selectByVisibleText("Baby Cat");
        //switch the focus to the main page
        driver.switchTo().defaultContent();
        //switch to frame containing text box
        driver.switchTo().frame("frame1");

       WebElement
               textBox=driver.findElement(By.xpath("//input"));
                 textBox.sendKeys("abracadabra");
//click on the checkBox
        //switch to iframe using webElement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();


    }

}
