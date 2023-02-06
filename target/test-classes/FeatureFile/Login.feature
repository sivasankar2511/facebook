Feature: Validate the login functionality of facebook


@Sanity
Scenario: Validate the login functionality with invalid user name and invalid password
When User should type invalid username and invalid password in the textbox
#without header----1D
|siva|siva@123|vasu|vasu@123|naveen|naveen@123|
And User should click the login button
Then User should negative to incorrect credential page

@regression
Scenario: Validate the login functionality with valid user name and invalid password
When User should type valid username and invalid password in the textbox
#without header-----2D
|siva|siva@123|vasu|vasu@123|
|vasu|vasu@123|naveen|naveen@123|
|naveen|naveen@123|siva|siva@123|

And User should click the login button
Then User should negative to incorrect credential page

@Smoke
Scenario: Validate the login functionality with invalid user name and valid password
When User should type invalid username and valid password in the textbox
#with header----1D
|siva|siva@123|
|vasu|vasu@123|
|naveen|naveen@123|
And User should click the login button
Then User should negative to incorrect credential page

@Unit
Scenario: Validate the login functionality with valid user name and valid password
When User should type valid username  and valid password  in the textbox
#without header---2D
|ram|prem|siva|
|A1|A2|A3|
|B1|B2|B3|
And User should click the login button
Then User should negative to incorrect credential page


             