package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import testContext.TestContext;

public class BaseHooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = TestContext.getInstance();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().setSize(new Dimension(1552, 840));
    }

    @After
    public void tearDown() {
        TestContext.quit();
    }
}
