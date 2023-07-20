@B29G4-156
Feature: Filter vehicle table under Fleet-Vehicle page

	Background:
		Given user is on the login page
	
	@B29G4-155
	Scenario: As a user, I should be able to filter vehicle table under Fleet-Vehicle page
		Given user logged in as "driver"
		When  user hover over on "fleetTab"
		And user click on "vehicleModules" module
		Then User clicks on filter icon, "Manage Filter" button should be visible
		When User can apply filters by clicking on filter name, from 'Manage Filters' menu.
		Then User can apply filters by typing the filter name, from 'Manage Filters' menu.