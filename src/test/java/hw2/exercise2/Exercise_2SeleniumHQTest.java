package hw2.exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Exercise_2SeleniumHQTest {


    //extends AbstractTests !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private WebDriver driver;
    private final String URL = "https://jdi-testing.github.io/jdi-light/index.html";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }//комментарии!

    /////нужно убрать!!!!!!
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
