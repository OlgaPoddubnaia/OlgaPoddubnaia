package hw3.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPagePO extends AbstractPage {

    public LoginPagePO(WebDriver driver) {
        super(driver);
    }

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


    public void logOnSite(String login, String password) {
        searchButton.click();
        searchUserNameField.sendKeys(login);
        searchPasswordField.sendKeys(password);
        searchLoginButton.click();
    }

    public void doesLoginButtonDisplayed() {
        Assert.assertFalse(searchLoginButton.isDisplayed());
    }

    public void userNameCompare(String name) {
        Assert.assertEquals(userName.getText(), name);
    }

    public void doesUserNameDisplayed() {
        Assert.assertTrue(userName.isDisplayed());
    }
}
