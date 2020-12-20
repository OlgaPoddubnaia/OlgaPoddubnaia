package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HeaderMenuOfHomePageAfterLoginPO extends AbstractPage {

    public HeaderMenuOfHomePageAfterLoginPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "ul.uui-navigation.nav.navbar-nav.m-l8>li")
    private List<WebElement> headerSection;


    public void getTextOfItemFromHeader(String home, String contactForm,
                                        String service, String metalsAndColors) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerSection.get(0).getText(), home);
        softAssert.assertEquals(headerSection.get(1).getText(), contactForm);
        softAssert.assertEquals(headerSection.get(2).getText(), service);
        softAssert.assertEquals(headerSection.get(3).getText(), metalsAndColors);
        softAssert.assertAll();
    }

    public void doesItemsFromHeaderDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(headerSection.get(0).isDisplayed());
        softAssert.assertTrue(headerSection.get(1).isDisplayed());
        softAssert.assertTrue(headerSection.get(2).isDisplayed());
        softAssert.assertTrue(headerSection.get(3).isDisplayed());
        softAssert.assertAll();
    }
}
