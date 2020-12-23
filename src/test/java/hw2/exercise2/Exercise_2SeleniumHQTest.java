package hw2.exercise2;

import hw2.baseTestsForExercises.AbstractTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class Exercise_2SeleniumHQTest extends AbstractTests {

    @Test
    public void softAssertTests() {

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
        WebElement searchUserName = driver.findElement(
                By.cssSelector("#name"));
        searchUserName.sendKeys("Roman");
        WebElement searchPassword = driver.findElement(
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

        //step#5 Open through the header menu Service -> Different Elements Page

        List<WebElement> headerSection = driver.findElements(By
                .cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li"));
        WebElement serviceHeaderDropdown = headerSection.get(2);
        serviceHeaderDropdown.click();
        List<WebElement> serviceDropdown = driver.findElements(By
                .cssSelector("ul.dropdown-menu>li"));
        WebElement differentElements = serviceDropdown.get(7);
        differentElements.click();
        softAssert.assertEquals(driver.getCurrentUrl(),
                "https://jdi-testing.github.io/jdi-light/different-elements.html");

        //step#6 Select checkboxes

        List<WebElement> checkboxes = driver.findElements(By
                .cssSelector("label.label-checkbox>input"));
        WebElement waterCheckbox = checkboxes.get(0);
        waterCheckbox.click();
        softAssert.assertTrue(waterCheckbox.isSelected());
        WebElement windCheckbox = checkboxes.get(2);
        windCheckbox.click();
        softAssert.assertTrue(windCheckbox.isSelected());

        //step#7 Select radio

        List<WebElement> radios = driver.findElements(By
                .cssSelector("label.label-radio>input"));
        WebElement selenRadio = radios.get(3);
        selenRadio.click();
        softAssert.assertTrue(selenRadio.isSelected());

        //step#8 Select in dropdown

        WebElement searchDropdown = driver.findElement(By
                .cssSelector("div.colors > select"));
        searchDropdown.click();
        Select colors = new Select(driver.findElement(By
                .cssSelector("select.uui-form-element")));
        colors.selectByVisibleText("Yellow");
        String yellowDropdown = colors.getFirstSelectedOption().getText();
        softAssert.assertEquals(yellowDropdown, "Yellow");


   /*step#9 Assert that
    •	for each checkbox there is an individual log row and value is
     corresponded to the status of checkbox
    •	for radio button there is a log row and value is corresponded
     to the status of radio button
    •	for dropdown there is a log row and value is corresponded to
    the selected value.*/

        //checkboxes names are corresponded to expected

        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Water')" +
                " and contains(text(),'true')]")).isDisplayed());
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Wind')" +
                " and contains(text(),'true')]")).isDisplayed());

        //check radio buttons statuses

        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'metal')" +
                " and contains(text(),'Selen')]")).isDisplayed());

        //check dropdown names

        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Colors')" +
                " and contains(text(),'Yellow')]")).isDisplayed());

        //assert All
        softAssert.assertAll();
    }
}
