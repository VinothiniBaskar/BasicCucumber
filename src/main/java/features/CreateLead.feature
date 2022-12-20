Feature: Create Lead with Functionality
Background: Positive Login
Given Enter the Username
And Enter the Password
When Click on Login Button
And Click on CrmLink

@Group3
Scenario: Create Lead with data
Given Click leads button
And Click create lead 
And Enter the Company name
And Enter the First name
And Enter the Last name
When Click create lead button
