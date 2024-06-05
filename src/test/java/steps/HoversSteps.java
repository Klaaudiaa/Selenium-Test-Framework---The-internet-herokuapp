package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.HoversPage;
import testContext.TestContext;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class HoversSteps {
    private final HomePage homePage;
    private final HoversPage hoversPage;

    public HoversSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.hoversPage = new HoversPage(TestContext.getInstance());
    }
    @Given("I am on the hovers page")
    public void iAmOnTheHoversPage() {
        homePage.clickHovers();
    }

    @When("I hover over image box")
    public void iHoverOverImageBox() {
        hoversPage.hoverOverFigure(1);
    }

    @Then("The title and link are correct")
    public void theTitleAndLinkTextAreCorrect() {
        assertTrue("Caption not displayed", hoversPage.hoverOverFigure(1).isCaptionDisplayed());
        assertEquals("name: user1", hoversPage.hoverOverFigure(1).getTitle());
        assertEquals("Incorrect link text","View profile", hoversPage.hoverOverFigure(1).getLinkText());
        assertTrue("Link is incorrect",hoversPage.hoverOverFigure(1).getLink().contains("/users/1"));
    }
}
