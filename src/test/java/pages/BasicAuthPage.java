package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BasicAuthPage{
    String URL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    private final WebDriver driver;
    public BasicAuthPage(WebDriver driver) {this.driver = driver;}
    public void switchToPopUp(){driver.get(URL);}
    public String getInfo(){
        return driver.findElement(By.tagName("p")).getText();
    }
}
