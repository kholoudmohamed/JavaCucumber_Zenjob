package Actions;

import PageObjects.TravelPage;
import Resources.Enum;
import Resources.GetData;
import org.openqa.selenium.WebDriver;

public class TravelPageActions extends BasePageActions {
    private static GetData data = new GetData();

    public static void Navigate(WebDriver driver)
    {
        driver.get(data.getPageUrl(Enum.Pages.TRAVELSEARCHPAGE));
    }
    public static void NavigateFromMainMenu()
    {
        TravelPage.MainMenu_Travel.click();
    }

    public static void EnterDestinationHotel(String dest)
    {
        TravelPage.TravelDestinationTxtBx.sendKeys(dest);
    }
    public static void ClickSearchBtn()
    {
        TravelPage.SearchBtn.click();
    }
    public static void EnterDepartureAirport(String airport)
    {
        TravelPage.DepartureAirportTxtBx.sendKeys(airport);
    }
    public static void ClickFindBtn()
    {
        TravelPage.FindTripBtn.click();
    }
}
