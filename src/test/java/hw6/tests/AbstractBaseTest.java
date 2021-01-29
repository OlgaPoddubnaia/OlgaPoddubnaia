package hw6.tests;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import hw6.JdiSite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public abstract class AbstractBaseTest {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
