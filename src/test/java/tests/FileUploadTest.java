package tests;

import utils.SettingsTestData;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    private final String FILE_NAME = SettingsTestData.getFileData().getUploadFile();
    private final String FILE_PATH = SettingsTestData.TEST_DATA_PATH + FILE_NAME;

    @Test
    public void fileUploadTest() {
        // todo: add test
    }
}
