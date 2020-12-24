package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class TextsUnderImagesOnIndexPagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "span.benefit-txt")
    private List<WebElement> textsOnIndexPage;

    public TextsUnderImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }



    public void isTextsUnderIconsEqualToExpected( ArrayList<String> properTextsUnderIcons) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(textsOnIndexPage.get(0).getText(), properTextsUnderIcons.get(0));
        softAssert.assertEquals(textsOnIndexPage.get(1).getText(), properTextsUnderIcons.get(1));
        softAssert.assertEquals(textsOnIndexPage.get(2).getText(), properTextsUnderIcons.get(2));
        softAssert.assertEquals(textsOnIndexPage.get(3).getText(), properTextsUnderIcons.get(3));
        softAssert.assertAll();
    }

    public void isTextUnderImagesDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(textsOnIndexPage.get(0).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(1).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(2).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(3).isDisplayed());
        softAssert.assertAll();
    }
}
