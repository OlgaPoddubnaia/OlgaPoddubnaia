package hw5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class UserTablePO extends AbstractPage {

    @FindBy(how = How.XPATH, using = "//*[@id='user-table']/descendant-or-self ::select")
    private List<WebElement> numberTypeDropdowns;

    @FindBy(how = How.XPATH, using = "//*[@id='user-table']/descendant-or-self ::a")
    private List<WebElement> usernames;

    @FindBy(how = How.XPATH, using = "//*[@id='user-table']/descendant-or-self ::span")
    private List<WebElement> descriptions;

    @FindBy(how = How.XPATH, using = "//*[@id='user-table']/descendant-or-self ::input")
    private List<WebElement> checkboxes;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Vip: condition changed to true')]")
    private WebElement logRow;

    @FindBy(how = How.XPATH, using = "//td[not(select/option or img or a)]")
    private List<WebElement> numbers;

    @FindBy(how = How.CSS, using = "select > option")
    private List<WebElement> droplist;

    public UserTablePO(WebDriver driver) {
        super(driver);
    }

    public String getUserTablePageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean areNumberTypeDropdownsDisplayed(int i) {
        return numberTypeDropdowns.get(i).isDisplayed();
    }

    public int numberTypeDropdownsSize() {
        return numberTypeDropdowns.size();
    }

    public boolean areThereSixNumberTypeDropdowns() {
        return numberTypeDropdownsSize() == 6;
    }

    public boolean areUsernamesDisplayed(int i) {
        return usernames.get(i).isDisplayed();
    }

    public int usernamesSize() {
        return usernames.size();
    }

    public boolean areThereSixUsernames() {
        return usernamesSize() == 6;
    }

    public boolean areDescriptionsDisplayed(int i) {
        return descriptions.get(i).isDisplayed();
    }

    public int descriptionsSize() {
        return descriptions.size();
    }

    public boolean areThereSixDescriptions() {
        return descriptionsSize() == 6;
    }

    public boolean areCheckboxesDisplayed(int i) {
        return checkboxes.get(i).isDisplayed();
    }

    public int checkboxesSize() {
        return checkboxes.size();
    }

    public boolean areThereSixCheckboxes() {
        return checkboxesSize() == 6;
    }

    public void selectVipCheckboxForSergeyIvan() {
        checkboxes.get(1).click();
    }

    public boolean isLogRowDisplayed() {
        return logRow.isDisplayed();
    }

    public String getTextOfDroplistValues(int i) {
        return droplist.get(i).getText();
    }

    public String getTextOfUsername(int i) {
        return usernames.get(i).getText();
    }

    public String getTextOfDescriptions(int i) {
        return descriptions.get(i).getText();
    }

    public String getTextOfNumbers(int i) {
        return numbers.get(i).getText();
    }
}
