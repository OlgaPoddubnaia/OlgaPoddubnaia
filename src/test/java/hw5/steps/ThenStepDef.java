package hw5.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Map;

public class ThenStepDef extends AbstractBaseStepDef {

    @Then("The site has proper Url {string}")
    public void checkUrl(String properUrl) {
        Assert.assertEquals(homePagePO.shouldHaveUrl(), properUrl);

    }

    @Then("The site has title {string}")
    public void checkBrowserTitle(String title) {
        Assert.assertEquals(homePagePO.shouldHaveTitle(), title);
    }

    @Then("Logged user name equals \"Roman Iovlev\"")
    public void checkIsUserLogged() {
        Assert.assertEquals(loginPage.getUserNameAfterLogin(),
                ConfProperties.getProperty("LOGGED_USER_NAME"));
    }

    @Then("The page has proper Url {string}")
    public void checkDifferentElementsUrl(String properUrl) {
        Assert.assertEquals(headerMenuOfHomePageAfterLoginPO
                .getDifferentElementsPageUrl(), properUrl);
    }

    @Then("{string}, {string} checkboxes are selected")
    public void checkAreWindWaterCheckboxesSelected(String wind,String water) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(differentElementsPO.isCheckboxSelected(wind));
        softAssert.assertTrue(differentElementsPO.isCheckboxSelected(water));
        softAssert.assertAll();
    }

    @Then("Selen radio is selected")
    public void checkIsSelenSelected() {
       Assert.assertTrue(differentElementsPO.isSelenRadioSelected());
    }

    @Then("Yellow in dropdown is selected")
    public void checkIsYellowInDropdownSelected() {
        Assert.assertEquals(differentElementsPO
                .getTextFromSelectedYellowInDropdown(), "Yellow");
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
        Assert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLogRowsDisplayedAndCorrespondedToSelenRadio());
    }

    @Then("Log row is displayed and corresponded to selected in dropdown status")
    public void isLogRowCorrespondedToYellowInDropdown() {
        Assert.assertTrue(logRowsOnDifferentElementsPagePO
                .isLorRowDisplayedAndCorrespondedToYellowDropdown());
    }

    @Then("\"User Table\" page should be opened")
    public void checkUserTableUrl() {
       Assert.assertEquals(userTablePO.getUserTablePageUrl(), ConfProperties
                .getProperty("USER_TABLE_URL"));
    }


    @Then("{int} Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void areSixNumberTypeDropdownsDisplayed(int numberOfTypeDropdowns) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixNumberTypeDropdowns(numberOfTypeDropdowns));
        for (int i = 0; i < userTablePO.numberTypeDropdownsSize(); i++) {
            softAssert.assertTrue(userTablePO.areNumberTypeDropdownsDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("{int} Usernames should be displayed on Users Table on User Table Page")
    public void areSixUsernamesDisplayed(int numberOfUsernames) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixUsernames(numberOfUsernames));
        for (int i = 0; i < userTablePO.usernamesSize(); i++) {
            softAssert.assertTrue(userTablePO.areUsernamesDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("{int} Description texts under images should be displayed on Users Table on User Table Page")
    public void areSixDescriptionsDisplayed(int numberOfDescriptions) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixDescriptions(numberOfDescriptions));
        for (int i = 0; i < userTablePO.descriptionsSize(); i++) {
            softAssert.assertTrue(userTablePO.areDescriptionsDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("{int} checkboxes should be displayed on Users Table on User Table Page")
    public void areSixCheckboxesDisplayed(int numberOfCheckboxes) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userTablePO.areThereSixCheckboxes(numberOfCheckboxes));
        for (int i = 0; i < userTablePO.checkboxesSize(); i++) {
            softAssert.assertTrue(userTablePO.areCheckboxesDisplayed(i));
        }
        softAssert.assertAll();
    }

    @Then("{int} log row has {string} text in log section")
    public void checkIfLogRowDisplayed(int numberOfLogRow, String properText) {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(userTablePO.isThereOneLogRowOnPanel(numberOfLogRow));
        softAssert.assertTrue(userTablePO.isLogRowsContainsText(properText));
        softAssert.assertAll();
    }

    @Then("droplist should contain values in column Type for user Roman")
    public void dropListShouldContainValues(List<String> list) {
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < 3; i++) {
            softAssert.assertEquals(userTablePO.getTextOfDroplistValues(i), list.get(i + 1));
        }
        softAssert.assertAll();
    }

    @Then("User table should contain following values:")
    public void userTableShouldContainValues(DataTable dataTable) {
        SoftAssert softAssert = new SoftAssert();
        List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < table.size(); i++) {
            softAssert.assertEquals(userTablePO.getTextOfUsername(i), table.get(i).get("User"));
            softAssert.assertEquals(userTablePO.getTextOfDescriptions(i), table.get(i).get("Description"));
            softAssert.assertEquals(userTablePO.getTextOfNumbers(i), table.get(i).get("Number"));
        }
        softAssert.assertAll();
    }
}
