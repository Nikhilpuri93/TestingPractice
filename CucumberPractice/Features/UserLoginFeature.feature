Feature: User should register and login into the application and then logout
Description: This is to test the login functionality with valid credentials

Scenario: User registers and login with the registered username and password
Given Open Browser and Enter the Url
And Click on MyAccount menu option
And Enter Username and Password and click on Register button
And Click on Register button
Then Click on Logout button
And Enter username and password
Then click on Login button
Then verify the user logged in successfully
And click on Logout button
