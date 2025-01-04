package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceorderPage {
    WebDriver driver;
    public PlaceorderPage (WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private By insertpurchasenamefield = By.cssSelector("input[id=\"name\"]");
    private By insertpurchasecountryfield= By.xpath("//*[@id=\"country\"]");
    private By insertpurchasecityfield= By.xpath("//*[@id=\"city\"]");
    private By insertpurchasecreditcardfield= By.xpath("//*[@id=\"card\"]");
    private By insertpurchasemonthfield= By.xpath("//*[@id=\"month\"]");
    private By insertpurchaseyearfield= By.xpath("//*[@id=\"year\"]");
    private By purchasebutton= By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary");
    private By successpurchase= By.xpath("(//h2)[3]");

    //actions
    public void insertPurchasenamefield(String name){
        driver.findElement(insertpurchasenamefield).sendKeys(name);
    }
    public void insertPurchasecountryfield(String country) {
        driver.findElement(insertpurchasecountryfield).sendKeys(country);
    }
    public void insertPurchasecityfield(String city){
        driver.findElement(insertpurchasecityfield).sendKeys(city);
    }
    public void insertPurchasecreditcardfield(String creditcard){
        driver.findElement(insertpurchasecreditcardfield).sendKeys(creditcard);
    }
    public void insertPurchasemonthfield(String month){
        driver.findElement(insertpurchasemonthfield).sendKeys(month);
    }
    public void insertPurchaseyearfield(String year){
        driver.findElement(insertpurchaseyearfield).sendKeys(year);
    }
    public void clickonPurchasebutoon() {
        driver.findElement(purchasebutton).click();
    }

    public String getsuccessmessagetext(){
        String text = driver.findElement(successpurchase).getText();
        return text;
    }
}