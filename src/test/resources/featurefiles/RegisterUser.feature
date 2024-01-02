Feature: Register functionality
  As a user I should be able to register , Create ,delete my account and navigate to different pages successfully

     #TC 1 Working
  Scenario: User should navigate to "Signup" page  successfully
    Given I am on homepage
    Then  I verify homepage Url
    When  I click on "Signup/Login" button in HomePage
    And   I navigate to "SignUp/Login" page for signing in
    Then  I verify  "New User Signup!" text  is visible

    #TC 5 Working
    Scenario: User should not be able to register  with existing email
      Given I am on homepage
      Then  I verify homepage Url
      When  I click on "Signup/Login" button in HomePage
      And   I navigate to "SignUp/Login" page for signing in
      When  I enter "Anamica" into the text bar of name field
      And   I enter already registered "anamica4345@gmail.com"
      And   I click on "Signup" button after entering name and incorrect email
      Then  I should be able to see error message "Email Address already exist!"

      #TC 6 Working
  Scenario: User should be able to fill in and submit the contact form thereby navigating back  to homepage successfully
    Given I am on homepage
    Then  I verify homepage Url
    When I click on "Contact Us" button at the top right in the homepage
    Then I verify "GET IN TOUCH" display message
    And  I enter "name" into name field
    And  I enter  "email" into email field
    And  I enter "subject" into subject field
    And  I enter "message" into message field
    And  I upload "file"
    And  I click on "Submit" button in Contact Us page
    And  I click on "OK" button after Submitting
    Then I verify success message "Success! Your details have been submitted successfully."
    And  I click on "Home" button in Contact Us page
    Then I verify landing to homepage successfully

        #TC 7 Working
  Scenario: User should be able to navigate to test cases page successfully
    Given I am on homepage
    Then  I verify homepage Url
    When I click on "Test Cases" button in the  HomePage
    Then I can navigate to test cases page successfully
    And  I can verify "Test Cases" page Url for test cases


      #TC 2 Working
  Scenario: User should navigate to "Enter Account Information" page ,able to fill in all details , navigate to
            "Account Created" page and delete his account successfully
    Given I am on homepage
    Then  I verify homepage Url
    When  I click on "Signup/Login" button in HomePage
    And   I navigate to "SignUp/Login" page for signing in
    Then  I verify  "New User Signup!" text  is visible
    And   I am on "SignUp/Login" page after clicking the SignUp button
    When  I enter "name" into name text field
    And   I enter "email address" into email text field
    And   I click on "Signup" button in the SigUp page
    And   I navigate to "Enter Account Information" page for entering details
    Then  I verify "ENTER ACCOUNT INFORMATION" top text is visible
    And   I click on  radio button "Title"
    And   I enter "math4321"  in the password text box
    And   I select "Day","Month" and "Year" in Date of Birth
    And   I select  the checkbox "Sign up for our newsletter!" for newsletter
    And   I select the checkbox "Receive special offers from our partners!" for offers
    And   I enter "First name" in the first name text field
    And   I enter "Last name" in the last  name text field
    And   I enter "Company name" in the Company name text field
    And   I enter "Address" in the address bar
    And   I enter "Address 2"in the address2 bar
    And   I select "Country" in the country text field
    And   I enter "State"  in the state text field
    And   I enter "City"  in the city text field
    And   I enter "Zipcode"  in the zipcode text field
    And   I enter "Mobile Number"  in the mobile number  text field
    And   I click on "Create Account button" after filling all details
    Then  I should navigate to "Account created" page  with Account Creation
    And   I verify  "ACCOUNT CREATED!" is visible
    When  I click on "Continue" button in account created page
    Then  I verify "Logged in as username" at the top right is visible
    When  I click on  "Delete Account" button for deletion
    Then  I verify that "ACCOUNT DELETED!" is visible for successful deletion
    And   I click on "Continue" button after deleting the account











