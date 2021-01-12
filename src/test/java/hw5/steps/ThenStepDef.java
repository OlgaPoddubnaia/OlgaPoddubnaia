package hw5.steps;

import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class ThenStepDef extends AbstractBaseStepDef {

    @Then("The site has proper Url")
    public void checkUrl() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePagePO.shouldHaveUrl(),
                ConfProperties.getProperty("URL"));
        softAssert.assertAll();
    }

    @Then("The site has proper title")
    public void checkBrowserTitle() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePagePO.shouldHaveTitle(), "Home Page");
        softAssert.assertAll();
    }

    @Then("Logged user name equals \"Roman Iovlev\"")
    public void checkIsUserLogged() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));
        softAssert.assertAll();
    }

    @Then("The page has proper Url")
    public void checkDifferentElementsUrl() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerMenuOfHomePageAfterLoginPO
                .getDifferentElementsPageUrl(), hw3.testLogic.ConfProperties
                .getProperty("DIFFERENT_ELEMENTS_URL"));
        softAssert.assertAll();
    }

    @Then("Wind, water checkboxes are selected")
    public void checkAreWindWaterCheckboxesSelected() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(differentElementsPO.isWindCheckboxSelected());
        softAssert.assertTrue(differentElementsPO.isWaterCheckboxSelected());
        softAssert.assertAll();
    }

    @Then("Selen radio is selected")
    public void checkIsSelenSelected() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(differentElementsPO.isSelenRadioSelected());
        softAssert.assertAll();
    }

    @Then("Yellow in dropdown is selected")
    public void checkIsYellowInDropdownSelected() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(differentElementsPO
                .getTextFromSelectedYellowInDropdown(), "Yellow");
        softAssert.assertAll();
    }

    @Then("Log rows are displayed and corresponded to checkboxes status")
    public void isLogRowsCorrespondedToWindWaterCheckboxes() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWaterCheckbox());
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowDisplayedAndCorrespondedToWindCheckbox());
        softAssert.assertAll();
    }

    @Then("Log row is displayed and corresponded to radio status")
    public void isLogRowCorrespondedToSelenRadio() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowsDisplayedAndCorrespondedToSelenRadio());
        softAssert.assertAll();
    }

    @Then("Log row is displayed and corresponded to selected in dropdown status")
    public void isLogRowCorrespondedToYellowInDropdown() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLorRowDisplayedAndCorrespondedToYellowDropdown());
        softAssert.assertAll();
    }

    @Then("\"User Table\" page should be opened")
    public void checkUserTableUrl() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(userTablePO.getUserTablePageUrl(), ConfProperties
                .getProperty("USER_TABLE_URL"));
        softAssert.assertAll();
    }


    @Then("6 Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void areSixNumberTypeDropdownsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixNumberTypeDropdowns());
        for (int i = 0; i < userTablePO.numberTypeDropdownsSize(); i++) {
            softAssert.assertTrue(userTablePO.areNumberTypeDropdownsDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("6 Usernames should be displayed on Users Table on User Table Page")
    public void areSixUsernamesDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixUsernames());
        for (int i = 0; i < userTablePO.usernamesSize(); i++) {
            softAssert.assertTrue(userTablePO.areUsernamesDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("6 Description texts under images should be displayed on Users Table on User Table Page")
    public void areSixDescriptionsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixDescriptions());
        for (int i = 0; i < userTablePO.descriptionsSize(); i++) {
            softAssert.assertTrue(userTablePO.areDescriptionsDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("6 checkboxes should be displayed on Users Table on User Table Page")
    public void areSixCheckboxesDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixCheckboxes());
        for (int i = 0; i < userTablePO.checkboxesSize(); i++) {
            softAssert.assertTrue(userTablePO.areCheckboxesDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("1 log row has \"Vip: condition changed to true\" text in log section")
    public void checkIfLogRowDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.isLogRowDisplayed());
        softAssert.assertAll();
    }

}
