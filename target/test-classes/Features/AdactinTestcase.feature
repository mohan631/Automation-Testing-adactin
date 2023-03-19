
@Login
Feature: Adactin Login Automation
@TC101 @smoke
  Scenario: To verify valid logindetails
  Given User Launch the "edge" Browser
  And User Naviagte Url "http://adactinhotelapp.com/"
  Then User verify login page
  And User Enter UserName "vijibharathi"
  And User Enter Password "Bharathi@@2629"
  And User Click the login Button
  Then User Verify login Sucessfull
  
  @TC102 @smoke
  Scenario: To verify invalid login details
   Given User Launch the "edge" Browser
  And User Naviagte Url "http://adactinhotelapp.com/"
  Then User verify login page
  And User Enter UserName "tester"
  And User Enter Password "Bharathi@@2629"
  And User Click the login Button
  Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
 And User Enter UserName "vijibharathi"
  And User Enter Password "tester"
  And User Click the login Button
  Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
 And User Enter UserName "tester"
  And User Enter Password "tester"
  And User Click the login Button
  Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
  
    @TC103 
  Scenario Outline: To verify invalid login details
  Given User Launch the "edge" Browser
  And User Naviagte Url "http://adactinhotelapp.com/"
  Then User verify login page
  And User Enter UserName <UserName>
  And User Enter Password <Password>
  And User Click the login Button
  Then User Verify Error message "Invalid Login details or Your Password might have expired. Click here to reset your password"
  
  Examples:
|UserName|Password|
|"tester"|"Bharathi@@2629"|
|"vijibharathi"|"tester"|
|"tester"|"tester"|
  