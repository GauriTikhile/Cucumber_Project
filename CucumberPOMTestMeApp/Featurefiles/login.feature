Feature: Login Functionality
	Scenario: Login with valid credentials
	Given Navigate to Home page
	When user enters username and password
	Then user logged in successfully 
	
	@data-driven
	Scenario: The one where user picks different product through search functionality
	When Larry searches below products in the search box:
	|Headphone |
	|Carpet|
	|Cylotains|
	Then product should be added in the cart if available
	
	@user-specific
	Scenario Outline: test login
	Given when i am on the home page
	When i enter "<uname>" and "<pwd>"
	Then i am able to login
	
	Examples:
	|uname  |pwd        |
	|lalitha|Password123|
	|ABC    |XYZ        |