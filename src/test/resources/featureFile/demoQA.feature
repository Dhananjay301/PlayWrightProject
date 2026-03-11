Feature: Demo QA application validation

  Scenario Outline: Verify home page validation for logo and Many more
    Given User login in to "<demoQA>" site
    And user wait for loader to be disapear
    Then user should see application logo

    Examples:
      | demoQA  |
      | https://demoqa.com/        |

    Scenario: Select desktop check boxes and validate all child checboxes under desktop by default selected
      Given user navigates to "https://demoqa.com/checkbox"
      When user click on "Elements" module
      And user wait for loader to be disapear
      And user click on "Check Box" button
      And user clicks expand all button
      And user clicks "collapse" all button
      And user selects "Desktop" checkbox
      Then user validate "Desktop" tree checkboxes

