package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laptop1page {
    WebDriver driver;
    public  Laptop1page(WebDriver driver)
    {this.driver=driver;}
    //locators
    private By Laptop1CartButton = By.xpath("//*[contains(@onclick,'8')]");
    private By HomeButton=By.xpath("(//a[@class='nav-link'])[1]");

    //actions
    public void clickOnAddToCartButton(){
        driver.findElement(Laptop1CartButton).click();
    }
    public String getAddProductText() {
        String text=driver.switchTo().alert().getText();
        return text;
    }
    public void accept1Alert(){
        driver.switchTo().alert().accept();
    }
    public HomePage clickOnHomeBtn(){
        driver.findElement(HomeButton).click();
        return new HomePage(driver);
    }
}
