package hw6.entities;


import com.google.gson.Gson;
import hw6.data.ReadMetalsAndColorsDataSetJson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetalsAndColorsFormDataFromJson {

    protected String[] summary;
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

    @Override
    public String toString() {
        return "MetalsAndColorsFormDataFromJson{" +
                "summary=" + Arrays.toString(summary) +
                ", elements=" + Arrays.toString(elements) +
                ", color='" + color + '\'' +
                ", metals='" + metals + '\'' +
                ", vegetables=" + Arrays.toString(vegetables) +
                ", readMetalsAndColors=" + readMetalsAndColors +
                ", gson=" + gson +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetalsAndColorsFormDataFromJson that = (MetalsAndColorsFormDataFromJson) o;
        return Arrays.equals(summary, that.summary) && Arrays.equals(elements, that.elements) && Objects.equals(color, that.color) && Objects.equals(metals, that.metals) && Arrays.equals(vegetables, that.vegetables) && Objects.equals(readMetalsAndColors, that.readMetalsAndColors) && Objects.equals(gson, that.gson);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, metals, readMetalsAndColors, gson);
        result = 31 * result + Arrays.hashCode(summary);
        result = 31 * result + Arrays.hashCode(elements);
        result = 31 * result + Arrays.hashCode(vegetables);
        return result;
    }
}
