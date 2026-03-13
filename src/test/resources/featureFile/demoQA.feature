Feature: Demo QA application validation

  Scenario Outline: Verify home page validation for logo and Many more
    Given User login in to "<demoQAUrl>" site
    And user wait for loader to be disapear
    Then user should see application logo

    Examples:
      | demoQA              |
      | https://demoqa.com/ |

  Scenario Outline: Select desktop check boxes and validate all child checboxes under desktop by default selected
    Given User login in to "demoQAUrl" site
    When user click on "Elements" module
    And user wait for loader to be disapear
    And user click on "Check Box" button
    And user clicks expand all button
    And user clicks "collapse" all button
    And user selects "<plusModule>" checkbox
    Then user validate "<plusModule>" tree checkboxes
    Examples:
      | plusModule |
      | Desktop    |

