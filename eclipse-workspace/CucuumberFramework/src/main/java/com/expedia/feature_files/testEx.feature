
Feature: Test user login feature for Expedia.com
    
  Scenario: User tries to login with valid credentails
    Given User opens expedia application
    When User clicks sign in 
    And User clicks sign in link
    And User navigates to sign in Page
    When User inserts valid email
    When User inserts valid password
     And User click sign in button
    Then User directed to login homepage
    
    Scenario: User tries to login with invalid credentails 
    	Given User opens expedia application
    And User clicks sign in 
    And User clicks sign in link
    And User navigates to sign in Page
    And User inserts invalid email
    When User inserts invalid password
     And User click sign in button
    Then User checks for error message displayed 
    

  
