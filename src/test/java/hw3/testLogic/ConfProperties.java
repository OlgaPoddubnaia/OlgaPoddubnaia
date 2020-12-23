package hw3.testLogic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfProperties {

    protected static Properties property;
    protected static FileInputStream fis;

    static {
        try {
            property = new Properties();
            fis = new FileInputStream("src/test/resources/hw3/config.properties");
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }
}
