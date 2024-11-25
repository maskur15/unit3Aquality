package utils;

import aquality.selenium.browser.AqualityServices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;


public class JsonReader {
    public static final String RESOURCES_PATH = "src/test/resources/";
    private static final Gson GSON = new Gson();

    protected static <T> T deserializeJson(String filePath, Class<T> tClass) {
        try {
            return GSON.fromJson(new FileReader(filePath), tClass);
        } catch (FileNotFoundException e) {
            AqualityServices.getLogger().error("Settings file %s not found or incorrect. Error msg: %s".formatted(filePath, e));
            throw new RuntimeException(e);
        }
    }
}
