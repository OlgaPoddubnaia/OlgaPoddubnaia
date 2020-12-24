package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    public void searchButtonClick() {
        searchButton.click();
    }

    public void loginButtonClick() {
        searchLoginButton.click();

    }

    public void logOnSite(String login, String password) {
        searchButtonClick();
        searchUserNameField.sendKeys(login);
        searchPasswordField.sendKeys(password);
        loginButtonClick();
    }

    public void isLoginButtonDisplayed() {
        Assert.assertFalse(searchLoginButton.isDisplayed());
    }

    public void userNameCompare(String name) {
        Assert.assertEquals(userName.getText(), name);
    }

    public void isUserNameDisplayed() {
        Assert.assertTrue(userName.isDisplayed());
    }
}
