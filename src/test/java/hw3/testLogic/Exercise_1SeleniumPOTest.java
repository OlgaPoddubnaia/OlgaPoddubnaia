
package hw3.testLogic;

import hw3.pageObjects.HomePageAbstractPO;
import hw3.pageObjects.LoginPageAbstractPO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import hw3.testLogic.ForProperties;


public class Exercise_1SeleniumPOTest extends BaseTest {

    HomePageAbstractPO homePageAbstractPO = new HomePageAbstractPO(driver);
    LoginPageAbstractPO loginPage = new LoginPageAbstractPO(driver);

    @Test
    public void Exercise1() {
        SoftAssert softAssert = new SoftAssert();
        driver.get(property.getProperty("URL"));
        softAssert.assertEquals(homePageAbstractPO.currentUrl(), property.getProperty("URL"));
        softAssert.assertEquals(homePageAbstractPO.getTitle(), "Home Page");
        loginPage.logOnSite(property.getProperty("USER_NAME"), property.getProperty("PASSWORD"));
        softAssert.assertFalse(loginPage.loginButtonIsDisplayed());


        softAssert.assertAll();
    }


}
