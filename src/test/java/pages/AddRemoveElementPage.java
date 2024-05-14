package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementPage {
        private final By addButton = By.cssSelector("div button");
        private final By removeButton = By.className("added-manually");
        private WebDriver driver;
        public AddRemoveElementPage(WebDriver driver) {
        this.driver = driver;
    }

        public void clickAddButton(){
            driver.findElement(addButton).click();
        }

        public void clickRemoveButton(){
            driver.findElement(removeButton).click();
        }
        public boolean checkAddedElement(){
            return driver.findElement(removeButton).isDisplayed();
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

