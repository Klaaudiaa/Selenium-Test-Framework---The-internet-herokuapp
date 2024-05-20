package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
        private WebDriver driver;
        public CheckboxesPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    private WebElement checkbox1;
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    private WebElement checkbox2;

        public boolean isCheckbox1Selected(){
            boolean isCheckbox1Selected = checkbox1.isSelected();
            return isCheckbox1Selected;
        }
        public boolean isCheckbox2Selected(){
            boolean isCheckbox2Selected = checkbox2.isSelected();
            return isCheckbox2Selected;
        }
        public CheckboxesPage clickCheckbox1(){
            checkbox1.click();
            return this;
        }
        public CheckboxesPage clickCheckbox2(){
            checkbox2.click();
            return this;
        }
    }
