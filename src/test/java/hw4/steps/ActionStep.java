package hw4.steps;

import hw4.testLogic.ConfProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ActionStep extends AbstractStep {

    protected ActionStep(WebDriver driver) {
        super(driver);
    }
@Step("Open test site by URL")
    public void openSiteByUrl(){
    homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
}


}
