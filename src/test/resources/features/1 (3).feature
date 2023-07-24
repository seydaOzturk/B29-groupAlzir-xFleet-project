@B29G4-178
Feature: Default

	
	@B29G4-176
	Scenario: users should see 8 filter items on the Accounts page 
		Given I logged in as 'salesManager'
		    When I click on 'Customers' tab
		    And I click on 'Accounts' button
		    And I click on 'Filter' button
		    Then I should see 'Filter' options	

	
	@B29G4-177
	Scenario: When user clicks on filtering items under "Manage Filters", each filter should be visible next to "Manage Filters" option.
		Given I logged in as 'salesManager'
		    When I click on 'Customers' tab
		    And I click on 'Accounts' button
		    And I click on 'Filter' button
		    And I click on 'Manage filters' tab
		    Then I should see 'Each Filter' options