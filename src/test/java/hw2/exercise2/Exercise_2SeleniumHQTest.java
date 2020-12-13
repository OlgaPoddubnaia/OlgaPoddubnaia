package hw2.exercise2;

import hw2.AbstractForExercises.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class Exercise_2SeleniumHQTest extends AbstractTests {


    @Test(priority = 1)
    public void openSiteByURL() {
        driver.get(URL);
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    @Test(priority = 2)
    public void checkBrowserTitle() {
        Assert.assertEquals(driver.getTitle(), "Home Page");
    }

    @Test(priority = 3)
    public void performLogin() {
        WebElement searchButton = driver.findElement(By
                .cssSelector("body > header > div > nav > ul.uui-navigation.navbar-nav.navbar-right > li > a"));
        searchButton.click();
        WebElement searchUserName = waitForElementLocatedBy(driver, By.cssSelector("#name"));
        searchUserName.sendKeys("Roman");
        WebElement searchPassword = waitForElementLocatedBy(driver, By.cssSelector("#password"));
        searchPassword.sendKeys("Jdi1234");
        WebElement searchLoginButton = driver.findElement(By.id("login-button"));
        searchLoginButton.click();
        Assert.assertFalse((driver.findElement(By.id("login-button"))).isDisplayed());
    }

    @Test(priority = 4)
    public void checkUserLoggedAndDisplayed() {
        Assert.assertTrue((driver.findElement(By.cssSelector("#user-name"))).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector("#user-name"))
                .getText(), "ROMAN IOVLEV");
    }

    @Test(priority = 5)
    public void openThroughServiceDifElemPage() {
        driver.findElement(By.cssSelector(".m-l8 > li.dropdown > a")).click();
        driver.findElement(By.cssSelector(" li.dropdown.open > ul > li:nth-child(8) > a")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://jdi-testing.github.io/jdi-light/different-elements.html");
    }

    @Test(priority = 6)
    public void checkWaterWindBoxes() {
        WebElement waterBox = driver.findElement(By.cssSelector("label:nth-child(1) > input[type=checkbox]"));
        waterBox.click();
        Assert.assertTrue(waterBox.isSelected());
        waterBox.click();
        Assert.assertFalse(waterBox.isSelected());

        WebElement windBox = driver.findElement(By.cssSelector("label:nth-child(3) > input[type=checkbox]"));
        windBox.click();
        Assert.assertTrue(windBox.isSelected());
        windBox.click();
        Assert.assertFalse(windBox.isSelected());
    }

    @Test(priority = 7)
    public void checkRadio() {
        WebElement selenRadio = driver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(4)"));
       // Assert.assertFalse(selenRadio.isSelected());
        selenRadio.click();
        Assert.assertTrue(selenRadio.isSelected());
    }

 /*   @Test(priority = 8)
    public void selectDropdownYellow(){

    }*/
}
