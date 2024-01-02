Feature:  Product functionality
  As a user I should search the product,verify All Products,add products in Cart,verify product quantity in cart,View category products,
  View and Cart Brand products, verify cart after login, add review on product and to add to cart from recommended items

  #TC 8    NW specific
  Scenario: User should be able to verify all products and product detail page
    Given   I am on homepage
     And    I verify homepage url
    When    I click on "Products" button on top menu tab
    Then    I verify "All Products" navigating to All products page
    When    I click on "View Product" of first product
    Then    I verify "Blue Top" name of the product
    Then    I verify "Category: Women > Tops" category of the product
    Then    I verify "Rs. 500" price
    Then    I verify "Availability: In Stock" availability
    Then    I verify "Condition: New" condition
    Then    I verify "Brand: Polo" brand

  #TC 9 Working
  Scenario: User should be able to search the Product
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    Then    I navigate to "All products" page and verify All Products Text
    When    I enter product name "Dress" in search input
    And     I click on "search" button to search the product
    Then    I verify "Searched Products" text visible
    And     I verify all the products related to search

    #TC 12 NW partially

  Scenario: User should be able to add products in Cart
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    And     I hover over on "Blue Top" first product
    And     I click on "Add To cart" button to add first product
    And     I click on "Continue Shopping " button to continue to shop
    When    I hover over on "Men Tshirt" second product
    And     I click on "Add to cart" button to add second product
    And     I click on "View cart" button to view the cart
    Then    I verify welcome text "Shopping cart" text
    Then    I verify both products added to cart
    Then    I verify "prices" prices
    And     I verify "quantity" quantity
    And     I verify "total price" total prices

    #TC 13  NW
  @sanity
  Scenario: User should be able to verify product quantity in cart
    Given   I am on homepage and I verify homepage url
    When    I click "View product" for any product on home page
    Then    I verify "product detail" is opened
    When    I increase "quantity" to 4
    And     I click on "Add to cart" button in the cart page
    And     I click on  "View Cart" pop up button
    Then    I verify product is displayed in cart page with exact quantity

    #TC 18  Working

  Scenario: User should be able to View category products
    Given   I am on homepage and I verify homepage url
    Then    I verify the "Category" text on left side bar
    When    I click on "Women" women category
    And     I click on "Dress" dress category
    Then    I navigate to other page verifying "Women-Dress Products" display text
    When    I click on "Men" men category
    And     I click on "Jeans" jeans under Men category
    Then    I can see the display text "Men-Jeans Products" visible

    #TC 19 NW

  Scenario: User should be able to View and Cart Brand products
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    Then    I verify "Brands" brands are visible on left side bar
    When    I click on "Polo" brand name
    Then    I verify "BRAND -  POLO PRODUCTS" brand polo products are displayed
    And     I click on any other brand "H&M" link
    Then    I can see the display text "BRAND - H&M PRODUCTS" H&M products

    #TC 20   NW partially

  Scenario: User should be able to search products and verify cart after login
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    Then    I navigate to "All products" page and verify All Products Text
    When    I enter product name "Dress" in search input
    And     I click on "search" button to search the product
    Then    I verify "Searched Products" text visible
    And     I verify all the products related to search
    And     I add "Long Maxi Tullie Fancy Dress Up Outfits" pink to the cart
    And     I click on "Continue Shopping " button to continue to shop
    And     I add another product "Sleeveless dress" black
    And     I click on  "View Cart" pop up button
    Then    I verify "Cart info" description details visible
    And     I click on "SignUp/Login" button in cart page
    Then    I verify "Login to your account" login text
    When    I enter "final123@gmail.com" in the email address text field
    And     I enter "finalpwd123" in the password text field
    And     I click on "Login" button
    Then    I am on homepage and I verify homepage url
    And     I click on "Cart" cart button in the homepage
    Then     I verify "Cart info" description details visible after logging in as well

    #TC 21  NW

  Scenario: User should be able to add review on product
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    Then    I navigate to "All products" page and verify All Products Text
    When    I click on "View Product" of first product
    Then    I verify "Write Your Review" review text is visible
    When    I enter "Anamica" name under review
    And     I enter "final123@gmail.com" email under review
    And     I add "Quality is good" review comments
    And     I click on "Submit" button under review
    Then    I verify the success message "Thank you for your review" thankyou

    #TC 22  Working

  Scenario: User should be able to add to cart from recommended items
    Given   I am on homepage and I verify homepage url
    When    I scroll to "Recommended Items" bottom of the page
    Then    I verify "Recommended Items" recommended items visible
    When    I click on "Add to cart" on recommended product Winter top
    And     I click on "View cart" view cart button pop up
    Then    I verify "Winter Top" displayed in cart page























