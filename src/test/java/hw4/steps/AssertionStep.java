package hw4.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AssertionStep extends AbstractStep {


    public AssertionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Check opened page Url")
    public void checkUrl() {
        softAssert=new SoftAssert();
        softAssert.assertEquals(homePagePO.shouldHaveUrl(), ConfProperties.getProperty("URL"));
        softAssert.assertAll();
    }

    @Step
    public void checkBrowserTitle() {
        softAssert.assertEquals(homePagePO.shouldHaveTitle(), "Home Page");
    }

//нужно ли проверять что зареганы?? кажется, что нет
/*
    softAssert.assertFalse(loginPage.isLoginButtonDisplayed());
        softAssert.assertTrue(loginPage.isUserNameDisplayed());*/
}
