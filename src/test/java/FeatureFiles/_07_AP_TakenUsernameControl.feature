Feature: Admin/User Management Page Username

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    And Click on the element in Dialog Content
      | addButton |
  Scenario:
    When Enter the username as "Admin"
    Then Notification message should be displayed