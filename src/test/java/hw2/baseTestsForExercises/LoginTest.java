package hw2.baseTestsForExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class LoginTest extends AbstractTests {

    @BeforeMethod
    public void performLogin() {
        SoftAssert softAssert = new SoftAssert();

        //step#1 Open test site by URL

        driver.get(URL);
        softAssert.assertEquals(driver.getCurrentUrl(), URL);

        //step#2 Assert Browser title

        softAssert.assertEquals(driver.getTitle(), "Home Page");

        //step#3 Perform login

        WebElement searchButton = driver.findElement(By
                .xpath("//a[@class='dropdown-toggle' and @href='#']"));
        searchButton.click();
        WebElement searchUserName = waitForElementLocatedBy(driver,
                By.cssSelector("#name"));
        searchUserName.sendKeys("Roman");
        WebElement searchPassword = waitForElementLocatedBy(driver,
                By.cssSelector("#password"));
        searchPassword.sendKeys("Jdi1234");
        WebElement searchLoginButton = driver.findElement(By
                .id("login-button"));
        searchLoginButton.click();
        softAssert.assertFalse((driver.findElement(By
                .id("login-button"))).isDisplayed());

    /*step#4 Assert User name in the left-top side of screen that
    user is loggined*/

        softAssert.assertTrue((driver.findElement(By
                .cssSelector("#user-name"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector("#user-name"))
                .getText(), "ROMAN IOVLEV");

        //assert All

        softAssert.assertAll();
    }
}
