package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/features/AddRemove.feature",
                "src/test/resources/features/BasicAuth.feature",
                "src/test/resources/features/BrokenImages.feature",
                "src/test/resources/features/Checkboxes.feature",
                "src/test/resources/features/Dropdown.feature"
        },
        glue = {
                "steps.AddRemoveElementSteps",
                "steps.BasicAuthSteps",
                "steps.BrokenImagesSteps",
                "steps.CheckboxesSteps",
                "steps.DropdownSteps"
        },
        plugin = {
                "summary",
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json"
        }
)
public class DefaultRunner extends AbstractTestNGCucumberTests {
}
