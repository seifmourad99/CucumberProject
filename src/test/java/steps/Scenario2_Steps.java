package steps;
import pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class Scenario2_Steps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;

    CartPage cartPage;
    LaptopsfieldPage laptopsfieldPage;
    Laptop1page laptop1page;
    Laptop2page laptop2page;
    LoginPage loginPage;
    PlaceorderPage placeorderPage;

    @Given("User opens the website and press on login link")
    public void user_opens_the_website_and_press_on_login_link() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickonLoginLink();
        Thread.sleep(2000);
    }

    @When("User enters valid username and password and click login")
    public void User_enters_valid_username_and_password_and_click_login() throws InterruptedException {

        loginPage = new LoginPage(driver);
        loginPage.insertUsernamee("seif131");
        loginPage.insertPasswordd("12341234");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
    }

    @Then("Welcome message displayed welcome username")
    public void WelcomeMessageDisplayedWelcomeUsername() throws InterruptedException {
        String actualresult = loginPage.getWelcomeUserText();
        String expectedresult = "Welcome seif131";
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(1000);
    }

    @And("User opens the website and press on Laptop page link")
    public void userOpensTheWebsiteAndPressOnLaptopPageLink() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickOnLaptopsFieldLink();
        Thread.sleep(2000);

    }

    @And("User press on laptop one page and add laptop one to cart then message alert is displayed that product is added to cart then press home btn")
    public void userPressOnLaptopOnePageAndAddLaptopOneToCartThenMessageAlertIsDisplayedThatProductIsAddedToCart() throws InterruptedException {
        laptopsfieldPage = new LaptopsfieldPage(driver);
        laptopsfieldPage.clickOnProduct1Page();
        Thread.sleep(2000);
        laptop1page = new Laptop1page(driver);
        laptop1page.clickOnAddToCartButton();
        Thread.sleep(2000);
        String actualresult2 = laptop1page.getAddProductText();
        String expectedresult2 = "Product added";
        Thread.sleep(1000);
        Assert.assertTrue(actualresult2.contains(expectedresult2));
        laptop1page.accept1Alert();
        laptop1page.clickOnHomeBtn();
        Thread.sleep(3000);
    }
    @And("User click on laptops page then press on laptop two page and add to cart and display message is displayed that product is added to cart")
    public void userClickOnLaptopsPageThenPressOnLaptopTwoPageAndAddToCartAndDisplayMessageIsDisplayedThatProductIsAddedToCart() throws InterruptedException {
        homePage=new HomePage(driver);
        Thread.sleep(1000);
        homePage.clickOnLaptopsFieldLink();
        Thread.sleep(2000);
        laptopsfieldPage.clickOnProduct2Page();
        Thread.sleep(1000);
        laptop2page = new Laptop2page(driver);
        laptop2page.clickOnAddToCartButton2();
        Thread.sleep(2000);
        String actualresult3 = laptop2page.getAddProductText();
        String expectedresult3 = "Product added";
        Assert.assertTrue(actualresult3.contains(expectedresult3));
        laptop2page.accept2Alert();
    }



    @And("User press cart button and check that the price,tittle And total price  of laptops have accurate details")
    public void userPressCartButtonAndCheckThatThePriceTittleAndTotalPriceOfLaptopsHaveAccurateDetails() throws InterruptedException {

        homePage.clickOnCartLink();
        Thread.sleep(2000);
        cartPage = new CartPage(driver);
        String actualresult4 = cartPage.getLaptop1Title();
        String expectedresult4 = "Sony vaio i5";
        Thread.sleep(1500);
        Assert.assertTrue(actualresult4.contains(expectedresult4));

        String actualresult5 = cartPage.getLaptop1Price();
        Integer expectedresult5 = 790;
        Thread.sleep(1500);
        Assert.assertTrue(actualresult5.contains(expectedresult5.toString()));

        String actualresult6 = cartPage.getLaptop2Tittle();
        String expectedresult6 = "Sony vaio i7";
        Thread.sleep(1500);
        Assert.assertTrue(actualresult6.contains(expectedresult6));

        String actualresult7 = cartPage.getLaptop2Price();
        Integer expectedresult7 = 790;
        Thread.sleep(1500);
        Assert.assertTrue(actualresult7.contains(expectedresult7.toString()));

        String actualresult8 = cartPage.getTotalPrice();
        Integer expectedresult8 = expectedresult5+expectedresult7;
        Thread.sleep(2000);
        Assert.assertTrue(actualresult8.contains(expectedresult8.toString()));
        Thread.sleep(1000);
    }

    @And("User press on place order button and fill all field with valid inputs then click on purchase button and display message should be displayed")
    public void userPressOnPlaceOrderButtonAndFillAllFieldWithValidInputsThenClickOnPurchaseButtonAndDisplayMessageShouldBeDisplayed() throws InterruptedException {
        // cartPage=new CartPage(driver);
        cartPage.clickOnPlaceOrderbtn();
        Thread.sleep(2000);
        placeorderPage = new PlaceorderPage(driver);
        placeorderPage.insertPurchaseNameField("seif");
        placeorderPage.insertPurchaseCountryField("Egypt");
        placeorderPage.insertPurchaseCityField("Cairo");
        placeorderPage.insertPurchaseCreditCardField("124151242312");
        placeorderPage.insertPurchaseMonthField("11");
        placeorderPage.insertPurchaseYearField("2022");
        Thread.sleep(2000);
        placeorderPage.purchaseButton();
        Thread.sleep(2000);
        String actualResult = placeorderPage.getSuccessMessageText();
        String expectedResult = "Thank you for your purchase!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}







