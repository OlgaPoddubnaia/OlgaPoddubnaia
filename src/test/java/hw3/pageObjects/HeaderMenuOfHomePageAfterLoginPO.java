package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HeaderMenuOfHomePageAfterLoginPO extends AbstractPage {

    public HeaderMenuOfHomePageAfterLoginPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "ul.uui-navigation.nav.navbar-nav.m-l8>li")
    private List<WebElement> headerSection;


    public void getHomeFromHeaderText() {
        headerSection.get(0).getText();
    }

    public boolean doesHomeFromHeaderDisplayed() {
        return headerSection.get(0).isDisplayed();
    }

    public void getTextContactFormFromHeader() {
        headerSection.get(1).getText();
    }

    public boolean doesContactFormFromHeaderDisplayed() {
        return headerSection.get(1).isDisplayed();
    }

    public void getTextServiceFromHeader() {
        headerSection.get(2).getText();
    }

    public boolean doesServiceFromHeaderDisplayed() {
        return headerSection.get(2).isDisplayed();
    }

    public void getTextMetalsAndColorsFromHeader() {
        headerSection.get(3).getText();
    }

    public boolean doesMetalsAndColorsFromHeaderDisplayed() {
        return headerSection.get(3).isDisplayed();
    }

}
