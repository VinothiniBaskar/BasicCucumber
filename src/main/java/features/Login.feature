Feature: Login Functionality 
@Group1
Scenario: Login Functionality with  Positive
Given Enter the Username as Democsr2
And Enter the Password as crmsfa
When Click on Login Button
And Click on CrmLink

@Group2
Scenario: Login Functionality with  Negative
Given Enter the Username as Democsr2
And Enter the Password as crmfal
When Click on Login Button
But ErrorMessage should be displayed