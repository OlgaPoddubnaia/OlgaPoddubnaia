package hw2.baseTestsForExercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTests {

    protected WebDriver driver;
    protected final String URL =
            "https://jdi-testing.github.io/jdi-light/index.html";

    @BeforeTest
    public void setUp() {
        // for windows
        //  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        // for mac os
        System.setProperty("webdriver.chrome.driver",
                "/Applications/chromedriver");
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
}