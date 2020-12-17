package hw2.exercise1;

import hw2.baseTestsForExercises.AbstractTests;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Exercise_1SeleniumHQTest extends AbstractTests {


    @Test
    public void softAssertTests() {

        //creating soft assert
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
        WebElement searchLoginButton = driver.findElement(By.id("login-button"));
        searchLoginButton.click();
        softAssert.assertFalse((driver.findElement(By
                .id("login-button"))).isDisplayed());

        //step#4 Assert Username is logged
        softAssert.assertTrue((driver.findElement(By
                .cssSelector("#user-name"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector("#user-name"))
                .getText(), "ROMAN IOVLEV");

        /*step#5 Assert that there are 4 items on the header
         section are displayed and they have proper texts*/
        List<WebElement> headerSection = driver.findElements(By
                .cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li"));
        softAssert.assertTrue(headerSection.get(0).isDisplayed());
        softAssert.assertEquals(headerSection.get(0).getText(), "HOME");
        softAssert.assertTrue(headerSection.get(1).isDisplayed());
        softAssert.assertEquals(headerSection.get(1).getText(), "CONTACT FORM");
        softAssert.assertTrue(headerSection.get(2).isDisplayed());
        softAssert.assertEquals(headerSection.get(2).getText(), "SERVICE");
        softAssert.assertTrue(headerSection.get(3).isDisplayed());
        softAssert.assertEquals(headerSection.get(3).getText(), "METALS & COLORS");

        /*step#6	Assert that there are 4 images on the Index Page
         and they are displayed	*/
        List<WebElement> imagesOnIndexPage = driver.findElements(By
                .cssSelector("div.benefit-icon>span"));
        softAssert.assertTrue(imagesOnIndexPage.get(0).isDisplayed());
        softAssert.assertTrue(imagesOnIndexPage.get(1).isDisplayed());
        softAssert.assertTrue(imagesOnIndexPage.get(2).isDisplayed());
        softAssert.assertTrue(imagesOnIndexPage.get(3).isDisplayed());

        /*step#7 Assert that there are 4 texts on the Index Page under
         icons and they have proper text*/
        List<WebElement> textsOnIndexPage = driver.findElements(By
                .cssSelector("span.benefit-txt"));
        softAssert.assertTrue(textsOnIndexPage.get(0).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(1).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(2).isDisplayed());
        softAssert.assertTrue(textsOnIndexPage.get(3).isDisplayed());

        softAssert.assertEquals(textsOnIndexPage.get(0)
                .getText(), "To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project");
        softAssert.assertEquals(textsOnIndexPage.get(1)
                .getText(), "To be flexible and\n" + "customizable");
        softAssert.assertEquals(textsOnIndexPage.get(2)
                .getText(), "To be multiplatform");
        softAssert.assertEquals(textsOnIndexPage.get(3)
                .getText(), "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…");

        //step #8 Assert that there is the iframe with “Frame Button” exist
        softAssert.assertTrue((driver.findElement(By
                .tagName("iframe"))).isDisplayed());

        /*step#9 Switch to the iframe and check that there is
         “Frame Button” in the iframe*/
        driver.switchTo().frame("frame");
        softAssert.assertTrue(driver.findElement(By
                .cssSelector("#frame-button")).isDisplayed());

        //step#10 Switch to original window back
        driver.switchTo().defaultContent();
        softAssert.assertFalse(driver.findElement(By
                .cssSelector("#frame-button")).isDisplayed());

        /*step#11 Assert that there are 5 items in the Left
      Section are displayed and they have proper text*/
        List<WebElement> itemsOnLeftSection = driver.
                findElements(By.cssSelector("ul.sidebar-menu>li"));
        softAssert.assertTrue(itemsOnLeftSection.get(0).isDisplayed());
        softAssert.assertTrue(itemsOnLeftSection.get(1).isDisplayed());
        softAssert.assertTrue(itemsOnLeftSection.get(2).isDisplayed());
        softAssert.assertTrue(itemsOnLeftSection.get(3).isDisplayed());
        softAssert.assertTrue(itemsOnLeftSection.get(4).isDisplayed());

        softAssert.assertEquals(itemsOnLeftSection.get(0)
                .getText(), "Home");
        softAssert.assertEquals(itemsOnLeftSection.get(1)
                .getText(), "Contact form");
        softAssert.assertEquals(itemsOnLeftSection.get(2)
                .getText(), "Service");
        softAssert.assertEquals(itemsOnLeftSection.get(3)
                .getText(), "Metals & Colors");
        softAssert.assertEquals(itemsOnLeftSection.get(4)
                .getText(), "Elements packs");

        //run all soft asserts
        softAssert.assertAll();
    }
}
