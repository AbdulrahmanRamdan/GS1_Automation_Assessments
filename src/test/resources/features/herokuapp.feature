@HerokuappFunctionality
Feature: Herokuapp Functionality

  Background:
    Given User opens the internet herokuapp website

  @Dynamicloading
  Scenario: Dynamic Loading
    When click Dynamic Loading
    And click Example2
    And click start
    Then Verify text appearance

  @Uploadfile
  Scenario Outline: File Upload
    When click file upload
    And Choose "<File>" from the data folder
    And click submit button
    Then Verify the file uploaded

    Examples:
      | File                           |
      | hr_management_system_prd_v3.md |
