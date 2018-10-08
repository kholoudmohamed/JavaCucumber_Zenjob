package Actions;

import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import Resources.Enum;
import Resources.GetData;
import org.openqa.selenium.WebDriver;

public class RegistrationPageActions extends BasePageActions {
    private static GetData data = new GetData();

    public static void Navigate(WebDriver driver)
    {
        driver.get(data.getPageUrl(Enum.Pages.REGISTRATIONPAGE));
    }
    public static String GetRegisterFormTitle()
    {
        return RegistrationPage.RegisterBoxTitle.getText();
    }

    public static void EnterEmail(String email)
    {
        LoginPage.UsernameTxtBx.sendKeys(email);
    }
    public static void EnterPasswordAndPasswordConfirmation(String password)
    {
        LoginPage.PasswordTxtBx.sendKeys(password);
        RegistrationPage.PasswordConfirmationTxtBx.sendKeys(password);
    }

    public static void ClickRegisterButton()
    {
        RegistrationPage.RegisterBtn.click();
    }
}
