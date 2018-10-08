package Definitions;

import Actions.LoginPageActions;
import Actions.RegistrationPageActions;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import Resources.GetData;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageStepDefinitions {
    public WebDriver driver;
    private static GetData data = new GetData();

    public RegistrationPageStepDefinitions()
    {
        driver = Hook.driver;
    }

    @Given("^I navigate to Registration Page$")
    public void iNavigateToLoginPage() throws Throwable {
        RegistrationPageActions.Navigate(driver);
    }

    @When("^I enter Email Address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String email) throws Throwable {
        PageFactory.initElements(driver, RegistrationPage.class);
        RegistrationPageActions.EnterEmail(email);
    }

    @And("^I enter Password and Password Confirmation as \"([^\"]*)\"$")
    public void iEnterPasswordAndPasswordConfirmationAs(String password) throws Throwable {
        PageFactory.initElements(driver, RegistrationPage.class);
        RegistrationPageActions.EnterPasswordAndPasswordConfirmation(password);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() throws Throwable {
        PageFactory.initElements(driver, RegistrationPage.class);
        RegistrationPageActions.ClickRegisterButton();
    }

    @And("^Registration Content box has title of \"([^\"]*)\"$")
    public void registrationContentBoxHasTitleOf(String RegisterFormTitle) throws Throwable {
        PageFactory.initElements(driver, RegistrationPage.class);
        Assert.assertEquals("Registration Form title text is not correct",RegisterFormTitle,RegistrationPageActions.GetRegisterFormTitle());
    }
}
