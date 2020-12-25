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
        Assert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));

        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
        Assert.assertEquals(headerMenuOfHomePageAfterLoginPO
                .getDifferentElementsPageUrl(), ConfProperties
                .getProperty("DIFFERENT_ELEMENTS_URL"));

        differentElementsPO.selectWindCheckbox();
        softAssert.assertTrue(differentElementsPO.isWindCheckboxSelected());

        differentElementsPO.selectWaterCheckbox();
        softAssert.assertTrue(differentElementsPO.isWaterCheckboxSelected());

        differentElementsPO.selectRadioSelen();
        softAssert.assertTrue(differentElementsPO.isSelenRadioSelected());

        differentElementsPO.selectYellowInDropdown();
        softAssert.assertEquals(differentElementsPO
                .getTextFromSelectedYellowInDropdown(), "Yellow");

        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWaterCheckbox());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWindCheckbox());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowsDisplayedAndCorrespondedToSelenRadio());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLorRowDisplayedAndCorrespondedToYellowDropdown());

        softAssert.assertAll();
    }
}
