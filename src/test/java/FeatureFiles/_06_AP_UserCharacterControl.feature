Feature: Admin login character number requirements
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

    Scenario:
      And Enter a value to username less than five character "abc"
      Then Notification message should be displayed