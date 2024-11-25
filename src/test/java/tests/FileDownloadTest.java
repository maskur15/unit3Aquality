package tests;

import pages.FileDownloadPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.JsonReader;
import utils.TestDataReader;

import java.io.File;

public class FileDownloadTest extends BaseTest {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();
    private final String fileName = TestDataReader.getFileData().getDownloadFile();
    private final String filePath = JsonReader.RESOURCES_PATH + fileName;
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
