package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class BasicAuthPage extends Form {
    private static final String NAME = "Basic Auth";
    private final ILabel successLabel = getElementFactory().getLabel(By.xpath("//*[text()='Congratulations! You must have the proper credentials.']"),"success label");

    public BasicAuthPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Verifiy the success message is displayed or not")
    public boolean isSuccessMsgDisplayed() {
        // todo: implement
        return successLabel.state().waitForDisplayed();
    }
}
