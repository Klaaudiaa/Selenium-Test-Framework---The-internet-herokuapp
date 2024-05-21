package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetrievePasswordPage {
    private final WebDriver driver;
    @FindBy (css = "body h1")
    private WebElement statusInformation;
    public RetrievePasswordPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getInformation(){
        return statusInformation.getText();
    }
}
