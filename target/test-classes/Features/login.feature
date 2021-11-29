Feature: Search Products


Scenario Outline: Login Functionality
	Given user is on login page 
	When user enters <username> and <password>
	And clicks on login button 
	Then verify if user navigates to the HomePage
Examples:
|username|password|
| +917018665510| HelloAmazon!23|


Scenario Outline: Product Search without logged in 
	Given user is on login page
	When user search for <phone>
	Then verify if user is able to get the items with search keyword <mobile>
Examples:
|phone|mobile|
|Realme|realme|


Scenario Outline: Product search after logged in to page 
	Given user is on login page 
	When user enters <username> and <password>
	And clicks on login button 
	Then verify if user navigates to the HomePage
	When user search for <phone>
	Then verify if user is able to get the items with search keyword <mobile>
Examples:
|username|password|phone|mobile|
| +917018665510| HelloAmazon!23|Realme|realme|

