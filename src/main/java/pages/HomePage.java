package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver ) {
        this.driver=driver;
    }

    //locators
    private By SignUp=By.id("signin2");
    private By Login=By.xpath("//a[@id='login2']");
    private By LaptopsField = By.xpath("//a[contains(text(), 'Laptop')]");
    private By CartField=By.xpath("//a[contains(text(), 'Cart')]");




    //actions
    public SignupPage clickOnSignupLink(){
        driver.findElement(SignUp).click();
        return new SignupPage(driver);
    }
    public LoginPage clickonLoginLink(){
        driver.findElement(Login).click();
        return  new LoginPage (driver);
    }

    public  LaptopsfieldPage clickOnLaptopsFieldLink(){
        driver.findElement(LaptopsField).click();
        return  new LaptopsfieldPage(driver);
    }
    public  CartPage clickOnCartLink() {
        driver.findElement(CartField).click();
        return new CartPage(driver);
    }

}
