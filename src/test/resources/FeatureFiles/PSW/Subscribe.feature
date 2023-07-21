Feature: Login with WebShop and Dynamics Application

  Background:
    Given User Setup Web Browser Session
   Then Database Setup

#  @WebShopLogin @Sanity
#  Scenario: User Navigate to WebShop
#
#    When User Navigates to "Krannich WebShop Application" URL
#    Then User Validates "WebShop" Title
#    And User Click on "Accept Cookies" Button on "Web Shop Login" Page

  @Dynamics_Login @Regression
  Scenario Outline: Subscribe Module

    When User Navigates to "Psw Website" URL
    And User Click on "subscribe" Button on "PSW page" Page
    And User Click on "agree" Button on "PSW page" Page
    And User Click on "proceed" Button on "PSW page" Page
    And User Enters "NTN Number" on "NTN" Field on "PSW page" Page
    And User Click on "validate" Button on "PSW page" Page
    And User Enters "Email" on "Email" Field on "PSW page" Page
    And User Enters "CNIC Number" on "CNIC Number" Field on "PSW page" Page
    And User Enters "Number" on "Number" Field on "PSW page" Page
    And User Enters "Jazz" on "Selection SIM" Field on "PSW page" Page
    Then User Click on "Jazz" Button on "PSW page" Page
    And User Press Enter
    Then User Click on "Jazz1" Button on "PSW page" Page
    When I send a POST Request to "<Endpoint>" on "<Base URL>" having request body "<Request Body>"
    And I verify the status code "<http_code>"
    Then User Click on "Generate Voucher" Button on "PSW page" Page
    And Save "payment slip" on "PSW page"
    And Save "subscription fee" on "PSW page"
    And Save "Application ID" on "PSW page"
    When I send a POST Request to "psw payment endpoint" on "<Base URL>" having request body "Payment Body"
    And I verify the status code "<http_code>"
    Then User Click on "Refresh" Button on "PSW page" Page
    Then User Click on "proceed" Button on "PSW page" Page
    Then User Click on "Send OTP" Button on "PSW page" Page
    And Fetch OTP value from Database

    Examples:
      | Endpoint     | http_code | Base URL | Request Body |
      | psw endpoint | 200       | psw base | Token Body   |

