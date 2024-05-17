package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementPage {
        private WebDriver driver;
    @FindBy(css = "div button")
    private WebElement addButton;
    @FindBy(css = "added-manually")
    private WebElement removeButton;
        public AddRemoveElementPage(WebDriver driver) {
        this.driver = driver;
    }

        public void clickAddButton(){
            addButton.click();
        }

        public void clickRemoveButton(){
            removeButton.click();
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

