package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicAuthPage;
import pages.HomePage;
import testContext.TestContext;

import static org.testng.Assert.assertTrue;

public class BasicAuthSteps {

    private final HomePage homePage;
    private final BasicAuthPage basicAuthPage;

    public BasicAuthSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.basicAuthPage = new BasicAuthPage(TestContext.getInstance());
    }
    @Given ("I am on the basic authorization page")
    public void i_am_on_the_basic_authorization_page() {homePage.clickBasicAuthPage();}
    @When("I fill popup with username and password")
    public void i_fill_popup_with_usrname_and_password(){basicAuthPage.switchToPopUp();}
    @Then("Authorization is finished")
    public void authorization_is_finished(){
        assertTrue(basicAuthPage.getInfo().contains("Congratulations! You must have the proper credentials."));
    }
}