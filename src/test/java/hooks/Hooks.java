package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

public class Hooks {

    @Before
    public void setup() {

        AqualityServices.getBrowser().maximize();
        AqualityServices.getBrowser().goTo(SettingsTestData.getEnvData().getHost());
    }

    @After
    public void tearDown() {

        AqualityServices.getBrowser().quit();

    }
}



