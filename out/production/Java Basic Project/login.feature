Feature: User should able to login on www.bmail.com with valid credential and welcome message should be displayed.

Scenario: User should be able to log in with valid credentials
    Given User is already on wwww.bmail.com - log in page
    When User types valid Username 'Nidhi001'
    And User types valid Password 'test001'
    And User clicks on login button
    Then User should be logged in successfully
    And Welcome message should be displayed

Scenario: User should not be able to log in with valid username and invalid password
    Given User is already on wwww.bmail.com - log in page
    When User types valid Username 'Nidhi001'
    And User types invalid Password 'test002'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed


Scenario: User should not be able to log in with invalid username and valid password
    Given User is already on wwww.bmail.com - log in page
    When User types invalid Username 'Shah002'
    And User types valid Password 'test001'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

Scenario: User should not be able to log in with invalid credential
    Given User is already on wwww.bmail.com - log in page
    When User types invalid Username 'Shah002'
    And User types invalid Password 'test002'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

Scenario: User should not be able to log in with empty username and valid password
    Given User is already on wwww.bmail.com - log in page
    When User types valid password 'test001'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

 Scenario: User should not be able to log in with valid username and empty password
     Given User is already on wwww.bmail.com - log in page
     When User types valid username 'Nidhi001'
     And User clicks on login button
     Then User should not be logged in
     And Error message should be displayed

Scenario: User should not be able to log in with empty credential
    Given User is already on wwww.bmail.com - log in page
    When User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

Scenario: User should not be able to log in with empty username and invalid password
    Given User is already on wwww.bmail.com - log in page
    When User types invalid password 'test002'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

Scenario: User should not be able to log in with invalid username and empty password
    Given User is already on wwww.bmail.com - log in page
    When User types invalid username 'Shah002'
    And User clicks on login button
    Then User should not be logged in
    And Error message should be displayed

