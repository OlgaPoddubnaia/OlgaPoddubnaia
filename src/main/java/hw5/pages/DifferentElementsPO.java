package hw5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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

    public void selectYellowInDropdown() {
        colors = new Select(driver.findElement(By
                .cssSelector("select.uui-form-element")));
        colors.selectByVisibleText("Yellow");
    }

    public String getTextFromSelectedYellowInDropdown() {
        colors = new Select(driver.findElement(By
                .cssSelector("select.uui-form-element")));
        return colors.getFirstSelectedOption().getText();
    }

    public void selectRadioSelen() {
        radios.get(3).click();
    }

    public boolean isSelenRadioSelected() {
        return radios.get(3).isSelected();
    }

    public void selectCheckbox(String text) {
        for (int i = 0; i < checkboxes.size(); i++) {

            if ( checkboxes.get(i).getAttribute("txt").contains(text)) {
                checkboxes.get(i).click();
            }
        }/*  for (int i = 0; i < checkboxes.size(); i++) {
            if (checkboxes.get(i).getText().contains(text)) {
                checkboxes.get(i).click();
            }
        }*/
    }


    public boolean isWindCheckboxSelected() {
        return checkboxes.get(0).isSelected();
    }

    public boolean isWaterCheckboxSelected() {
        return checkboxes.get(2).isSelected();
    }
}
