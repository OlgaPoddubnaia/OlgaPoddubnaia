package hw4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePO extends AbstractPage {

    @FindBy(xpath = "//a[@class='dropdown-toggle' and @href='#']")
    private WebElement searchButton;

    @FindBy(css = "#name")
    private WebElement searchUserNameField;

    @FindBy(css = "#password")
    private WebElement searchPasswordField;

    @FindBy(id = "login-button")
    private WebElement searchLoginButton;

    @FindBy(css = "#user-name")
    private WebElement userName;

    public LoginPagePO(WebDriver driver) {
        super(driver);
    }

    public void loginButtonClick() {
        searchLoginButton.click();
    }

    public void logOnSite(String login, String password) {
        searchButton.click();
        searchUserNameField.sendKeys(login);
        searchPasswordField.sendKeys(password);
        loginButtonClick();
    }

    public boolean isLoginButtonDisplayed() {
        return searchLoginButton.isDisplayed();
    }

    public String getUserNameAfterLogin() {
        return userName.getText();
    }

    public boolean isUserNameDisplayed() {
        return userName.isDisplayed();
    }
}
