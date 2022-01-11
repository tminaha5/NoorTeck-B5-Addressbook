Feature: AddressbookTestTwo

  Scenario Outline: verify register functionality
    Given User is on Register Page
    When User enters email "<Email>"
    And User enters password "<Password>"
    And User clicks signin button
    And User clicks new address
    And User enters firstname "<FirstName>"
    And User enters lastname "<LastName>"
    And User enters address1 "<Address>"
    And User enters city "<City>"
    And User selects state "<State>"
    And User selects country
    And User enters age "<Age>"
    And User enters phone "<Phone>"
    And User selects common interests
    And User enters note "<Note>"
    And User clicks create address button
    And User clicks list button
    Then User verifies firstname
    And User verifies lastname
    And User verifies city
    And User verifies state

    Examples: 
      | Email               | Password | FirstName | LastName | Address           | City    | State | Age | Phone         | Note              |
      | johndoe@gmail.com   | hello123 | John      | Doe      | 123 Main Street   | Reston  | VA    |  22 | 123-2334-3434 | Automation is Fun |
      | janesmith@gmail.com | hi5643   | Jane      | Smith    | 453 Tysons Corner | Fairfax | NY    |  21 | 702-2334-1232 | Automation is Fun |
