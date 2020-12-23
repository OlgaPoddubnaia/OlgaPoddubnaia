package hw3.testLogic;

import hw3.pageObjects.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;


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
        IframePagePO iframePagePO = new IframePagePO(driver);
        LeftSectionOnHomePagePO leftSectionOnHomePagePO =
                new LeftSectionOnHomePagePO(driver);
        SoftAssert softAssert = new SoftAssert();

        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
        homePagePO.shouldHaveUrl(ConfProperties.getProperty("URL"));
        homePagePO.shouldHaveTitle("Home Page");
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));
        loginPage.isLoginButtonDisplayed();
        loginPage.isUserNameDisplayed();
        loginPage.userNameCompare(ConfProperties.getProperty("LOGGED_USER_NAME"));
        headerMenuOfHomePageAfterLoginPO.isItemsFromHeaderDisplayed();
        String[] properHeaderTexts = {"HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"};
        headerMenuOfHomePageAfterLoginPO.isItemFromHeaderHasAProperText(properHeaderTexts);
        imagesOnIndexPagePO.isImagesFromIndexPageDisplayed();
        textsUnderImagesOnIndexPagePO.isTextUnderImagesDisplayed();
        ArrayList<String> properTextsUnderIcons = new ArrayList<>();
        properTextsUnderIcons.add("To include good practices\n" +
                "and ideas from successful\nEPAM project");
        properTextsUnderIcons.add("To be flexible and\ncustomizable");
        properTextsUnderIcons.add("To be multiplatform");
        properTextsUnderIcons.add("Already have good base\n(about 20 internal and\n" +
                "some external projects),\nwish to get more…");
        textsUnderImagesOnIndexPagePO.isTextsUnderIconsEqualToExpected(properTextsUnderIcons);
        homePagePO.isIframeExistsOnHomePage();
        homePagePO.switchToFrame();
        iframePagePO.isFrameButtonOnFramePageDisplayed();
        homePagePO.switchToHomePage();
        leftSectionOnHomePagePO.isLeftSectionItemsOnHomePageDisplayed();
        String[] properLeftSectionTexts = {"Home", "Contact form", "Service",
                "Metals & Colors", "Elements packs"};
        leftSectionOnHomePagePO.isLeftSectionItemsOnHomePageHaveProperTexts(properLeftSectionTexts);
        softAssert.assertAll();
    }
}
