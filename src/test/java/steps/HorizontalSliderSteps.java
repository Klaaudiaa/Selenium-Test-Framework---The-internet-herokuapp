package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicAuthPage;
import pages.HomePage;
import pages.HorizontalSliderPage;
import testContext.TestContext;

import static junit.framework.TestCase.assertEquals;

public class HorizontalSliderSteps {
    private final HomePage homePage;
    private final HorizontalSliderPage horizontalSliderPage;

    public HorizontalSliderSteps() {
        this.homePage = new HomePage(TestContext.getInstance());
        this.horizontalSliderPage = new HorizontalSliderPage(TestContext.getInstance());
    }
    @Given("I am on the horizontal slider page")
    public void iAmOnTheHorizontalSliderPage() {
        homePage.clickHorizontalSlide();
    }

    @When("Move horizontal slider to right by {int} points")
    public void moveHorizontalSliderToRightByPoints(int arg0) {
        horizontalSliderPage.setSliderValue(String.valueOf(arg0));
    }

    @Then("Horizontal slider is on value {int}")
    public void horizontalSliderIsOnValue(int arg) {
        assertEquals(horizontalSliderPage.getSliderValue(), String.valueOf(arg));
    }
}
