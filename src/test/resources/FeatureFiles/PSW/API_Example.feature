Feature: Validate the response code for various scenarios
#
 # Scenario Outline: Validate the response code for various scenarios like checking "<http_code>" status code
  #  Given I should see response code "<http_code>" for the requested API "<Endpoint>"
   # Examples:
    #  | Endpoint      | http_code |
     # | Get Special URL |   201     |
      #| Get Special URL |   201     |

  @API
  Scenario Outline: Validate the response code for various scenarios like checking "<http_code>" status code
    Given I should see response code <http_code> for the requested API "<Endpoint>"
    When I send a GET request to the API
    Then I should receive the expected response code

    Examples:
      | Endpoint          | http_code  |
      | Get Special URL   |   200      |
      | Get Special URL2  |   201      |
  @API2
  Scenario Outline: Validate the response code for various scenarios
    Given I should see response code <http_code> for the requested API "<Endpoint>"
    When I send a GET request to the API
    Then I should receive the expected response code

    Examples:
      | Endpoint          | http_code |
      | Get Special URL   |   200     |
      | Get Special URL2  |   201     |



