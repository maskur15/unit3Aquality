package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {
    private final IButton enableBtn = getElementFactory().getButton(By.xpath("//button[text()='Enable']"),"enable button");
    private final IButton disableBtn = getElementFactory().getButton(By.xpath("//button[text()='Disable']"),"disable button");

    private final ITextBox inputBox = getElementFactory().getTextBox(By.xpath("//input[@type='text']"),"input box");


    // todo: implement class
    public DynamicControlsPage() {
        // todo: implement
        super(By.xpath("//*[text()='Dynamic Controls']"), "Dynamic controls page");
    }

    @Step("Click enable button")
    public void clickEnableBtn() {
        enableBtn.click();
    }

    @Step("Send random text {text} to the input field")
    public void sendRandomText(String text) {
        inputBox.state().waitForEnabled();
        inputBox.clearAndType(text);
    }

    @Step("get the input text")
    public String retriveInputText() {
        return inputBox.getValue();
    }
 }
