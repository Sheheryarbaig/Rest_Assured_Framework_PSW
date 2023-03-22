Feature: CartPage
  Contains All Web Shop Regression Module Test Cases

  Background:
    Given User Setup Web Browser Session
    And User Navigates to "krannich.web.shop" URL
    Then User Validates "krannich.web.title" Title

  @20765  @Regression
  Scenario: Verify Functionality of Cart Page
    Then User Validate "kws.create.account" Field Appeared on "Web Shop Login" Page
    Then User Validate "kws.contact.us" Field Appeared on "Web Shop Login" Page
    Then User Validate "kws.hello" Field Appeared on "Web Shop Login" Page
    When User Click on "kws.login" Button on "Web Shop Login" Page
    Then User Validate "kws.sign.in.text" Field Appeared on "Web Shop Login" Page
    When User Enters "kws.registered.email" on "kws.user.Name" Field on "Web Shop Login" Page
    And User Enters "kws.registered.user.pass" on "kws.user.password" Field on "Web Shop Login" Page
    And User Click on "kws.sign.in" Button on "Web Shop Login" Page
    Then User Validate "kws.user.name" Field Appeared on "Home" Page
    Then User Click on "kws.cart.icon" Button on "Home" Page
    Then User Validate "kws.cart.heading" Field Appeared on "Cart" Page
    And User JsClick on "kws.increase.quantity" Button on "Cart" Page
    Then User Validate "value" of "kws.item.quantity" Appeared on "Cart" Page
    Then User Validate "kws.max.quantity.message" Field Appeared on "Cart" Page
    Then User Click on "kws.item" Button on "Cart" Page
    Then User Validate "kws.pdp.heading" Field Appeared on "PDP" Page