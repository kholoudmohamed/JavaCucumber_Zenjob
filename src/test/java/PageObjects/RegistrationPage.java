package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    //Locators
    @FindBy(how = How.CSS,using = ".c24-kb-content-box>h1")
    public static WebElement RegisterBoxTitle ;

    @FindBy(how = How.ID,using = "passwordrepetition")
    public static WebElement PasswordConfirmationTxtBx ;

    @FindBy(how = How.ID,using = "c24-kb-btn")
    public static WebElement RegisterBtn ;
}
