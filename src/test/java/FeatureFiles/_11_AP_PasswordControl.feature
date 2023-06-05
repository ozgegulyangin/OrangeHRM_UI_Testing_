Feature: Admin/User Management Page Password

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page
    When Click on the element in Dialog Content
      | addButton |
  Scenario:
    When Enter the password as "Grup15t"
    Then Notification message should be displayed