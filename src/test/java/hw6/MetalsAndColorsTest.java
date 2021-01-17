package hw6;

import org.testng.annotations.Test;

import static hw6.JdiSite.*;
import static hw6.entities.User.ROMAN;

public class MetalsAndColorsTest extends AbstractBaseTest {

    @Test(priority = 1)
    public void loginTest() {

        open();

        login(ROMAN);

        homePage.checkUserLoggedIn(ROMAN);

        //String actualFullName = getUserName();
        //Assert.assertEquals(actualFullName, User.ROMAN.getFullName());
        // homePage.userName.is().text(ROMAN.getFullName());
    }

    @Test(priority = 2)
    public void isMetalsAndColorsPageOpenedTest() {
        openMetalsAndColorsPage();
        checkMetalsAndColorsPageUrl();
    }
}
