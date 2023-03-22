Feature: Homepage
  Contains All Web Shop Regression Module Test Cases

  Background:
    Given User Setup Web Browser Session
    And User Navigates to "krannich.web.shop" URL
    Then User Validates "krannich.web.title" Title

#    @TC-19762
  Scenario: Navigate to PLP and verify the product cards is visible as per design
    When User Click on "kws.login" Button on "Web Shop Login" Page
    When User Enters "kws.registered.email" on "kws.user.Name" Field on "Web Shop Login" Page
    And User Enters "kws.registered.user.pass" on "kws.user.password" Field on "Web Shop Login" Page
    And User Click on "kws.sign.in" Button on "Web Shop Login" Page
    Then User Validate "kws.user.name" Field Appeared on "Home" Page
    When User Hovers on "kws.product" Button on "Home" Page
    And User Click on "kws.product.solar.modules" Button on "Product Listing" Page
    Then User Validates "kws.solar.product" Element Appeared on "Product Listing" Page
    And  User Validates "kws.product.card" Color On Hover of "kws.solar.product" Button on "Product Listing" Page
    And User Validates "kws.solar.product.price" of "kws.solar.product" On "Product Listing" Page
    And User Validates "kws.solar.product.image" Element Appeared on "Product Listing" Page
    And User Validates "kws.add.to.cart.color" Color On Hover of "kws.solar.product" Button on "Product Listing" Page
    When User Clicks on "kws.add.to.cart" Button of "kws.solar.product" on "Product Listing" Page
    Then User Validates "kws.product.quick.view" Element Appeared on "Product Listing" Page
    And User Clicks on "kws.quick.view.close" Button of "kws.product.quick.view" on "Product Listing" Page
    When User Clicks on "kws.product.card" Button of "kws.solar.product" on "Product Listing" Page
    Then User Validates "kws.product.display.page.title" URL on "Product Display" Page





#    When User look at the product cards section
#    Then User should see the background color of the product card is white
