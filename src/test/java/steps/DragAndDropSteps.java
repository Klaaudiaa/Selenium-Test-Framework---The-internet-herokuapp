package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DragAndDropPage;
import pages.HomePage;
import testContext.TestContext;

import static org.junit.Assert.assertTrue;

public class DragAndDropSteps {
    private final HomePage homePage;
    private final DragAndDropPage dragAndDropPage;

    public DragAndDropSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.dragAndDropPage = new DragAndDropPage(TestContext.getInstance());
    }
    @Given("I am on the drag and drop page")
    public void iAmOnTheDragAndDropPage() {
    homePage.clickDragAndDrop();
    }

    @When("I drag box A and drop on column B")
    public void iDragBoxAAndDropOnSecondPlace() {
        dragAndDropPage.dragAtoColumnB();
    }

    @Then("Box A is on second place")
    public void boxAIsOnSecondPlace() {
        assertTrue(dragAndDropPage.getTextFromColumnA().contains("B"));
    }

    @And("I drag box A and drop on column A")
    public void iDragBoxAAndDropOnFirstPlace() {
        dragAndDropPage.dragAtoColumnA();
    }

    @Then("Box A is on first place")
    public void boxAIsOnFirstPlace() {
        assertTrue(dragAndDropPage.getTextFromColumnA().contains("A"));
    }
}
