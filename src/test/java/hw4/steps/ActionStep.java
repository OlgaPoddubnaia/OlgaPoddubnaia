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


}
