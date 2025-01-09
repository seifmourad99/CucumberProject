package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By InsertUsernamee = By.xpath("//input[@id='loginusername']");
    private By InsertPasswordd = By.xpath("//input[@id='loginpassword']");
    private By LoginButton = By.xpath("//button[contains(text(), 'Log in')]");
    private By WelcomeUser=By.xpath("//*[@id=\"nameofuser\"]");

    //actions
    public void insertUsernamee(String username){
        driver.findElement(InsertUsernamee).sendKeys(username);
    }
    public void insertPasswordd(String password){
        driver.findElement(InsertPasswordd).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }
    public String getWelcomeUserText(){
        String text = driver.findElement(WelcomeUser).getText();
        return text;
    }
}






