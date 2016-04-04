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
    And After checking the values I want to go back to the main page

  Scenario: Fill in form on website with all data
    Given That the website is running and I navigated to it
    When I fill in my firstName with "jozef22"
    And I fill in my lastName with "test"
    And I fill in my StreetName with "testStreet"
    And I fill in my HouseNumber with "11"
    And I fill in my Zipcode with "1111AA"
    And I hit the submit button
    Then I should see my name and address data on the next page and it is also saved
    And After checking the values I want to go back to the main page

  Scenario Outline: test
    Given That the website is running and I navigated to it
    When I fill in my firstName with "<firstname>"
    And I fill in my lastName with "<lastname>"
    And I fill in my StreetName with "<streetname>"
    And I fill in my HouseNumber with "<housenumber>"
    And I fill in my Zipcode with "<zip>"
    And I hit the submit button
    Then I should see my name and address data on the next page and it is also saved
    And After checking the values I want to go back to the main page
    And The browser should be closed
    Examples:
      | firstname | lastname | streetname  | housenumber | zip    |
      | jozef     | Bilkes   | Test Straat | 29          | 1121AX |
      | vincent   | Free     | Zonnelaan   | 221         | 9742BE |