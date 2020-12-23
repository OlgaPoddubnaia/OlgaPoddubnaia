package hw2.exercise1;

import hw2.baseTestsForExercises.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
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
        String[] properHeaderTexts = {"HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS"};
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(headerSection.get(i).isDisplayed());
        }
        for (int i = 0; i < 4; i++) {
            softAssert.assertEquals(headerSection.get(i).getText(), properHeaderTexts[i]);
        }

        /*step#6	Assert that there are 4 images on the Index Page
         and they are displayed	*/
        List<WebElement> imagesOnIndexPage = driver.findElements(By
                .cssSelector("div.benefit-icon>span"));
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(imagesOnIndexPage.get(i).isDisplayed());

        }

        /*step#7 Assert that there are 4 texts on the Index Page under
         icons and they have proper text*/
        List<WebElement> textsOnIndexPage = driver.findElements(By
                .cssSelector("span.benefit-txt"));
        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(textsOnIndexPage.get(i).isDisplayed());

        }

        ArrayList<String> properTextsUnderIcons = new ArrayList<>();
        properTextsUnderIcons.add("To include good practices\n" +
                "and ideas from successful\nEPAM project");
        properTextsUnderIcons.add("To be flexible and\ncustomizable");
        properTextsUnderIcons.add("To be multiplatform");
        properTextsUnderIcons.add("Already have good base\n(about 20 internal and\n" +
                "some external projects),\nwish to get more…");

        for (int i = 0; i < 4; i++) {
            softAssert.assertEquals(textsOnIndexPage.get(i).getText(),
                    properTextsUnderIcons.get(i));
        }

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
        softAssert.assertTrue((driver.findElement(By
                .tagName("iframe"))).isDisplayed());

        /*step#11 Assert that there are 5 items in the Left
      Section are displayed and they have proper text*/
        List<WebElement> itemsOnLeftSection = driver.
                findElements(By.cssSelector("ul.sidebar-menu>li"));
        for (int i = 0; i < 5; i++) {
            softAssert.assertTrue(itemsOnLeftSection.get(i).isDisplayed());

        }
        String[] properLeftSectionTexts = {"Home", "Contact form", "Service",
                "Metals & Colors", "Elements packs"};
        for (int i = 0; i < 5; i++) {
            softAssert.assertEquals(itemsOnLeftSection.get(i)
                    .getText(), properLeftSectionTexts[i]);
        }

        //run all soft asserts
        softAssert.assertAll();
    }
}
