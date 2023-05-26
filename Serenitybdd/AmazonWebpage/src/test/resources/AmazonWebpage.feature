@amazonWebpage
Feature: Validate the functionalities available on Amazon webpage.

  Background: Open browser and open link
    Given Given user launched the chrome browser
    Then User is on Amazon base Page

 
  @Scenario1
  Scenario:Verify user is able to login
    Given User on the Amazon home page
    When User click signin button to login and entered details.
    And Get the Signin Status
    Then close browser

  @Scenario2
  Scenario:Verify user is able to Signup
    Given User on the Amazon home page
    When Signin fails so register to signup
    And Get the Signup Status
    Then close browser


  @Scenario3
  Scenario:Verify user is able to change language
    Given User on the Amazon home page
    When User click language button
    And Get the language Status
    Then close browser

  @Scenario4
  Scenario:Verify user is able to login
    Given User on the Amazon home page
    When User click cart button
    And Get the cart Status
    Then close browser

  @Scenario5
  Scenario:Verify user is able to set Address
    Given User on the Amazon home page
    When User click Address bar and set my pincode
    And Get the Address Status
    Then close browser


  @Scenario6
  Scenario:Verify user is able to acsess customer service
    Given User on the Amazon home page
    When User click customer service button
    And Get the Custo service Status
    Then close browser

  @Scenario7
  Scenario:Verify user is able to view today's deal
    Given User on the Amazon home page
    When User click today's deal button
    And Get the deal of the day Status
    Then close browser

  @Scenario8
  Scenario:Verify user is able to see all categories
    Given User on the Amazon home page
    When User click category dropdown box
    And Get the category Status
    Then close browser








