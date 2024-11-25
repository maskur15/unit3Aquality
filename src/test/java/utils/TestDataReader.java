package utils;

import models.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestDataReader extends JsonReader {
    public final String TEST_DATA_PATH = RESOURCES_PATH + "testdata/";

    private final String USER_FILE_PATH = TEST_DATA_PATH + "userData.json";
    private final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "dataTableData.json";
    private final String FILE_DATA_PATH = TEST_DATA_PATH + "fileData.json";

    public UserData getUserData() {
        return deserializeJson(USER_FILE_PATH, UserData.class);
    }

    public DataTableData getDataTableData() {
        return deserializeJson(DATA_TABLE_FILE_PATH, DataTableData.class);
    }

    public FileData getFileData() {
        return deserializeJson(FILE_DATA_PATH, FileData.class);
    }
}
