package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

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

    public void doesLogRowsDisplayedAndCorrespondedToCheckboxes() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(waterCheckboxLogRow.isDisplayed());
        softAssert.assertTrue(windCheckboxLogRow.isDisplayed());
        softAssert.assertAll();
    }

    public void doesLogRowsDisplayedAndCorrespondedToRadios() {
        Assert.assertTrue(selenMetalLogRow.isDisplayed());
    }

    public void doesLorRowsDisplayedAndCorrespondedToDropdowns() {
        Assert.assertTrue(yellowDropdownLogRow.isDisplayed());
    }
}
