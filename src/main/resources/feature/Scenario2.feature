Feature: Verify that Two Products Are Purchased Successfully

  Scenario: Verify that we successfully Purchased 2 Laptops
    Given User opens the website and press on login link
    When User enters valid username and password and click login
    Then Welcome message displayed welcome username
    And  User opens the website and press on Laptop page link
    And User press on laptop one page and add laptop one to cart then message alert is displayed that product is added to cart then press home btn
    And User click on laptops page then press on laptop two page and add to cart and display message is displayed that product is added to cart
    And User press cart button and check that the price,tittle And total price  of laptops have accurate details
    And User press on place order button and fill all field with valid inputs then click on purchase button and display message should be displayed

