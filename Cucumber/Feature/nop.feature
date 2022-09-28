
Feature: Test register and login for NOP
 
Background:

Given open chrome and open url
 
  Scenario: Test the resister functionality
      When Input valid information
      Then Registration complete and close driver
      
      
 Scenario: Login Test valid
 			When login with valid credential
 			Then Login with Valid info and close driver
 			
   Scenario: Login Test invalid
 			When login with invalid credential
 			Then Login with inValid info and close driver 
 			
 		Scenario: Login Test Null
 			When login with Null credential
 			Then Login with Null info and close driver    
 
      
  