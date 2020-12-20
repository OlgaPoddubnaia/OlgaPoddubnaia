package hw3.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogRowsOnDifferentElementsPagePO extends AbstractPage {

    public LogRowsOnDifferentElementsPagePO(WebDriver driver) {
        super(driver);
    }

    List<WebElement> logRows = driver.findElements(By.className("panel-body-list logs"));


}
