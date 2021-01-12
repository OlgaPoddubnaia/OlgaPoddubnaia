package hw5.steps;

import io.cucumber.java.en.When;

public class WhenStepDef extends AbstractBaseStepDef {

    @When("I click on \"Service\" button in Header")
    public void clickServiceDropdown() {
        headerMenuOfHomePageAfterLoginPO.clickServiceInDropdown();
    }

    @When("I open Different Elements page through the header menu->Service")
    public void openDifferentElementsPage() {
        headerMenuOfHomePageAfterLoginPO.openDifferentElementsPage();
    }


    @When("I select water, wind checkboxes")
    public void selectWindWaterCheckboxes() {
        differentElementsPO.selectWindCheckbox();
        differentElementsPO.selectWaterCheckbox();
    }

    @When("I select selen radio")
    public void selectSelenRadio() {
        differentElementsPO.selectRadioSelen();
    }

    @When("Select yellow in dropdown")
    public void selectYellowInDropdown() {
        differentElementsPO.selectYellowInDropdown();
    }

    @When("I select 'vip' checkbox for \"Sergey Ivan\"")
    public void selectVipCheckboxForSergeyIvan() {
        userTablePO.selectVipCheckboxForSergeyIvan();
    }

    @When("I click on \"User Table\" button in Service dropdown")
    public void clickUserTableInDropdown() {
        headerMenuOfHomePageAfterLoginPO.clickUserTableInDropdown();
    }

}
