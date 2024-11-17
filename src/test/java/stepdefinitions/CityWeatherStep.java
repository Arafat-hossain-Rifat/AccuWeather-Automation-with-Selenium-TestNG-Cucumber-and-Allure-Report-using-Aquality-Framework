package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CityWeatherPage;
import utils.BrowserUtils;

import static io.qameta.allure.Allure.step;

public class CityWeatherStep {

    private final CityWeatherPage cityWeatherPage = new CityWeatherPage();

    @When("the user goes back to the previous page")
    public void goBackToMainPage() {
        step("Go back to the previous page");
        cityWeatherPage.state().waitForDisplayed();
        BrowserUtils.goBackToThePreviousPage();
    }

    @Then("the city weather page header contains {string}")
    public void verifyCityNameInHeader(String city) {
        cityWeatherPage.state().waitForDisplayed();
        String headerText = cityWeatherPage.getCityNameFromHeader();
        Assert.assertTrue(headerText.contains(city), "Page header doesn't contain %s.".formatted(city));
    }
}
