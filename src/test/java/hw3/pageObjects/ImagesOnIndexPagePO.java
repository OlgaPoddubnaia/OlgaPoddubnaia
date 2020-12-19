package hw3.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ImagesOnIndexPagePO extends AbstractPage {

    public ImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "div.benefit-icon>span")
    private List<WebElement> imagesOnIndexPage;

    public boolean doesImageOneFromIndexPageDisplayed() {
        return imagesOnIndexPage.get(0).isDisplayed();
    }

    public boolean doesImageTwoFromIndexPageDisplayed() {
        return imagesOnIndexPage.get(1).isDisplayed();
    }

    public boolean doesImageThreeFromIndexPageDisplayed() {
        return imagesOnIndexPage.get(2).isDisplayed();
    }

    public boolean doesImageFourFromIndexPageDisplayed() {
        return imagesOnIndexPage.get(3).isDisplayed();
    }

}
