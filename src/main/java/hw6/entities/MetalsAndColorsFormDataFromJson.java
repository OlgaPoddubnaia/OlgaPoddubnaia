package hw6.entities;


import com.google.gson.Gson;
import hw6.data.ReadMetalsAndColorsDataSetJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetalsAndColorsFormDataFromJson {

    protected int[] summary;
    protected String[] elements;
    protected String color;
    protected String metals;
    protected String[] vegetables;

    transient ReadMetalsAndColorsDataSetJson readMetalsAndColors = new ReadMetalsAndColorsDataSetJson();
    transient Gson gson = new Gson();

    public MetalsAndColorsFormDataFromJson getFromJsonObject_1() {
        return gson.fromJson(readMetalsAndColors.getJsonObject_1(), MetalsAndColorsFormDataFromJson.class);
    }

    public MetalsAndColorsFormDataFromJson getFromJsonObject_2() {
        return gson.fromJson(readMetalsAndColors.getJsonObject_2(), MetalsAndColorsFormDataFromJson.class);
    }

    public MetalsAndColorsFormDataFromJson getFromJsonObject_3() {
        return gson.fromJson(readMetalsAndColors.getJsonObject_3(), MetalsAndColorsFormDataFromJson.class);
    }

    public MetalsAndColorsFormDataFromJson getFromJsonObject_4() {
        return gson.fromJson(readMetalsAndColors.getJsonObject_4(), MetalsAndColorsFormDataFromJson.class);
    }

    public MetalsAndColorsFormDataFromJson getFromJsonObject_5() {
        return gson.fromJson(readMetalsAndColors.getJsonObject_5(), MetalsAndColorsFormDataFromJson.class);
    }
}
