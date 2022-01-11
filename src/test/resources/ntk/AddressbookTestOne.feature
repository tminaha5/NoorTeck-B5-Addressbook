Feature: ScenarioOutline demo

  Scenario Outline: verify register functionality
    Given User is on Register Page
    When User enters email "<Email>"
    And User enters password "<Password>"
    And User clicks signup button
    Then User verifies message

    Examples: 
      | Email               | Password |
      | johndoe@gmail.com   | hello    |
      | maryjames@gmail.com | hi123    |
