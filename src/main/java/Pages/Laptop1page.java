package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laptop1page {
    WebDriver driver;
    public  Laptop1page(WebDriver driver)
    {this.driver=driver;}
    //locators
    private By laptop1cartbutton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    private By homebutton=By.cssSelector("#navbarExample > ul > li.nav-item.active > a");

    //actions
    public void clickonaddtocartbutton(){
        driver.findElement(laptop1cartbutton).click();
    }
    public String getaddproducttext() {
       String text=driver.switchTo().alert().getText();
       return text;
    }
    public void accept1alert(){
        driver.switchTo().alert().accept();
    }
    public HomePage clickonhomebtn(){
        driver.findElement(homebutton).click();
        return new HomePage(driver);
    }
}
