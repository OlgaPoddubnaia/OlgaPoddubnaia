package hw6.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import hw6.entities.User;
import org.openqa.selenium.support.FindBy;

public class LoginFrom extends Form<User> {

    @FindBy(id = "name")
    public TextField name;

    @FindBy(id = "password")
    public TextField password;

    @FindBy(id = "login-button")
    public Button submit;


}
