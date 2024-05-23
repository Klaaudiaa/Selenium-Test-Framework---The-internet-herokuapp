package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

        private WebDriver driver;
        @FindBy(id = "range")
        private WebElement sliderValue;
        @FindBy(css = ".sliderContainer input")
        private WebElement slider;

        public HorizontalSliderPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void setSliderValue(String value){
            while(!getSliderValue().equals(value)){
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        }

        public String getSliderValue(){
            return sliderValue.getText();
        }
    }
