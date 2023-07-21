@B29US128
Feature: Store Manager and Sales Manager should be able to add event
  User Story: As a store manager and sales manager, I should be able to add an event

  Background:
    Given user is on the login page


  @US128AC1
  Scenario Outline: US128AC1 Add event page access scenario outline
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button
    Then user can access the "Add Event" page

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|



 @US128AC2-1
  Scenario Outline: US128AC2 Add event button functionality
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|



 @US128AC2-2
  Scenario: US128AC2 Add event button functionality
    Given user logged in as "driver"
    When user hover over on "Fleet"
    And user click on "Vehicle" module
    And user click on vehicle row
    Then user do not see "Add Event" button

@US128AC3
  Scenario Outline: US128AC3 Add event page should pop up
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button
    Then "Add Event" page should pop up

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|

  @US128AC4
  Scenario Outline: US128AC4 Compulsory fields verification
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button
    Then user see compulsory fields below:
      | Title                  |
      | Owner                  |
      | Organizer display name |
      | Organizer email        |
      | Start Date             |
      | End Date               |

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|

     @US128AC5
  Scenario Outline: US128AC5 Add event button functionality
    Given user logged in as "<userType>"
    When  user hover over on "<tab>"
    And user click on "<module>" module
    And user click on vehicle row
    Then user click "Add Event" button
    Then user click Save button
    Then user sees "This value should not be blank." message

    Examples:
      | userType      | tab  | module|
      | store manager | Fleet| Vehicle|
      | sales manager | Fleet| Vehicle|









