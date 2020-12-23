package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class DifferentElementsPO extends AbstractPage {

    @FindBy(how = How.CSS, using = "label.label-checkbox>input")
    private List<WebElement> checkboxes;

    @FindBy(how = How.CSS, using = "label.label-radio>input")
    private List<WebElement> radios;

    @FindBy(how = How.CSS, using = "select.uui-form-element>option")
    private List<WebElement> colorsInDropdown;

    @FindBy(css = "div.colors > select")
    private WebElement dropdown;

    public DifferentElementsPO(WebDriver driver) {
        super(driver);
    }

    public void isYellowInDropdownSelected() {
        dropdown.click();
        colorsInDropdown.get(3).click();
        Assert.assertTrue(colorsInDropdown.get(3).isSelected());
    }

    public void isSelenRadioSelected() {
        SoftAssert softAssert = new SoftAssert();
        radios.get(3).click();
        softAssert.assertTrue(radios.get(3).isSelected());
        softAssert.assertAll();
    }

    public void isWindWaterCheckboxesSelected() {
        SoftAssert softAssert = new SoftAssert();
        checkboxes.get(0).click();
        softAssert.assertTrue(checkboxes.get(0).isSelected());
        checkboxes.get(2).click();
        softAssert.assertTrue(checkboxes.get(2).isSelected());
        softAssert.assertAll();
    }
}
