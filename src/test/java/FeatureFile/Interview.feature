Feature: Interview Scheduled

  Scenario Outline: Verify login functionality with correct username and correct password
    When I navigated to Website
    Then Enter correct "<username>" and correct "<password>"
    And When i clicked on login button
    Then I should be able to see number of scheduled interview
    Examples:
      | username                             | password         |
      | SGltYW5zaHVndXB0YTI0NEB5YWhvby5jb20= | SW5mb2VkZ2UxMCEp |


  Scenario Outline: Verify login functionality with correct username and correct password
    When I navigated to Website
    Then Enter correct "<username>" and correct "<password>"
    And When i clicked on login button
    Then I should be able to see number of scheduled interview
    Examples:
      | username                             | password         |
      | c3VkaGFuc2h1Z3VwdGE3N0BnbWFpbC5jb20= | RW51a2UxMjMhISE= |