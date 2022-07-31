@completeDesktops
Feature: Desktops Tab

  Background: 
    Given User is on Retail Website
    When User click on Desktops tab
    And User click on Show all desktops


  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

 
  Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click ADD TO CART option on HP LP3065 item
    And User select quantity '1'
    And User click add to Cart button
    Then User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'

  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click ADD TO CART option on Canon EOS 5D item
    And User select color from dropdown Red
    And User select quantity '1'
    And User click add to Cart button
    Then User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'

  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | yourReview                         | Rating |
      | TEK User | This is not good on Friday Evening |      5 |
    And User clicks on Continue Button
    Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'
