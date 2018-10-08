package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravelPage extends BasePage {
    public TravelPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(how = How.ID,using = "c24-travel-js-fake-destination-input")
    public static WebElement TravelDestinationTxtBx;

    @FindBy(how = How.CSS,using = "#c24-travel-js-personal-form-layer-cnt > div.c24-travel-small-form-area-cnt > div.c24-travel-input-wrapper > span")
    public static WebElement SearchBtn ;

    @FindBy(how = How.ID,using = "c24-travel-destination-element")
    public static WebElement DestinationHotelTxtBx ;

    @FindBy(how = How.ID,using = "c24-travel-airport-element")
    public static WebElement DepartureAirportTxtBx ;

    @FindBy(how = How.ID,using = "c24-travel-search-button-element")
    public static WebElement FindTripBtn ;
}
