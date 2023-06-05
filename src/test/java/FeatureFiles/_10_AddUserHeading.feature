Feature: Add Button Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton  |

  Scenario:
    Then Add user heading should be displayed