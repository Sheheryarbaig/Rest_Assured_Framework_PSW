Feature: Product Detail Page
  Contains All Web Shop Regression Module Test Cases

  Background:
    Given User Setup Web Browser Session
    And User Navigates to "krannich.web.shop" URL
    Then User Validates "krannich.web.title" Title

  @TC-20612
  Scenario: Verify the product customization and quantity alert messages
    When User Click on "kws.login" Button on "Web Shop Login" Page
    When User Enters "kws.registered.email" on "kws.user.Name" Field on "Web Shop Login" Page
    And User Enters "kws.registered.user.pass" on "kws.user.password" Field on "Web Shop Login" Page
    And User Click on "kws.sign.in" Button on "Web Shop Login" Page
    Then User Validate "kws.user.name" Field Appeared on "Home" Page
    And User Enters "kws.product.item.number" on "kws.search.form" Field on "Home" Page
    And User Click on "kws.search.submit" Button on "Home" Page
    And User Click on "kws.navigate.to.search.result" Button on "Product Listing" Page
    Then User Validate "kws.product.specification.heading" Field Appeared on "Product Detail Page" Page
    Then User Validate "kws.quantity.box.label" Field Appeared on "Product Detail Page" Page
    Then User Validates "kws.quantity.box" Element Displayed on "Product Detail Page" Page
    And User Enters "kws.min.quantity" on "kws.quantity.box" Field on "Product Detail Page" Page
#    Then User Validate "kws.min.quantity.message" Field Appeared on "Product Detail Page" Page
    And User Enters "kws.max.quantity" on "kws.quantity.box" Field on "Product Detail Page" Page
    Then User Validate "kws.max.quantity.message" Field Appeared on "Product Detail Page" Page
