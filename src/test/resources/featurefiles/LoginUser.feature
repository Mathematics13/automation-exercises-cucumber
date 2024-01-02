Feature: Login functionality
  As a user I should be able to login and logout successfully

    #TC 3 Working
  @sanity
  Scenario: User should not be able to login successfully with incorrect email address and password
    Given I am on homepage
    Then  I verify homepage Url
    When  I click on "Signup / Login" on top right
    Then  I verify "Login to your account" login text
    When  I enter "dummy456@gmail.com" incorrect  in the email address text field
    And   I enter "dummy456" incorrect in the password text field
    And   I click on "Login" button
    Then  I should be able to see the "Your email or password is incorrect!' "


        #TC 4 Working
  @smoke
  Scenario: User should be able to log out successfully
    Given I am on homepage
    Then  I verify homepage Url
    When  I click on "Signup / Login" on top right
    Then  I verify "Login to your account" login text
    When  I enter "final123@gmail.com" in the email address text field
    And   I enter "finalpwd123" in the password text field
    And   I click on "Login" button
    Then  I verify "Logged in as final123" logged in as username is visible
    When  I click on "Log Out" button to logOut
    And   I  can verify "Login Page" Url
