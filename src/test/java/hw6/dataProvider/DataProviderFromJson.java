package hw6.dataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import hw6.entities.MetalsAndColors;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataProviderFromJson {
    private String jsonPath = "src/test/resources/hw6/JDI_metalsColorsDataSet.json";
    private static FileInputStream fileInputStream;
    private static ObjectMapper objectMapper;
    private static Object[][] dataObject;

    @DataProvider
    public Object[][] getDataFromJson() {

        try {
            objectMapper = new ObjectMapper();
            fileInputStream = new FileInputStream(jsonPath);
            HashMap<String, MetalsAndColors> map = objectMapper.readValue(fileInputStream,
                    new TypeReference<HashMap<String, MetalsAndColors>>() {
                    });
            int i = 0;
            dataObject = new Object[map.size()][1];
            for (Map.Entry<String, MetalsAndColors> entry : map.entrySet()) {
                dataObject[i][0] = entry.getValue();
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataObject;

    }
}
