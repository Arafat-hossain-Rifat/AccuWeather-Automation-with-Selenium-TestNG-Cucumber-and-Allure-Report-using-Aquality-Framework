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
