
package hw3.testLogic;

import hw3.pageObjects.LoginPageAbstractPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise_1SeleniumPOTest extends BaseTest {

    @Test
    public void signUp() {
        driver.get(URL);

        LoginPageAbstractPO loginPage = new LoginPageAbstractPO(driver);
        Assert.assertEquals(loginPage.currentUrl(),URL);
        Assert.assertEquals(loginPage.getTitle(),"Home Page");
        loginPage.logOnSite("Roman","Jdi1234");
        Assert.assertFalse(loginPage.loginButtonIsDisplayed());
    }



}
