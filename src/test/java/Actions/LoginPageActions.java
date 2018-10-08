package Actions;

import Definitions.Hook;
import PageObjects.LoginPage;
import Resources.GetData;
import Resources.Helpers;
import org.openqa.selenium.WebDriver;
import Resources.Enum;

import java.security.PublicKey;
import java.util.List;

public class LoginPageActions extends BasePageActions {
    private static GetData data = new GetData();

    public static void Navigate(WebDriver driver)
    {
        driver.get(data.getPageUrl(Enum.Pages.LOGINPAGE));
    }

    public static String GetLoginFormTitle()
    {
        return LoginPage.LoginBoxTitle.getText();
    }
    public static String GetLoginFormSubTitle()
    {
        return LoginPage.LoginBoxSubTitle.getText();
    }
    public static List<String> GetLoginFormLabelsText()
    {
        return Helpers.GetListOfStringsFromListOfElements(LoginPage.FormLabels);
    }
    public static List<String> GetSignInOptionsButtonsText()
    {
        return Helpers.GetListOfStringsFromListOfElements(LoginPage.SignInOptionsBtns);
    }
    public static void EnterUsernameAndPassword(String userName,String password)
    {
        LoginPage.UsernameTxtBx.sendKeys(userName);
        LoginPage.PasswordTxtBx.sendKeys(password);
    }
    public static boolean AreUsernameAndPasswordTxtBxsDisplayed()
    {
        boolean usernameDisplayed=LoginPage.UsernameTxtBx.isDisplayed();
        boolean passwordDisplayed=LoginPage.PasswordTxtBx.isDisplayed();
        return usernameDisplayed&&passwordDisplayed;

    }
    public static void ClickSignInOptionsHelpIcon()
    {
        LoginPage.SignInOptionsHelpIcon.click();
    }
    public static void ClickUsernameHelpIcon()
    {
        LoginPage.UsernameHelpIcon.click();
    }
    public static void ClickPasswordHelpIcon()
    {
        LoginPage.PasswordHelpIcon.click();
    }
    public static void ClickLoginButton()
    {
        LoginPage.LoginBtn.click();
    }
    public static void ClickForgetPasswordLink()
    {
        LoginPage.ForgetPasswordLink.click();
    }
    public static void ClickNewUserLink()
    {
        LoginPage.NewUserLink.click();
    }
    public static boolean AreSignInOptionsDisplayed()
    {
        boolean facebookBtnDisplayed=LoginPage.SignInOptionsBtns.get(0).isDisplayed();
        boolean googleBtnDisplayed=LoginPage.SignInOptionsBtns.get(0).isDisplayed();
        return facebookBtnDisplayed&&googleBtnDisplayed;

    }
    public static String GetSignInHelpText()
    {
        return LoginPage.SignInOptionsHelpContent.getText();
    }
    public static Boolean IsSignInHelpTextDisplayed()
    {
        return LoginPage.SignInOptionsHelpContent.isDisplayed();
    }
    public static String GetUsernameHelpText()
    {
        return LoginPage.UsernameHelpContent.getText();
    }
    public static Boolean IsUsernameHelpTextDisplayed()
    {
        return LoginPage.UsernameHelpContent.isDisplayed();
    }
    public static String GetPasswordHelpText()
    {
        return LoginPage.PasswordHelpContent.getText();
    }
    public static Boolean IsPasswordHelpTextDisplayed()
    {
        return LoginPage.PasswordHelpContent.isDisplayed();
    }
    public static String GetHeaderGreetingsText()
    {
        return LoginPage.HeaderCustomerGreetings.getText();
    }
    public static String GetUserNameErrorMsgText()
    {
        return LoginPage.UsernameErrorMsg.getText();
    }
    public static String GetPasswordErrorMsgText()
    {
        return LoginPage.PasswordErrorMsg.getText();
    }
    public static Boolean IsUserNameErrorMsgDisplayed()
    {
        return LoginPage.UsernameErrorMsg.isDisplayed();
    }
    public static Boolean IsPasswordErrorMsgDisplayed()
    {
        return LoginPage.PasswordErrorMsg.isDisplayed();
    }

    public static void ClosePopupAtAccountPage()
    {
        try {
            LoginPage.ClosePopupAtAccountPage.click();
        }
        catch (Exception ex){}

    }

}
