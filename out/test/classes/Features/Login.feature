Feature: Login Feature
  This feature deals with login functionality of the application

  Background:
    Given I navigate to Login Page

  Scenario: Login Page Elements displayed correctly
    Then Breadcrumb should be displayed correctly with text "Sie sind hier: Anmeldung"
    And Login Content box has title of "Sie haben ein Konto? Melden Sie sich an."
    And Login Content box has sub title of "Hier können Sie sich in Ihrem persönlichen CHECK24 Kundenkonto anmelden."
    And Sign in options displayed correctly
    And Email and password fields displayed correctly
    When I Click on Sign in options tooltip
    Then Sign in correct text displayed
    When I Click on Email tooltip
    Then Email correct text displayed
    When I Click on Password tooltip
    Then Password correct text displayed
    When I Click on forget password link
    Then I'm directed to Password reset Page
    And I navigate to Login Page
    When I click on Start Here link
    Then I'm directed to registration page

  Scenario Outline: Login with valid username and password
    When I enter username as <Username> and password as <Password>
    And I click on login button
    Then I'm logged in and Directed to User Account page

    Examples:
    | Username                    | Password        |
    | kholoud.mohamed@hotmail.com | 123@zenjob.com  |

  Scenario Outline: Login with invalid username and password
    When I enter username as <Username> and password as <Password>
    And I click on login button
    Then Error Message displayed correctly with text <ErrorMessage> as per the executed <Scenario>
    And I'm not logged in

    Examples:
      | Scenario                    | Username                      | Password    | ErrorMessage                                                                                                        |
      | InvalidUsername             | invalid                       | invalid     | Bitte geben Sie Ihre E-Mail-Adresse ein.                                                                            |
      | EmptyUsername               |                               | invalid     | Bitte geben Sie Ihre E-Mail-Adresse ein.                                                                            |
      | InvalidEmail                | invalid@test.com              | invalid     | Bei der Eingabe Ihrer E-Mail-Adresse / Ihres Passworts ist ein Fehler aufgetreten. Bitte versuchen Sie es erneut.   |
      | ValidEmailInvalidPassword   | kholoud.mohamed@hotmail.com   | invalid     | Bei der Eingabe Ihrer E-Mail-Adresse / Ihres Passworts ist ein Fehler aufgetreten. Bitte versuchen Sie es erneut.   |
      | InvalidEmailEmptyPassword   | invalid@test.com              |             | Bitte geben Sie Ihr Passwort ein.                                                                                   |