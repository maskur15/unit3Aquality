package tests;

import pages.FileDownloadPage;
import utils.SettingsTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private final String fileName = SettingsTestData.getFileData().getDownloadFile();
    private final String filePath = SettingsTestData.RESOURCES_PATH + fileName;
    private final File downloadedFile = new File(filePath);

    @Test
    public void fileDownloadTest() {
        // todo: add test
    }

    @AfterMethod
    public void deleteFile() {
        // todo: add delete file
    }
}
