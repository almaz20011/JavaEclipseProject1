Feature: Login into Application
Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "Rediff" Site
And Click on Login in home page to land on Secure sign in Page
When User enters "Username" and "Password" and logs in 
Then Verify that user is successfully logged in

