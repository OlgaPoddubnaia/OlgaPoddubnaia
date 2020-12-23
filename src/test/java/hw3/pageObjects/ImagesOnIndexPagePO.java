package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ImagesOnIndexPagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "div.benefit-icon>span")
    private List<WebElement> imagesOnIndexPage;

    public ImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    public void isImagesFromIndexPageDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(imagesOnIndexPage.get(i).isDisplayed());
        }
        softAssert.assertAll();
    }
}
