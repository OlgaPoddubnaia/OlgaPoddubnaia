package hw3.testLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest  extends ForProperties{

    protected final String DRIVER_TYPE = "webdriver.chrome.driver";
    protected final String DRIVER_STORAGE_URL = "C:\\SeleniumDrivers\\chromedriver.exe";
    protected final String DIFFERENT_ELEMENTS_URL =
            "https://jdi-testing.github.io/jdi-light/different-elements.html";

    @BeforeTest
    public void setUp() {
        System.setProperty(DRIVER_TYPE, DRIVER_STORAGE_URL);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        driver = null;
    }
//еренести в отдельный класс?
    protected static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        WebElement searchInput = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
        return searchInput;
    }
}
