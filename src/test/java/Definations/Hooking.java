package Definations;

import BaseDrivers.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooking {

    @Before
    public void starting(){
        BaseClass.driver = new ChromeDriver();
        BaseClass.driver.manage().window().maximize();
        BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void teatDown(){
        BaseClass.driver.quit();
    }
}
