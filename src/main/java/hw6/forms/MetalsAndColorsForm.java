package hw6.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import hw6.entities.MetalsAndColors;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MetalsAndColorsForm extends Form<MetalsAndColors> {
    @FindBy(css = "p.radio > input")
    public static RadioButtons summary;

    @FindBy(name = "custom_radio_odd")
    public RadioButtons radio_odd;

    @FindBy(name = "custom_radio_even")
    public RadioButtons radio_even;

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

    @FindBy(css = "section[id=elements-checklist] input[type=checkbox]")
    public static Checklist elements;

    @FindBy(css = ".results li")
    public List<WebElement> results;

    @XPath("//input[@id='g7']")
    public Checkbox vegetableCheckBox;

    @UI("[id=calculate-button]")
    public Button calculateButton;

    @UI("[id=submit-button]")
    public Button submitButton;


    @Override
    public void fill(MetalsAndColors metalsAndColors) {
        radio_odd.select(metalsAndColors.getSummary()[0]);
        radio_even.select(metalsAndColors.getSummary()[1]);
        colors.select(metalsAndColors.getColor());
        metals.select(metalsAndColors.getMetals());
        vegetables.expand();
        vegetableCheckBox.click();
        vegetables.select(metalsAndColors.getVegetables());
        elements.select(metalsAndColors.getElements());
        calculateButton.click();
        submitButton.click();
    }
}
