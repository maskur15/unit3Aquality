package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class DataTablesPage extends Form {
    private static final String NAME = "Data Tables";
    private final By due = By.xpath("//*[@id='table1']//td[4]");

    public DataTablesPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    @Step("Get due amount list")
    public List<String> getFirstDueList() {
        List<String> dueList = new ArrayList<>();
        for(ILabel due : getFirstDueLblList()) {
            dueList.add(due.getText());
        }
        // todo: implement
        return dueList;
    }

    private List<ILabel> getFirstDueLblList() {
        return AqualityServices.getElementFactory().findElements(due, "due", ElementType.LABEL);
    }
}
