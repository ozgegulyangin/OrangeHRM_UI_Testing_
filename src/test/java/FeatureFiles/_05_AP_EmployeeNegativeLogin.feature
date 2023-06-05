Feature: Employee Negative Login Test
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |

    Scenario:
      And Enter an invalid name "Superman" to name field
      Then Notification message should be displayed