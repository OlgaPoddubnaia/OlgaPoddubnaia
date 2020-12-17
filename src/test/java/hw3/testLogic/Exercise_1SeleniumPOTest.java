
package hw3.testLogic;

import hw3.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_1SeleniumPOTest extends BaseTest {

    @Test
    public void signUp() {
        driver.get(URL);

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.currentUrl(),URL);
        Assert.assertEquals(loginPage.getTitle(),"Home Page");
        loginPage.logOnSite("Roman","Jdi1234");
        Assert.assertFalse(loginPage.loginButtonIsDisplayed());
    }



}
