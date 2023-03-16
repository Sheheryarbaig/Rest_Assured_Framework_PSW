Feature: Android Regression Feature File
  Contains All Android Regression Module Test Cases

  Background:
    Given User Setup Android Application Session
    Then User Clicks on Sign In Button on Login Screen

  @TC_032 @Regression
  Scenario: Verify User Top Up on Etisalat Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Clicks on Lets Try Again Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "mobile.top.up.option" Option on Dashboard Screen
    And User Clicks on "etisalat.list.option" Option on Top Up Screen
    Then User Clicks on Add Account Button on Top Up Screen
    And User Enters "testing.name" on Name Field on Top Up Screen
    And User Enters "etisalat.top.up.msisdn" on Msisdn Field on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    And User Selects "top.up.amount" from Pre-Defined Amount on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    Then User Validates Payment Method Balance on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    And User Enters "full.kyc.pin" on Pin Field on Top Up Screen
    And User Clicks on Confirm Button on Top Up Screen
    Then User Validates Successful Message for Top Up of Etisalat on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_033 @Regression
  Scenario: Verify User Top Up on Du Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Clicks on Lets Try Again Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "mobile.top.up.option" Option on Dashboard Screen
    And User Clicks on "du.list.option" Option on Top Up Screen
    Then User Clicks on Add Account Button on Top Up Screen
    And User Enters "testing.name" on Name Field on Top Up Screen
    And User Enters "du.top.up.msisdn" on Msisdn Field on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    And User Clicks on "minutes.only.list.option" Option on Top Up Screen
    And User Selects "top.up.amount" from Pre-Defined Amount on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    Then User Validates Payment Method Balance on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    And User Enters "full.kyc.pin" on Pin Field on Top Up Screen
    And User Clicks on Confirm Button on Top Up Screen
    Then User Validates Successful Message for Top Up of Du on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_034 @Regression
  Scenario: Verify User Performs Other Top Up Services - National Bond

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Clicks on Lets Try Again Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "show.more.expand" Expandable Button on Dashboard Screen
    Then User Clicks on "other.top.up.services.option" Option on Dashboard Screen
    And User Clicks on "national.bond.list.option" Option on Other Services Screen
    Then User Clicks on Add Account Button on Other Services Screen
    And User Enters "testing.name" on Name Field on Other Services Screen
    And User Enters "national.bond.account.number" on Account Number Field on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    And User Selects "national.bond.amount" from Pre-Defined Amount on Other Services Screen
    Then User Validates Amount to be Deducted on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    Then User Validates Payment Method Balance on Other Services Screen
    Then User Validates Amount to be Deducted on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    And User Enters "full.kyc.pin" on Pin Field on Other Services Screen
    And User Clicks on Confirm Button on Other Services Screen
    Then User Validates Successful Message for Top Up of National Bond on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_035 @Regression @check
  Scenario: Verify User Performs Salik Top Up Services

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Clicks on Lets Try Again Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "salik.top.up.option" Option on Dashboard Screen
    And User Clicks on "salik.list.option" Option on Top Up Screen
    Then User Clicks on Add Account Button on Other Services Screen
    And User Enters "testing.name" on Name Field on Other Services Screen
    And User Enters "salik.account.number" on Account Number Field on Other Services Screen
    And User Enters "salik.pin" on Account Pin Field on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    And User Selects "salik.amount" from Pre-Defined Amount on Other Services Screen
    Then User Validates Amount to be Deducted on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    Then User Validates Payment Method Balance on Other Services Screen
    Then User Validates Amount to be Deducted on Other Services Screen
    And User Clicks on Proceed Button on Other Services Screen
    And User Enters "full.kyc.pin" on Pin Field on Other Services Screen
    And User Clicks on Confirm Button on Other Services Screen
    Then User Validates Successful Message for Top Up of Salik on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen


  @TC_034 @Regression
  Scenario: Verify User Performs Other Top Up Services - Zakat Fund

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Clicks on Lets Try Again Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "show.more.expand" Expandable Button on Dashboard Screen
    Then User Clicks on "other.top.up.services.option" Option on Dashboard Screen
    And User Clicks on "zakat.fund.list.option" Option on Other Services Screen