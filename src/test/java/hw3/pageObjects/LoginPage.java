package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".navbar-nav.navbar-right > li > a")
    private WebElement searchButton;

    @FindBy(css = "#name")
    private WebElement searchUserName;

    @FindBy(css = "#password")
    private WebElement searchPassword;

    @FindBy(id = "login-button")
    private WebElement searchLoginButton;

    public String currentUrl(){
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void logOnSite(String login,String password){
        searchButton.click();
        searchUserName.sendKeys(login);
        searchPassword.sendKeys(password);
        searchLoginButton.click();
    }

    public boolean loginButtonIsDisplayed(){
       return searchLoginButton.isDisplayed();
    }


}
