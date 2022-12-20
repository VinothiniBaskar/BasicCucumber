Feature: Create Lead Functionality
Background:
Given Enter the username as 'Democsr2'
And Enter the password as 'crmsfa'
When Click Login button
And Click CRMLink
@Group2
Scenario Outline:  Create Lead with Multiple data
And Click Leads button
And Click Create Lead
And Enter the company name as <companyname>
And Enter the first name as <firstname>
And Enter the lastname as <lastname>
When Click Create Lead button 
Then View Lead page is displayed

Examples:
|companyname|firstname|lastname|
|Testleaf|Vino|B|