package hw3.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TextsUnderImagesOnIndexPagePO extends AbstractPage {
    public TextsUnderImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "span.benefit-txt")
    private List<WebElement> textsOnIndexPage;


    public void getTextUnderFirstImage(String firstText, String secondText,
                                       String thirdText, String fourthText) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(textsOnIndexPage.get(0).getText(), firstText);
        softAssert.assertEquals(textsOnIndexPage.get(1).getText(), secondText);
        softAssert.assertEquals(textsOnIndexPage.get(2).getText(), thirdText);
        softAssert.assertEquals(textsOnIndexPage.get(3).getText(), fourthText);
        softAssert.assertAll();
    }

    public void doesTextUnderImagesDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(textsOnIndexPage.get(0).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(1).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(2).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(3).isDisplayed());
        softAssert.assertAll();
    }


    public void getTextUnderSecondImage() {
        textsOnIndexPage.get(1).getText();
    }

    public boolean doesTextUnderSecondImageDisplayed() {
        return textsOnIndexPage.get(1).isDisplayed();
    }

    public void getTextUnderThirdImage() {
        textsOnIndexPage.get(2).getText();
    }

    public boolean doesTextUnderThirdImageDisplayed() {
        return textsOnIndexPage.get(2).isDisplayed();
    }

    public void getTextUnderFourthImage() {
        textsOnIndexPage.get(3).getText();
    }

    public boolean doesTextUnderFourthImageDisplayed() {
        return textsOnIndexPage.get(3).isDisplayed();
    }
}