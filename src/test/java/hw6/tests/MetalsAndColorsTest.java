package hw6.tests;

import hw6.data.ReadMetalsAndColorsDataSetJson;
import org.testng.annotations.Test;

import static hw6.JdiSite.*;
import static hw6.entities.User.ROMAN;

public class MetalsAndColorsTest extends AbstractBaseTest {

    @Test(priority = 1)
    public void loginTest() {
        open();
        login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);
    }

    @Test(priority = 2)
    public void isMetalsAndColorsPageOpenedTest() {
        openMetalsAndColorsPage();
        checkMetalsAndColorsPageUrl();
    }

    @Test(priority = 3,
            dataProvider = "",
            dataProviderClass = ReadMetalsAndColorsDataSetJson.class)
    public void isMetalsAndColorsFormFilled() {

    }

}
