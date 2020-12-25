package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    public String getDifferentElementsPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getTextOfItemFromHeader(int i) {
        return headerSection.get(i).getText();
    }

    public boolean isItemsFromHeaderDisplayed(int i) {
        return headerSection.get(i).isDisplayed();
    }
}
