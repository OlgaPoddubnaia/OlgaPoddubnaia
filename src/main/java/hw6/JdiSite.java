package hw6;

import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import hw6.entities.User;
import hw6.pages.HomePage;
import hw6.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite extends PageFactory {

    public static HomePage homePage;
    public static MetalsAndColorsPage metalsAndColorsPage;

    public static void open() {
        homePage.open();
    }

    public static void login(User user) {
        homePage.login(user);
    }

    public static String getUserName() {
        return homePage.getUserName();
    }

    public static void openMetalsAndColorsPage() {
        homePage.openMetalsAndColorsPage();
    }

    public static void checkMetalsAndColorsPageUrl() {
        metalsAndColorsPage.checkMetalsAndColorsUrl();
    }

}
