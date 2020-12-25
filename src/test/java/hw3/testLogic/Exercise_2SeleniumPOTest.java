package hw3.testLogic;

import hw3.pageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Exercise_2SeleniumPOTest extends BaseTest {

    @Test
    public void Exercise2POTests() {
        HomePagePO homePagePO = new HomePagePO(driver);
        LoginPagePO loginPage = new LoginPagePO(driver);
        HeaderMenuOfHomePageAfterLoginPO headerMenuOfHomePageAfterLoginPO =
                new HeaderMenuOfHomePageAfterLoginPO(driver);
        DifferentElementsPO differentElementsPO = new DifferentElementsPO(driver);
        LogRowsOnDifferentElementsPagePO logRowsOnDifferentElementsPagePO =
                new LogRowsOnDifferentElementsPagePO(driver);
        SoftAssert softAssert = new SoftAssert();

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

        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
        softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
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
