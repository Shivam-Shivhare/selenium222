Feature: Login
Scenario Outline: Successful Login with valid input

Given User launch chrome browser
When User open url "https://practicetestautomation.com/practice-test-login/"
And user Enter username "<username>" and password "<password>"
And click on submit button 
Then Page title should be "Logged In Successfully | Practice Test Automation" 
When User click on logout button 
Then Page title should be "TestLogin | Practice Test Automation" 
And close browser


Examples:
        |username |password|
        |student |Password123|
      

