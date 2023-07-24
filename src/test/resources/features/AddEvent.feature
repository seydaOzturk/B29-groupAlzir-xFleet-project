@B29G4-168
Feature: Default

	Background:
		#@B29G4-172
		Given user is on the login page
		

	#US: 
	#
	#As a store manager and sales manager, I should be able to add an event
	@B29G4-162
	Scenario Outline: Verify "store manager" and "sales manager"can access the "Add Event" page
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

	
	@B29G4-163
	Scenario Outline: Verify "sales manager" and "store manager" can click "Add Event" button
		    Given user logged in as "<userType>"
		    When  user hover over on "<tab>"
		    And user click on "<module>" module
		    And user click on vehicle row
		    Then user click "Add Event" button
		
		    Examples:
		      | userType      | tab  | module|
		      | store manager | Fleet| Vehicle|
		      | sales manager | Fleet| Vehicle|	

	#US:
	#
	#As a store manager and sales manager, I should be able to add an event
	@B29G4-164
	Scenario: Verify that as a "Driver" do not see "Add Event" button
		    Given user logged in as "driver"
		    When user hover over on "Fleet"
		    And user click on "Vehicle" module
		    And user click on vehicle row
		    Then user do not see "Add Event" button	

	#US:
	#
	#As a store manager and sales manager, I should be able to add an event
	@B29G4-165
	Scenario Outline: Verify that "Add Event" page should  pop up
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

	#US:
	#
	#As a store manager and sales manager, I should be able to add an event
	@B29G4-166
	Scenario Outline: Verify Compulsory fields are shown as: -> Title -> Owner -> Organizer display name -> Organizer email -> Start Date -> End Date
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

	#US
	#
	#As a store manager and sales manager, I should be able to add an event
	#
	# 
	@B29G4-167
	Scenario Outline: Verify If any compulsory field is not filled, "This value should not be blank." message should be displayed after clicking on save button
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