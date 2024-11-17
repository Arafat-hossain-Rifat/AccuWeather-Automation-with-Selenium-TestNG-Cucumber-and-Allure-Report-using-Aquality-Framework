package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {

    private final ITextBox searchTextBox = getElementFactory().getTextBox(By.className("search-input"), "Search Input");
    private final IButton consentButton = getElementFactory().getButton(By.className("banner-button"), "Consent Data Usage Button");
    private final By searchedListLocator = (By.className("search-bar-result__name"));
    private final ILabel useCurrentLocationLabel = getElementFactory().getLabel(By.xpath("//span[@class='current-location-text']"), "Use Your Current Location Label");
    private final By recentLocations = By.className("recent-location-name");
    private final ILink searchResultsList = getElementFactory().getLink(By.className("search-bar-result__name"), "Search Results");
    private final ILink searchResultsListContainer = getElementFactory().getLink(By.className("search-results"), "Search Results Container");

    public MainPage() {
        super(By.className("accuweather"), "Main Page");
    }

    public void consentDataUsage() {
        consentButton.state().waitForDisplayed();
        consentButton.click();
    }

    public void inputSearchQuery(String query) {
        searchTextBox.clearAndType(query);
    }

    public boolean isSearchResultsDisplayed() {
        return searchResultsListContainer.state().isDisplayed();
    }

    public void clickFirstSearchResult() {
        searchResultsList.state().waitForDisplayed();
        List<ILink> searchedList = getElementFactory().findElements(searchedListLocator, ElementType.LINK);
        searchedList.get(0).click();
    }

    public void clickSearchField() {
        searchTextBox.click();
    }

    public boolean isLocationLabelDisplayed() {
        return useCurrentLocationLabel.state().isDisplayed();
    }

    public void chooseFirstCity() {
        List<ILink> locationList = getElementFactory().findElements(recentLocations, ElementType.LINK);
        locationList.get(0).click();
    }
}
