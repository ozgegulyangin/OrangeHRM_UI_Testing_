Feature: Add Button Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario:
    Then Add button should be displayed