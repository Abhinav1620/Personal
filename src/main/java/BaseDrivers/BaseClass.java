package BaseDrivers;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait webDriverWait;
    public static String scheduledInterview;
    public static String[] valuesStore;
    public static JavascriptExecutor js;
}
