@B29US130
Feature: Sales manager and store manager should see the detailed information of a specific vehicle

  Background:
    Given User is on the login page

  Scenario Outline:  As a user, I should be able to see the detailed information of a specific vehicle
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    When user click on a vehicle row
    Then user sees general information page
    When  user hover over on "<tab>"
    And user click on "<module>" module
    When user hover over at the end of each row
    And user click on eye icon
    Then user sees general information page
    When user is on general information page
    Then user sees to edit, delete and add event buttons

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|
