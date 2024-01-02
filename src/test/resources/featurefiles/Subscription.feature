Feature: Subscription functionality
  As a user I should be able to subscribe ,Scroll Up and down with and without  'Arrow' button successfully

  #TC 10 Working
  Scenario: User should be able to verify Subscription in home page
    Given   I am on homepage and I verify homepage url
    When    I scroll down to "Subscription" footer
    Then    I verify "Subscription" text at the footer
    When    I enter "final123@gmail.com" in the email textfield
    And     I click on "arrow" button in subscription
    Then    I verify success message "You have been successfully subscribed!" in subscription

    #TC 11 Working
  @sanity
  Scenario: User should be able to Verify Subscription in Cart Page
    Given   I am on homepage and I verify homepage url
    When    I click on "cart" Cart button
    And     I scroll down to footer
    Then    I verify text "Subscription" SUBSCRIPTION
    When    I enter "final123@gmail.com" in email address field in cart page
    And     I click on arrow button
    Then    I verify "You have been successfully subscribed!" success message of Subscription under cart visible

    #TC 25 Working

  Scenario: User should be able to Scroll Up using 'Arrow' button and Scroll Down functionality
    Given   I am on homepage and I verify homepage url
    When    I scroll down to "Subscription" footer
    Then    I verify "Subscription" text at the footer
    When    I click on arrow at bottom right side to move upward scroll up
    Then    I verify "Full-Fledged practice website for Automation Engineers" text is visible on screen

    #TC 26 Working
  @smoke
  Scenario: User should be able to Scroll Up without 'Arrow' button and Scroll down functionality
    Given   I am on homepage and I verify homepage url
    When    I scroll down to "Subscription" footer
    Then    I verify "Subscription" text at the footer
    When    I "Scroll up" scroll up page to top
    Then    I verify "Full-Fledged practice website for Automation Engineers" text is visible on screen