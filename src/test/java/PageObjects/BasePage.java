package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public abstract class BasePage {
    public static WebDriver driver;
    public static boolean bResult;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        BasePage.bResult = true;
    }

    // Common Locators
    @FindBy(how = How.CSS,using = "#c24-breadcrumb>div")
    public static WebElement Breadcrumb ;

    @FindBy(how = How.CSS,using = "li.c24-mainnav-sec-section.c24-nav-travel>a")
    public static WebElement MainMenu_Travel ;
}
