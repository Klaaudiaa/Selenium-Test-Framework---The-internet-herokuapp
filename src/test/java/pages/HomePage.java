package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

        public LoginPage clickFormAuthentication(){
            clickLink("Form Authentication");
            return new LoginPage(driver);
        }

        public DropdownPage clickDropDown(){
            clickLink("Dropdown");
            return new DropdownPage(driver);
        }
        public ForgotPasswordPage clickForgotPassowrd(){
            clickLink("Forgot Password");
            return new ForgotPasswordPage(driver);
        }

        public ABTesting clickABTesting(){
            clickLink("A/B Testing");
            return new ABTesting(driver);
        }

        public HoversPage clickHovers(){
            clickLink("Hovers");
            return new HoversPage(driver);
        }

        public KeyPressesPage clickKeyPresses(){
            clickLink("Key Presses");
            return new KeyPressesPage(driver);
        }

        public AddRemoveElementPage clickAddRemoveElement(){
            clickLink("Add/Remove Elements");
            return new AddRemoveElementPage(driver);
        }

        public HorizontalSliderPage clickHorizontalSlide(){
            clickLink("Horizontal Slider");
            return new HorizontalSliderPage(driver);
        }

        public BrokenImagesPage clickBrokenImages(){
            clickLink("Broken Images");
            return new BrokenImagesPage(driver);
        }
        public CheckboxesPage clickCheckboxesPage(){
            clickLink("Checkboxes");
            return new CheckboxesPage(driver);
        }
        public BasicAuthPage clickBasicAuthPage(){
            clickLink("Basic Auth");
            return new BasicAuthPage(driver);
        }
    public DragAndDropPage clickDragAndDrop(){
        clickLink("Drag and Drop");
        return new DragAndDropPage(driver);
    }
        public JSAlertPage clickJavacriptAlerts(){
            clickLink("JavaScript Alerts");
            return new JSAlertPage(driver);
        }

        private void clickLink(String linkText){
            driver.findElement(By.linkText(linkText)).click();
        }
}
