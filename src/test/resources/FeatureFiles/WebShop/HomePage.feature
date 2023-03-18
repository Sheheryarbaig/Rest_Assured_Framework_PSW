Feature: Homepage
  Contains All Web Shop Regression Module Test Cases

  Background:
    Given User Setup Web Browser Session
    And User Navigates to "krannich.web.shop" URL
    Then User Validates "krannich.web.title" Title

    @TC-19762
  Scenario: Verify the layout for homepage logged in user is same as design
      When User Click on "kws.login" Button on "Web Shop Login" Page
      When User Enters "kws.registered.email" on "kws.user.Name" Field on "Web Shop Login" Page
      And User Enters "kws.registered.user.pass" on "kws.user.password" Field on "Web Shop Login" Page
      And User Click on "kws.sign.in" Button on "Web Shop Login" Page
      Then User Validate "kws.user.name" Field Appeared on "Home" Page

