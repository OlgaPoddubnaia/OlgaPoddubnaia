package hw3.pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageAbstractPO extends AbstractPage {

    public HomePageAbstractPO(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get( "https://jdi-testing.github.io/jdi-light/index.html");
    }

    public String currentUrl() {
         return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
