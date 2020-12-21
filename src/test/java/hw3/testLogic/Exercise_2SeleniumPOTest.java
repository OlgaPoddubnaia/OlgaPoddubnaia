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

        homePagePO.openPage(ConfProperties.getProperty("URL"));
        homePagePO.currentUrl(ConfProperties.getProperty("URL"));
        homePagePO.getTitle("Home Page");
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"), ConfProperties.getProperty("PASSWORD"));
        loginPage.doesLoginButtonDisplayed();
        loginPage.doesUserNameDisplayed();
        loginPage.userNameCompare(ConfProperties.getProperty("LOGGED_USER_NAME"));

        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage(
                ConfProperties.getProperty("DIFFERENT_ELEMENTS_URL"));
        differentElementsPO.checkDoesWindWaterCheckboxesSelected();
        differentElementsPO.checkDoesSelenRadioSelected();
        differentElementsPO.checkDoesYellowInDropdownSelected();
        logRowsOnDifferentElementsPagePO.doesLogRowsDisplayedAndCorrespondedToCheckboxes();
        logRowsOnDifferentElementsPagePO.doesLogRowsDisplayedAndCorrespondedToRadios();
        logRowsOnDifferentElementsPagePO.doesLorRowsDisplayedAndCorrespondedToDropdowns();
        softAssert.assertAll();
    }
}
