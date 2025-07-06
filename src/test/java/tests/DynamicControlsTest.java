package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import pages.DynamicControlsPage;
import org.testng.annotations.Test;

import java.util.UUID;

public class DynamicControlsTest extends BaseTest {
    private final DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    private final String randomText = UUID.randomUUID().toString();

    @DataProvider
    public Object[][] randomData() {
        return new Object[][] {
                {"hasan", "it10002"},
                {"Lopa","cs3333"}
        };
    }

    //@Test(dataProvider = "randomData")
    public void dataProviderTest(String name, String  id )
    {
        System.out.println(name + " " + id);
    }

    @Test
    public void dynamicControlsTest() {;
        // todo: add test
        mainPage.clickNavigationLink(MainPageNavigation.DYNAMIC_CONTROLS);
        dynamicControlsPage.clickEnableBtn();

        dynamicControlsPage.sendRandomText(randomText);
        Assert.assertEquals(dynamicControlsPage.retriveInputText(),randomText,"Text doesnt match");

    }
}
