@completeRetail
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company   | website          | taxID     | paymentMethod | payeeName    |
      | Apex Inc. | www.tekschool.us | 111223333 | Cheque        | Chris Tester |
    And User check on About us check box
    And User clicks on Continue button
    Then User should see a Success Message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName        | abaNumber | swiftCode | accountName | accountNumber |
      | Bank of America |    654321 |    898989 | Checking    |      87654321 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | Christopher | Tester | tigerstekschool9@gmail.com | 6129876543 |
    And User click on continue button
    Then User should observe a success message 'Success: Your account has been successfully updated.'
