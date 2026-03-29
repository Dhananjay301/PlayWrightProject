Feature: Test SwagLab Page

  @Smoke
  Scenario Outline: Verify swag lab login page with valid credentials
    Given user is on swagLab page
    And swagLab logo should be displayed
    When user enter "<username>" in username section
    And user wait for loader to be disapear
    And user enter "<password>" in password section
    And user wait for loader to be disapear
    And user click on login button
    And user wait for loader to be disapear

    Examples:
      | username      | password |
      | standard_user | secret_sauce |