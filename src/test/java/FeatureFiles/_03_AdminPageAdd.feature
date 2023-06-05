Feature: Admin/User Management Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario:
    When Click on the element in Dialog Content
      | addButton  |
      | saveButton |
    Then Notification message should be displayed



