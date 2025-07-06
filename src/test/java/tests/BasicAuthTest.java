package tests;

import constants.MainPageNavigation;
import io.qameta.allure.*;
import org.testng.Assert;
import pages.BasicAuthPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.EnvDataReader;
import utils.TestDataReader;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class BasicAuthTest extends BaseTest {
    private final BasicAuthPage basicAuthPage = new BasicAuthPage();

    @BeforeMethod
    public void auth() {
        // todo: add basic auth
        step("Set the username and passowrd");
        getBrowser().network().addBasicAuthentication(EnvDataReader.getEnvData().getDomain(),
                TestDataReader.getUserData().getUsername(),TestDataReader.getUserData().getPassword());
    }

    @Test(priority = 1)
    @Description("Authentication to the heroku site")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "website",url = "https://the-internet.herokuapp.com/")
    @Owner("Maskur")
    public void basicAuthTest() {
        mainPage.clickNavigationLink(MainPageNavigation.BASIC_AUTH);

        Assert.assertTrue(basicAuthPage.isSuccessMsgDisplayed(),"Msg is not displayed");
        // todo: add test
    }
}
