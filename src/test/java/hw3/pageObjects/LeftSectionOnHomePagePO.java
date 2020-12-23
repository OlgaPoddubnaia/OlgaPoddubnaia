package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class LeftSectionOnHomePagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "ul.sidebar-menu>li")
    private List<WebElement> leftSectionOnHomePage;

    public LeftSectionOnHomePagePO(WebDriver driver) {
        super(driver);
    }

    public void isLeftSectionItemsOnHomePageDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(leftSectionOnHomePage.get(0).isDisplayed());
        softAssert.assertTrue(leftSectionOnHomePage.get(1).isDisplayed());
        softAssert.assertTrue(leftSectionOnHomePage.get(2).isDisplayed());
        softAssert.assertTrue(leftSectionOnHomePage.get(3).isDisplayed());
        softAssert.assertTrue(leftSectionOnHomePage.get(4).isDisplayed());
        softAssert.assertAll();
    }

    public void isLeftSectionItemsOnHomePageHaveProperTexts
            (String home, String contactForm, String service,
             String metalsAndColors, String elementsPack) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(leftSectionOnHomePage.get(0).getText(), home);
        softAssert.assertEquals(leftSectionOnHomePage.get(1).getText(), contactForm);
        softAssert.assertEquals(leftSectionOnHomePage.get(2).getText(), service);
        softAssert.assertEquals(leftSectionOnHomePage.get(3).getText(), metalsAndColors);
        softAssert.assertEquals(leftSectionOnHomePage.get(4).getText(), elementsPack);
        softAssert.assertAll();
    }
}
