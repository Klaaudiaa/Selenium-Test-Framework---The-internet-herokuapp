package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSAlertPage {
    private final WebDriver driver;
    @FindBy(id = "result")
    private WebElement results;
    @FindBy(xpath = ".//button[text()='Click for JS Alert']")
    private WebElement alertButton;
    @FindBy(xpath = ".//button[text()='Click for JS Confirm']")
    private WebElement confirmButton;
    @FindBy(xpath = ".//button[text()='Click for JS Prompt']")
    private WebElement promptButton;
    public JSAlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAlertButton(){
        alertButton.click();
    }
    public void clickConfirmButton(){
        confirmButton.click();
    }
    public void clickPromptButton(){
        promptButton.click();
    }
    public void accept(){
        driver.switchTo().alert().accept();
    }
    public void dismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public String getResults(){
        return results.getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
