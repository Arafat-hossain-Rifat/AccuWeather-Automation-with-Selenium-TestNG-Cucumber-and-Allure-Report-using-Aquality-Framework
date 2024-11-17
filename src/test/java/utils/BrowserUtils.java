package utils;

import lombok.experimental.UtilityClass;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class BrowserUtils {

    public void goBackToThePreviousPage() {
        getBrowser().goBack();
    }
}
