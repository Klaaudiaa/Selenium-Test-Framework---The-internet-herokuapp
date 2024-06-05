package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.JSAlertPage;
import testContext.TestContext;

import static org.junit.Assert.assertEquals;


public class JSAlertSteps {
    private final HomePage homePage;
    private final JSAlertPage jsAlertPage;

    public JSAlertSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.jsAlertPage = new JSAlertPage(TestContext.getInstance());
    }
    @Given("I am on the JavaScript alerts page")
    public void IAmOnTheJavaScriptAlertsPage() {
        homePage.clickJavacriptAlerts();
    }
    @When("I click for JS alert")
    public void iClickForJSAlert() {
        jsAlertPage.clickAlertButton();
        assertEquals( "I am a JS Alert", jsAlertPage.getAlertText());
    }
    @When("I click for JS confirmation alert")
    public void iClickForJSConfirmationAlert() { jsAlertPage.clickConfirmButton();
        assertEquals("I am a JS Confirm", jsAlertPage.getAlertText());
    }
    @When("I click for JS prompt")
    public void iClickForJSPrompt() {
        jsAlertPage.clickPromptButton();
        assertEquals("I am a JS prompt",jsAlertPage.getAlertText());
    }
    @And("I accept alert")
    public void iAcceptAlert() {
        jsAlertPage.accept();
    }
    @And("I dismiss confirmation alert")
    public void iDismissConfirmationAlert() {
        jsAlertPage.dismiss();
    }
    @And("I accept confirmation alert")
    public void iAcceptConfirmationAlert() {
        jsAlertPage.accept();
    }
    @And("I write text in the prompt")
    public void iWriteTextInThePrompt() {
        jsAlertPage.alert_setInput("Kurza stopa, udało się!");
    }
    @Then("Alert is not visible")
    public void alertIsNotVisible() {
        assertEquals("You successfully clicked an alert", jsAlertPage.getResults());}
    @Then("Confirmation alert is canceled")
    public void confirmationAlertIsCanceled() {
        assertEquals("You clicked: Cancel", jsAlertPage.getResults());}
        @Then("Confirmation alert is accepted")
    public void confirmationAlertIsAccepted() {
        assertEquals("You clicked: Ok", jsAlertPage.getResults());}
    @Then("Results are correct")
    public void resultsAreCorrect() {
        assertEquals("You entered: Kurza stopa, udało się!", jsAlertPage.getResults());}
}
