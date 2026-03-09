Feature: Demo QA application validation

  Scenario Outline: Verify home page validation for logo and Many more
    Given User login in to "<demoQA>" site
    And user wait for loader to be disapear
    Then user should see application logo
    Then user should see forms feature

    Examples:
      | demoQA  |
      | https://demoqa.com/        |