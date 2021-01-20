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


    @FindBy(css = "p.radio > input")
    public static RadioButtons summary;

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

    private Write

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
        elements.assertThat().values(intElements);

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


    public void checkResults(int[] intSummary, String[] intElements,
                             String intColor, String intMetals,
                             String[] intVegetables) {
    /*   results.get(0).getText().contains(intSummary);
       results.assertThat().values(intElements);
      results.assertThat().values(intColor);
       results.assertThat().values(intMetals);
       results.assertThat().values(intVegetables);*/

    /*    List<String> actualRows = new ArrayList<>();
        for (int i = 1; i < elements.size(); i++) {
          Assert.assertEquals(elements.get(i).getText().trim(),intColor);
        }*/

      /*  for (int i = 0; i < intColor.length(); i++) {
            results.assertThat().values(intColor[i]);
        }*/

       /* List<String> actualRows = new ArrayList<>();
        for (WebElement element : results) {
            actualRows.add(element.getText().trim());
        }


        List<String> expectedRows =new ArrayList<>();
        expectedRows.addAll(Arrays.asList(intElements));
        expectedRows.addAll(Collections.singleton(intColor));
        expectedRows.addAll(Collections.singleton(intMetals));
        expectedRows.addAll(Arrays.asList(intVegetables));
        expectedRows.addAll(Collections.singleton(intSummary.toString()));

        Assert.assertEquals(actualRows, expectedRows);*/
     /*   for (int i = 0; i < results.size(); i++) {
            Assert.assertTrue(actualRows.contains(intElements[i]));
        }*/

        /* public List<String> resultLogRow(){

        List<String> results = new ArrayList<>();
        int sum = Integer.parseInt(this.summary.get(0)) + Integer.parseInt(this.summary.get(1));
        String veg = "Vegetables: ";
        for (int i = 0; i < this.vegetables.size() - 1; i++) {
            //Cucumber, Vegetables
            veg += this.vegetables.get(i) + ", ";
        }
        veg += this.vegetables.get(this.vegetables.size() - 1);

        results.add("Summary: " + sum);
        results.add("Elements: " + this.elements.get(0) + ", " + this.elements.get(1));
        results.add("Color: " + this.colors);
        results.add("Metal: " + this.metals);
        results.add(veg);

        return results;
    }*/

    }

    public void assertResults() {
        writeToJason = new WriteToJason();
        writeToJason.writeToJason(assertRow
                .stream().map(WebElement::getText).collect(Collectors.toList()).get(0));
    }

}
