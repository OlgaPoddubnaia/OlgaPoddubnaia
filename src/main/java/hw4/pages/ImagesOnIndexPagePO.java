package hw4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ImagesOnIndexPagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "div.benefit-icon>span")
    private List<WebElement> imagesOnIndexPage;

    public ImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    public int imagesOnIndexPageSize() {
        return imagesOnIndexPage.size();
    }

    public boolean isImagesFromIndexPageDisplayed(int i) {
        return imagesOnIndexPage.get(i).isDisplayed();
    }
}
