package tests;

import aquality.selenium.browser.AlertActions;
import io.qameta.allure.testng.Tag;
import pages.JavaScriptAlertsPage;
import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class AlertTest extends BaseTest {
    private final JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @Test(description = "Javscirpts alert")
    @Tag("regression")
    public void alertTest() {
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        javaScriptAlertsPage.clickForJsAlertBtn();
        getBrowser().handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
    }
}
