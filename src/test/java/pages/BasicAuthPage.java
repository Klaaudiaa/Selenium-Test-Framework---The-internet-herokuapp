package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage{
    String URL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    private final WebDriver driver;
    @FindBy(tagName = "p")
    private WebElement element;
    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}
    public BasicAuthPage switchToPopUp(){
        driver.get(URL);
        return this;
    }
    public String getInfo(){
        return element.getText();
    }
}
