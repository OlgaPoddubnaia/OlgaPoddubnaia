package hw6.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import hw6.entities.User;
import hw6.forms.LoginFrom;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebPage {

    public LoginFrom loginForm;

    @FindBy(id="user-name")
    public Label userName;

    public String getUserName() {
        return userName.getText();
    }

    public void login(User user) {
        loginForm.login(user);
    }
}
