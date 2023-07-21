Feature: API test

  Background:
#    Given User Setup Web Browser Session

#  @WebShop @GuestUser @BusinessScenario
#  Scenario: User Navigate to WebShop
#
#    When User Navigates to "Krannich WebShop Application" URL


  Scenario Outline: verify the User List Get Response

    When I send a GET Request to "<Endpoint>" on "<Base URL>"
    And I verify the status code "<http_code>"
    Examples:
      | Endpoint     | http_code  |   Base URL             |
      | Users List   |   200      |   QA API Base Url      |
      | Single User  |   200      |   QA API Base Url      |
      | Unknown User |   200      |   QA API Base Url      |


  Scenario Outline: verify the Create User POST Response

    When I send a POST Request to "<Endpoint>" on "<Base URL>" having request body "<Request Body>"
    And I verify the status code "<http_code>"
    Examples:
      | Endpoint     | http_code  |   Base URL             |   Request Body             |
      | Create User  |   201      |   QA API Base Url      |   Create User              |
      | Register User|   200      |   QA API Base Url      |   Register User            |

  Scenario Outline: verify the Create User Patch Response

    When I send a PATCH Request to "<Endpoint>" on "<Base URL>" having request body "<Request Body>"
    And I verify the status code "<http_code>"
    Examples:
      | Endpoint     | http_code  |   Base URL             |   Request Body             |
      | Single User  |   200      |   QA API Base Url      |   Create User              |

  @PSW
  Scenario Outline: verify the token generated from psw api

    When I send a POST psw Request to "<Endpoint>" on "<Base URL>" having request body "<Request Body>"
    And I verify the status code "<http_code>"
    Examples:
      | Endpoint     | http_code  |   Base URL      |   Request Body            |
      | psw endpoint |   200      |   psw base      |   Payment Body              |
