package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckboxesPage;
import pages.DropdownPage;
import pages.HomePage;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownSteps {
    private final HomePage homePage;
    private final DropdownPage dropdownPage;

    public DropdownSteps() {
        this.homePage = new HomePage(BaseHooks.getDriver());
        this.dropdownPage = new DropdownPage(BaseHooks.getDriver());
    }

    @Given ("I am on the dropdown page")
    public void i_am_on_the_dropdown_page(){homePage.clickDropDown();}
    @When ("I choose first option")
    public void i_choose_first_option(){dropdownPage.selectFromDropDown("Option 1");}
    @Then ("First option is chosen")
    public void first_option_is_chosen(){assertEquals(1,dropdownPage.getSelectedOptions().size(), "Incorrect");
        assertTrue("Option not selected", dropdownPage.getSelectedOptions().contains("Option 1"));}
    @And ("I choose second option")
    public void i_choose_second_option(){dropdownPage.selectFromDropDown("Option 2");}
    @Then ("Second option is chosen")
    public void second_option_is_chosen(){assertTrue("Option not selected", dropdownPage.getSelectedOptions().contains("Option 2"));}}

