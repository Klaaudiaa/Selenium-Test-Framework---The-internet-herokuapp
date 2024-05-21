package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicAuthPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import testContext.TestContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageSteps {
    private final HomePage homePage;
    private final LoginPage loginPage;
    private final SecureAreaPage secureAreaPage;

    public LoginPageSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.loginPage = new LoginPage(TestContext.getInstance());
        this.secureAreaPage = new SecureAreaPage(TestContext.getInstance());
    }
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        homePage.clickFormAuthentication();
    }

    @When("I enter username and password")
    public void iEnterUsernameAndPassword() {
        loginPage.setUsername("tomsmith").setPassword("SuperSecretPassword!").LoginButtonClick();

    }

    @Then("I am redirected to secure area page")
    public void iAmRedirectedToSecureAreaPage() {
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert: text is incorrect");
    }

    @And("I log out")
    public void iLogOut() {
        loginPage.clickLogoutButton();
    }

    @Then("I am back on login page")
    public void iAmBackOnLoginPage() {
        assertTrue(loginPage.getHeaderText().contains("You logged out of the secure area!"),
                "Alert: text is incorrect");
    }
}
