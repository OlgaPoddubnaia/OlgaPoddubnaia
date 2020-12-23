package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePagePO extends AbstractPage {

    @FindBy(tagName = "iframe")
    private WebElement iframeOnHomePage;

    public HomePagePO(WebDriver driver) {
        super(driver);
    }

    public void openPage(String URL) {
        driver.get(URL);
    }

    public void currentUrl(String URL) {
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    public void getTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    public void doesIframeExistsOnHomePage() {
        Assert.assertTrue(iframeOnHomePage.isDisplayed());
    }

    public void switchToFrame() {
        driver.switchTo().frame("frame");
    }

    public void switchToHomePage() {
        driver.switchTo().defaultContent();
        doesIframeExistsOnHomePage();
    }
}
