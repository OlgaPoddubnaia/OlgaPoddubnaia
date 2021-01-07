package hw4.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("HW4 with step design pattern")
@Story("Exercise 1 in step design pattern")
public class Exercise_1JenkinsAllureTest extends AbstractBaseTest {

    @Test
    public void Exercise1StepDesignTest() {

        //step#1 Open test site by URL
        actionStep.openSiteByUrl();
        assertionStep.checkUrl();

        //step#2 Assert Browser title
        assertionStep.checkBrowserTitle();
        //step#3 Perform login

        //step#4 Assert Username is logged

          /*step#5 Assert that there are 4 items on the header
         section are displayed and they have proper texts*/

        /*step#6	Assert that there are 4 images on the Index Page
         and they are displayed	*/

          /*step#7 Assert that there are 4 texts on the Index Page under
         icons and they have proper text*/

        //step #8 Assert that there is the iframe with “Frame Button” exist

        /*step#9 Switch to the iframe and check that there is
         “Frame Button” in the iframe*/

        //step#10 Switch to original window back

        /*step#11 Assert that there are 5 items in the Left
      Section are displayed and they have proper text*/


    }
}
