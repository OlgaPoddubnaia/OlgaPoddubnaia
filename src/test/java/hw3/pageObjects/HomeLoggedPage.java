package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLoggedPage extends PageObject {

    public HomeLoggedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#user-name")
    public WebElement userName;

    @FindBy(css = "\".m-l8 > li:nth-child(1) > a\"")
    public WebElement homeHeaderSection;

    @FindBy(css = ".m-l8 > li:nth-child(2) > a")
    public WebElement ContactFormHeaderSection;

    @FindBy(css = ".m-l8 > li.dropdown > a")
    public WebElement serviceHeaderSection;

    @FindBy(css = ".m-l8 > li:nth-child(4) > a")
    public WebElement metalsAndColorsHeaderSection;

    public boolean nameIsDisplayed() {
        return userName.isDisplayed();
    }

    public String getUserName() {
        return userName.getText();
    }

    public String getHomeHeaderText() {
        return homeHeaderSection.getText();
    }

    public boolean homeHeaderIsDisplayed() {
        return homeHeaderSection.isDisplayed();
    }

    public String getContactFormHeaderText() {
        return ContactFormHeaderSection.getText();
    }

    public boolean contactFormHeaderIsDisplayed() {
        return ContactFormHeaderSection.isDisplayed();
    }

    public String getServiceHeaderText() {
        return serviceHeaderSection.getText();
    }

    public boolean serviceHeaderIsDisplayed() {
        return serviceHeaderSection.isDisplayed();
    }

    public String getMetalsAndColorsHeaderText() {
        return metalsAndColorsHeaderSection.getText();
    }

    public boolean metalsAndColorsHeaderIsDisplayed() {
        return metalsAndColorsHeaderSection.isDisplayed();
    }



}
