Feature: Password controller

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline:The message that appears in the uppercase letter entered in the password field
    When Click on the element in Dialog Content
      | addButton |

    Then User from sending the keys in Dialog Content
      | password     | <password>     |

    When Password Check


    Examples:
      | password |
      | asdghfkla |