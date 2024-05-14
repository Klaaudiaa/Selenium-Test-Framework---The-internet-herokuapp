package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

    public class CheckboxesPage {
        private WebDriver driver;
        public CheckboxesPage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isCheckbox1Selected(){
            boolean isCheckbox1Selected = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
            return isCheckbox1Selected;
        }
        public boolean isCheckbox2Selected(){
            boolean isCheckbox2Selected = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
            return isCheckbox2Selected;
        }
        public void clickCheckbox1(){
            clickBox("//*[@id=\"checkboxes\"]/input[1]");
        }

        public void clickCheckbox2(){
            clickBox("//*[@id=\"checkboxes\"]/input[2]");
        }
        private void clickBox(String name){
            driver.findElement(By.xpath(name)).click();
        }
    }
