package hw3.testLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class Exercise_1SeleniumPOTest extends BaseTest {

    @Test
    public void Exercise1POTests() {

        //step#1 Open test site by URL
        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
        softAssert.assertEquals(homePagePO.shouldHaveUrl(), ConfProperties
                .getProperty("URL"));

        //step#2 Assert Browser title
        softAssert.assertEquals(homePagePO.shouldHaveTitle(), "Home Page");

        //step#3 Perform login
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));
        softAssert.assertFalse(loginPage.isLoginButtonDisplayed());
        softAssert.assertTrue(loginPage.isUserNameDisplayed());

        //step#4 Assert Username is logged
        softAssert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));

         /*step#5 Assert that there are 4 items on the header
         section are displayed and they have proper texts*/
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(headerMenuOfHomePageAfterLoginPO
                    .isItemsFromHeaderDisplayed(i));
        }

        String[] properHeaderTexts = {"HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"};
        for (int i = 0; i < 4; i++) {
            softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                    .getTextOfItemFromHeader(i), properHeaderTexts[i]);
        }

         /*step#6	Assert that there are 4 images on the Index Page
         and they are displayed	*/
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(imagesOnIndexPagePO
                    .isImagesFromIndexPageDisplayed(i));
        }

        /*step#7 Assert that there are 4 texts on the Index Page under
         icons and they have proper text*/
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(textsUnderImagesOnIndexPagePO
                    .isTextUnderImagesDisplayed(i));
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

        //step #8 Assert that there is the iframe with “Frame Button” exist
        softAssert.assertTrue(homePagePO.isIframeDisplayedOnHomePage());

        /*step#9 Switch to the iframe and check that there is
         “Frame Button” in the iframe*/
        homePagePO.switchToFrame();
        softAssert.assertTrue(iframePagePO.isFrameButtonOnFramePageDisplayed());

        //step#10 Switch to original window back
        homePagePO.switchToHomePage();
        softAssert.assertTrue(homePagePO.isIframeDisplayedOnHomePage());

        /*step#11 Assert that there are 5 items in the Left
      Section are displayed and they have proper text*/
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

        //run all soft asserts
        softAssert.assertAll();
    }
}
