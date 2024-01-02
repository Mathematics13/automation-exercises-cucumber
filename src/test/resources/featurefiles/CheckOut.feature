Feature: CheckOut Functionality
  As a user I should be able to register while checkout, before checkout ,login before Checkout,to remove products from cart
  and  to verify address details in checkout page

  #TC 14  NW
  Scenario: User should be able to place order ,register while checkout
    Given   I am on homepage and I verify homepage url
    And     I hover over first product Blue Top
    When    I add first product "Blue Top" to the cart
    And     I click on "View Cart" to view items added in the cart
    Then    I verify "cart page" displayed with descriptions
    When    I click on "Proceed to checkout" to checkout
    And     I click on "Register/Login" button in proceed to checkout
    Then    I verify  "New User Signup!" new user sign up text  is visible
    When    I enter "mathrobot" name into name text field
    And     I enter "mathrobot@gmail.com" email into email text field
    And     I click on "Signup" signup button in the SigUp page
    Then    I verify "ENTER ACCOUNT INFORMATION" enter account information top text is visible
    And     I click on  radio button "Title" to select MR
    And     I enter "mathst987"  password in the password text box
    And     I select "17","October" and "2012" in day ,month and year Date of Birth
    And     I select  the checkbox "Sign up for our newsletter!" to tick for newsletter
    And     I select the checkbox "Receive special offers from our partners!" to avail for offers
    And     I enter "Kilimanjaro" name in the first name text field
    And     I enter "Rajni" name in the last  name text field
    And     I enter "Tata Consultancy Service"  TCS in the Company name text field
    And     I enter "B67 TVS Nagar" address in the address bar
    And     I enter "Kajamalai" address2 in the address2 bar
    And     I select "India" India in the country text field
    And     I enter "Tamil Nadu" state in the state text field
    And     I enter "Chennai" chennai in the city text field
    And     I enter "620006" code in the zipcode text field
    And     I enter "98654 67895"  mobile number in the mobile number  text field
    And     I click on "Create Account button" to create after filling all details
    Then    I verify  "ACCOUNT CREATED!" verifying account creation is visible
    When    I click on "Continue" button of account creation in account created page
    Then    I verify "Logged in as mathrobot" at the top right corner is visible
    And     I click on "Cart" cart button in the homepage
    When    I click on "Proceed to checkout" to checkout
    Then    I verify "Address details" address
    Then    I verify "Review your Order" review order
    And     I enter description "If any size discrepancy will exchange.Thanks" in comment text area
    And     I click on "Place Order" to place the order
    When    I enter payment details "Name on Card" name
    And     I enter "Card number" card number
    And     I enter "CVC" cvc number
    And     I enter "expiration date" expiry date
    And     I click on "Pay and Confirm Order" to pay and confirm button
    Then    I verify success message "Your order has been placed successfully!" Congratulations! Your order has been confirmed!
    When    I click on  "Delete Account" button in the home page for deletion
    Then    I verify that "ACCOUNT DELETED!" is visible for deletion
    And     I click on "Continue" button after successful  deletion

    #TC 15 Partially works
  @sanity
  Scenario: User should be able to place order , register before checkout
    Given   I am on homepage and I verify homepage url
    When    I click on "Signup/Login" button in HomePage
    Then    I verify  "New User Signup!" text  is visible
    When    I enter "mathrobot" into name text field
    And     I enter "mathrobot@gmail.com" into email text field
    And     I click on "Signup" button in the SigUp page
    Then    I verify "ENTER ACCOUNT INFORMATION" top text is visible
    And     I click on  radio button "Title"
    And     I enter "math4321"  in the password text box
    And     I select "17","October" and "2022" in Date of Birth
    And     I select  the checkbox "Sign up for our newsletter!" for newsletter
    And     I select the checkbox "Receive special offers from our partners!" for offers
    And     I enter "Kilimanjaro" in the first name text field
    And     I enter "Rajni" in the last  name text field
    And     I enter "TCS" in the Company name text field
    And     I enter "B67 TVS Nagar" in the address bar
    And     I enter "Kajamalai"in the address2 bar
    And     I select "India" in the country text field
    And     I enter "Tamil Nadu"  in the state text field
    And     I enter "Chennai"  in the city text field
    And     I enter "62006"  in the zipcode text field
    And     I enter "98765 43267"  in the mobile number  text field
    And     I click on "Create Account button" after filling all details
    Then    I should navigate to "Account created" page  with Account Creation
    And     I verify  "ACCOUNT CREATED!" is visible
    When    I click on "Continue" button in account created page
    Then    I verify "Logged in as mathrobot" at the top right is visible
    And     I hover over first product Blue Top
    When    I add first product "Blue Top" to the cart
    And     I click on "View Cart" to view items added in the cart
    Then    I verify "cart page" displayed with descriptions
    When    I click on "Proceed to checkout" to checkout
    Then    I verify "Address details" address
    Then    I verify "Review your Order" review order
    And     I enter description "If any size discrepancy will exchange.Thanks" in comment text area
    And     I click on "Place Order" to place the order
    When    I enter payment details "Name on Card" name
    And     I enter "Card number" card number
    And     I enter "CVC" cvc number
    And     I enter "expiration date" expiry date
    And     I click on "Pay and Confirm Order" to pay and confirm button
    Then    I verify success message "Your order has been placed successfully!" Congratulations! Your order has been confirmed!
    When    I click on  "Delete Account" button in the home page for deletion
    Then    I verify that "ACCOUNT DELETED!" is visible for deletion
    And     I click on "Continue" button after successful  deletion

    #TC 16  NW partially
  Scenario: User should be able to place order, login before checkout
    Given   I am on homepage and I verify homepage url
    When    I click on "Signup / Login" on top right
    Then    I verify "Login to your account" login text
    When    I enter "final123@gmail.com" in the email address text field
    And     I enter "finalpwd123" in the password text field
    And     I click on "Login" button
    Then    I verify "Logged in as final123" logged in as username is visible
    When    I click on products button
    Then    I navigate to "All products" page and verify All Products Text
    And     I hover over on "Blue Top" first product
    And     I click on "Add To cart" button to add first product
    And     I click on  "View Cart" pop up button
    Then    I verify welcome text "Shopping cart" text
    When    I click on "Proceed to checkout" to checkout
    Then    I verify "Address details" address
    Then    I verify "Review your Order" review order
    And     I enter description "If any size discrepancy will exchange.Thanks" in comment text area
    And     I click on "Place Order" to place the order
    When    I enter payment details "Name on Card" name
    And     I enter "Card number" card number
    And     I enter "CVC" cvc number
    And     I enter "expiration date" expiry date
    And     I click on "Pay and Confirm Order" to pay and confirm button
    Then    I verify success message "Your order has been placed successfully!" Congratulations! Your order has been confirmed!
    When    I click on  "Delete Account" button in the home page for deletion
    Then    I verify that "ACCOUNT DELETED!" is visible for deletion
    And     I click on "Continue" button after successful  deletion

    #TC 17 Working partially

  Scenario: User should be able to remove products from cart
    Given   I am on homepage and I verify homepage url
    When    I click on products button
    And     I hover over on "Sleeveless dress" sleeveless dress
    And     I click on "Add to Cart" add to cart button of sleeveless dress
    And     I click on "View Cart" button window pop up
    Then    I verify "Shopping cart" welcome text
    When    I click on "X" cross button corresponding to particular product to delete
    Then    I should be able to see the text "Cart is empty!" cart empty  message

    #TC 23 Working most

  Scenario: User should be able to verify address details in checkout page
    Given I am on homepage
    Then  I verify homepage Url
    When  I click on "Signup/Login" button in HomePage
    And   I navigate to "SignUp/Login" page for signing in
    Then  I verify  "New User Signup!" text  is visible
    And   I am on "SignUp/Login" page after clicking the SignUp button
    When  I enter new name "salar" into name text field
    And   I enter new email "salar123@gmail.com" into email text field
    And   I click on "Signup" button in the SigUp page
    And   I navigate to "Enter Account Information" page for entering details
    Then  I verify "ENTER ACCOUNT INFORMATION" top text is visible
    And   I click on  radio button "Mrs."
    And   I enter "salar123"  in the password text box
    And   I select "23","January" and "2007" in Date of Birth
    And   I select  the checkbox "Sign up for our newsletter!" for newsletter
    And   I select the checkbox "Receive special offers from our partners!" for offers
    And   I enter "Salar" in the first name text field
    And   I enter "Kodi" in the last  name text field
    And   I enter "CTS" in the Company name text field
    And   I enter "28,Guntur" in the address bar
    And   I enter "Tirupati Street"in the address2 bar
    And   I select "India" in the country text field
    And   I enter "Andhra Pradesh"  in the state text field
    And   I enter "Tirupati"  in the city text field
    And   I enter "620009"  in the zipcode text field
    And   I enter "+9199765 32451"  in the mobile number  text field
    And   I click on "Create Account button" after filling all details
    Then  I should navigate to "Account created" page  with Account Creation
    And   I verify  "ACCOUNT CREATED!" is visible
    When  I click on "Continue" button in account created page
    Then  I verify "Logged in as salar" at the top right is visible
    And   I add "Madame Top For Women" madame top to the cart
    And   I click on "view cart" button to view the product added
    Then  I verify "Madame Top For Women" displayed in cart is visible
    When  I click on "Proceed to checkout" to checkout
    Then  I verify "Mrs. Salar Kodi CTS 28,Guntur Tirupati Street Tirupati Andhra Pradesh  620009 India 9199765 32451" delivery address
    Then  I verify "Mrs. Salar Kodi CTS 28,Guntur Tirupati Street Tirupati Andhra Pradesh  620009 India 9199765 32451" billing address
    When  I click on  "Delete Account" button in the home page for deletion
    Then  I verify that "ACCOUNT DELETED!" is visible for deletion
    And   I click on "Continue" button after successful  deletion

    #TC 24 NW
  @smoke
  Scenario: User should be able to download invoice after purchase order
    Given I am on homepage and I verify homepage url
    And   I add "Madame Top For Women" madame top to the cart
    And   I click on "view cart" button to view the product added
    Then  I verify "Madame Top For Women" displayed in cart is visible
    When  I click on "Proceed to checkout" to checkout
    And   I click on "Register/Login" button in proceed to checkout
    Then  I verify  "New User Signup!" new user sign up text  is visible
    When  I enter new name "chemath" into name text field
    And   I enter new email "chemath@gmail.com" into email text field
    And   I click on "Signup" signup button in the SigUp page
    Then  I verify "ENTER ACCOUNT INFORMATION" enter account information top text is visible
    And   I click on  radio button "Title" to select MR
    And   I enter "chemst987"  password in the password text box
    And   I select "17","October" and "2012" in day ,month and year Date of Birth
    And   I select  the checkbox "Sign up for our newsletter!" to tick for newsletter
    And   I select the checkbox "Receive special offers from our partners!" to avail for offers
    And   I enter "Chemath" name in the first name text field
    And   I enter "Phybio" name in the last  name text field
    And   I enter "Tata Consultancy Service"  TCS in the Company name text field
    And   I enter "B67 TVS Nagar" address in the address bar
    And   I enter "Kajamalai" address2 in the address2 bar
    And   I select "India" India in the country text field
    And   I enter "Tamil Nadu" state in the state text field
    And   I enter "Chennai" chennai in the city text field
    And   I enter "620006" code in the zipcode text field
    And   I enter "98654 67895"  mobile number in the mobile number  text field
    And   I click on "Create Account button" to create after filling all details
    Then  I verify  "ACCOUNT CREATED!" verifying account creation is visible
    When  I click on "Continue" button of account creation in account created page
    Then  I verify "Logged in as chemath" at the top right corner is visible
    And   I click on "Cart" cart button in the homepage
    When  I click on "Proceed to checkout" to checkout
    Then  I verify "Address details" address
    Then  I verify "Review your Order" review order
    And   I enter description "If any size discrepancy will exchange.Thanks" in comment text area
    And   I click on "Place Order" to place the order
    When  I enter payment details "KamalHasan" name
    And   I enter "4567 3245 8765 9876" card number
    And   I enter "312" cvc number
    And   I enter "expiration date" expiry date
    And   I click on "Pay and Confirm Order" to pay and confirm button
    Then  I verify success message "Your order has been placed successfully!" Congratulations! Your order has been confirmed!
    When  I click on "Download Invoice" button to download
    And   I click on "Continue" button to continue after invoice downloading
    When  I click on  "Delete Account" button in the home page for deletion
    Then  I verify that "ACCOUNT DELETED!" is visible for deletion
    And   I click on "Continue" button after successful  deletion

















