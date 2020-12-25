package hw3.testLogic;

import hw3.pageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class BaseTest extends ConfProperties {

    protected WebDriver driver;
    protected SoftAssert softAssert;


    protected HomePagePO homePagePO;
    protected LoginPagePO loginPage;
    protected HeaderMenuOfHomePageAfterLoginPO headerMenuOfHomePageAfterLoginPO;
    protected ImagesOnIndexPagePO imagesOnIndexPagePO;
    protected TextsUnderImagesOnIndexPagePO textsUnderImagesOnIndexPagePO;
    protected IframePagePO iframePagePO;
    protected LeftSectionOnHomePagePO leftSectionOnHomePagePO;
    protected DifferentElementsPO differentElementsPO;
    protected LogRowsOnDifferentElementsPagePO logRowsOnDifferentElementsPagePO;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        softAssert = new SoftAssert();

        loginPage = new LoginPagePO(driver);
        homePagePO = new HomePagePO(driver);
        headerMenuOfHomePageAfterLoginPO = new HeaderMenuOfHomePageAfterLoginPO(driver);
        imagesOnIndexPagePO = new ImagesOnIndexPagePO(driver);
        textsUnderImagesOnIndexPagePO = new TextsUnderImagesOnIndexPagePO(driver);
        iframePagePO = new IframePagePO(driver);
        leftSectionOnHomePagePO = new LeftSectionOnHomePagePO(driver);
        differentElementsPO = new DifferentElementsPO(driver);
        logRowsOnDifferentElementsPagePO =
                new LogRowsOnDifferentElementsPagePO(driver);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        driver = null;
    }
}
