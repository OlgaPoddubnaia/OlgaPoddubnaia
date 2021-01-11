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

    @Step("Log user on site")
    public void userLogin() {
        loginPage.logOnSite(ConfProperties.getProperty("USER_NAME"),
                ConfProperties.getProperty("PASSWORD"));
    }

    @Step("Switch from home page to iframe")
    public void switchToIframe() {
        homePagePO.switchToFrame();
    }

    @Step("Switch from home page to iframe")
    public void switchToHomepage() {
        homePagePO.switchToHomePage();
    }

    @Step("Open different elements page")
    public void openDifferentElementsPage() {
        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
    }

    @Step("Select wind, water checkboxes on different elements page")
    public void selectWindWaterCheckboxes() {
        differentElementsPO.selectWindCheckbox();
        differentElementsPO.selectWaterCheckbox();
    }

    @Step("Select selen radio on different elements page")
    public void selectSelenRadio() {
        differentElementsPO.selectRadioSelen();
    }

    @Step("Select yellow in dropdown on different elements page")
    public void selectYellowInDropdown() {
        differentElementsPO.selectYellowInDropdown();
    }
}
