package hw3.testLogic;

import hw3.pageObjects.*;
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
        homePagePO.shouldHaveUrl(ConfProperties.getProperty("URL"));
        homePagePO.shouldHaveTitle("Home Page");
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));
        loginPage.isLoginButtonDisplayed();
        loginPage.isUserNameDisplayed();
        loginPage.userNameCompare(ConfProperties.getProperty("LOGGED_USER_NAME"));

        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage(
                ConfProperties.getProperty("DIFFERENT_ELEMENTS_URL"));
        differentElementsPO.isWindWaterCheckboxesSelected();
        differentElementsPO.isSelenRadioSelected();
        differentElementsPO.isYellowInDropdownSelected();
        logRowsOnDifferentElementsPagePO.isLogRowsDisplayedAndCorrespondedToCheckboxes();
        logRowsOnDifferentElementsPagePO.isLogRowsDisplayedAndCorrespondedToRadios();
        logRowsOnDifferentElementsPagePO.isLorRowsDisplayedAndCorrespondedToDropdowns();
        softAssert.assertAll();
    }
}
