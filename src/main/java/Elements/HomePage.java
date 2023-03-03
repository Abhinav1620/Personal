package Elements;

import BaseDrivers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(BaseClass.driver, this);
    }

    By userName = By.id("yourUsername");
    By passWord = By.id("yourPassword");
    By loginBTN = By.xpath("//*[text()='Login']");



    public WebElement username(){
        return BaseClass.driver.findElement(userName);
    }

    public WebElement password(){
        return BaseClass.driver.findElement(passWord);
    }

    public WebElement login(){
        return BaseClass.driver.findElement(loginBTN);
    }
}
