Feature: verify login functionality
Scenario: verify positive scenario

Given login with valid credentials
When check home page
And check details
Then validate login 
