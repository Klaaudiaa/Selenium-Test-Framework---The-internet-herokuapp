package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.RetrievePasswordPage;
import testContext.TestContext;
import static org.junit.Assert.assertTrue;

public class ForgotPasswordSteps {
    private final HomePage homePage;
    private final ForgotPasswordPage forgotPasswordPage;
    private final RetrievePasswordPage retrievePasswordPage;

    public ForgotPasswordSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.forgotPasswordPage = new ForgotPasswordPage(TestContext.getInstance());
        this.retrievePasswordPage = new RetrievePasswordPage(TestContext.getInstance());
    }

    @Given("I am on the forgot password page")
    public void i_am_on_the_dropdown_page(){homePage.clickForgotPassowrd();}
    @When("I write my e-mail")
    public void i_write_my_email(){forgotPasswordPage.setEmail("klaudia@gmail.com").clickRetrievePassword();}
    @Then("Email is correct")
    public void first_option_is_chosen(){assertTrue(retrievePasswordPage.getInformation().contains("Internal Server Error"));}
}
