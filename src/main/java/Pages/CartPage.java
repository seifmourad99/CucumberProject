package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By laptop1tittle = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]");
    private By laptop1price =By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[3]");
    private By laptop2tittle=By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]");
    private By laptop2price =By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[3]");
    private By tottalprice=By.cssSelector("#totalp");
    private By placeObutton= By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");



 //actions
 public String getlaptop1title(){
     String text = driver.findElement(laptop1tittle).getText();
     return text;
 }public String getlaptop1price(){
        String text = driver.findElement(laptop1price).getText();
        return text;
    }public String getlaptop2tittle(){
        String text = driver.findElement(laptop2tittle).getText();
        return text;
    }public String getlaptop2price(){
        String text = driver.findElement(laptop2price).getText();
        return text;
    }
    public String gettottalprice() {
        String number = driver.findElement(tottalprice).getText();
        return number;
    }
    public PlaceorderPage clickonplaceorderbtn(){
        driver.findElement(placeObutton).click();
        return new PlaceorderPage(driver);
    }


}