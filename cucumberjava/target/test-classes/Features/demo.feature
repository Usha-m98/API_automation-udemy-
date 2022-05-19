
Feature: Guru99 login page
  
 
  Scenario: Register on guru99 with email
    Given User is on home page
    When User provide email id
    And User click on submit button
    Then Page should display the login details
    
 Scenario: Register on guru99 without email
    Given User is on home page
    When User will provide blank email id
    And User click on submit button
    Then Page should display the error message