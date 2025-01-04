package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laptop2page {
    WebDriver driver;
    public  Laptop2page(WebDriver driver)
    {this.driver=driver;}
    //locators
    private By laptop2cartbutton = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    //actions
    public void clickonaddtocartbutton(){
        driver.findElement(laptop2cartbutton).click();
    }
    public String getaddproducttext() {
        String text=driver.switchTo().alert().getText();
        return text;
    }
    public void accept2alert(){
        driver.switchTo().alert().accept();
    }
}



