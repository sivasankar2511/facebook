Feature: Validate the forgotten password functionality of facebook
Scenario: Validate the forgotten using invalid mobile number
When User should click forgotten password
And User should enter invalid mobile number
And User should click the search button
Then User should negative to otp page
