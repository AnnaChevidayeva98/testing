package framework.waits;

import framework.browser.Browser;
import framework.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    private static WebDriverWait wait = new WebDriverWait(Browser.getDriver(), Integer.parseInt(ConfigReader.getProperty("explicitlyWait")));

    public static void waitVisibilityOfElementLocated(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitClickableOfElementLocated(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitTextToBePresentInElementLocated(By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }

    public static boolean isClickable(By locator)
    {
        try
        {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

}
