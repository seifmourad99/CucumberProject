package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceorderPage {
    WebDriver driver;
    public PlaceorderPage (WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By InsertPurchaseNameField = By.xpath("//input[@id='name']");
    private By InsertPurchaseCountryField= By.xpath("//input[@id='country']");
    private By InsertPurchaeCityField= By.xpath("//input[@id='city']");
    private By InsertPurchaseCreditCardField= By.xpath("//input[@id='card']");
    private By InsertPurchaseMonthField= By.xpath("//input[@id='month']");
    private By InsertPurchaseYearField= By.xpath("//input[@id='year']");
    private By PurchaseButton= By.xpath("//*[contains(@onclick,'purchase')]");
    private By SuccessPurchase= By.xpath("(//h2)[3]");

    //actions
    public void insertPurchaseNameField(String name){
        driver.findElement(InsertPurchaseNameField).sendKeys(name);
    }
    public void insertPurchaseCountryField(String country) {
        driver.findElement(InsertPurchaseCountryField).sendKeys(country);
    }
    public void insertPurchaseCityField(String city){
        driver.findElement(InsertPurchaeCityField).sendKeys(city);
    }
    public void insertPurchaseCreditCardField(String creditcard){
        driver.findElement(InsertPurchaseCreditCardField).sendKeys(creditcard);
    }
    public void insertPurchaseMonthField(String month){
        driver.findElement(InsertPurchaseMonthField).sendKeys(month);
    }
    public void insertPurchaseYearField(String year){
        driver.findElement(InsertPurchaseYearField).sendKeys(year);
    }
    public void purchaseButton() {
        driver.findElement(PurchaseButton).click();
    }

    public String getSuccessMessageText(){
        String text = driver.findElement(SuccessPurchase).getText();
        return text;
    }
}