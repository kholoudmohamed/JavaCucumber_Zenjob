package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Selectors
    @FindBy(how = How.CSS,using = ".c24-kb-content-box>h1")
    public static WebElement LoginBoxTitle ;

    @FindBy(how = How.CSS,using = ".c24-kb-content-box>div.c24-kb-content-row")
    public static WebElement LoginBoxSubTitle ;

    @FindBy(how = How.CSS,using = "div.c24-kb-form-column-label>label")
    public static List<WebElement> FormLabels ;

    @FindBy(how = How.CSS,using = "div.oauth-btn-container>div.oauth-btn")
    public static List<WebElement> SignInOptionsBtns ;

    @FindBy(how = How.CSS,using = "#oauth-container>div>div>span.c24-kb-help")
    public static WebElement SignInOptionsHelpIcon ;

    @FindBy(how = How.CSS,using = "#oauth-container>div>div.c24-kb-help-container")
    public static WebElement SignInOptionsHelpContent ;

    @FindBy(how = How.ID,using = "email")
    public static WebElement UsernameTxtBx ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(8)>div>span.c24-kb-help")
    public static WebElement UsernameHelpIcon ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(8)>div.c24-kb-help-container")
    public static WebElement UsernameHelpContent ;

    @FindBy(how = How.ID,using = "password")
    public static WebElement PasswordTxtBx ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(9)>div>span.c24-kb-help")
    public static WebElement PasswordHelpIcon ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(9)>div.c24-kb-help-container")
    public static WebElement PasswordHelpContent ;

    @FindBy(how = How.ID,using = "pw_reset_btn")
    public static WebElement ForgetPasswordLink ;

    @FindBy(how = How.ID,using = "c24-kb-register-btn")
    public static WebElement LoginBtn ;

    @FindBy(how = How.ID,using = "new_customer")
    public static WebElement NewUserLink ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(8)>div>div.error-desc")
    public static WebElement UsernameErrorMsg ;

    @FindBy(how = How.CSS,using = "form#login>div:nth-child(9)>div>div.error-desc")
    public static WebElement PasswordErrorMsg ;

    @FindBy(how = How.ID,using = "c24-customer-salutation")
    public static WebElement HeaderCustomerGreetings ;

    @FindBy(how = How.CSS,using = "section.c24-dialog-box-overlay.points-modal>div.c24-dialog-box>header>button.dialog-box-close.button-cancel.close")
    public static WebElement ClosePopupAtAccountPage ;

}
