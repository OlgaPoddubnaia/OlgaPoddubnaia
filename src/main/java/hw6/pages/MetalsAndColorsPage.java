package hw6.pages;

import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import com.epam.jdi.light.ui.html.elements.complex.MultiSelector;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;


@Url("metals-colors.html")
@Title("Metal and Colors")
public class MetalsAndColorsPage extends WebPage {

    @UI("[class=radio]")
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


    @UI("[id=elements-checklist]")
    public static Checklist elements;
    public static Checklist elementsNoLocator;

    @UI("[id=calculate-button]")
    public Button calculateButton;

    @UI("[id=submit-button]")
    public Button submitButton;


    public void checkMetalsAndColorsUrl() {
        MetalsAndColorsPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }

    public void selcetSummary(int[] intSummary){
        summary.select(intSummary);
    }

}
