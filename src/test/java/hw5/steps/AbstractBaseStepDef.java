package hw5.steps;

import hw5.driver.WebDriverSingleton;
import hw5.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public abstract class AbstractBaseStepDef {

    protected HomePagePO homePagePO;
    protected LoginPagePO loginPage;
    protected HeaderMenuOfHomePageAfterLoginPO headerMenuOfHomePageAfterLoginPO;
    protected DifferentElementsPO differentElementsPO;

    protected AbstractBaseStepDef() {
        WebDriver driver = WebDriverSingleton.getDriver();
        homePagePO = new HomePagePO(driver);
        loginPage = new LoginPagePO(driver);
        headerMenuOfHomePageAfterLoginPO = new HeaderMenuOfHomePageAfterLoginPO(driver);
        differentElementsPO = new DifferentElementsPO(driver);
    }
}
