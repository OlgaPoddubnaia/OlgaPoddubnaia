package hw3.testLogic;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ForProperties {
    public WebDriver driver;
    public Properties property;

    public WebDriver initializeDriver() throws IOException {
        FileInputStream fis = null;
        property = new Properties();
        try {
            fis = new FileInputStream("src/test/resources/hw3/config.properties");
            property.load(fis);

            final String USER_NAME = property.getProperty("USER_NAME");
            final String PASSWORD = property.getProperty("PASSWORD");
            final String URL = property.getProperty("URL");

        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }
        return driver;
    }
}
