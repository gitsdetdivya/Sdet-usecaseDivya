#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login
 @login
 #Scenario: Login Functionality
  #Given user navigates to the website
  #When User Click on Services
   # And  close chrome driver

    
  @reg  
  #Scenario: Register Functionality
  # Given user navigates to the website
    #When User Click on Contact us
   # And  close chrome driver
    
   @test
   #Scenario: Error  Validation
   # Given user navigates to the website
    #When User validates Error Message
     #Then  close chrome driver
     
   @last
   Scenario: About us
    Given user navigates to the website
    And User Click on About us 
    #Then Print
   
  