package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LogRowsOnDifferentElementsPagePO extends AbstractPage {

    public LogRowsOnDifferentElementsPagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "label.label-checkbox>input")
    private List<WebElement> checkboxes;

    @FindBy(how = How.CSS, using = "label.label-radio>input")
    private List<WebElement> radios;

    @FindBy(how = How.CSS, using = "select.uui-form-element>option")
    private List<WebElement> colors;

    @FindBy(css = "div.colors > select")
    private WebElement searchDropdown;

    @FindBy(xpath = "//li[contains(text(),'Water') and contains(text(),'true')]")
    private WebElement waterCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'Earth') and contains(text(),'true')]")
    private WebElement earthCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'Wind') and contains(text(),'true')]")
    private WebElement windCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'Fire') and contains(text(),'true')]")
    private WebElement fireCheckboxLogRow;

    @FindBy(xpath = "//li[contains(text(),'metal') and contains(text(),'Gold')]")
    private WebElement goldMetalLogRow;

    @FindBy(xpath = "//li[contains(text(),'metal') and contains(text(),'Silver')]")
    private WebElement silverMetalLogRow;

    @FindBy(xpath = "//li[contains(text(),'metal') and contains(text(),'Bronze')]")
    private WebElement bronzeMetalLogRow;

    @FindBy(xpath = "//li[contains(text(),'metal') and contains(text(),'Selen')]")
    private WebElement selenMetalLogRow;


    @FindBy(xpath = "//li[contains(text(),'Colors') and contains(text(),'Red')]")
    private WebElement redDropdownLogRow;

    @FindBy(xpath = "//li[contains(text(),'Colors') and contains(text(),'Green')]")
    private WebElement greenDropdownLogRow;

    @FindBy(xpath = "//li[contains(text(),'Colors') and contains(text(),'Blue')]")
    private WebElement blueDropdownLogRow;

    @FindBy(xpath = "//li[contains(text(),'Colors') and contains(text(),'Yellow')]")
    private WebElement yellowDropdownLogRow;


    public void doesLogRowsDisplayedAndCorrespondedToCheckboxes() {
        SoftAssert softAssert = new SoftAssert();
        checkboxes.get(0).click();
        softAssert.assertTrue(waterCheckboxLogRow.isDisplayed());
        checkboxes.get(1).click();
        softAssert.assertTrue(earthCheckboxLogRow.isDisplayed());
        checkboxes.get(2).click();
        softAssert.assertTrue(windCheckboxLogRow.isDisplayed());
        checkboxes.get(3).click();
        softAssert.assertTrue(fireCheckboxLogRow.isDisplayed());
        softAssert.assertAll();
    }

    public void doesLogRowsDisplayedAndCorrespondedToRadios() {
        SoftAssert softAssert = new SoftAssert();
        radios.get(0).click();
        softAssert.assertTrue(goldMetalLogRow.isDisplayed());
        radios.get(1).click();
        softAssert.assertTrue(silverMetalLogRow.isDisplayed());
        radios.get(2).click();
        softAssert.assertTrue(bronzeMetalLogRow.isDisplayed());
        radios.get(3).click();
        softAssert.assertTrue(selenMetalLogRow.isDisplayed());
        softAssert.assertAll();
    }

    public void doesLorRowsDisplayedAndCorrespondedToDropdowns() {
        SoftAssert softAssert = new SoftAssert();
        searchDropdown.click();
        colors.get(0).click();
        softAssert.assertTrue(redDropdownLogRow.isDisplayed());
        searchDropdown.click();
        colors.get(1).click();
        softAssert.assertTrue(greenDropdownLogRow.isDisplayed());
        searchDropdown.click();
        colors.get(2).click();
        softAssert.assertTrue(blueDropdownLogRow.isDisplayed());
        searchDropdown.click();
        colors.get(3).click();
        softAssert.assertTrue(yellowDropdownLogRow.isDisplayed());
        softAssert.assertAll();
    }
}
