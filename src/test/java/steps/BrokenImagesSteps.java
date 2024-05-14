package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.testng.Assert.assertEquals;
import pages.BrokenImagesPage;
import pages.HomePage;

public class BrokenImagesSteps {
    private final HomePage homePage;
    private final BrokenImagesPage brokenImagesPage;

    public BrokenImagesSteps() {
        this.homePage = new HomePage(BaseHooks.getDriver());
        this.brokenImagesPage = new BrokenImagesPage(BaseHooks.getDriver());
    }

    @Given("I am on the broken images page")
    public void i_am_on_the_broken_images_page() {
        homePage.clickBrokenImages();
    }

    @When("I check all the images")
    public void i_check_all_the_images() {
        assertEquals(brokenImagesPage.validateInvalidImages(),2,"More broken Images than expected");
    }
    @Then("Images are broken")
    public void images_are_broken() {
        assertEquals(brokenImagesPage.countImages(), 4, "More images than expected");
    }
}

