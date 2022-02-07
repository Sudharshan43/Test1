Feature: validating login function of fb application

Scenario: validating login by incorrect username and correct password
Given user is on Fb page on chrome browser
When user enter username and password
And click login button
Then user should check home page is vissible or not
