package tests;

import pages.FileDownloadPage;
import utils.SettingsTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private final String FILE_NAME = SettingsTestData.getFileData().getDownloadFile();
    private final String FILE_PATH = SettingsTestData.RESOURCES_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);

    @Test
    public void fileDownloadTest() {
        // todo: add test
    }

    @AfterMethod
    public void deleteFile() {
        // todo: add delete file
    }
}
