package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage{
    String URL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    private final WebDriver driver;
    @FindBy(tagName = "p")
    private WebElement element;
    public BasicAuthPage(WebDriver driver) {this.driver = driver;}
    public void switchToPopUp(){driver.get(URL);}
    public String getInfo(){
        return element.getText();
    }
}
