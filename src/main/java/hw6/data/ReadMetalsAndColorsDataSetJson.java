package hw6.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class ReadMetalsAndColorsDataSetJson {
    InputStream inputStream = getClass().getClassLoader()
            .getResourceAsStream("src/test/java/hw6/data/ReadMetalsAndColorsDataSetJson.java");
    JsonParser jsonParser = new JsonParser();
    Reader reader = new InputStreamReader(inputStream);

    JsonElement jsonElement = jsonParser.parse(reader);
    JsonObject jsonObject = jsonElement.getAsJsonObject();

    public JsonObject getJsonObject_1() {
        return jsonObject.getAsJsonObject("data_1");
    }

    public JsonObject getJsonObject_2() {
        return jsonObject.getAsJsonObject("data_2");
    }

    public JsonObject getJsonObject_3() {
        return jsonObject.getAsJsonObject("data_3");
    }

    public JsonObject getJsonObject_4() {
        return jsonObject.getAsJsonObject("data_4");
    }

    public JsonObject getJsonObject_5() {
        return jsonObject.getAsJsonObject("data_5");
    }
}
