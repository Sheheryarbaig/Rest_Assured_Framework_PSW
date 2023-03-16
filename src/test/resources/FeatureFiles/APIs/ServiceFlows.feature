Feature: APIs Regression Feature File
  Contains All APIs Flows Regression Module Test Cases

  Background:
    Given User Setup APIs Environment

  @TC_001 @check
  Scenario: Verify User Login

    And User Sets "pre-prod.base.url" Base URL
    And User Sets "basic.header.values" Header Values
    And User Sets "check.app.version.path" Request Body with "check.app.version.param" Dynamic Parameters
    Then User Posts the Request to "check.app.version.path" API Path
    And User Validates "check.app.version.path" Response of the API with "check.app.version.res" Dynamic Parameters
    Then User Fetches "check.app.version.attributes" Attributes Values from Response

