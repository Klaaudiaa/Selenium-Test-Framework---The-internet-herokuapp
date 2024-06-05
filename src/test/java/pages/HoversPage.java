package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HoversPage {
    @FindBy(className = "figure")
    private List<WebElement> figureBoxes;
    @FindBy(className = "figcaption")
    private WebElement caption;
    @FindBy(tagName = "h5")
    private WebElement header;
    @FindBy(linkText = "View profile")
    private WebElement link;
    private final WebDriver driver;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HoversPage hoverOverFigure(int index) {
        WebElement figure = figureBoxes.get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return this;
    }
        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return header.getText();
        }

        public String getLink() {
            return link.getAttribute("href");
        }

        public String getLinkText() {
            return link.getText();
        }
}
