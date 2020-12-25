package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogRowsOnDifferentElementsPagePO extends AbstractPage {

    @FindBy(xpath = "//li[contains(text(),'Water') and contains(text(),'true')]")
    private WebElement waterCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'Wind') and contains(text(),'true')]")
    private WebElement windCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'metal') and contains(text(),'Selen')]")
    private WebElement selenMetalLogRow;

    @FindBy(xpath = "//li[contains(text(),'Colors') and contains(text(),'Yellow')]")
    private WebElement yellowDropdownLogRow;

    public LogRowsOnDifferentElementsPagePO(WebDriver driver) {
        super(driver);
    }

    public boolean isLogRowDisplayedAndCorrespondedToWaterCheckbox() {
        return waterCheckboxLogRow.isDisplayed();
    }

    public boolean isLogRowDisplayedAndCorrespondedToWindCheckbox() {
        return windCheckboxLogRow.isDisplayed();
    }

    public boolean isLogRowsDisplayedAndCorrespondedToSelenRadio() {
        return selenMetalLogRow.isDisplayed();
    }

    public boolean isLorRowDisplayedAndCorrespondedToYellowDropdown() {
        return yellowDropdownLogRow.isDisplayed();
    }
}
