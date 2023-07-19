@B29US128
Feature: Store Manager and Sales Manager should be able to add event
  User Story: As a store manager and sales manager, I should be able to add an event

  Background:
    Given user is on the login page
@US128TC1
  Scenario Outline: US128AC1 Add event as a store manager
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button
    Then user sees "Add Event" in the title

    Examples:
    | userType      | tab  | module|
    | store manager | Fleet| Vehicle|
    | sales manager | Fleet| Vehicle|
