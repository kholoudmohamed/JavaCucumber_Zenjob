Feature: Registration Feature
  This feature deals with Registration functionality of the application

  Background:
    Given I navigate to Registration Page

  Scenario: Registration Page Elements displayed correctly
    Then Breadcrumb should be displayed correctly with text "Sie sind hier: Neuanmeldung"
    And Registration Content box has title of "Jetzt CHECK24 Kundenkonto anlegen und Vorteile nutzen!"

  Scenario: Register a new user
    When I enter Email Address as "Test@test.com"
    And I enter Password and Password Confirmation as "123456789"
    And I click on Register button
    Then I'm logged in and Directed to User Account page
