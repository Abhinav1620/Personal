package Actions;

import BaseDrivers.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Operations {
    public static void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }

    public static void clickElement(WebElement element){
        element.click();
    }


    public static void extractData(List<WebElement> elements, String Text){
        for (WebElement element: elements){
            if (element.getText().contains(Text)){
                BaseClass.scheduledInterview = element.getText();
                BaseClass.valuesStore = BaseClass.scheduledInterview.split(Text);
//                BaseDrivers.test.log(LogStatus.INFO, BaseClass.valuesStore[0]+" has been Scheduled");
            }
        }
    }

    public static void alertPop(){
        if (BaseClass.scheduledInterview != null){
            BaseClass.driver.switchTo().newWindow(WindowType.TAB);
            BaseClass.js = (JavascriptExecutor)BaseClass.driver;
            BaseClass.js.executeScript("alert('"+BaseClass.valuesStore.length+" interview Scheduled on "+getCurrentDate()+"')");
        }
        else {
//            driver.switchTo().newWindow(WindowType.TAB);
            BaseClass.driver.switchTo().newWindow(WindowType.TAB);
            BaseClass.js = (JavascriptExecutor)BaseClass.driver;
            BaseClass.js.executeScript("alert('No Interview Scheduled for :"+ getCurrentDate()+"')");
//            BaseDrivers.test.log(LogStatus.INFO, "No interview Scheduled at :   " + getCurrentDate());
        }
    }


    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
