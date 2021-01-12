package hw5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePO extends AbstractPage {

    public HomePagePO(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl(String URL) {
        driver.get(URL);
    }

    public String shouldHaveUrl() {
        return driver.getCurrentUrl();
    }

    public String shouldHaveTitle() {
        return driver.getTitle();
    }
}
