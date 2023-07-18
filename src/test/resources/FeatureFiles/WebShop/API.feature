Feature: Post API Testing

  #Scenario: Sending a GET request and verifying the response

   # Given I have the GET API endpoint
    #When I send a GET request
    #Then I should receive a successful response



  #Scenario: Sending a Post request and verifying the response

   # Given I have the POST API endpoint
    #When I send a POST request with the following request body:
    #Then I should receive a successful Post response
  @Dynamics_Login @Regression
  Scenario: Sending a Get request and verifying the response

    When User Validate to "Get" and "Basic" URL
    When User Validate to "Post" and "Basic" URL
    When User Validate to "Patch" and "Basic" URL





