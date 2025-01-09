package steps;

import pages.*;
import pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
public class Scenario1_Steps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    SignupPage signupPage;


    @Given("user opens the website and press on signup link")
    public void user_opens_the_website_and_press_on_signup_link() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickOnSignupLink();
        Thread.sleep(2000);
    }
    @When("user enters valid username  and password as  and click signup")
    public void user_enters_valid_username_and_password_and_click_signup () throws InterruptedException {
        signupPage =new SignupPage(driver);
        signupPage.insertUsername("seif131");
        signupPage.insertPassword("12341234");
        signupPage.clickSignUpButton();
        Thread.sleep(2000);
    }
    @Then("user gets signup message alert")
    public void user_gets_signup_message_alert() {
        String actualresult = signupPage.getSinupAlertMessageText();
        String expectedresult = "Sign up successful";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }



}




