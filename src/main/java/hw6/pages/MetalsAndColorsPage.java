package hw6.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import com.epam.jdi.light.ui.html.elements.complex.MultiSelector;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;


public class MetalsAndColorsPage extends WebPage {


    @FindBy(css = "p.radio > input")
    public static RadioButtons summary;

    @JDropdown(root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public static Dropdown colors;

    @UI("#metals")
    public static DataListOptions metals;


    @UI("#vegetables")
    public static MultiSelector vegetables;


    @FindBy(css = "p.checkbox > input")
    public static Checklist elements;
    public static Checklist elementsNoLocator;

    @UI("[id=calculate-button]")
    public Button calculateButton;

    @UI("[id=submit-button]")
    public Button submitButton;


    public void checkMetalsAndColorsUrl() {
        MetalsAndColorsPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }

    public void selectSummary(int[] intSummary) {
        for (int i = 0; i < intSummary.length; i++) {
            summary.select(intSummary[i]);
        }
    }

    public void selectElements(String[] intElements) {
        for (int i = 0; i < intElements.length; i++) {
            elements.select(intElements[i]);
        }
    }

    public void selectColors(String stringColor) {
        colors.select(stringColor);
        colors.is().selected(stringColor);
    }

    public void selectMetals(String stringMetals) {
        metals.select(stringMetals);
        metals.is().selected(stringMetals);
    }

    public void selectVegetables(String[] intVegetables) {
        vegetables.select(intVegetables);
    }

    public void clickCalculateButton() {
        calculateButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }


}
