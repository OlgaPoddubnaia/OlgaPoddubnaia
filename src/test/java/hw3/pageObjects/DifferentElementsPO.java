package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class DifferentElementsPO extends AbstractPage {

    public DifferentElementsPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "label.label-checkbox>input")
    private List<WebElement> checkboxes;

    @FindBy(how = How.CSS, using = "label.label-radio>input")
    private List<WebElement> radios;

    @FindBy(how = How.CSS, using = "select.uui-form-element>option")
    private List<WebElement> colorsInDropdown;

    @FindBy(css = "div.colors > select")
    private WebElement dropdown;

    public void checkDoesYellowInDropdownSelected() {
        dropdown.click();
        colorsInDropdown.get(3).click();
        Assert.assertTrue(colorsInDropdown.get(3).isSelected());
    }

    public void checkDoesSelenRadioSelected() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(radios.get(3).isSelected());
        radios.get(3).click();
        softAssert.assertTrue(radios.get(3).isSelected());
        softAssert.assertAll();
    }

    public void checkDoesWindWaterCheckboxesSelected() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(checkboxes.get(0).isSelected());
        checkboxes.get(0).click();
        softAssert.assertTrue(checkboxes.get(0).isSelected());
        checkboxes.get(0).click();
        softAssert.assertFalse(checkboxes.get(2).isSelected());
        checkboxes.get(2).click();
        softAssert.assertTrue(checkboxes.get(2).isSelected());
        checkboxes.get(2).click();
        softAssert.assertAll();
    }
}
