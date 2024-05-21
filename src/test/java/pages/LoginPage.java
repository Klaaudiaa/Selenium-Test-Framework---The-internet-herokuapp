package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = "#login button")
    private WebElement loginButton;
    @FindBy(id = "flash")
    private WebElement header;
    @FindBy(css = "a.button.secondary.radius")
    private WebElement logoutButton;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public SecureAreaPage LoginButtonClick() {
        loginButton.click();
        return new SecureAreaPage(driver);
    }
    public String getHeaderText() {
        return header.getText();
    }
    public LoginPage clickLogoutButton() {
        logoutButton.click();
        return this;
    }
}
