package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HeaderMenuOfHomePageAfterLoginPO extends AbstractPage {

    @FindBy(how = How.CSS, using = "ul.uui-navigation.nav.navbar-nav.m-l8>li")
    private List<WebElement> headerSection;

    @FindBy(how = How.CSS, using = "ul.dropdown-menu>li")
    private List<WebElement> serviceDropdown;

    public HeaderMenuOfHomePageAfterLoginPO(WebDriver driver) {
        super(driver);
    }

    public void openDifferentElementsPage(String differentElementsURL) {
        headerSection.get(2).click();
        serviceDropdown.get(7).click();
        Assert.assertEquals(driver.getCurrentUrl(), differentElementsURL);
    }

    public void isItemFromHeaderHasAProperText(String[] properText) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerSection.get(0).getText(), properText[0]);
        softAssert.assertEquals(headerSection.get(1).getText(), properText[1]);
        softAssert.assertEquals(headerSection.get(2).getText(), properText[2]);
        softAssert.assertEquals(headerSection.get(3).getText(), properText[3]);
        softAssert.assertAll();
    }

    public void isItemsFromHeaderDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(headerSection.get(0).isDisplayed());
        softAssert.assertTrue(headerSection.get(1).isDisplayed());
        softAssert.assertTrue(headerSection.get(2).isDisplayed());
        softAssert.assertTrue(headerSection.get(3).isDisplayed());
        softAssert.assertAll();
    }
}
