Feature: User login into the application
Description: This is to test the login functionality with valid credentials

Scenario: User Login with valid username and password
Given Open Browser
When Enter the Url
And Click on MyAccount menu option
And Enter registered Username and Password
And Click on Login button
And User must login successfully
Then Click on Logout button