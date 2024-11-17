Description:
This project automates the testing of the AccuWeather website's key features, such as displaying the current location label, recent locations, and searching for a city's weather.
Built using Selenium with Java, TestNG, Cucumber, and the Aquality Framework, it verifies that location labels are correctly displayed, recent locations are accessible,
and weather information is accurately shown for searched cities. The project integrates Allure Reports for comprehensive test result visualization and analysis.

Features:

Feature: Current Location Label
  As a user
  I want to see the current location

  Scenario: Current location label display
    Given the user is on "AccuWeather" page
    When the user consents to data usage
    And the user clicks search field
    Then the Use your current location label is displayed

Feature: Recent Locations
  As a user
  I want to view recent locations
  So that I can access previously searched cities

  Scenario: Recent locations display
    Given the user is on "AccuWeather" page
    When the user consents to data usage
    And the user inputs "London" in the search field
    And the user clicks on the first search result
    And the user goes back to the previous page
    Then the main page is opened
    When the user clicks on the first city in Recent locations
    Then the city weather page header contains "London"

Feature: Search City
  As a user
  I want to search for a city's weather
  So that I can see the weather details

  Scenario: Display weather for searched city
    Given the user is on "AccuWeather" page
    When the user consents to data usage
    And the user inputs "New York" in the search field
    Then the search results list is displayed
    When the user clicks on the first search result
    Then the city weather page header contains "New York"

