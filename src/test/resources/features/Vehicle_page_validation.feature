Feature: As a user, I should be able to select any vehicle from the Vehicle page


  Background:
    Given user is on the login page

  Scenario: Vehicle page filter validation
    Given I logged in as 'salesManager'
    When I click on 'Customers' tab
    And I click on 'Accounts' button
    And I click on 'Filter' button
    Then I should see 'Filter' options

  @B29G4-138
  Scenario: Vehicle page manage filters validation
    Given I logged in as 'salesManager'
    When I click on 'Customers' tab
    And I click on 'Accounts' button
    And I click on 'Filter' button
    And I click on 'Manage filters' tab
    Then I should see 'Each Filter' options
