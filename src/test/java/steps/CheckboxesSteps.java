package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckboxesPage;
import pages.HomePage;
import testContext.TestContext;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckboxesSteps {
    private final HomePage homePage;
    private final CheckboxesPage checkboxesPage;

    public CheckboxesSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.checkboxesPage = new CheckboxesPage(TestContext.getInstance());
    }
    @Given("I am on the checkboxes page")
    public void i_am_on_the_checkboxes_page() {
        homePage.clickCheckboxesPage();
    }

    @When("I click on checkboxes")
    public void i_click_on_checkbox() {
        if(!checkboxesPage.isCheckbox1Selected()){
        checkboxesPage.clickCheckbox1();}
        if(!checkboxesPage.isCheckbox2Selected()){
        checkboxesPage.clickCheckbox2();}
    }
    @And("I uncheck checkboxes")
    public void i_uncheck_checkboxes(){
        if(checkboxesPage.isCheckbox1Selected()){
            checkboxesPage.clickCheckbox1();}
        if(checkboxesPage.isCheckbox2Selected()){
            checkboxesPage.clickCheckbox2();}
    }

    @Then("Checkboxes are selected")
    public void checkboxes_are_selected(){
        assertTrue(checkboxesPage.isCheckbox1Selected());
        assertTrue(checkboxesPage.isCheckbox2Selected());
    }
    @Then("Checkboxes are not selected")
    public void checkboxes_are_not_selected(){
        assertFalse(checkboxesPage.isCheckbox1Selected());
        assertFalse(checkboxesPage.isCheckbox2Selected());
    }
}
