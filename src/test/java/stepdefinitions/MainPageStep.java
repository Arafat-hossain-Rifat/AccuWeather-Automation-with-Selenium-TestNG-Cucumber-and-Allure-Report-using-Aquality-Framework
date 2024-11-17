package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageStep {

    private final MainPage mainPage = new MainPage();

    @Given("the user is on {string} page")
    public void openMainPage(String string) {
        mainPage.state().waitForDisplayed();
    }

    @When("the user consents to data usage")
    public void acceptConsent() {
        mainPage.consentDataUsage();
    }

    @When("the user clicks search field")
    public void clickSearchField() {
        step("Click search field");
        mainPage.clickSearchField();
    }

    @When("the user inputs {string} in the search field")
    public void inputSearchQuery(String city) {
        step("Input %s in the search field.".formatted(city));
        mainPage.inputSearchQuery(city);
    }

    @Then("the search results list is displayed")
    public void verifySearchResultsDisplayed() {
        Assert.assertTrue(mainPage.isSearchResultsDisplayed(), "Search results are not displayed.");
    }

    @When("the user clicks on the first search result")
    public void clickFirstSearchResult() {
        step("Click on the first search result");
        mainPage.clickFirstSearchResult();
    }

    @Then("the Use your current location label is displayed")
    public void locationLabel() {
        Assert.assertTrue(mainPage.isLocationLabelDisplayed(), "Current location label is not displayed.");
    }

    @Then("the main page is opened")
    public void mainPageReopen() {
        mainPage.state().waitForDisplayed();
        Assert.assertTrue(mainPage.state().isDisplayed(), "The main page is not displayed");
    }

    @When("the user clicks on the first city in Recent locations")
    public void clickFirstRecentCity() {
        step("Choose the first city in Recent locations");
        mainPage.chooseFirstCity();
    }
}
