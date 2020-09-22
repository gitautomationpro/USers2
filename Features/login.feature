Feature: Login module


  
 Scenario: user login with valied data
    Given user on a home page
    Then user clicks a on login
    | username | password |
    Then user enters a id and password
    Then user clicks on a login button
    Then user successfully a logged in   
    
    