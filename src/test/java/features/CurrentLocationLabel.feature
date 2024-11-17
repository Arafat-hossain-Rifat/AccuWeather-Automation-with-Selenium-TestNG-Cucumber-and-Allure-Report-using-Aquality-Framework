Feature: Current Location Label
  As a user
  I want to see the current location

  Scenario: Current location label display
    Given the user is on "AccuWeather" page
    When the user consents to data usage
    And the user clicks search field
    Then the Use your current location label is displayed
