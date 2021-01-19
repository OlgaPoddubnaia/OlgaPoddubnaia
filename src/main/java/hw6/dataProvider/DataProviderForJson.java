package hw6.dataProvider;

import hw6.entities.MetalsAndColorsFormDataFromJson;
import org.testng.annotations.DataProvider;

public class DataProviderForJson {

    public static MetalsAndColorsFormDataFromJson metalsAndColorsFormDataFromJson =
            new MetalsAndColorsFormDataFromJson();

    @DataProvider(name = "dataFromJson")
    public static Object[][] dataFromJson() {
        return new Object[][]{
                {
                        metalsAndColorsFormDataFromJson.getFromJsonObject_1().getSummary(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_1().getElements(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_1().getColor(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_1().getMetals(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_1().getVegetables()
                },
                {
                        metalsAndColorsFormDataFromJson.getFromJsonObject_2().getSummary(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_2().getElements(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_2().getColor(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_2().getMetals(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_2().getVegetables()
                },
                {
                        metalsAndColorsFormDataFromJson.getFromJsonObject_3().getSummary(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_3().getElements(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_3().getColor(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_3().getMetals(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_3().getVegetables()
                },
                {
                        metalsAndColorsFormDataFromJson.getFromJsonObject_4().getSummary(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_4().getElements(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_4().getColor(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_4().getMetals(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_4().getVegetables()
                },
                {
                        metalsAndColorsFormDataFromJson.getFromJsonObject_5().getSummary(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_5().getElements(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_5().getColor(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_5().getMetals(),
                        metalsAndColorsFormDataFromJson.getFromJsonObject_5().getVegetables()
                }
        };
    }
}
