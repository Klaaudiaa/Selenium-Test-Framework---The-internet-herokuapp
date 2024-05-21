package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddRemoveElementPage {
        private WebDriver driver;
    @FindBy(css = "div button")
    private WebElement addButton;
    @FindBy(className = "added-manually")
    private WebElement removeButton;
        public AddRemoveElementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
            }

        public AddRemoveElementPage clickAddButton(){
            addButton.click();
            return this;
        }

        public AddRemoveElementPage clickRemoveButton(){
            removeButton.click();
            return this;
        }
        public boolean checkAddedElement(){
            return removeButton.isDisplayed();
        }
        public boolean isElementPresent(By locatorKey) {
            try {
                driver.findElement(locatorKey);
                return false;
            } catch (NoSuchElementException e) {
                return true;
            }
        }
    }

