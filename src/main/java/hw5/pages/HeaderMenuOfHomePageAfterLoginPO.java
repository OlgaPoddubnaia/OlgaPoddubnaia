package hw5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HeaderMenuOfHomePageAfterLoginPO extends AbstractPage {

    @FindBy(how = How.CSS, using = "ul.uui-navigation.nav.navbar-nav.m-l8>li")
    private List<WebElement> headerSection;

    @FindBy(how = How.CSS, using = "ul.dropdown-menu>li")
    private List<WebElement> serviceDropdown;

    public HeaderMenuOfHomePageAfterLoginPO(WebDriver driver) {
        super(driver);
    }

    public void openDifferentElementsPage() {
        headerSection.get(2).click();
        serviceDropdown.get(7).click();
    }

    public void clickServiceInDropdown(String serviceString) {
             wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText(serviceString)))
                .click();
    }

    public void clickUserTableInDropdown(String stringForDropdown) {
        wait.until(ExpectedConditions
                .elementToBeClickable(By.linkText(stringForDropdown)))
                .click();
    }

    public String getDifferentElementsPageUrl() {
        return driver.getCurrentUrl();
    }

    public int headerSectionSize() {
        return headerSection.size();
    }

    public String getTextOfItemFromHeader(int i) {
        return headerSection.get(i).getText();
    }

    public boolean isItemsFromHeaderDisplayed(int i) {
        return headerSection.get(i).isDisplayed();
    }
}
