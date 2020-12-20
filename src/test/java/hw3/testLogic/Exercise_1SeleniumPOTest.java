package hw3.testLogic;

import hw3.pageObjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Exercise_1SeleniumPOTest extends BaseTest {

    @Test
    public void Exercise1POTests() {
        HomePagePO homePagePO = new HomePagePO(driver);
        LoginPagePO loginPage = new LoginPagePO(driver);
        HeaderMenuOfHomePageAfterLoginPO headerMenuOfHomePageAfterLoginPO =
                new HeaderMenuOfHomePageAfterLoginPO(driver);
        ImagesOnIndexPagePO imagesOnIndexPagePO = new ImagesOnIndexPagePO(driver);
        TextsUnderImagesOnIndexPagePO textsUnderImagesOnIndexPagePO =
                new TextsUnderImagesOnIndexPagePO(driver);
        IframePage iframePage = new IframePage(driver);
        LeftSectionOnHomePagePO leftSectionOnHomePagePO =
                new LeftSectionOnHomePagePO(driver);
        SoftAssert softAssert = new SoftAssert();

        homePagePO.openPage(ConfProperties.getProperty("URL"));
        homePagePO.currentUrl(ConfProperties.getProperty("URL"));
        homePagePO.getTitle("Home Page");
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"), ConfProperties.getProperty("PASSWORD"));
        loginPage.doesLoginButtonDisplayed();
        loginPage.doesUserNameDisplayed();
        loginPage.userNameCompare(ConfProperties.getProperty("LOGGED_USER_NAME"));
        headerMenuOfHomePageAfterLoginPO.doesItemsFromHeaderDisplayed();
        headerMenuOfHomePageAfterLoginPO.getTextOfItemFromHeader("HOME",
                "CONTACT FORM", "SERVICE", "METALS & COLORS");
        imagesOnIndexPagePO.doesImagesFromIndexPageDisplayed();
        textsUnderImagesOnIndexPagePO.doesTextUnderImagesDisplayed();
        String firstText = "To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project";
        String secondText = "To be flexible and\n" + "customizable";
        String thirdText = "To be multiplatform";
        String fourthText = "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…";
        textsUnderImagesOnIndexPagePO.getTextUnderFirstImage(firstText,
                secondText, thirdText, fourthText);
        homePagePO.doesIframeExistsOnHomePage();
        homePagePO.switchToFrame();
        iframePage.doesFrameButtonOnFramePageDisplayed();
        homePagePO.switchToHomePage();
        leftSectionOnHomePagePO.doesLeftSectionItemsOnHomePageDisplayed();
        leftSectionOnHomePagePO.doesLeftSectionItemsOnHomePageHaveProperTexts("Home",
                "Contact form", "Service", "Metals & Colors",
                "Elements packs");
        softAssert.assertAll();
    }
}
