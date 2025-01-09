package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignupPage {
    WebDriver driver;
    public SignupPage (WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By InsertUsername = By.xpath("//input[@id='sign-username']");
    private By InsertPassword = By.xpath("//input[@id='sign-password']");
    private By SignUpButton = By.xpath("//button[contains(text(), 'Sign up')]");


    //actions
    public void insertUsername(String username){
        driver.findElement(InsertUsername).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(InsertPassword).sendKeys(password); }

    public void clickSignUpButton() {
        driver.findElement(SignUpButton).click();
    }
    public String getSinupAlertMessageText(){
        String text=driver.switchTo().alert().getText();
        return text;
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}

