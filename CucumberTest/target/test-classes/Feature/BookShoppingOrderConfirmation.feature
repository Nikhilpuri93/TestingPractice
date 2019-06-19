Feature: Login into the automation practice site and place an order for a book through shop option

@shop
Scenario: Login and place an order through shop option
	Given User opens the automation practice site url
	Then Click on My Account option
	Then enter username And password
	And click on login button
	Then verify the logged in username
	Then click on shop option
	And add HTML5 Forms to basket
	Then click on view basket
	Then click on proceed to checkout
	Then fill billing details
	#And select Direct Bank Transfer option 
	And click on Place Order button
	Then verify thank you message
	And print the order number
	And logout from the application
	
@status
Scenario: Login and verify the status of order
	Given User opens the automation practice site url
	Then Click on My Account option
	Then enter username And password
	And click on login button
	Then verify the logged in username
	Then click on orders link
	And click on recently placed order
	And verify the status of the order
	And logout from the application
	 
