@B29G4-170
Feature: Default


		#@B29G4-171
		Background:
		   Given user is on the login page
		

	
	@B29G4-169
	Scenario Outline: Verify user can see all vehicles information in a table under the FleetVehicle module

		      Given user logged in as "<userType>"
		      When user hover over on "Fleet"
		      And user click on "Vehicle" module
		      Then user sees all information on the page
		      Then user sees total page number
		      Then user sees next page and previous page buttons
		      Then user sees total records of vehicles
		
		      Examples:
		        | userType      |
		        | store manager |
		        | sales manager |
		        | driver        |