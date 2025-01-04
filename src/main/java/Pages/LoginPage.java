package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

//locators
private By insertusernamee = By.xpath("//input[@id='loginusername']");
private By insertpasswordd = By.xpath("//input[@id='loginpassword']");
private By loginbutton = By.xpath("//button[contains(text(), 'Log in')]");
private By welcomeuser=By.xpath("//*[@id=\"nameofuser\"]");

//actions
public void insertUsernamee(String username){
    driver.findElement(insertusernamee).sendKeys(username);
}
    public void insertPasswordd(String password){ driver.findElement(insertpasswordd).sendKeys(password);
    }
    public void clickloginButton() {
        driver.findElement(loginbutton).click();
    }
    public String getwelcomeusertext(){
    String text = driver.findElement(welcomeuser).getText();
    return text;
    }
}






