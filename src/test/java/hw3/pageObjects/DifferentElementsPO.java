package hw3.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class DifferentElementsPO extends AbstractPage {

    @FindBy(how = How.CSS, using = "label.label-checkbox>input")
    private List<WebElement> checkboxes;

    @FindBy(how = How.CSS, using = "label.label-radio>input")
    private List<WebElement> radios;

    @FindBy
    private Select colors;

    @FindBy(css = "div.colors > select")
    private WebElement dropdown;

    public DifferentElementsPO(WebDriver driver) {
        super(driver);
    }

    public void clickDropdown() {
        dropdown.click();
    }

    public void clickYellowInDropdown() {
        colors = new Select(driver.findElement(By
                .cssSelector("select.uui-form-element")));
        colors.selectByVisibleText("Yellow");
    }

    public void isYellowInDropdownSelected() {
        clickDropdown();
        clickYellowInDropdown();
        Assert.assertEquals(colors.getFirstSelectedOption().getText(),
                "Yellow");
    }

    public void radioSelenClick() {
        radios.get(3).click();
    }

    public void isSelenRadioSelected() {
        radioSelenClick();
        Assert.assertTrue(radios.get(3).isSelected());
    }

    public void windCheckboxClick() {
        checkboxes.get(0).click();
    }

    public void waterCheckboxClick() {
        checkboxes.get(2).click();
    }

    public void isWindWaterCheckboxesSelected() {
        SoftAssert softAssert = new SoftAssert();
        windCheckboxClick();
        softAssert.assertTrue(checkboxes.get(0).isSelected());
        waterCheckboxClick();
        softAssert.assertTrue(checkboxes.get(2).isSelected());
        softAssert.assertAll();
    }

}
