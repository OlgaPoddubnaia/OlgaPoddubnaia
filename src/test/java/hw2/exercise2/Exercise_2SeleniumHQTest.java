package hw2.exercise2;

import hw2.baseTestsForExercises.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class Exercise_2SeleniumHQTest extends LoginTest {

    @Test
    public void softAssertTests() {

        SoftAssert softAssert = new SoftAssert();

        //step#5 Open through the header menu Service -> Different Elements Page

        List<WebElement> headerSection = driver.findElements(By
                .cssSelector("ul.uui-navigation.nav.navbar-nav.m-l8>li"));
        headerSection.get(2).click();
        List<WebElement> serviceDropdown = driver.findElements(By
                .cssSelector("ul.dropdown-menu>li"));
        serviceDropdown.get(7).click();
        softAssert.assertEquals(driver.getCurrentUrl(),
                "https://jdi-testing.github.io/jdi-light/different-elements.html");

        //step#6 Select checkboxes

        List<WebElement> checkboxes = driver.findElements(By
                .cssSelector("label.label-checkbox>input"));
        softAssert.assertFalse(checkboxes.get(0).isSelected());
        checkboxes.get(0).click();
        softAssert.assertTrue(checkboxes.get(0).isSelected());
        checkboxes.get(0).click();
        softAssert.assertFalse(checkboxes.get(2).isSelected());
        checkboxes.get(2).click();
        softAssert.assertTrue(checkboxes.get(2).isSelected());
        checkboxes.get(2).click();

        //step#7 Select radio

        List<WebElement> radios = driver.findElements(By
                .cssSelector("label.label-radio>input"));
        softAssert.assertFalse(radios.get(3).isSelected());
        radios.get(3).click();
        softAssert.assertTrue(radios.get(3).isSelected());

        //step#8 Select in dropdown

        WebElement searchDropdown = driver.findElement(By
                .cssSelector("div.colors > select"));
        searchDropdown.click();
        List<WebElement> colors = driver.findElements(By
                .cssSelector("select.uui-form-element>option"));
        colors.get(3).click();
        softAssert.assertTrue(colors.get(3).isSelected());

   /*step#9 Assert that
    •	for each checkbox there is an individual log row and value is
     corresponded to the status of checkbox
    •	for radio button there is a log row and value is corresponded
     to the status of radio button
    •	for dropdown there is a log row and value is corresponded to
    the selected value.*/

        //checkboxes names are corresponded to expected

        checkboxes.get(0).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Water')" +
                " and contains(text(),'true')]")).isDisplayed());
        checkboxes.get(1).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Earth')" +
                " and contains(text(),'true')]")).isDisplayed());
        checkboxes.get(2).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Wind')" +
                " and contains(text(),'true')]")).isDisplayed());
        checkboxes.get(3).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Fire')" +
                " and contains(text(),'true')]")).isDisplayed());

        //check radio buttons statuses

        radios.get(0).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'metal')" +
                " and contains(text(),'Gold')]")).isDisplayed());
        radios.get(1).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'metal')" +
                " and contains(text(),'Silver')]")).isDisplayed());
        radios.get(2).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'metal')" +
                " and contains(text(),'Bronze')]")).isDisplayed());
        radios.get(3).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'metal')" +
                " and contains(text(),'Selen')]")).isDisplayed());

        //check dropdown names

        searchDropdown.click();
        colors.get(0).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Colors')" +
                " and contains(text(),'Red')]")).isDisplayed());
        searchDropdown.click();
        colors.get(1).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Colors')" +
                " and contains(text(),'Green')]")).isDisplayed());
        searchDropdown.click();
        colors.get(2).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Colors')" +
                " and contains(text(),'Blue')]")).isDisplayed());
        searchDropdown.click();
        colors.get(3).click();
        softAssert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Colors')" +
                " and contains(text(),'Yellow')]")).isDisplayed());

        //assert All
        softAssert.assertAll();
    }
}
