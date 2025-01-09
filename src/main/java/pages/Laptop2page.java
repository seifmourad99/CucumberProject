package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laptop2page {
    WebDriver driver;

    public Laptop2page(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By Laptop2CartButton = By.xpath("//a[@onclick='addToCart(9)']");


    //actions
    public void clickOnAddToCartButton2() {
        driver.findElement(Laptop2CartButton).click();
    }

    public String getAddProductText() {
        String text = driver.switchTo().alert().getText();
        return text;
    }

    public void accept2Alert() {
        driver.switchTo().alert().accept();
    }



}

