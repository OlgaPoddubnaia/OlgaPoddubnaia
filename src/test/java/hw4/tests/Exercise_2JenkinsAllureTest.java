package hw4.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("HW4 with step design pattern")
@Story("Exercise 2 in step design pattern")
public class Exercise_2JenkinsAllureTest extends AbstractBaseTest {

    @Test
    public void Exercise2StepDesignTest() {
        //step#1 Open test site by URL
        actionStep.openSiteByUrl();
        assertionStep.checkUrl();

        //step#2 Assert Browser title
        assertionStep.checkBrowserTitle();

        //step#3 Perform login
        actionStep.userLogin();

        //step#4 Assert Username is logged
        assertionStep.checkIsUserLogged();

        //step#5 Open through the header menu Service -> Different Elements Page
        actionStep.openDifferentsElementsPage();
        assertionStep.checkDifferentElementsUrl();

        //step#6 Select checkboxes
        actionStep.selectWindWaterCheckboxes();
        assertionStep.checkAreWindWaterCheckboxesSelected();

        //step#7 Select radio
        actionStep.selectSelenRadio();
        assertionStep.checkIsSelenSelected();

        //step#8 Select in dropdown
        actionStep.selectYellowInDropdown();
        assertionStep.checkIsYellowInDropdownSelected();

          /*step#9 Assert that
    •	for each checkbox there is an individual log row and value is
     corresponded to the status of checkbox
    •	for radio button there is a log row and value is corresponded
     to the status of radio button
    •	for dropdown there is a log row and value is corresponded to
    the selected value.*/

        //checkboxes names are corresponded to expected
        assertionStep.isLogRowsCorrespondedToWindWaterCheckboxes();
        //check radio buttons statuses
        assertionStep.isLogRowCorrespondedToSelenRadio();
        //check dropdown names
        assertionStep.isLogRowCorrespondedToYellowInDropdown();

    }
}
