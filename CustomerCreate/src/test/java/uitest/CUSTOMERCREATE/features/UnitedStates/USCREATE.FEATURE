#Author: mohammad.danish1@ibm.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step

@tag
Feature: USCreate Request
  I want to use this Script for Create Request for UnitedState in CustomerCreate

   @cp1tc01
  Scenario: Logon_CreateCMR_Positive_Testing_TC01
    Given user enters url to launch the CreateCMR application
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
