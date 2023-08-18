Feature: Homepage functionality
  As a user, I should be able to see the VirginGames homepage


  Scenario: user should be able to see welcome text
    Given I am on home page
    When I accept cookies all
    Then I should be able to see "Welcome to Virgin Games"

