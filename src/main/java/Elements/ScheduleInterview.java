package Elements;

import BaseDrivers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ScheduleInterview {

    public ScheduleInterview(WebDriver driver){
        PageFactory.initElements(BaseClass.driver, this);
    }


    private By interview = By.cssSelector("i[Class*='bi-menu-button-wide']");

    private By interviewTable = By.tagName("tr");


    public WebElement interview(){
        return BaseClass.driver.findElement(interview);
    }

    public List<WebElement> allData(){
        return BaseClass.driver.findElements(interviewTable);
    }
}
