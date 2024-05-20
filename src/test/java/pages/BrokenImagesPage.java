package pages;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class BrokenImagesPage {
    private final WebDriver driver;
    private int invalidImageCount = 0;
    @FindBy (tagName = "img")
    private List<WebElement> image;

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int validateInvalidImages() {
        List<WebElement> allImagesList = image;
        for (WebElement image : allImagesList) {
            if (image != null) {
                verifyActiveImage(image);
            }
        }
        return invalidImageCount;
    }

    public int countImages() {
        List<WebElement> allImagesList = image;
        return allImagesList.size();
    }

    private void verifyActiveImage(WebElement element) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(element.getAttribute("src"));
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() != 200) {
                invalidImageCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}