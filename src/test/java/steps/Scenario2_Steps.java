package steps;
import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class Scenario2_Steps {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    SignupPage signupPage;
    CartPage cartPage;
    LaptopsfieldPage laptopsfieldPage;
    Laptop1page laptop1page;
    Laptop2page laptop2page;
    LoginPage loginPage;
    PlaceorderPage placeorderPage;

    @Given("User opens the website and press on login link")
    public void user_opens_the_website_and_press_on_login_link() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickonloginlink();
        Thread.sleep(2000);
    }

    @When("User enters valid username and password and click login")
    public void User_enters_valid_username_and_password_and_click_login() throws InterruptedException {

        loginPage = new LoginPage(driver);
        loginPage.insertUsernamee("seif131");
        loginPage.insertPasswordd("12341234");
        loginPage.clickloginButton();
        Thread.sleep(2000);
    }

    @Then("Welcome message displayed welcome username")
    public void WelcomeMessageDisplayedWelcomeUsername() throws InterruptedException {
        String actualresult = loginPage.getwelcomeusertext();
        String expectedresult = "Welcome seif131";
        Assert.assertTrue(actualresult.contains(expectedresult));
        Thread.sleep(1000);
    }

    @And("User opens the website and press on Laptop page link")
    public void userOpensTheWebsiteAndPressOnLaptopPageLink() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickonlaptopsfieldlink();
        Thread.sleep(2000);

    }

    @And("User press on laptop one page and add laptop one to cart then message alert is displayed that product is added to cart then press home btn")
    public void userPressOnLaptopOnePageAndAddLaptopOneToCartThenMessageAlertIsDisplayedThatProductIsAddedToCart() throws InterruptedException {
        laptopsfieldPage = new LaptopsfieldPage(driver);
        laptopsfieldPage.clickonproduct1page();
        Thread.sleep(2000);
        laptop1page = new Laptop1page(driver);
        laptop1page.clickonaddtocartbutton();
        Thread.sleep(2000);
        String actualresult2 = laptop1page.getaddproducttext();
        String expectedresult2 = "Product added";
        Thread.sleep(1000);
        Assert.assertTrue(actualresult2.contains(expectedresult2));
        laptop1page.accept1alert();
        laptop1page.clickonhomebtn();
        Thread.sleep(3000);
    }
    @And("User click on laptops page then press on laptop two page and add to cart and display message is displayed that product is added to cart")
    public void userClickOnLaptopsPageThenPressOnLaptopTwoPageAndAddToCartAndDisplayMessageIsDisplayedThatProductIsAddedToCart() throws InterruptedException {
        homePage=new HomePage(driver);
        Thread.sleep(1000);
        homePage.clickonlaptopsfieldlink();
        Thread.sleep(2000);
        laptopsfieldPage.clickonproduct2page();
        Thread.sleep(1000);
        laptop2page = new Laptop2page(driver);
        laptop2page.clickonaddtocartbutton();
        Thread.sleep(2000);
        String actualresult3 = laptop2page.getaddproducttext();
        String expectedresult3 = "Product added";
        Assert.assertTrue(actualresult3.contains(expectedresult3));
        laptop2page.accept2alert();
    }



    @And("User press cart button and check that the price,tittle And total price  of laptops have accurate details")
    public void userPressCartButtonAndCheckThatThePriceTittleAndTotalPriceOfLaptopsHaveAccurateDetails() throws InterruptedException {

        homePage.clickoncartlink();
        Thread.sleep(2000);
        cartPage = new CartPage(driver);
        String actualresult4 = cartPage.getlaptop1title();
        String expectedresult4 = "Sony vaio i5";
        Thread.sleep(1500);
        Assert.assertTrue(actualresult4.contains(expectedresult4));

        String actualresult5 = cartPage.getlaptop1price();
        Integer expectedresult5 = 790;
        Thread.sleep(1500);
        Assert.assertTrue(actualresult5.contains(expectedresult5.toString()));

        String actualresult6 = cartPage.getlaptop2tittle();
        String expectedresult6 = "Sony vaio i7";
        Thread.sleep(1500);
        Assert.assertTrue(actualresult6.contains(expectedresult6));

        String actualresult7 = cartPage.getlaptop2price();
        Integer expectedresult7 = 790;
        Thread.sleep(1500);
        Assert.assertTrue(actualresult7.contains(expectedresult7.toString()));

        String actualresult8 = cartPage.gettottalprice();
        Integer expectedresult8 = expectedresult5+expectedresult7;
        Thread.sleep(2000);
        Assert.assertTrue(actualresult8.contains(expectedresult8.toString()));
        Thread.sleep(1000);
    }

    @And("User press on place order button and fill all field with valid inputs then click on purchase button and display message should be displayed")
    public void userPressOnPlaceOrderButtonAndFillAllFieldWithValidInputsThenClickOnPurchaseButtonAndDisplayMessageShouldBeDisplayed() throws InterruptedException {
        // cartPage=new CartPage(driver);
        cartPage.clickonplaceorderbtn();
        Thread.sleep(2000);
        placeorderPage = new PlaceorderPage(driver);
        placeorderPage.insertPurchasenamefield("seif");
        placeorderPage.insertPurchasecountryfield("Egypt");
        placeorderPage.insertPurchasecityfield("Cairo");
        placeorderPage.insertPurchasecreditcardfield("124151242312");
        placeorderPage.insertPurchasemonthfield("11");
        placeorderPage.insertPurchaseyearfield("2022");
        Thread.sleep(2000);
        placeorderPage.clickonPurchasebutoon();
        Thread.sleep(2000);
        String actualResult = placeorderPage.getsuccessmessagetext();
        String expectedResult = "Thank you for your purchase!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}







