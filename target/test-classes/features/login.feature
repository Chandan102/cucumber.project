Feature: Login into portal

Scenario: positive test validating login
Given Initilize the brower with chrome
And Navigate to "https://portal-dev.trakzeus.in/" site
When User enters username as "democustom" and password as "democustom" to login
Then verify whether user is able to login and Dashboard page to be opened
