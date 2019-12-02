Feature: Login
  	As a user  of MCT Website i can do a login 
  	SO i can  do all loggedin activities

  Scenario: User can do a login with valid credentials
    Given I am on MCT home page
    When I complete login with valid Credentails
    Then I see my profile name as James Williams

  Scenario: User can do a Log Out
    Given I am on MCT home page
    When I complete login with valid Credentails
    And I do a log out
    Then I see my profile name as null
