package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.testng.Tag;
import pages.DataTablesPage;
import constants.MainPageNavigation;
import utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestDataReader;

public class DataTableTests extends BaseTest {
    private final DataTablesPage dataTablesPage = new DataTablesPage();

    @Test(priority = 0)
    @Epic("Data Table testing")
    @Feature("Amount table")
    @Story("due amount")
    @Tag("smoke")
    public void dataTableTest() {
        mainPage.clickNavigationLink(MainPageNavigation.SORTABLE_DATA_TABLES);
        Double actualSum = 0.0;
        for (String due : dataTablesPage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, TestDataReader.getDataTableData().getExpectedDueSum(), "Sum is not correct");
    }
}
