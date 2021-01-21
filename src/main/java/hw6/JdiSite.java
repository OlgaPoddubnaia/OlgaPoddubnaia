package hw6;

import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw6.entities.User;
import hw6.pages.HomePage;
import hw6.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite extends PageFactory {

    @Url("index.html")
    @Title("Home Page")
    public static HomePage homePage;
    @Url("metals-colors.html")
    @Title("Metal and Colors")
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

    public static void submitMetalsAndColorsForm() {
        metalsAndColorsPage.clickSubmitButton();
    }

    public static void calculateSummary() {
        metalsAndColorsPage.clickCalculateButton();
    }
}
