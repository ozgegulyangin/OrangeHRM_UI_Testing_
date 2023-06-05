Feature: Creating User

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Admin Page

  Scenario Outline: Creating new ESS User
    When Click on the element in Dialog Content
      | addButton |
      | userRole  |
    Then Robot "2"

    When Click on the element in Dialog Content
      | status |
    Then Robot "2"


    Then User from sending the keys in Dialog Content
      | userName    | <username> |
      | password    | <pass>     |
      | conPassword | <pass>     |

    Then User from sending the keys in Dialog Content
      | employeeName | <name> |

    When Click on the element in Dialog Content
      | employeeInside |
      | saveButton     |

    And Wait until element visible
      | sysUsers |

    Then User from sending the keys in Dialog Content
      | sysUserName | <username> |

    When Click on the element in Dialog Content
      | saveButton |

    Then Saved User Control"<username>"


    Examples:
      | name           | username | pass       |
      | k | technost111  | Tc>1245785 |
