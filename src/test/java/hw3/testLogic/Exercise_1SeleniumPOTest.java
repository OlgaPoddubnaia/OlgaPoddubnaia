package hw3.testLogic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;


public class Exercise_1SeleniumPOTest extends BaseTest {

    @Test
    public void Exercise1POTests() {

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

        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(headerMenuOfHomePageAfterLoginPO
                    .isItemsFromHeaderDisplayed(i));
        }

        String[] properHeaderTexts = {"HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"};
        for (int i = 0; i < 4; i++) {
            softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                    .getTextOfItemFromHeader(i), properHeaderTexts[i]);
        }

        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(imagesOnIndexPagePO.isImagesFromIndexPageDisplayed(i));
        }

        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(textsUnderImagesOnIndexPagePO.isTextUnderImagesDisplayed(i));
        }

        ArrayList<String> properTextsUnderIcons = new ArrayList<>();
        properTextsUnderIcons.add("To include good practices\n" +
                "and ideas from successful\nEPAM project");
        properTextsUnderIcons.add("To be flexible and\ncustomizable");
        properTextsUnderIcons.add("To be multiplatform");
        properTextsUnderIcons.add("Already have good base\n(about 20 internal and\n" +
                "some external projects),\nwish to get more…");
        for (int i = 0; i < 4; i++) {
            softAssert.assertEquals(textsUnderImagesOnIndexPagePO
                    .getTextsUnderIcons(i), properTextsUnderIcons.get(i));
        }

        softAssert.assertTrue(homePagePO.isIframeDisplayedOnHomePage());

        homePagePO.switchToFrame();

        softAssert.assertTrue(iframePagePO.isFrameButtonOnFramePageDisplayed());

        homePagePO.switchToHomePage();
        softAssert.assertTrue(homePagePO.isIframeDisplayedOnHomePage());


        for (int i = 0; i < 5; i++) {
            softAssert.assertTrue(leftSectionOnHomePagePO
                    .isLeftSectionItemsOnHomePageDisplayed(i));
        }


        String[] properLeftSectionTexts = {"Home", "Contact form", "Service",
                "Metals & Colors", "Elements packs"};
        for (int i = 0; i < 5; i++) {
            softAssert.assertEquals(leftSectionOnHomePagePO
                    .getTextFromLeftSectionItems(i), properLeftSectionTexts[i]);
        }

        softAssert.assertAll();
    }
}
