package hw6.tests;

import hw6.dataProvider.DataProviderFromJson;
import hw6.entities.MetalsAndColors;
import org.testng.annotations.Test;

import static hw6.JdiSite.*;
import static hw6.entities.User.ROMAN;

public class MetalsAndColorsTest extends AbstractBaseTest {

    @Test(dataProvider = "getDataFromJson",
            dataProviderClass = DataProviderFromJson.class)
    public void metalsAndColorsFormTest(MetalsAndColors metalsAndColors) {
        open();
        login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);
        openMetalsAndColorsPage();
        checkMetalsAndColorsPageUrl();
        fillAndSubmitMetalsAndColorsForm(metalsAndColors);
        metalsAndColorsFormHaveProperData(metalsAndColors);
    }
}

