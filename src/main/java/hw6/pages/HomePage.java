package hw6.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import hw6.entities.User;
import hw6.forms.LoginFrom;
import org.openqa.selenium.WebElement;

public class HomePage extends WebPage {

    public LoginFrom loginForm;

    @UI("[id = user-name]")
    public Label userName;

    @FindBy(xpath = "//a[@class='dropdown-toggle' and @href='#']")
    public WebElement searchButton;


    @FindBy(xpath = "//a[contains(text(),'Metals & Colors')]")
    public Button metalsAndColorsOnHeaderMenu;

    public String getUserName() {
        return userName.getText();
    }

    public void login(User user) {
           if (!userName.isDisplayed()) {
            searchButton.click();
            loginForm.login(user);
        }
    }

    public void checkUserLoggedIn(User user) {
        userName.is().text(user.getFullName());
    }

    public void openMetalsAndColorsPage() {
        metalsAndColorsOnHeaderMenu.click();
    }
}
