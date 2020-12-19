package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageAbstractPO extends AbstractPage {

    public LoginPageAbstractPO(WebDriver driver) {
        super(driver);
    }
// поменять локатор, изменить метод на vois
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

    public LoginPageAbstractPO logOnSite(String login, String password){
        searchButton.click();
        searchUserName.sendKeys(login);
        searchPassword.sendKeys(password);
        searchLoginButton.click();
        return this;
    }

    public boolean loginButtonIsDisplayed(){
       return searchLoginButton.isDisplayed();
    }


}
