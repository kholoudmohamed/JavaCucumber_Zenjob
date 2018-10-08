Feature: Travel Feature
  This feature deals with Travel Search functionality of the application

  Background:
    Given I'm logged In with "" and "" credentials

    Scenario: Search using Travel
      Given I clicked on travel from main menu
      When I enter destination or hotel as "Crete"
      And I enter Departure airport as "Frankfurt am Main (FRA)"
      And I enter dates as "" and ""
      And I choose duration as ""
      And I click on find a trip button
      Then I should be directed to search results page
      And results should include at least one result

