package hw3.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TextsUnderImagesOnIndexPagePO extends AbstractPage {
    public TextsUnderImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "span.benefit-txt")
    private List<WebElement> textsOnIndexPage;

    public void getTextUnderFirstImage() {
        textsOnIndexPage.get(0).getText();
    }

    public boolean doesTextUnderFirstImageDisplayed() {
        return textsOnIndexPage.get(0).isDisplayed();
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
