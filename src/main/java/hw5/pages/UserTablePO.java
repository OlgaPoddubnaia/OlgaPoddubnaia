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

    @FindBy(how = How.XPATH, using = "//ul[@class='panel-body-list logs']/li[contains(text(),'')]")
    private List<WebElement> logRows;

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

    public boolean areThereSixNumberTypeDropdowns(int number) {
        return numberTypeDropdownsSize() == number;
    }

    public boolean areUsernamesDisplayed(int i) {
        return usernames.get(i).isDisplayed();
    }

    public int usernamesSize() {
        return usernames.size();
    }

    public boolean areThereSixUsernames(int numberOfUsernames) {
        return usernamesSize() == numberOfUsernames;
    }

    public boolean areDescriptionsDisplayed(int i) {
        return descriptions.get(i).isDisplayed();
    }

    public int descriptionsSize() {
        return descriptions.size();
    }

    public boolean areThereSixDescriptions(int numberOfDescriptions) {
        return descriptionsSize() == numberOfDescriptions;
    }

    public boolean areCheckboxesDisplayed(int i) {
        return checkboxes.get(i).isDisplayed();
    }

    public int checkboxesSize() {
        return checkboxes.size();
    }

    public boolean areThereSixCheckboxes(int numberOfCheckboxes) {
        return checkboxesSize() == numberOfCheckboxes;
    }

    public void selectVipCheckboxForSergeyIvan() {
        checkboxes.get(1).click();
    }

    public int logRowsSize() {
        return logRows.size();
    }

    public boolean isThereOneLogRowOnPanel(int numberOfLogRows) {
        return logRowsSize() == numberOfLogRows;
    }

    public boolean isLogRowsContainsText(String text) {
        for (int i = 0; i < logRows.size(); i++) {
            if (logRows.get(i).getText().contains(text)) {
                return true;
            }
        }
        return false;
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
