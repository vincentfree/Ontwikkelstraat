Feature: FormController

  Scenario: Fill in form on website
    Given That the website is running and I navigated to it
    When I fill in my firstName with "jozef22"
    And I fill in my lastName
    And I fill in my StreetName
    And I fill in my HouseNumber
    And I fill in my Zipcode
    And I hit the submit button
    Then I should see my name and address data on the next page and it is also saved
    And The browser should be closed

  Scenario Outline: test
    Given That the website is running and I navigated to it
    When I fill in my firstName with "<firstname>"
    Then The browser should be closed
    Examples:
    |firstname|
    |jozef    |
    |vincent  |