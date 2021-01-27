package hw6.pages;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import hw6.entities.MetalsAndColors;
import hw6.forms.MetalsAndColorsForm;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetalsAndColorsPage extends WebPage {

    protected MetalsAndColorsForm metalsAndColorsForm;

    @FindBy(css = "ul.results  > li")
    private List<WebElement> results;

    public void checkMetalsAndColorsUrl() {
        MetalsAndColorsPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }

    public void fillMetalsAndColorsForm(MetalsAndColors metalsAndColors) {
        metalsAndColorsForm.fill(metalsAndColors);
    }

    public void checkResults(MetalsAndColors metalsAndColors) {
        List<String> expectedRows = metalsAndColors.convertedResults();
        List<String> actualRows = new ArrayList<>();
        for (WebElement element : results) {
            actualRows.add(element.getText().trim());
        }
        Assert.assertEquals(actualRows, expectedRows);
    }
}
