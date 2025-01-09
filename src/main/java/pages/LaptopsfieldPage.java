package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopsfieldPage {
    WebDriver driver;
    public LaptopsfieldPage(WebDriver driver) {
        this.driver=driver;}

    //locators
    private By Laptop1 = By.xpath("//a[contains(text(), 'Sony vaio i5')]");
    private  By Laptop2 = By.xpath("//a[contains(text(), 'Sony vaio i7')]");

    //actions

    public Laptop1page clickOnProduct1Page() {
        driver.findElement(Laptop1).click();
        return new Laptop1page(driver);
    }
    public Laptop2page clickOnProduct2Page(){
        driver.findElement(Laptop2).click();
        return new Laptop2page(driver);
    }

}