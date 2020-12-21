package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IframePagePO extends AbstractPage {

    public IframePagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#frame-button")
    private WebElement frameButtonOnIframePage;

    public void doesFrameButtonOnFramePageDisplayed() {
        Assert.assertTrue(frameButtonOnIframePage.isDisplayed());
    }
}
