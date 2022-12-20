Feature: Create Lead Functionality
Background:
Given Enter the username as 'Democsr2'
And Enter the password as 'crmsfa'
And Click on Login Button
When Click Crm Link
@Group2
Scenario: Create Lead with static data
Given Click Leads button
And Click create lead
And Enter the company name as 'Testleaf'
And Enter the first name as 'Vinothini'
And Enter the last name as 'B'
When Click create lead button
