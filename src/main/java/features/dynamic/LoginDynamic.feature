Feature: Login Functionality for Leaftaps Application

@Group1
Scenario: Login with positive credential
Given Enter the username as 'Democsr2'
Given Enter the password as 'crmsfa'
When Click on  Login button
Then HomPage should be displayed

@Group2
Scenario: Login with negative credential
Given Enter the username as 'Democsr2'
Given Enter the password as 'crmfal'
When Click on  Login button
But ErrorMessage should be displayed

