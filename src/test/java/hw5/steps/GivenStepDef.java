package hw5.steps;

import io.cucumber.java.en.Given;

public class GivenStepDef extends AbstractBaseStepDef {

    @Given("I open JDI GitHub site")
    public void openSiteByUrl() {
        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
    }


}
