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
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), ConfProperties.getProperty("URL"));
        softAssert.assertAll();
    }


}
