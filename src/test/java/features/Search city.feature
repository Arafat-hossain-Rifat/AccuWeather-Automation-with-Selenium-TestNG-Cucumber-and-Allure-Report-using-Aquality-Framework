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
