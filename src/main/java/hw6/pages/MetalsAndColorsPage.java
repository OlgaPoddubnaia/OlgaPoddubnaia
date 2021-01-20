package hw6.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import com.epam.jdi.light.ui.html.elements.complex.MultiSelector;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MetalsAndColorsPage extends WebPage {

    @UI("[name=custom_radio_odd]")
    public RadioButtons summaryTop;

    @UI("[name=custom_radio_even]")
    public RadioButtons summaryBottom;


    @FindBy(css = "p.radio > input")
    public static RadioButtons summary;

    @FindBy(css = "div.info-panel-section > section.horizontal-group ")
    public static List<WebElement> summaryTexts;

    @JDropdown(root = "div[ui=dropdown]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public static Dropdown colors;

    @JDropdown(root = "div[ui=combobox]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public static Dropdown metals;


    @JDropdown(root = "div[ui=droplist]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public static Dropdown vegetables;


    @FindBy(css = "p.checkbox > input")
    public static Checklist elements;
    public static Checklist elementsNoLocator;

    @UI("[id=calculate-button]")
    public Button calculateButton;

    @UI("[id=submit-button]")
    public Button submitButton;

    @FindBy(css = ".results li")
    public List<WebElement> results;

    @Override
    public String toString() {
        return "MetalsAndColorsPage{" +
                "results=" + results +
                '}';
    }


    public void checkMetalsAndColorsUrl() {
        MetalsAndColorsPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static ArrayList<Integer> sum = new ArrayList<>();


    public void selectSummary(String[] summary) {
        summaryTop.select(summary[0]);
        summaryBottom.select(summary[1]);
        sum.add(Integer.parseInt(summary[0]) + Integer.parseInt(summary[1]));
        calculateButton.click();
    }






 /*   public void selectSummary(String[] intSummary) {
        for (int i = 0; i < intSummary.length; i++) {
            summary.select(intSummary[i]);
        }

    }*/

    public void selectElements(String[] stringElements) {
        for (int i = 0; i < stringElements.length; i++) {
            elements.select(stringElements[i]);
        }
        elements.assertThat().values(stringElements);

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
        for (int i = 0; i < intVegetables.length; i++) {
            vegetables.select(intVegetables[i]);
        }
        vegetables.assertThat().values(intVegetables);
    }

    public void clickCalculateButton() {
        calculateButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }


    public void checkResults(String[] sum, String[] intElements,
                             String intColor, String intMetals,
                             String[] intVegetables) {

        List<String> expectedRows = new ArrayList<>();
        expectedRows.addAll(Collections.singleton(Arrays.toString(sum)));
        expectedRows.addAll(Arrays.asList(intElements));
        expectedRows.addAll(Collections.singleton(intColor));
        expectedRows.addAll(Collections.singleton(intMetals));
        expectedRows.addAll(Arrays.asList(intVegetables));
        List<String> actualRows = new ArrayList<>();
        for (WebElement element : results) {
            actualRows.add(element.getText().trim());
        }
        for (int i = 0; i < expectedRows.size(); i++) {
            Assert.assertEquals(actualRows.get(i), expectedRows.get(i));

        }

    }


}
