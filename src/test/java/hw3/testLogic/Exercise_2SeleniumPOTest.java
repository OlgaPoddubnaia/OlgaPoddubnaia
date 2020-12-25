package hw3.testLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_2SeleniumPOTest extends BaseTest {

    @Test
    public void Exercise2POTests() {

        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));

        Assert.assertEquals(homePagePO.shouldHaveUrl(), ConfProperties
                .getProperty("URL"));

        softAssert.assertEquals(homePagePO.shouldHaveTitle(), "Home Page");

        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));

        softAssert.assertFalse(loginPage.isLoginButtonDisplayed());
        softAssert.assertTrue(loginPage.isUserNameDisplayed());
        softAssert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));

        //step#5 Open through the header menu Service -> Different Elements Page
        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
        softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                .getDifferentElementsPageUrl(), ConfProperties
                .getProperty("DIFFERENT_ELEMENTS_URL"));

        //step#6 Select checkboxes
        differentElementsPO.selectWindCheckbox();
        softAssert.assertTrue(differentElementsPO.isWindCheckboxSelected());
        differentElementsPO.selectWaterCheckbox();
        softAssert.assertTrue(differentElementsPO.isWaterCheckboxSelected());

        //step#7 Select radio
        differentElementsPO.selectRadioSelen();
        softAssert.assertTrue(differentElementsPO.isSelenRadioSelected());

        //step#8 Select in dropdown
        differentElementsPO.selectYellowInDropdown();
        softAssert.assertEquals(differentElementsPO
                .getTextFromSelectedYellowInDropdown(), "Yellow");

          /*step#9 Assert that
    •	for each checkbox there is an individual log row and value is
     corresponded to the status of checkbox
    •	for radio button there is a log row and value is corresponded
     to the status of radio button
    •	for dropdown there is a log row and value is corresponded to
    the selected value.*/

        //checkboxes names are corresponded to expected
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWaterCheckbox());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWindCheckbox());
        //check radio buttons statuses
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowsDisplayedAndCorrespondedToSelenRadio());
        //check dropdown names
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLorRowDisplayedAndCorrespondedToYellowDropdown());

        //assert All
        softAssert.assertAll();
    }
}
