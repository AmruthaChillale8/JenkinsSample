@browserPOC
Feature: Browser POC

    @browserPOCFunctionality
  Scenario: Browser POC functionality 
    Given I launch the web application
    When I enter username and password 
		Then I click on Login button 
    And I check if the element is present or not
    
    
   