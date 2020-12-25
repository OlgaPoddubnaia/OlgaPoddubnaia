package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LeftSectionOnHomePagePO extends AbstractPage {

    @FindBy(how = How.CSS, using = "ul.sidebar-menu>li")
    private List<WebElement> leftSectionOnHomePage;

    public LeftSectionOnHomePagePO(WebDriver driver) {
        super(driver);
    }

    public boolean isLeftSectionItemsOnHomePageDisplayed(int i) {
        return leftSectionOnHomePage.get(i).isDisplayed();
    }

    public String getTextFromLeftSectionItems(int i) {
        return leftSectionOnHomePage.get(i).getText();
    }
}
