package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePagePO extends AbstractPage {

    @FindBy(css = "#frame-button")
    private WebElement frameButtonOnIframePage;

    public IframePagePO(WebDriver driver) {
        super(driver);
    }

    public boolean isFrameButtonOnFramePageDisplayed() {
        return frameButtonOnIframePage.isDisplayed();
    }
}
