package hw2.exercise1;

import hw2.AbstractForExercises.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Exercise_1SeleniumHQTest extends AbstractTests {


    @Test
    public void softAssertTests() {
        //creating soft assert
        SoftAssert softAssert = new SoftAssert();
        //step#1
        driver.get(URL);
        softAssert.assertEquals(driver.getCurrentUrl(), URL);
        //step#2
        softAssert.assertEquals(driver.getTitle(), "Home Page");
        //step#3
        WebElement searchButton = driver.findElement(By
                .cssSelector("body > header > div > nav > ul.uui-navigation.navbar-nav.navbar-right > li > a"));
        searchButton.click();
        WebElement searchUserName = waitForElementLocatedBy(driver, By.cssSelector("#name"));
        searchUserName.sendKeys("Roman");
        WebElement searchPassword = waitForElementLocatedBy(driver, By.cssSelector("#password"));
        searchPassword.sendKeys("Jdi1234");
        WebElement searchLoginButton = driver.findElement(By.id("login-button"));
        searchLoginButton.click();
        softAssert.assertFalse((driver.findElement(By.id("login-button"))).isDisplayed());

        //step#4
        softAssert.assertTrue((driver.findElement(By.cssSelector("#user-name"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("#user-name"))
                .getText(), "ROMAN IOVLEV");
        //step#5
        softAssert.assertTrue((driver.findElement(By.cssSelector(".m-l8 > li:nth-child(1) > a"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector(".m-l8 > li:nth-child(1) > a"))
                .getText(), "HOME");
        softAssert.assertTrue((driver.findElement(By.cssSelector(".m-l8 > li:nth-child(2) > a"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector(".m-l8 > li:nth-child(2) > a"))
                .getText(), "CONTACT FORM");
        softAssert.assertTrue((driver.findElement(By.cssSelector(".m-l8 > li.dropdown > a"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector(".m-l8 > li.dropdown > a"))
                .getText(), "SERVICE");
        softAssert.assertTrue((driver.findElement(By.cssSelector(".m-l8 > li:nth-child(4) > a"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector(".m-l8 > li:nth-child(4) > a"))
                .getText(), "METALS & COLORS");
        //step#6
        softAssert.assertTrue((driver.findElement(By.cssSelector("div:nth-child(1) > div > div > span"))).isDisplayed());
        softAssert.assertTrue((driver.findElement(By.cssSelector("div:nth-child(2) > div > div > span"))).isDisplayed());
        softAssert.assertTrue((driver.findElement(By.cssSelector("div:nth-child(3) > div > div > span"))).isDisplayed());
        softAssert.assertTrue((driver.findElement(By.cssSelector("div:nth-child(4) > div > div > span"))).isDisplayed());

        //step#7
        softAssert.assertTrue((driver.findElement(By
                .cssSelector("div.row.clerafix.benefits > div:nth-child(1) > div > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector("div.row.clerafix.benefits > div:nth-child(1) > div > span"))
                .getText(), "To include good practices\n" +
                "and ideas from successful\n" +
                "EPAM project");

        softAssert.assertTrue((driver.findElement(By
                .cssSelector("div div:nth-child(2) > div > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector("div div:nth-child(2) > div > span"))
                .getText(), "To be flexible and\n" + "customizable");

        softAssert.assertTrue((driver.findElement(By
                .cssSelector("div:nth-child(3) > div > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector("div:nth-child(3) > div > span"))
                .getText(), "To be multiplatform");

        softAssert.assertTrue((driver.findElement(By
                .cssSelector(" div:nth-child(4) > div > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By
                .cssSelector(" div:nth-child(4) > div > span"))
                .getText(), "Already have good base\n" +
                "(about 20 internal and\n" +
                "some external projects),\n" +
                "wish to get more…");

        //step #8
        //первый способ тоже работает, но его не оч рекомендуют использовать. почему?
        // softAssert.assertTrue(driver.getPageSource().contains("iframe"));
        softAssert.assertTrue((driver.findElement(By.tagName("iframe"))).isDisplayed());

        //step№9
        driver.switchTo().frame("frame");
        softAssert.assertTrue(driver.findElement(By.cssSelector("#frame-button")).isDisplayed());

        //step#10
        driver.switchTo().defaultContent();
        softAssert.assertTrue(driver.findElement(By.className("wrapper")).isDisplayed());

        //step#11
        softAssert.assertTrue((driver.findElement(By.cssSelector("li.active > a > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("li.active > a > span"))
                .getText(), "Home");
        softAssert.assertTrue((driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(2) > a > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(2) > a > span"))
                .getText(), "Contact form");
        softAssert.assertTrue((driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(3) > a > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(3) > a > span"))
                .getText(), "Service");
        softAssert.assertTrue((driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(4) > a > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(4) > a > span"))
                .getText(), "Metals & Colors");
        softAssert.assertTrue((driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(5) > a > span"))).isDisplayed());
        softAssert.assertEquals(driver.findElement(By.cssSelector("#mCSB_1_container > ul > li:nth-child(5) > a > span"))
                .getText(), "Elements packs");


        //run all soft asserts
        softAssert.assertAll();
    }

}
