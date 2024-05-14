package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseHooks {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    @Before
    public void setUp() {
        ChromeDriver d = new ChromeDriver();
        d.manage().window().setSize(new Dimension(1552, 840));
        driver.set(d);
        getDriver().get("https://the-internet.herokuapp.com");
    }

    @After
    public void tearDown() {
        getDriver().quit();
    }
}
