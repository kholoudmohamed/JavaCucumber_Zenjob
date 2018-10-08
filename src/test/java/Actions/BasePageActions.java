package Actions;

import PageObjects.BasePage;

public abstract class BasePageActions {

    public static String GetBreadcrumbText()
    {
        return BasePage.Breadcrumb.getText();
    }
    public static void ClickOnTravelFromMainMenu()
    {
        BasePage.MainMenu_Travel.click();
    }
}
