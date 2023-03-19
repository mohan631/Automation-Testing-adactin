@smoke
Feature: Adactin Somke testcases

Background: 
Given User launch the "Browser" Browser
And User Navigate the Url "URL"
Then User verify login page

@TC101 @Regression @sanity
Scenario: To verify valid login details
And User Enter valid UserName "AdactinUserName"
And User Enter Valid Password "AdactinPassword"
And User click the login Button
Then User Verify logined Successfully

@TC102
Scenario Outline: To verify Invalid login details
And User Enter Username <Username> and Enter Password <Password>
And User click the login Button
Then User Verify login Error Message

Examples:
|Username|Password|
|"bharathi"|"Bharathi@@2629"|
|"vijibharathi"|"Bharathi@@2629"|
|"bharathi"|"@@2629"|

@TC103 @Regression @ignore
Scenario: To verify valid login details
And User Enter valid UserName "vijibharathi"
And User Enter Valid Password "Bharathi@@2629"
And User click the login Button
Then User Verify logined Successfully

@TC104
Scenario: To verify valid login details
And User Enter valid UserName "vijibharathi"
And User Enter Valid Password "Bharathi@@2629"
And User click the login Button
Then User Verify logined Successfully
@TC105 @Regression
Scenario: To verify valid login details
And User Enter valid UserName "vijibharathi"
And User Enter Valid Password "Bharathi@@2629"
And User click the login Button
Then User Verify logined Successfully

@TC106
Scenario: To verify valid login details
And User Enter valid UserName "vijibharathi"
And User Enter Valid Password "Bharathi@@2629"
And User click the login Button
Then User Verify logined Successfully
@TC107
Scenario: To verify valid login details
And User Enter valid UserName "vijibharathi"
And User Enter Valid Password "Bharathi@@2629"
And User click the login Button
Then User Verify logined Successfully
