package Definitions;

import Actions.LoginPageActions;
import Actions.TravelPageActions;
import PageObjects.RegistrationPage;
import PageObjects.TravelPage;
import Resources.GetData;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TravelPageStepDefinitions {
    public WebDriver driver;
    private static GetData data = new GetData();

    public TravelPageStepDefinitions()
    {
        driver = Hook.driver;
    }

    @Given("^I clicked on travel from main menu$")
    public void iNavigateToLoginPage() throws Throwable {
        PageFactory.initElements(driver, TravelPage.class);
        TravelPageActions.NavigateFromMainMenu();
    }

    @When("^I enter destination or hotel as \"([^\"]*)\"$")
    public void iEnterDestinationOrHotelAs(String dest) throws Throwable {
        PageFactory.initElements(driver, TravelPage.class);
        TravelPageActions.EnterDestinationHotel(dest);
    }

    @And("^I click Find Button$")
    public void iClickFindButton() throws Throwable {
        PageFactory.initElements(driver, TravelPage.class);
        TravelPageActions.ClickFindBtn();
    }

    @And("^I enter Departure airport as \"([^\"]*)\"$")
    public void iEnterDepartureAirportAs(String airport) throws Throwable {
        PageFactory.initElements(driver, TravelPage.class);
        TravelPageActions.EnterDepartureAirport(airport);
    }
}
