Feature: Login with WebShop and Dynamics Application

  Background:
    Given User Setup Web Browser Session

#  @WebShopLogin @Sanity
#  Scenario: User Navigate to WebShop
#
#    When User Navigates to "Krannich WebShop Application" URL
#    Then User Validates "WebShop" Title
#    And User Click on "Accept Cookies" Button on "Web Shop Login" Page

  @Dynamics_Login @Regression
  Scenario: Successfully Logged In to Krannich Dynamics Application

    When User Navigates to "Krannich Dynamics Application" URL
    And User Enters "User Email" on "Email" Field on "Dynamics Login" Page
    And User Click on "Next" Button on "Dynamics Login" Page
    And User Enters "User Pasword" on "Password" Field on "Dynamics Login" Page
    And User Click on "Sign In" Button on "Dynamics Login" Page
    And User Click on "Next" Button on "Dynamics Login" Page
    Then User Validates "Dynamics Application" Title