package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";

    private final By clickForJsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private final By successMessage = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));
    private final IButton clickForJsAlertBtn = getElementFactory().getButton(clickForJsAlertButton, "Click for JS alert");
    private final ILabel successLbl = getElementFactory().getLabel(successMessage, "Success");

    public JavaScriptAlertsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }

    @Step("Verfiy the success label")
    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }
}
