package Definations;

import Actions.EncodingDecoding;
import Actions.Operations;
import BaseDrivers.BaseClass;
import Elements.HomePage;
import Elements.ScheduleInterview;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs extends Operations {
    public static String UserName;
    public static String PassWord;

    HomePage page = new HomePage(BaseClass.driver);
    ScheduleInterview interview = new ScheduleInterview(BaseClass.driver);

    @When("^I navigated to Website$")
    public void iNavigatedToWebsite() {
//        System.out.println("I navigated to Website");
        BaseClass.driver.get("https://expert.vprople.com/expert-login");
    }


    @Then("Enter correct {string} and correct {string}")
    public void enterCorrectUsernameAndCorrectPassword(String username, String password){
//        System.out.println("enterCorrectUsernameAndCorrectPassword");
        UserName=username;
        PassWord=password;
        sendKeys(page.username(), EncodingDecoding.decoding(username));
        sendKeys(page.password(), EncodingDecoding.decoding(password));
    }

    @Then("When i clicked on login button")
    public void  whenIClickedOnLoginButton(){
//        System.out.println("whenIClickedOnLoginButton");
        clickElement(page.login());
    }

    @Then("I should be able to see number of scheduled interview")
    public void iShouldBeAbleToSeeNumberOfScheduledInterview(){
        System.out.println("iShouldBeAbleToSeeNumberOfScheduledInterview");
        clickElement(interview.interview());
        extractData(interview.allData(), "Scheduled");
        alertPop();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
