Feature: Contact us of SecurePay

  @Regression @Smoke 
  Scenario: Login with valid user
    Given I am on google home page
    When I search "SecurePay" in google
    And I click on "https://www.securepay.com.au" in search result
    And I navigate to SecurePay contact us page
    Then I verify contact us page loaded
    When I fill contact us form fields
    