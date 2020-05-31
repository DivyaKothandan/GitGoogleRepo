Feature: Validate Google Search Page

@Regression
@Fun
Scenario: Validate Google Home Page
Given Launch Browser
When Launch URL
Then Validate Google Home page
And Validate Google Title
And Quit Browser

@E2E
Scenario Outline: Validate Google Search Page
Given Launch Browser
When Launch URL
And Enter <SearchTerm>
Then Validate Google Search Page
And Validate Google Title
And Quit Browser

Examples:
|SearchTerm|
|Selenium|
|Java|
|Testng|

@Fun
Scenario: Valiate Gmail Link in google page
Given Launch Browser
When Launch URL
Then Validate Gmail Link
And Quit Browser

@Fun
Scenario: Validate Image Link in google
Given Launch Browser
When Launch URL
Then Validate Images Link
And Quit Browser

@Fun
Scenario: Validate Image Link in google
Given Launch Browser
When Launch URL
Then Validate Google Image Link


