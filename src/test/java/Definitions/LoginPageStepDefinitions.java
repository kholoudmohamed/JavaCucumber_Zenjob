package Definitions;

import Actions.LoginPageActions;
import PageObjects.LoginPage;
import Resources.Enum;
import Resources.GetData;
import Resources.Helpers;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.He;
import org.junit.Assert;
import org.openqa.jetty.html.Break;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPageStepDefinitions {
    public WebDriver driver;
    private static GetData data = new GetData();

    public LoginPageStepDefinitions()
    {
        driver = Hook.driver;
    }

    @Given("^I navigate to Login Page$")
    public void iNavigateToLoginPage() throws Throwable {
        LoginPageActions.Navigate(driver);
    }

    @Then("^Breadcrumb should be displayed correctly with text \"([^\"]*)\"$")
    public void breadcrumbShouldBeDisplayedCorrectlyWithText(String breadcrumbTxt) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals("Breadcrumb text is not correct",breadcrumbTxt,LoginPageActions.GetBreadcrumbText());
    }

    @And("^Login Content box has title of \"([^\"]*)\"$")
    public void loginContentBoxHasTitleOf(String loginFormTitle) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals("Login Form title text is not correct",loginFormTitle,LoginPageActions.GetLoginFormTitle());
    }

    @And("^Login Content box has sub title of \"([^\"]*)\"$")
    public void loginContentBoxHasSubTitleOf(String loginFormSubTitle) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals("Login Form sub title text is not correct",loginFormSubTitle,LoginPageActions.GetLoginFormSubTitle());
    }

    @When("^I enter username as ([^\"]*) and password as ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUsernameAndPassword(userName,password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickLoginButton();
    }

    @And("^Sign in options displayed correctly$")
    public void signInOptionsDisplayedCorrectly() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertTrue("Sign in Optiond buttons are not displayed",LoginPageActions.AreSignInOptionsDisplayed());
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("Facebook");
        expectedList.add("Google");
        Assert.assertEquals("Sign in options text is not correct",expectedList,LoginPageActions.GetSignInOptionsButtonsText());
    }

    @And("^Email and password fields displayed correctly$")
    public void emailAndPasswordFieldsDisplayedCorrectly() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        List<String> labels = LoginPageActions.GetLoginFormLabelsText();
        Assert.assertEquals("Username Label text is not correct","Meine E-Mail-Adresse ist",labels.get(1));
        Assert.assertEquals("Password Label text is not correct","Mein CHECK24 Passwort ist",labels.get(2));
        Assert.assertTrue("Username/Password text box is not displayed",LoginPageActions.AreUsernameAndPasswordTxtBxsDisplayed());
    }

    @When("^I Click on Sign in options tooltip$")
    public void iClickOnSignInOptionsTooltop() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickSignInOptionsHelpIcon();
    }

    @Then("^Sign in correct text displayed$")
    public void signInCorrectTextDisplayed() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Helpers.WaitUntillElementDisplayed(driver,LoginPage.SignInOptionsHelpContent,10);
        Assert.assertTrue("Sign In options help text is not displayed",LoginPageActions.IsSignInHelpTextDisplayed());
        String expected=data.getSignInOptionsHelpText();
        String actual = Helpers.normalizeLineEnds(LoginPageActions.GetSignInHelpText());
        Assert.assertEquals("Sign In options help text content is not correct",expected,actual);

    }

    @When("^I Click on Email tooltip$")
    public void iClickOnEmailTooltip() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickUsernameHelpIcon();
    }

    @Then("^Email correct text displayed$")
    public void emailCorrectTextDisplayed() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Helpers.WaitUntillElementDisplayed(driver,LoginPage.UsernameHelpContent,10);
        Assert.assertTrue("Username help text is not displayed",LoginPageActions.IsUsernameHelpTextDisplayed());
        String expected=data.getUsernameOptionsHelpText();
        String actual = Helpers.normalizeLineEnds(LoginPageActions.GetUsernameHelpText());
        actual = Helpers.deAccent(actual);
        Assert.assertEquals("Username help text content is not correct",expected,actual);
    }

    @When("^I Click on Password tooltip$")
    public void iClickOnPasswordTooltip() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickPasswordHelpIcon();
    }

    @Then("^Password correct text displayed$")
    public void passwordCorrectTextDisplayed() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Helpers.WaitUntillElementDisplayed(driver,LoginPage.PasswordHelpContent,10);
        Assert.assertTrue("Password help text is not displayed",LoginPageActions.IsPasswordHelpTextDisplayed());
        String expected=data.getPasswordOptionsHelpText();
        String actual = Helpers.normalizeLineEnds(LoginPageActions.GetPasswordHelpText());
        actual = Helpers.deAccent(actual);
        Assert.assertEquals("Username help text content is not correct",expected,actual);
    }

    @When("^I Click on forget password link$")
    public void iClickOnForgetPasswordLink() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickForgetPasswordLink();
    }

    @Then("^I'm directed to Password reset Page$")
    public void iMDirectedToPasswordResetPage() throws Throwable {
        Assert.assertEquals("Current Url is not correct",data.getPageUrl(Enum.Pages.LOGINFORGETPASSWORDPAGE),driver.getCurrentUrl());
    }

    @When("^I click on Start Here link$")
    public void iClickOnStartHereLink() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickNewUserLink();
    }

    @Then("^I'm directed to registration page$")
    public void iMDirectedToRegistrationPage() throws Throwable {
        Assert.assertEquals("Current Url is not correct",data.getPageUrl(Enum.Pages.REGISTRATIONPAGE),driver.getCurrentUrl());
    }

    @And("^I'm directed to Home Page$")
    public void iMDirectedToHomePage() throws Throwable {
        Assert.assertEquals("Current Url is not correct",data.getPageUrl(Enum.Pages.TRAVELSEARCHPAGE),driver.getCurrentUrl());
    }

    @Then("^I'm logged in and Directed to User Account page$")
    public void iMLoggedIn() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Helpers.WaitUntillUrlMatches(driver,Enum.Pages.USERACCOUNTPAGE,10);
        //Assert.assertEquals("Current Url is not correct",data.getPageUrl(Enum.Pages.USERACCOUNTPAGE),driver.getCurrentUrl());
        Assert.assertFalse("User is not logged in",LoginPageActions.GetHeaderGreetingsText().contains("Anmelden"));
        LoginPageActions.ClosePopupAtAccountPage();

    }

    @And("^I'm not logged in$")
    public void iMNotLoggedIn() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertTrue("User is logged in",LoginPageActions.GetHeaderGreetingsText().contains("Anmelden"));
    }

    @Then("^Error Message displayed correctly with text ([^\"]*) as per the executed ([^\"]*)$")
    public void errorMessageDisplayedCorrectlyWithTextErrorMessageAsPerTheExecutedScenario(String errorMsg,String scenario) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        switch (scenario) {
            case "InvalidUsername":
            case "EmptyUsername":
                Assert.assertTrue("Username Error Message is not displayed",LoginPageActions.IsUserNameErrorMsgDisplayed());
                Assert.assertEquals("Username Error Message is not correct",errorMsg,LoginPageActions.GetUserNameErrorMsgText());
                break;
            case"InvalidEmail":
            case"ValidEmailInvalidPassword":
                Assert.assertTrue("Username Error Message is not displayed",LoginPageActions.IsUserNameErrorMsgDisplayed());
                Assert.assertTrue("Username Error Message is not displayed",LoginPageActions.IsPasswordErrorMsgDisplayed());
                Assert.assertEquals("Username Error Message is not correct",errorMsg,LoginPageActions.GetUserNameErrorMsgText());
                Assert.assertEquals("Username Error Message is not correct",errorMsg,LoginPageActions.GetPasswordErrorMsgText());
                break;
            case"InvalidEmailEmptyPassword":
                Assert.assertTrue("Username Error Message is not displayed",LoginPageActions.IsPasswordErrorMsgDisplayed());
                Assert.assertEquals("Username Error Message is not correct",errorMsg,LoginPageActions.GetPasswordErrorMsgText());
                break;
        }
    }

    @Given("^I'm logged In with \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void iMLoggedInWithAndCredentials(String userName, String password) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUsernameAndPassword(userName,password);
        Helpers.WaitUntillUrlMatches(driver,Enum.Pages.USERACCOUNTPAGE,10);
    }
}
