@smoke
Feature: The user choose new shoes on the amazon US

  Scenario: The user want to choose and see new shoes on amazon
    Given The user launch the amazon US webpage
    When The user search Shoes on this webpage
    Then Verify the page loads successfully
    And The user select a Shoe
    Then Verify selection
