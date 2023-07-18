Feature: End To End Flow WebShop and Dynamics Application

  Background:
    Given User Setup Web Browser Session

  @WebShop
  Scenario: User Place an Order Using WebShop and Verify in Dynamics
    When User Navigates to "Krannich WebShop Application" URL
    Then User Validates "WebShop" Title

    And User Click on "Accept Cookies" Button on "Web Shop Login" Page

    And User Click on "Login" Button on "Web Shop Login" Page
    Then User Validate "Sign In Heading" Field Appeared on "Web Shop Login" Page

    When User Enters "Registered Email" on "User Name" Field on "Web Shop Login" Page
    And User Enters "User Password" on "Password" Field on "Web Shop Login" Page
    And User Click on "Sign In" Button on "Web Shop Login" Page
    Then User Validate "User Name" Field Appeared on "Home" Page

    When User Enters "Product" on "Product Search" Field on "Home" Page
    And User Click on "Search Result" Button on "Home" Page
    And User Click on "Search Result" Button on "Product Listing" Page
    Then User Validate "Product Details" Field Appeared on "Product Details" Page

    When User Enters "Quantity" on "Quantity" Field on "Product Details" Page
    And User Click on "Add To Cart" Button on "Product Details" Page
    And User Click on "View Cart and Check Out" Button on "Product Details" Page
    Then User Validate "Shopping Cart" Field Appeared on "Cart" Page

    When User Click on "Proceed to Checkout" Button on "Cart" Page
    Then User Validate "Check Out" Field Appeared on "Check Out" Page

    When User Click on "Apply and Continue" Button on "Check Out" Page
    And User Click on "Place Order" Button on "Check Out" Page
    Then User Validate "Order Request Details" Field Appeared on "Order Confirmation" Page
    Then User Get "Order Request ID" from "Order Confirmation" Page

    When User Navigates to "Krannich Dynamics Application" URL
    And User Enters "User Email" on "Email" Field on "Dynamics Login" Page
    And User Click on "Next" Button on "Dynamics Login" Page
    And User Enters "User Pass" on "Password" Field on "Dynamics Login" Page
    Then User Click on "Sign In" Button on "Dynamics Login" Page

    And User Click on "Next" Button on "Dynamics Login" Page
    Then User Validates "Dynamics Application" Title

    And User Navigates to "Online Store Transactions" URL