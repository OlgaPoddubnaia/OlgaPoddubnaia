package hw4.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {

    public ActionStep(WebDriver driver) {
        super(driver);
    }

    @Step("Open test site by URL")
    public void openSiteByUrl() {
        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
    }

    @Step
    public void userLogin() {
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));
    }

    @Step
    public void switchToIframe(){
        homePagePO.switchToFrame();
    }

    @Step
    public void switchToHomepage(){
        homePagePO.switchToHomePage();
    }

}
