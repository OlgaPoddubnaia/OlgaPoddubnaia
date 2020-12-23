package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IframePagePO extends AbstractPage {

    @FindBy(css = "#frame-button")
    private WebElement frameButtonOnIframePage;

    public IframePagePO(WebDriver driver) {
        super(driver);
    }

    public void doesFrameButtonOnFramePageDisplayed() {
        Assert.assertTrue(frameButtonOnIframePage.isDisplayed());
    }
}
