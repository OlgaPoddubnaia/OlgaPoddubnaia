package hw5.steps;

import io.cucumber.java.en.When;

public class WhenStepDef extends AbstractBaseStepDef {

    @When("I click on \"Service\" button in Header")
    public void clickServiceDropdown(){
        headerMenuOfHomePageAfterLoginPO.clickServiceInDropdown();
    }

}
