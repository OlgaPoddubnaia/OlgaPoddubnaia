package hw4.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class AssertionStep extends AbstractStep {


    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Check opened page Url")
    public void checkUrl() {
        softAssert = new SoftAssert();
        softAssert.assertEquals(homePagePO.shouldHaveUrl(),
                ConfProperties.getProperty("URL"));
        softAssert.assertAll();
    }

    @Step
    public void checkBrowserTitle() {
        softAssert = new SoftAssert();
        softAssert.assertEquals(homePagePO.shouldHaveTitle(), "Home Page");
        softAssert.assertAll();
    }

    @Step
    public void checkIsUserLogged() {
        softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));
        softAssert.assertAll();
    }

    @Step
    public void areItemsDisplayedAndHaveProperTexts() {
        softAssert = new SoftAssert();
        for (int i = 0; i < headerMenuOfHomePageAfterLoginPO.headerSectionSize(); i++) {
            softAssert.assertTrue(headerMenuOfHomePageAfterLoginPO
                    .isItemsFromHeaderDisplayed(i));
        }

        String[] properHeaderTexts = {"HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"};
        for (int i = 0; i < headerMenuOfHomePageAfterLoginPO.headerSectionSize(); i++) {
            softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                    .getTextOfItemFromHeader(i), properHeaderTexts[i]);
        }
        softAssert.assertAll();
    }

    @Step
    public void areImagesOnIndexPageDisplayed() {
        softAssert = new SoftAssert();
        for (int i = 0; i < imagesOnIndexPagePO.imagesOnIndexPageSize(); i++) {
            softAssert.assertTrue(imagesOnIndexPagePO
                    .isImagesFromIndexPageDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Step
    public void areTextsOnIndexPageDisplayedAndHaveProperTexts() {
        softAssert = new SoftAssert();
        for (int i = 0; i < textsUnderImagesOnIndexPagePO.textsUnderImagesSize(); i++) {
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

        for (int i = 0; i < textsUnderImagesOnIndexPagePO.textsUnderImagesSize(); i++) {
            softAssert.assertEquals(textsUnderImagesOnIndexPagePO
                    .getTextsUnderIcons(i), properTextsUnderIcons.get(i));
        }
        softAssert.assertAll();
    }

    @Step
    public void isIframeExists() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(homePagePO.isIframeDisplayedOnHomePage());
        softAssert.assertAll();
    }

    @Step
    public void isFrameButtonOnIframe() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(iframePagePO.isFrameButtonOnFramePageDisplayed());
        softAssert.assertAll();
    }

    @Step
    public void areItemsInLeftSectionDisplayedAndHaveProperTexts() {
        softAssert = new SoftAssert();
        for (int i = 0; i < leftSectionOnHomePagePO.leftSectionSize(); i++) {
            softAssert.assertTrue(leftSectionOnHomePagePO
                    .isLeftSectionItemsOnHomePageDisplayed(i));
        }

        String[] properLeftSectionTexts = {"Home", "Contact form", "Service",
                "Metals & Colors", "Elements packs"};
        for (int i = 0; i < leftSectionOnHomePagePO.leftSectionSize(); i++) {
            softAssert.assertEquals(leftSectionOnHomePagePO
                    .getTextFromLeftSectionItems(i), properLeftSectionTexts[i]);
        }
        softAssert.assertAll();

    }

    @Step
    public void checkDifferentElementsUrl() {
        softAssert = new SoftAssert();
        softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                .getDifferentElementsPageUrl(), hw3.testLogic.ConfProperties
                .getProperty("DIFFERENT_ELEMENTS_URL"));
        softAssert.assertAll();
    }

    @Step
    public void checkAreWindWaterCheckboxesSelected() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(differentElementsPO.isWindCheckboxSelected());
        softAssert.assertTrue(differentElementsPO.isWaterCheckboxSelected());
        softAssert.assertAll();
    }

    @Step
    public void checkIsSelenSelected() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(differentElementsPO.isSelenRadioSelected());
        softAssert.assertAll();
    }

    @Step
    public void checkIsYellowInDropdownSelected() {
        softAssert = new SoftAssert();
        softAssert.assertEquals(differentElementsPO
                .getTextFromSelectedYellowInDropdown(), "Yellow");
        softAssert.assertAll();
    }

    @Step
    public void isLogRowsCorrespondedToWindWaterCheckboxes() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWaterCheckbox());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWindCheckbox());
        softAssert.assertAll();
    }

    @Step
    public void isLogRowCorrespondedToSelenRadio() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowsDisplayedAndCorrespondedToSelenRadio());
        softAssert.assertAll();
    }

    @Step
    public void isLogRowCorrespondedToYellowInDropdown() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLorRowDisplayedAndCorrespondedToYellowDropdown());
        softAssert.assertAll();
    }


}

