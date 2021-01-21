package hw6.tests;

import hw6.dataProvider.DataProviderForJson;
import org.testng.annotations.Test;

import static hw6.JdiSite.*;
import static hw6.entities.User.ROMAN;

public class MetalsAndColorsTest extends AbstractBaseTest {

    /*@Test(priority = 1)
    public void loginTest() {
        open();
        login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);
    }*/

   /* @Test(priority = 2)
    public void isMetalsAndColorsPageOpenedTest() {
        openMetalsAndColorsPage();
        checkMetalsAndColorsPageUrl();
    }*/

    @Test(dataProvider = "dataFromJson",
            dataProviderClass = DataProviderForJson.class)
    public void isMetalsAndColorsFormFilled(String[] summary, String[] elements,
                                            String color, String metals,
                                            String[] vegetables) {
        open();
        login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);
        openMetalsAndColorsPage();
        checkMetalsAndColorsPageUrl();
        metalsAndColorsPage.selectSummary(summary);
        calculateSummary();
        metalsAndColorsPage.selectColors(color);
        metalsAndColorsPage.selectMetals(metals);
        metalsAndColorsPage.selectElements(elements);
        metalsAndColorsPage.selectVegetables(vegetables);
        submitMetalsAndColorsForm();
        metalsAndColorsPage.checkResults(summary, elements, color, metals, vegetables);


    }

}
