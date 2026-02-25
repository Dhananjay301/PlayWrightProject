Feature: Test SwagLab Page

  Scenario Outline: Verify swag lab login page with valid credentials
    Given user is on swagLab page
    And swagLab logo should be displayed
    When user enter "<username>" in username section
    And user enter "<password>" in password section
    Then user is on swag home page
    Examples:
      | username      | password |
      | standard_user | secret_sauce |