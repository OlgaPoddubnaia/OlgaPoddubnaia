package hw2.exercise2;

import hw2.abstractForExercises.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Exercise_2SeleniumHQTest extends AbstractTests {

    //step#1 Open test site by URL

    @Test(priority = 1)
    public void openSiteByURL() {
        driver.get(URL);
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    //step#2 Assert Browser title

    @Test(priority = 2)
    public void checkBrowserTitle() {
        Assert.assertEquals(driver.getTitle(), "Home Page");
    }

    //step#3 Perform login

    @Test(priority = 3)
    public void performLogin() {
        WebElement searchButton = driver.findElement(By
                .cssSelector(".navbar-nav.navbar-right > li > a"));
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
        Assert.assertFalse((driver.findElement(By
                .id("login-button"))).isDisplayed());
    }

    /*step#4 Assert User name in the left-top side of screen that
    user is loggined*/

    @Test(priority = 4)
    public void checkUserLoggedAndDisplayed() {
        Assert.assertTrue((driver.findElement(By
                .cssSelector("#user-name"))).isDisplayed());
        Assert.assertEquals(driver.findElement(By
                .cssSelector("#user-name"))
                .getText(), "ROMAN IOVLEV");
    }

    //step#5 Open through the header menu Service -> Different Elements Page

    @Test(priority = 5)
    public void openThroughServiceDifElemPage() {
        driver.findElement(By.cssSelector(".m-l8 > li.dropdown > a"))
                .click();
        driver.findElement(By.cssSelector(" li.dropdown.open > ul > li:nth-child(8) > a"))
                .click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://jdi-testing.github.io/jdi-light/different-elements.html");
    }

    //step#6 Select checkboxes

    @Test(priority = 6)
    public void checkWaterWindBoxes() {
        SoftAssert softAssert = new SoftAssert();

        WebElement waterBox = driver.findElement(By
                .cssSelector("label:nth-child(1) > input[type=checkbox]"));
        waterBox.click();
        softAssert.assertTrue(waterBox.isSelected());
        waterBox.click();
        softAssert.assertFalse(waterBox.isSelected());

        WebElement windBox = driver.findElement(By
                .cssSelector("label:nth-child(3) > input[type=checkbox]"));
        windBox.click();
        softAssert.assertTrue(windBox.isSelected());
        windBox.click();
        softAssert.assertFalse(windBox.isSelected());

        softAssert.assertAll();
    }

    //step#7 Select radio

    @Test(priority = 7)
    public void checkRadio() {
        WebElement selenRadio = driver.findElement(By
                .cssSelector(" label:nth-child(4) > input[type=radio]"));
        Assert.assertFalse(selenRadio.isSelected());
        selenRadio.click();
        Assert.assertTrue(selenRadio.isSelected());
    }

    //step#8 Select in dropdown

    @Test(priority = 8)
    public void selectDropdownYellow() {
        WebElement searchDropdown = driver.findElement(By
                .cssSelector("div.colors > select"));
        searchDropdown.click();
        WebElement yellow = driver.findElement(By
                .cssSelector("option:nth-child(4)"));
        yellow.click();
        Assert.assertTrue(yellow.isSelected());
    }

   /*step#9 Assert that
    •	for each checkbox there is an individual log row and value is
     corresponded to the status of checkbox
    •	for radio button there is a log row and value is corresponded
     to the status of radio button
    •	for dropdown there is a log row and value is corresponded to
    the selected value.*/

    @Test(priority = 9)
    public void softAsserts() {

        SoftAssert softAssert = new SoftAssert();

        //checkboxes names are corresponded to expected

        softAssert.assertEquals(driver.findElement(By.
                cssSelector("div.main-content > div > div:nth-child(2) > label:nth-child(1)"))
                .getText(), "Water");

        softAssert.assertEquals(driver.findElement(By.
                cssSelector(" div:nth-child(2) > label:nth-child(2)"))
                .getText(), "Earth");

        softAssert.assertEquals(driver.findElement(By.
                cssSelector("div:nth-child(2) > label:nth-child(3)"))
                .getText(), "Wind");

        softAssert.assertEquals(driver.findElement(By.
                cssSelector("div:nth-child(2) > label:nth-child(4)"))
                .getText(), "Fire");

        //checkbox status

        WebElement waterBox = driver.findElement(By
                .cssSelector("label:nth-child(1) > input[type=checkbox]"));
        waterBox.click();
        softAssert.assertTrue(waterBox.isSelected());
        waterBox.click();
        softAssert.assertFalse(waterBox.isSelected());

        WebElement windBox = driver.findElement(By
                .cssSelector("label:nth-child(3) > input[type=checkbox]"));
        windBox.click();
        softAssert.assertTrue(windBox.isSelected());
        windBox.click();
        softAssert.assertFalse(windBox.isSelected());

        WebElement earthBox = driver.findElement(By
                .cssSelector(" label:nth-child(2) > input[type=checkbox]"));
        earthBox.click();
        softAssert.assertTrue(earthBox.isSelected());
        earthBox.click();
        softAssert.assertFalse(earthBox.isSelected());

        WebElement fireBox = driver.findElement(By
                .cssSelector("label:nth-child(4) > input[type=checkbox]"));
        fireBox.click();
        softAssert.assertTrue(fireBox.isSelected());
        fireBox.click();
        softAssert.assertFalse(fireBox.isSelected());

        //check radio buttons statuses

        WebElement goldRadio = driver.findElement(By
                .cssSelector(" label:nth-child(1) > input[type=radio]"));
        softAssert.assertFalse(goldRadio.isSelected());
        goldRadio.click();
        softAssert.assertTrue(goldRadio.isSelected());

        WebElement silverRadio = driver.findElement(By
                .cssSelector("label:nth-child(2) > input[type=radio]"));
        softAssert.assertFalse(silverRadio.isSelected());
        silverRadio.click();
        softAssert.assertTrue(silverRadio.isSelected());

        WebElement bronzeRadio = driver.findElement(By
                .cssSelector("label:nth-child(3) > input[type=radio]"));
        softAssert.assertFalse(bronzeRadio.isSelected());
        bronzeRadio.click();
        softAssert.assertTrue(bronzeRadio.isSelected());

        WebElement selenRadio = driver.findElement(By
                .cssSelector(" label:nth-child(4) > input[type=radio]"));
        softAssert.assertFalse(selenRadio.isSelected());
        selenRadio.click();
        softAssert.assertTrue(selenRadio.isSelected());

        //check radio buttons names

        softAssert.assertEquals((driver.findElement(By
                .cssSelector("div:nth-child(3) > label:nth-child(1)"))
                .getText()), "Gold");

        softAssert.assertEquals((driver.findElement(By
                .cssSelector("div:nth-child(3) > label:nth-child(2)"))
                .getText()), "Silver");

        softAssert.assertEquals((driver.findElement(By
                .cssSelector("div:nth-child(3) > label:nth-child(3)"))
                .getText()), "Bronze");

        softAssert.assertEquals((driver.findElement(By
                .cssSelector("div:nth-child(3) > label:nth-child(4)"))
                .getText()), "Selen");

        //check dropdown names

        WebElement searchDropdown = driver.findElement(By
                .cssSelector("div.colors > select"));

        searchDropdown.click();
        WebElement yellow = driver.findElement(By
                .cssSelector("option:nth-child(4)"));
        yellow.click();
        softAssert.assertTrue(yellow.isSelected());
        softAssert.assertEquals((driver.findElement(By
                .cssSelector("option:nth-child(4)"))
                .getText()), "Yellow");

        searchDropdown.click();
        WebElement red = driver.findElement(By
                .cssSelector("option:nth-child(1)"));
        red.click();
        softAssert.assertTrue(red.isSelected());
        softAssert.assertEquals((driver.findElement(By
                .cssSelector("option:nth-child(1)"))
                .getText()), "Red");

        searchDropdown.click();
        WebElement green = driver.findElement(By
                .cssSelector("option:nth-child(2)"));
        green.click();
        softAssert.assertTrue(green.isSelected());
        softAssert.assertEquals((driver.findElement(By
                .cssSelector("option:nth-child(2)"))
                .getText()), "Green");

        searchDropdown.click();
        WebElement blue = driver.findElement(By
                .cssSelector("option:nth-child(3)"));
        blue.click();
        softAssert.assertTrue(blue.isSelected());
        softAssert.assertEquals((driver.findElement(By
                .cssSelector("option:nth-child(3)"))
                .getText()), "Blue");

        //assert All
        softAssert.assertAll();
    }
}
