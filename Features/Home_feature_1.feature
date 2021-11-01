Feature: HomeCentre Website URL check 


Background: The HomeCentre URL is navigated to
Given The driver is intialized 
And the driver access the "https://www.homecentre.in/"
Then the title of the page is checked
And the page is confirmed





Scenario: To check if the page searches the required products
Given the webpage is loaded
And the searchbar is clicked
Then send the reruired items  
And Click enter to continue the search
And check if navigated to required page

