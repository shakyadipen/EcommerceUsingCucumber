Feature:Create a User to Login
Scenario:Successfully Register a user to Login Further
  Given The user opens a browser
  When The user enters URL "https://www.demoblaze.com/"
  And User clicks SignUp Button
  And User provides username "shakya05" and password "123456"
  And User Clicks Signup button
  And User Accept the popup window
  Then Close Browser