#Author: Radia
Feature: Validate Place API`s


@addPlace
 
 
 Scenario: validate add placeApi
    Given I Add place payload
    When user calls"AddApiPlace" with post https
    Then Api call is succesful with status code 200
    And "status" in response body is "OK"
    And "scope" inn response body is" App"
    

  
  Scenario: Verify DeletePlace is working
  Given deletPlace Payload
  #copy from previous scenario
  When user calls"deleteApiPlace" with post https
  Then the  Api call is succesful with status code 200
  And "status" in response body is "OK"
  
  