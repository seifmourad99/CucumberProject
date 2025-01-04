package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopsfieldPage {
    WebDriver driver;
    public LaptopsfieldPage(WebDriver driver) {
        this.driver=driver;}

      //locators
       private By laptop1 = By.xpath("//a[contains(text(), 'Sony vaio i5')]");
       private  By laptop2 = By.xpath("//a[contains(text(), 'Sony vaio i7')]");

       //actions

        public Laptop1page clickonproduct1page() {
            driver.findElement(laptop1).click();
            return new Laptop1page(driver);
        }
        public Laptop2page clickonproduct2page(){
           driver.findElement(laptop2).click();
           return new Laptop2page(driver);
        }

}