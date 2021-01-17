package hw6.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;

@Url("metals-colors.html") @Title("Metal and Colors")
public class MetalsAndColorsPage extends WebPage {

    public void checkMetalsAndColorsUrl(){
        MetalsAndColorsPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }

}
