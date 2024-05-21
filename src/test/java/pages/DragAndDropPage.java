package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
    private final WebDriver driver;
    @FindBy (id = "column-a")
    private WebElement columnA;
    @FindBy (id = "column-b")
    private WebElement columnB;
    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DragAndDropPage dragAtoColumnB(){
        Actions action = new Actions(driver);
        action.dragAndDrop(columnA, columnB).build().perform();
    return this;
    }
    public DragAndDropPage dragAtoColumnA(){
        Actions action = new Actions(driver);
        action.dragAndDrop(columnB, columnA).build().perform();
        return this;
    }
    public String getTextFromColumnA(){
        return columnA.getText();
    }
}
