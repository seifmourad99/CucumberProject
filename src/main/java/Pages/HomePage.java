package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver ) {
        this.driver=driver;
    }

    //locators
    private By signup=By.id("signin2");
    private By login=By.xpath("//*[@id=\"login2\"]");
    private By laptopsfield = By.xpath("//a[contains(text(), 'Laptop')]");
    private By cartfield=By.xpath("//a[contains(text(), 'Cart')]");




    //actions
    public SignupPage clickonsignuplink(){
        driver.findElement(signup).click();
        return new SignupPage(driver);
    }
    public LoginPage clickonloginlink(){
        driver.findElement(login).click();
        return  new LoginPage (driver);
    }

    public  LaptopsfieldPage clickonlaptopsfieldlink(){
        driver.findElement(laptopsfield).click();
        return  new LaptopsfieldPage(driver);
    }
    public  CartPage clickoncartlink() {
        driver.findElement(cartfield).click();
        return new CartPage(driver);
    }

}
