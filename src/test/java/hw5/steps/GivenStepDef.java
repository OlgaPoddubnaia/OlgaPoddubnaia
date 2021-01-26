package hw5.steps;

import io.cucumber.java.en.Given;

public class GivenStepDef extends AbstractBaseStepDef {

    @Given("I open JDI GitHub site")
    public void openSiteByUrl() {
        homePagePO.openPageByUrl(ConfProperties.getProperty("URL"));
    }

    @Given("I login as user \"Roman Iovlev\"")
    public void userLogin() {
        loginPage.logOnSite(hw4.steps.ConfProperties.getProperty("USER_NAME"),
                hw4.steps.ConfProperties.getProperty("PASSWORD"));
    }

    @Given("Dropdown Values")
    public String[] getDropdownText(String[] values) {
     return  values;
    }


}
