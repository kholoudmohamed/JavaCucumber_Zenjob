package Resources;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Helpers {
    private static GetData data = new GetData();
    public static List<String> GetListOfStringsFromListOfElements(List<WebElement> elements)
    {
        List<String> strings = new ArrayList<String>();
        for (int i=0;i<elements.size();i++) {
            strings.add(elements.get(i).getText());
        }
        return strings;
    }
    public static void WaitUntillUrlMatches(WebDriver driver,Enum.Pages page, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.urlMatches(data.getPageUrl(page)));
    }
    public static void WaitUntillElementDisplayed(WebDriver driver,WebElement element, int sec) {
        WebDriverWait wait = new WebDriverWait(driver, sec);
        WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static String normalizeLineEnds(String s) {
        return s.replace("\n", "").replace("\r", "");
    }
    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }

}
