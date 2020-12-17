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

        List<WebElement> checkboxesNames = driver.findElements(By
                .className("label-checkbox"));
        softAssert.assertEquals(checkboxesNames.get(0).getText(), "Water");
        softAssert.assertEquals(checkboxesNames.get(1).getText(), "Earth");
        softAssert.assertEquals(checkboxesNames.get(2).getText(), "Wind");
        softAssert.assertEquals(checkboxesNames.get(3).getText(), "Fire");

        //checkbox status

        checkboxes.get(0).click();
        softAssert.assertTrue(checkboxes.get(0).isSelected());
        checkboxes.get(0).click();
        softAssert.assertFalse(checkboxes.get(0).isSelected());

        checkboxes.get(1).click();
        softAssert.assertTrue(checkboxes.get(1).isSelected());
        checkboxes.get(1).click();
        softAssert.assertFalse(checkboxes.get(1).isSelected());

        checkboxes.get(2).click();
        softAssert.assertTrue(checkboxes.get(2).isSelected());
        checkboxes.get(2).click();
        softAssert.assertFalse(checkboxes.get(2).isSelected());

        checkboxes.get(3).click();
        softAssert.assertTrue(checkboxes.get(3).isSelected());
        checkboxes.get(3).click();
        softAssert.assertFalse(checkboxes.get(3).isSelected());

        //check radio buttons statuses

        softAssert.assertFalse(radios.get(0).isSelected());
        radios.get(0).click();
        softAssert.assertTrue(radios.get(0).isSelected());

        softAssert.assertFalse(radios.get(1).isSelected());
        radios.get(1).click();
        softAssert.assertTrue(radios.get(1).isSelected());

        softAssert.assertFalse(radios.get(2).isSelected());
        radios.get(2).click();
        softAssert.assertTrue(radios.get(2).isSelected());

        softAssert.assertFalse(radios.get(3).isSelected());
        radios.get(3).click();
        softAssert.assertTrue(radios.get(3).isSelected());

        //check radio buttons names

        List<WebElement> radiosNames = driver.findElements(By
                .className("label-radio"));
        softAssert.assertEquals(radiosNames.get(0).getText(), "Gold");
        softAssert.assertEquals(radiosNames.get(1).getText(), "Silver");
        softAssert.assertEquals(radiosNames.get(2).getText(), "Bronze");
        softAssert.assertEquals(radiosNames.get(3).getText(), "Selen");

        //check dropdown names

        searchDropdown.click();
        colors.get(0).click();
        softAssert.assertEquals(colors.get(0).getText(), "Red");

        searchDropdown.click();
        colors.get(1).click();
        softAssert.assertEquals(colors.get(1).getText(), "Green");

        searchDropdown.click();
        colors.get(2).click();
        softAssert.assertEquals(colors.get(2).getText(), "Blue");

        searchDropdown.click();
        colors.get(3).click();
        softAssert.assertEquals(colors.get(3).getText(), "Yellow");

        //assert All
        softAssert.assertAll();
    }
}
