package hw6.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import org.apache.logging.log4j.core.util.Assert;

public class MetalsAndColorsPage extends WebPage {

    public void checkMetalsAndColorsUrl(){
        WebPage.checkUrl("https://jdi-testing.github.io/jdi-light/metals-colors.html");
    }

}
