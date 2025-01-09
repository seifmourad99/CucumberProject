package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By Laptop1Tittle = By.xpath("//td[contains(text(),'i5')]");
    private By Laptop1Price =By.xpath("//td[contains(text(),790)]");
    private By Laptop2Tittle=By.xpath("//td[contains(text(),'i7')]");
    private By Laptop2Price =By.xpath("//td[contains(text(),790)]");
    private By TottalPrice=By.cssSelector("#totalp");
    private By PlaceOrderButton= By.xpath("//button[@class='btn btn-success']");



    //actions
    public String getLaptop1Title(){
        String text = driver.findElement(Laptop1Tittle).getText();
        return text;
    }public String getLaptop1Price(){
        String text = driver.findElement(Laptop1Price).getText();
        return text;
    }public String getLaptop2Tittle(){
        String text = driver.findElement(Laptop2Tittle).getText();
        return text;
    }public String getLaptop2Price(){
        String text = driver.findElement(Laptop2Price).getText();
        return text;
    }
    public String getTotalPrice() {
        String number = driver.findElement(TottalPrice).getText();
        return number;
    }
    public PlaceorderPage clickOnPlaceOrderbtn(){
        driver.findElement(PlaceOrderButton).click();
        return new PlaceorderPage(driver);
    }


}