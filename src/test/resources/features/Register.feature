Feature: Register

  @register
  Scenario: Register with Test Environment Website
    Given I am on Test Environment Home Page
    When I click on My Account button
    And i click on register link
    And i fill registration form
      | firstname | lastname | email                      | telephone  | password   | confirmPassword |
      | Chris     | Tester   | tigerstekschool9@gmail.com | 6123456265 | tigers!1!2 | tigers!1!2      |
    And i subscribe to newsletter
    And i agree to privacy policy
    And i click on continue button
    Then i validate my account is created successfully
