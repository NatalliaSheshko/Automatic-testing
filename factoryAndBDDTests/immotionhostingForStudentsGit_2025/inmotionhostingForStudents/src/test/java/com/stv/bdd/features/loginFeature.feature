Feature: Login page

Scenario: the system opens ForgotPassword page
Given Main page is loaded
When The user click on loginButton
Then The login page is loaded
When The user click on ForgotPassword
Then ForgotPassword page is loaded