@B29G4-161
Feature: Default

  Background:
    Given user is on the login page



  @B29G4-145
  Scenario Outline: User can access the "Add Event" page by  clicking on any vehicle/row under Fleet-Vehicle module
    Given user logged in as "<userType>"
    When "<userType>" hovers over Fleet module
    Then "<userType>" clicks on Vehicles submodule
    Then "<userType>" clicks on any vehicle-row
    And "<userType>" sees Add Event button

    Examples: user type values we are going to be using for this scenario outlines
      | userType      |
      | sales manager |
      | store manager |

  @B29G4-148
  Scenario Outline: After clicking on "Add event" button, "Add Event" page should pop up.
    Given user logged in as "<userType>"
    When "<userType>" hovers over Fleet module
    Then "<userType>" clicks on Vehicles submodule
    Then "<userType>" clicks on any vehicle-row
    Given "<userType>" clicks on Add Event button
    Then "<userType>" sees Add Event page pops up

    Examples: user type values we are going to be using for this scenario outlines
      | userType       |
      | sales manager  |
      | store manager  |

  @B29G4-151
  Scenario Outline: User can mark the event with any color
    Given user logged in as "<userType>"
    When "<userType>" hovers over Fleet module
    Then "<userType>" clicks on Vehicles submodule
    Then "<userType>" clicks on any vehicle-row
    Given "<userType>" clicks on Add Event button
    When "<userType>" clicks on each color


    Examples: user type values we are going to be using for this scenario outlines
      | userType      |
      | sales manager |
      | store manager |

  @B29G4-157
  Scenario Outline: User can click "All-day event" on the "Add Event" pop-up
    Given user logged in as "<userType>"
    When "<userType>" hovers over Fleet module
    Then "<userType>" clicks on Vehicles submodule
    Then "<userType>" clicks on any vehicle-row
    Given "<userType>" clicks on Add Event button
    When "<userType>" clicks on All-day event
    Then "<userType>" sees All-day option is clicked

    Examples: user type values we are going to be using for this scenario outlines
      | userType      |
      | sales manager |
      | store manager |


  @B29G4-159
  Scenario Outline: User can repeat the action by specifying occurrence periods and ending time:
  a)Repeat options should include the options: -> "Daily", "Weekly", "Monthly", "Yearly"
    Given user logged in as "<userType>"
    When "<userType>" hovers over Fleet module
    Then "<userType>" clicks on Vehicles submodule
    Then "<userType>" clicks on any vehicle-row
    Given "<userType>" clicks on Add Event button
    When "<userType>" clicks on Repeat option
    And "<userType>" selects "<repeatPeriods>"
    Then "<userType>" sees "<expectedValue>" is clicked

    Examples: option values we are going to be using in this scenario outline
      | repeatPeriods | expectedValue | userType|
      | Daily         | Daily         | store manager |
      | Daily         | Daily         | sales manager |
      | Weekly        | Weekly        | store manager |
      | Weekly        | Weekly        | sales manager |
      | Monthly       | Monthly       | store manager |
      | Monthly       | Monthly       | sales manager |
      | Yearly        | Yearly        | store manager |
      | Yearly        | Yearly        | sales manager |