Feature: Verify Sliders on Home Page

@sanity
  Scenario: Verify Home Page has exactly three sliders
    
 Given Open the browser
 And Enter the URL "http://practice.automationtesting.in"
 Then Click on My Account Menu
 And Enter registered "Naresh303011@gmail.com" in username textbox
 And Enter password in "Naresh9959" textbox
 And Click on login button
Then User must successfully login to the web page
Then verify the Signout text


 @regression
Scenario Outline: verify with invalid data 
 	
Given Open the browser
And Enter the URL "http://practice.automationtesting.in/"
Then Click on My Account Menu
And Enter incorrect "<username>" in username textbox
And Enter incorrect "<password>" in password textbox.
Then Click on login button
Then Proper error must be displayed(ie Invalid username) and prompt to enter login again
 	
 Examples:
 
 	| username | password |
 	|	Naresh3030@gmail.com | Naresh9959  |
 	
 	@validname
 Scenario:
 Given Open the browser
 And Enter the URL "http://practice.automationtesting.in/"
 Then Click on My Account Menu
 And Enter valid "Naresh9959@gmail.com" in username textbox
 Then Click on login button.
 Then Proper error must be displayed(ie Invalid password) and prompt to enter login again
 	
 	