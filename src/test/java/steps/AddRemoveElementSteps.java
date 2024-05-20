package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AddRemoveElementPage;
import pages.HomePage;
import testContext.TestContext;

public class AddRemoveElementSteps {
    private final HomePage homePage;
    private final AddRemoveElementPage addRemoveElementPage;

    public AddRemoveElementSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.addRemoveElementPage = new AddRemoveElementPage(TestContext.getInstance());
    }
    @Given("I am on the add remove element page")
    public void i_am_on_the_add_remove_element_page() {homePage.clickAddRemoveElement();}
    @When("I add element")
    public void addElement(){
        addRemoveElementPage.clickAddButton();
    }
    @Then("Element is visible")
    public void checkAddedElement(){
        addRemoveElementPage.checkAddedElement();
    }
    @And("I delete element")
    public void deletedElement(){
        addRemoveElementPage.clickRemoveButton();
    }
    @Then("Element is not visible")
    public void checkDeletedElement(){
        boolean isElementPresent = addRemoveElementPage.isElementPresent(By.className("added-manually"));
        Assert.assertTrue(isElementPresent, "Element is visible");
    }
}
