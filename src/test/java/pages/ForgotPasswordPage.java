package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    private final WebDriver driver;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "form_submit")
    private WebElement submitButton;
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public ForgotPasswordPage setEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public RetrievePasswordPage clickRetrievePassword() {
        submitButton.click();
        return new RetrievePasswordPage(driver);
    }
}
