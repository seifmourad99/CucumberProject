package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignupPage {
    WebDriver driver;
    public SignupPage (WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By insertusername = By.xpath("//input[@id='sign-username']");
    private By insertpassword = By.xpath("//input[@id='sign-password']");
    private By signupbutton = By.xpath("//button[contains(text(), 'Sign up')]");


   //actions
   public void insertUsername(String username){
       driver.findElement(insertusername).sendKeys(username);
   }
   public void insertPassword(String password){
       driver.findElement(insertpassword).sendKeys(password); }

    public void clickSignupButton() {
        driver.findElement(signupbutton).click();
    }
    public String getsinupalertmessagetext(){
       String text=driver.switchTo().alert().getText();
       return text;
    }

    public void acceptalert(){
       driver.switchTo().alert().accept();
    }

}

