package hw5.steps;

import hw4.steps.ConfProperties;
import io.cucumber.java.en.And;

public class AndStepDef extends AbstractBaseStepDef {



    @And("I open Different Elements page through the header menu->Service")
    public void openDifferentElementsPage() {
        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
    }

    @And("I select water, wind checkboxes")
    public void selectWindWaterCheckboxes() {
        differentElementsPO.selectWindCheckbox();
        differentElementsPO.selectWaterCheckbox();
    }

    @And("I select selen radio")
    public void selectSelenRadio() {
        differentElementsPO.selectRadioSelen();
    }

    @And("Select yellow in dropdown")
    public void selectYellowInDropdown() {
        differentElementsPO.selectYellowInDropdown();
    }

    @And("I click on \"User Table\" button in Service dropdown")
    public void clickUserTableInDropdown() {
        headerMenuOfHomePageAfterLoginPO.clickUserTableInDropdown();
    }


}
