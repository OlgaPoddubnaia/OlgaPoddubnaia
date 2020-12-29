package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TextsUnderImagesOnIndexPagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "span.benefit-txt")
    private List<WebElement> textsOnIndexPage;

    public TextsUnderImagesOnIndexPagePO(WebDriver driver) {
        super(driver);
    }

    public int textsUnderImagesSize() {
        return textsOnIndexPage.size();
    }

    public String getTextsUnderIcons(int i) {
        return textsOnIndexPage.get(i).getText();
    }

    public boolean isTextUnderImagesDisplayed(int i) {
        return textsOnIndexPage.get(i).isDisplayed();
    }
}
