package constants;

import lombok.experimental.UtilityClass;

// This class was used in the training to help you with basics of XPath and learn how to use string.format().
// Now it's better to avoid it in your code.
// Just XPath with text() will be better option to use, and it looks cleaner and more readable.
@UtilityClass
public class LocatorConstants {
    public final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    public final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
}
