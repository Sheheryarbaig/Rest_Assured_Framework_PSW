Feature: IOS Regression Feature File
  Contains All IOS Regression Module Test Cases

  Background:
    Given User Setup IOS Application Session
    And User Allows Permission on IOS Device
    Then User Clicks on Sign In Button on Login Screen

  @TC_001 @Sprint_2022.12
  Scenario: Verify User Sends Cash Gift to Registered Full KYC Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "cash.gift.option" Option on Gifting Screen
    And User Enters "registered.receiver.msisdn" on Mobile Number Field on Gifting Screen
    And User Enters "transfer.amount" on Amount Field on Gifting Screen
    Then User Validates Available Balance is Correct on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Cash Gift on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_002 @Sprint_2022.12
  Scenario: Verify User Sends Cash Gift to Unregistered Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "cash.gift.option" Option on Gifting Screen
    And User Enters "unregistered.receiver.msisdn.ios" on Mobile Number Field on Gifting Screen
    Then User Validates Send Invite Message Visibility "true" on PopUp
    And User Clicks Proceed Button on PopUp
    And User Enters "transfer.amount" on Amount Field on Gifting Screen
    Then User Validates Available Balance is Correct on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Cash Gift on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_003 @Sprint_2022.12
  Scenario: Verify User Add Money Through Cash Gift Flow

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "cash.gift.option" Option on Gifting Screen
    Then User Clicks Add Money Button on Gifting Screen
    Then User Clicks on "debit.card.list.option" Option on Add Money Screen
    And User Enters "add.money.transaction.amount" on Amount Field on Add Money Screen
    And User Clicks the Saved Debit Card on Add Money Screen
    And User Clicks on Confirm Button on Add Money Screen
    And User Enters "full.kyc.pin" on Pin Field on Add Money Screen
    And User Clicks on Login Confirm Button on Add Money Screen
    And User Enters "card.cvv.number" on Validation Code Field on Pop Up
    Then User Clicks Add Money Button on Pop Up
    Then User Validates Successful Message for Add Money on Pop Up
    Then User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Added Amount on Dashboard Screen

  @TC_004 @Sprint_2022.12
  Scenario: Verify User Purchase Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "pubg.option" Option on Gifting Screen
    And User Fetches Amount of "pubg.uc.option" Voucher Option on Gifting Screen
    And User Clicks on "pubg.uc.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_005 @Sprint_2022.12
  Scenario: Verify User Add Account for Direct Pay

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "direct.pay.option" Option on Dashboard Screen
    And User Clicks on Add a New Account Button on Direct Pay Screen
    Then User Enters Random Text on Name Field on Direct Pay Screen
    And User Enters Random MSISDN on MSISDN Field on Direct Pay Screen
    And User Selects "direct.pay.tag" Tag on Direct Pay Screen
    And User Clicks Add Account Button on Direct Pay Screen
    Then User Validates Successful Message for Direct Pay Account Added on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Account Added on Direct Pay Screen

  @TC_006 @Sprint_2022.12
  Scenario: Verify User Delete Account for Direct Pay

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "direct.pay.option" Option on Dashboard Screen
    And User Swipes Saved Account Except "saved.direct.pay.account" on Direct Pay Screen
    And User Clicks Delete Button on Direct Pay Screen
    Then User Enters "full.kyc.pin" on Pin Field on Direct Pay Screen
    And User Clicks on Confirm Button on Direct Pay Screen
    Then User Validates Successful Message for Direct Pay Account Deleted on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Account Deleted on Direct Pay Screen

  @TC_007 @Sprint_2022.12
  Scenario: Verify User Transfer Money from Direct Pay Flow

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "direct.pay.option" Option on Dashboard Screen
    And User Selects Saved Account "saved.direct.pay.account" on Direct Pay Screen
    And User Enters "direct.pay.transfer.amount" on Amount Field on Direct Pay Screen
    And User Validates Amount to be Deducted on Direct Pay Screen
    And User Clicks on Proceed Button on Direct Pay Screen
    Then User Enters "full.kyc.pin" on Pin Field on Direct Pay Screen
    And User Clicks on Confirm Button on Direct Pay Screen
    Then User Validates Successful Message for Transfer Money of Direct Pay on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Goes Back from Current Screen
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_008 @Regression
  Scenario: Verify User Performs Logout Functionality

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks Logout Button on Dashboard Screen
    Then User Validates Account has been Logged Out

  @TC_009 @Regression
  Scenario: Verify User Add Money via Home Screen through Debit Card Full KYC

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on Add Money Button on Dashboard Screen
    And User Clicks on "debit.card.list.option" Option on Add Money Screen
    And User Enters "add.money.transaction.amount" on Amount Field on Add Money Screen
    And User Clicks the Saved Debit Card on Add Money Screen
    And User Clicks on Confirm Button on Add Money Screen
    And User Enters "full.kyc.pin" on Pin Field on Add Money Screen
    And User Clicks on Login Confirm Button on Add Money Screen
    And User Enters "card.cvv.number" on Validation Code Field on Pop Up
    Then User Clicks Add Money Button on Pop Up
    Then User Validates Successful Message for Add Money on Pop Up
    Then User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Added Amount on Dashboard Screen

  @TC_010 @Regression
  Scenario: Verify User Cannot Add Money For No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Add Money Button "disabled" on Dashboard Screen

  @TC_011 @Regression
  Scenario: Verify User Cannot Send Money For No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Send Money Button "disabled" on Dashboard Screen

  @TC_012 @Regression
  Scenario: Verify User Tap on Balance Card to Navigate to Transaction History Section

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks Balance Card on Dashboard Screen
    And User Validates Transaction History Heading Visibility "true" on Dashboard Screen

  @TC_013 @Regression
  Scenario: Verify User Performs mParking Flow of Abu Dhabi

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "mparking.option" Option on Dashboard Screen
    And User Selects "abu.dhabi.option" Option on mParking Screen
    Then User Enters "plate.number.text" on Plate Number Field on mParking Screen
    Then User Selects "one.hour.option" from Duration Option on mParking Screen
    And User Clicks on Pay Parking Button on mParking Screen
    Then User Validates Entered "plate.number.text" and "one.hour.option" and "abu.dhabi.number" on Message Screen

  @TC_014 @Regression
  Scenario: Verify User Performs mParking Flow of Dubai

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "mparking.option" Option on Dashboard Screen
    And User Selects "dubai.option" Option on mParking Screen
    Then User Enters "plate.number.text" on Plate Number Field on mParking Screen
    Then User Enters "parking.zone.text" on Parking Zone Field on mParking Screen
    Then User Selects "one.hour.option" from Duration Option on mParking Screen
    And User Clicks on Pay Parking Button on mParking Screen
    Then User Validates Entered "plate.number.text" and "parking.zone.text" and "one.hour.option" and "dubai.number" on Message Screen

  @TC_015 @Regression
  Scenario: Verify User Performs mParking Flow of Sharjah

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "mparking.option" Option on Dashboard Screen
    And User Selects "sharjah.option" Option on mParking Screen
    Then User Enters "plate.number.text" on Plate Number Field on mParking Screen
    Then User Selects "sharjah.option" from License Plate Source on mParking Screen
    And User Clicks on Pay Parking Button on mParking Screen
    Then User Validates "sharjah.code" and "plate.number.text" and "sharjah.number" on Message Screen

  @TC_016 @Regression
  Scenario: Verify User Performs mParking Flow of Ajman

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "mparking.option" Option on Dashboard Screen
    And User Selects "ajman.option" Option on mParking Screen
    Then User Enters "plate.number.text" on Plate Number Field on mParking Screen
    Then User Selects "ajman.option" from License Plate Source on mParking Screen
    And User Clicks on Pay Parking Button on mParking Screen
    Then User Validates "ajman.code" and "plate.number.text" and "ajman.number" on Message Screen

  @TC_017 @Regression
  Scenario: Verify User Validate Promotions on Home Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Promotion Banner on Dashboard Screen

  @TC_018 @Regression
  Scenario: Verify User can See Agents Listing and View All on Home Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Agents Listing on Dashboard Screen
    Then User Clicks on Agents View All on Dashboard Screen
    And User Validates List View Tab on Dashboard Screen
    And User Validates Map View on Dashboard Screen

  @TC_019 @Regression
  Scenario: Verify User can See Merchants Listing and View All on Home Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Merchants Listing on Dashboard Screen
    Then User Clicks on Merchants View All on Dashboard Screen
    And User Validates List View Tab on Dashboard Screen
    And User Validates Map View on Dashboard Screen

  @TC_020 @Regression
  Scenario: Verify User Navigate to Wallet Tab from Bottom Bar

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "wallet.option" Option on Bottom Navigation on Dashboard Screen
    And User Validates Wallet Heading Visibility "true" on Dashboard Screen
    And User Validates Saved Cards Heading Visibility "true" on Dashboard Screen
    And User Validates Saved Banks Heading Visibility "true" on Dashboard Screen

  @TC_021 @Regression
  Scenario: Verify User Navigate to Profile Tab from Bottom Bar

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Validates Profile Heading Visibility "true" on Dashboard Screen

  @TC_022 @Regression
  Scenario: Verify Navigate Functionality of Profile

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks on "my.documents.p.option" from Profile Option on Dashboard Screen
    Then User Validates My Documents Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "saved.bank.accounts.p.option" from Profile Option on Dashboard Screen
    Then User Validates Bank Accounts Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "account.access.p.option" from Profile Option on Dashboard Screen
    Then User Validates Account Access Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "imt.p.option" from Profile Option on Dashboard Screen
    Then User Validates International Remittance Beneficiaries Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "direct.pay.p.option" from Profile Option on Dashboard Screen
    Then User Validates Direct Pay Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "services.and.utilities.p.option" from Profile Option on Dashboard Screen
    Then User Validates Services and Utilities Heading on Dashboard Screen
    And User Goes Back from Current Screen
    And User Clicks on "faq.p.option" from Profile Option on Dashboard Screen
    Then User Validates FAQs Heading on Dashboard Screen

  @TC_023 @Regression
  Scenario: Verify FAQ Functionality of Profile

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks on "faq.p.option" from Profile Option on Dashboard Screen
    Then User Validates FAQs Heading on Dashboard Screen
    And User Clicks on "about.e&money.faq.option" Option on Help and Support Screen
    And User Validates "about.e&money.faq.option" Heading on Help and Support Screen
    Then User Goes Back from Current Screen
    And User Clicks on "setup.e&money.faq.option" Option on Help and Support Screen
    And User Validates "setup.e&money.faq.option" Heading on Help and Support Screen
    Then User Goes Back from Current Screen
    And User Clicks on "manage.your.account.faq.option" Option on Help and Support Screen
    And User Validates "manage.your.account.faq.option" Heading on Help and Support Screen
    Then User Goes Back from Current Screen
    And User Clicks on "payment.and.transactions.faq.option" Option on Help and Support Screen
    And User Validates "payment.and.transactions.faq.option" Heading on Help and Support Screen
    Then User Goes Back from Current Screen
    And User Clicks on "other.topics.faq.option" Option on Help and Support Screen
    And User Validates "other.topics.faq.option" Heading on Help and Support Screen

  @TC_024 @Regression
  Scenario: Verify Contact Us Functionality of Profile

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks on "contact.us.p.option" from Profile Option on Dashboard Screen
    Then User Validates Contact Us Mobile Number on Dashboard Screen

  @TC_025 @Sprint_2022.14
  Scenario: Verify Text on Payment Machines Flow on Add Money Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on Add Money Button on Dashboard Screen
    And User Clicks on "payment.machines.list.option" Option on Add Money Screen
    Then User Validates Payment Machines Steps Text on Add Money Screen

  @TC_026 @Sprint_2022.14
  Scenario: Verify Xbox and iTunes Removed from Other Services and Displayed on Gifting

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "show.more.expand" Expandable Button on Dashboard Screen
    And User Clicks on "other.top.up.services.option" Option on Dashboard Screen
    Then User Validates "itunes.uae.option" Option Visibility "false" on Other Services Screen
    Then User Validates "xbox.option" Option Visibility "false" on Other Services Screen
    And User Goes Back from Current Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    Then User Validates "itunes.uae.option" Option Visibility "true" on Gifting Screen
    Then User Validates "xbox.option" Option Visibility "true" on Gifting Screen

  @TC_027 @Sprint_2022.14
  Scenario: Verify Add Money Screen is Consistent from Different Navigation

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "cash.gift.option" Option on Gifting Screen
    Then User Clicks Add Money Button on Gifting Screen
    And User Validates Add Money Heading Visibility "true" on Add Money Screen
    Then User Validates "debit.card.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "bank.account.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "payment.machines.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "agents.list.option" Option Visibility "true" on Add Money Screen
    And User Goes Back from Current Screen
    And User Goes Back from Current Screen
    And User Goes Back from Current Screen
    And User Clicks on "direct.pay.option" Option on Dashboard Screen
    And User Selects Saved Account "saved.direct.pay.account" on Direct Pay Screen
    And User Clicks on Add Money Button on Direct Pay Screen
    And User Validates Add Money Heading Visibility "true" on Add Money Screen
    Then User Validates "debit.card.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "bank.account.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "payment.machines.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "agents.list.option" Option Visibility "true" on Add Money Screen
    And User Goes Back from Current Screen
    And User Goes Back from Current Screen
    And User Goes Back from Current Screen
    Then User Clicks on Send Money Button on Dashboard Screen
    Then User Clicks on "send.to.friend.list.option" Option on Send Money Screen
    And User Clicks on Add Money Button on Send Money Screen
    And User Validates Add Money Heading Visibility "true" on Add Money Screen
    Then User Validates "debit.card.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "bank.account.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "payment.machines.list.option" Option Visibility "true" on Add Money Screen
    Then User Validates "agents.list.option" Option Visibility "true" on Add Money Screen

  @TC_028 @Sprint_2022.14
  Scenario: Verify Quicker Access Pop Up does not Display after Decline

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Waits for Loader to Disappear
    Then User Validates Quicker Access Pop Up Visibility "true" on Pop Up Window
    Then User Clicks on Not Now Button on Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks Logout Button on Dashboard Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Waits for Loader to Disappear
    Then User Validates Quicker Access Pop Up Visibility "false" on Pop Up Window

  @TC_029 @Sprint_2022.14
  Scenario: Verify Agents is Displayed in Ascending Order of Distance on Table and List View

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Agents Names from Agents Table on Dashboard Screen
    Then User Validates Agents Table is in Ascending Order on Dashboard Screen
    And User Clicks on Agents View All on Dashboard Screen
    Then User Validates Agents List View is in Ascending Order on Dashboard Screen
    And User Validates Names Order on Agents List View on Dashboard Screen

  @TC_030 @Sprint_2022.14
  Scenario: Verify Merchants is Displayed in Ascending Order of Distance on Table and List View

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Merchants Names from Agents Table on Dashboard Screen
    Then User Validates Merchants Table is in Ascending Order on Dashboard Screen
    And User Clicks on Merchants View All on Dashboard Screen
    Then User Validates Merchants List View is in Ascending Order on Dashboard Screen
    And User Validates Merchants Order on Agents List View on Dashboard Screen

  @TC_031 @Regression
  Scenario: Verify User Send Money Via Home Screen to Agent ID

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on Send Money Button on Dashboard Screen
    And User Clicks on "agents.list.option" Option on Send Money Screen
    And User Allows Permission on IOS Device
    Then User Clicks on Enter ID logo on Send Money Screen
    And User Enters "agent.id" on Agent ID Field on Send Money Screen
    And User Clicks on Confirm Button on Send Money Screen
    Then User Selects "send.money.amount" from Pre-define Amount on Send Money Screen
    And User Validates Total Amount with Fee and Vat Included on Send Money Screen
    Then User Clicks on Confirm Button on Send Money Screen
    And User Enters "full.kyc.pin" on Pin Field on Send Money Screen
    Then User Clicks on Confirm Button on Login Screen
    Then User Validates Successful Message for Send Money to Agent on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_032 @Regression
  Scenario: Verify User Top Up on Etisalat Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "mobile.top.up.option" Option on Dashboard Screen
    And User Clicks on "etisalat.list.option" Option on Top Up Screen
    Then User Clicks on Add Account Button on Top Up Screen
    And User Enters "testing.name" on Name Field on Top Up Screen
    And User Enters "etisalat.top.up.msisdn" on Msisdn Field on Top Up Screen
    And User Allows Permission on IOS Device
    And User Clicks on Proceed Button on Top Up Screen
    And User Selects "top.up.amount" from Pre-Defined Amount on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    Then User Validates Payment Method Balance on Top Up Screen
    Then User Validates Amount to be Deducted on Top Up Screen
    And User Clicks on Proceed Button on Top Up Screen
    And User Enters "full.kyc.pin" on Pin Field on Top Up Screen
    And User Clicks on Confirm Button on Top Up Screen
    And User Rejects Permission on IOS Device
    Then User Validates Successful Message for Top Up of Etisalat on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_033 @Regression
  Scenario: Verify User Top Up on Du Number

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "mobile.top.up.option" Option on Dashboard Screen
    And User Clicks on "du.list.option" Option on Top Up Screen
    Then User Clicks on Add Account Button on Top Up Screen
    And User Enters "testing.name" on Name Field on Top Up Screen
    And User Enters "etisalat.top.up.msisdn" on Msisdn Field on Top Up Screen
    And User Allows Permission on IOS Device
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
    Then User Rejects Permission on IOS Device
    Then User Validates Successful Message for Top Up of Du on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_034 @Regression
  Scenario: Verify User Performs Other Top Up Services - National Bond

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
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

  @TC_035 @Regression
  Scenario: Verify User Performs Salik Top Up Services

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
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

  @TC_036 @Regression
  Scenario: Verify User Performs Pay Bill - Ajman Sewerage

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on "pay.bills.option" Option on Dashboard Screen
    And User Clicks on "ajman.sewerage.list.option" Option on Pay Bills Screen
    Then User Clicks on Add Account Button on Pay Bills Screen
    And User Enters "testing.name" on Name Field on Pay Bills Screen
    And User Enters "ajman.sewerage.account.number" on Account Number Field on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Enters "ajman.sewerage.amount" on Amount Field on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    Then User Validates Payment Method Balance on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Enters "full.kyc.pin" on Pin Field on Pay Bills Screen
    And User Clicks on Confirm Button on Pay Bills Screen
    Then User Validates Successful Message for Pay Bills of Ajman Sewerage on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_037 @Regression
  Scenario: Verify User Send Money via Home Screen to Bank Account

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    Then User Clicks on Send Money Button on Dashboard Screen
    And User Clicks on "bank.account.list.option" Option on Send Money Screen
    And User Selects Saved Bank Account on Send Money Screen
    Then User Selects "send.money.bank.amount" from Pre-define Amount on Send Money Screen
    Then User Validates Amount to be Deducted with Transaction Fee and Vat Included on Send Money Screen
    And User Clicks on Confirm Button on Send Money Screen
    And User Enters "full.kyc.pin" on Pin Field on Send Money Screen
    And User Clicks on Confirm Button on Send Money Screen
    Then User Validates Successful Message for Send Money to Bank on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

#  @TC_038 @Regression
#  Scenario: Verify User Add Money via Home Screen through Bank Account Full KYC
#
#    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
#    And User Clicks on Join Button on Login Screen
#    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
#    And User Clicks on Confirm Button on Login Screen
#    And User Enters "full.kyc.pin" on Pin Field on Login Screen
#    And User Clicks on Login Confirm Button on Login Screen
#    And User Closes Pop Up Window
#    And User Allows Permission on IOS Device
#    And User Fetches Wallet Balance on Dashboard Screen
#    Then User Clicks on Add Money Button on Dashboard Screen
#    And User Clicks on "bank.account.list.option" Option on Add Money Screen
#    And User Enters "add.money.bank.amount" on Amount Field on Add Money Screen
#    Then User Clicks on Continue Button on Add Money Screen
#    Then User Selects "add.money.bank" from Bank Dropdown on Add Money Screen
#    And User Clicks on Submit Button on Add Money Screen
#    And User Clicks on Radio Button on Terms and Conditions on Add Money Screen
#    And User Clicks on Submit Button on Add Money Screen
#    And User Enters "bank.response.code.text" on Response Code Field on Add Money Screen
#    And User Enters "bank.response.msg.text" on Response Message Field on Add Money Screen
#    And User Enters "bank.auth.code.text" on Auth Code Field on Add Money Screen
#    And User Enters "bank.bank.id.text" on Bank ID Field on Add Money Screen
#    And User Clicks on Generate Hash Button on Add Money Screen
#    And User Clicks on Return to PG Button on Add Money Screen
#    Then User Validates Successful Message for Add Money from Bank on Pop Up
#    And User Clicks on Close Button on Pop Up
#    Then User Validates Wallet Balance with Added Amount on Dashboard Screen
#
#  @TC_039 @Regression
#  Scenario: Verify User Add and Delete Bank from Wallet Screen
#
#    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
#    And User Clicks on Join Button on Login Screen
#    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
#    And User Clicks on Confirm Button on Login Screen
#    And User Enters "full.kyc.pin" on Pin Field on Login Screen
#    And User Clicks on Login Confirm Button on Login Screen
#    And User Closes Pop Up Window
#    And User Allows Permission on IOS Device
#    And User Clicks on "wallet.option" Option on Bottom Navigation on Dashboard Screen
#    And User Clicks on Add New of Saved Bank Accounts on Dashboard Screen
#    And User Enters "bank.name.text" on Bank Name Field on Manage e& Money Screen
#    And User Enters "iban.text" on IBAN Field on Manage e& Money Screen
#    And User Enters "beneficiary.text" on Beneficiary Field on Manage e& Money Screen
#    And User Enters "alias.text" on Alias Field on Manage e& Money Screen
#    And User Clicks on Link Bank Account Button on Manage e& Money Screen
#    And User Enters "full.kyc.pin" on Pin Field on Manage e& Money Screen
#    And User Clicks on Confirm Button on Manage e& Money Screen
#    Then User Validates Successful Message for Linked a Bank on Pop Up
#    And User Clicks on Ok Button on Pop Up
#    Then User Validates Saved Bank Account Visibility "true" on Dashboard Screen
#    And User Swipe Saved Bank Account on Dashboard Screen
#    And User Clicks on Bank Delete Button on Dashboard Screen
#    And User Enters "full.kyc.pin" on Pin Field on Manage e& Money Screen
#    And User Clicks on Confirm Button on Manage e& Money Screen
#    Then User Validates Successful Message for Unlinked a Bank on Pop Up
#    And User Clicks on Ok Button on Pop Up
#    Then User Validates Saved Bank Account Visibility "false" on Dashboard Screen

  @TC_040 @Regression
  Scenario: Verify User Performs Resend Flow from Transaction History

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks Balance Card on Dashboard Screen
    And User Clicks on Transfer Entity from Dashboard Screen
    And User Allows Permission on IOS Device
    And User Clicks on Resend Button on Dashboard Screen
    And User Fetches Amount from Amount Field on Transfer Screen
    Then User Validates Amount to be Deducted on Transfer Screen
    And User Clicks on Proceed Button on Transfer Screen
    Then User Validates Payment Method Balance on Transfer Screen
    Then User Validates Amount to be Deducted on Transfer Screen
    And User Clicks on Proceed Button on Transfer Screen
    And User Enters "full.kyc.pin" on Pin Field on Transfer Screen
    And User Clicks on Confirm Button on Transfer Screen
    Then User Validates Successful Message for Transfer Money of Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_041 @Regression
  Scenario: Verify User Add and Delete Card from Wallet Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "wallet.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks on Add New of Saved Card on Dashboard Screen
    And User Enters "full.kyc.pin" on Pin Field on Manage e& Money Screen
    And User Clicks on Confirm Button on Manage e& Money Screen
    And User Enters "card.number" on Card Number Field on Manage e& Money Screen
    And User Enters "card.expiry.date" on Expiry Date Field on Manage e& Money Screen
    And User Enters "card.cvv.number" on CVV Field on Manage e& Money Screen
    And User Clicks on Verify Card on Manage e& Money Screen
    Then User Validates Successful Message for Linked a Card on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Saved Card Visibility "true" on Dashboard Screen
    And User Swipe Saved Debit Card on Dashboard Screen
    And User Clicks on Card Delete Button on Dashboard Screen
    And User Enters "full.kyc.pin" on Pin Field on Manage e& Money Screen
    And User Clicks on Confirm Button on Manage e& Money Screen
    Then User Validates Successful Message for Unlinked a Card on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Saved Card Visibility "false" on Dashboard Screen

  @TC_042 @Sprint_2022.17
  Scenario: Verify User Purchase Amazon US Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "amazon.us.option" Option on Gifting Screen
    And User Fetches Amount of "amazon.us.option" Voucher Option on Gifting Screen
    And User Clicks on "amazon.us.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_043 @Sprint_2022.17
  Scenario: Verify User Purchase Spotify US Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "spotify.us.option" Option on Gifting Screen
    And User Fetches Amount of "spotify.us.option" Voucher Option on Gifting Screen
    And User Clicks on "spotify.us.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_044 @Sprint_2022.17
  Scenario: Verify User Purchase Fortnite Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "fortnite.option" Option on Gifting Screen
    And User Fetches Amount of "fortnite.bucks.option" Voucher Option on Gifting Screen
    And User Clicks on "fortnite.bucks.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_045 @Sprint_2022.17
  Scenario: Verify User Purchase Yalla Ludo Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "yalla.ludo.option" Option on Gifting Screen
    And User Fetches Amount of "yalla.ludo.diamond.option" Voucher Option on Gifting Screen
    And User Clicks on "yalla.ludo.diamond.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_046 @Sprint_2022.17
  Scenario: Verify User Purchase FreeFire Voucher from Gifting Module

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    Then User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "freefire.option" Option on Gifting Screen
    And User Fetches Amount of "freefire.diamonds.option" Voucher Option on Gifting Screen
    And User Clicks on "freefire.diamonds.option" Voucher Option on Gifting Screen
    And User Accept Terms and Conditions on Pop Up
    Then User Validates Payment Method Balance on Gifting Screen
    Then User Validates Amount to be Deducted on Gifting Screen
    And User Clicks Proceed Button on Gifting Screen
    And User Enters "full.kyc.pin" on Pin Field on Gifting Screen
    And User Clicks Login Proceed Button on Gifting Screen
    And User Validates Successful Message for Purchase Voucher on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_047 @Regression
  Scenario: Verify User Performs IMT Transfer Via Cash PickUp

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.cash.pickup.option" from Country Dropdown on IMT Screen
    And User Selects "imt.cash.pickup.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_048 @Regression
  Scenario: Verify User Performs IMT Transfer Via Send to Bank

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.send.to.bank.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.bank.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_049 @Regression
  Scenario: Verify User Performs IMT Transfer Via Send to Mobile Wallet

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.send.to.mobile.wallet.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.mobile.wallet.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_050 @Sprint_2022.17
  Scenario: Verify User Performs Send to Myself on IMT Transfer Via Cash PickUp

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.cash.pickup.option" from Country Dropdown on IMT Screen
    And User Selects "imt.cash.pickup.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer of Send to Myself on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_051 @Sprint_2022.17
  Scenario: Verify User Performs Send to Myself on IMT Transfer Via Send to Bank

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.send.to.bank.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.bank.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer of Send to Myself on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_052 @Sprint_2022.17
  Scenario: Verify User Performs Send to Myself on IMT Transfer Via Send to Mobile Wallet

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "imt.option" Option on Dashboard Screen
#    Then User Calls API to Fetch IMT Partner Name
    Then User Selects Country w.r.t "imt.send.to.mobile.wallet.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.mobile.wallet.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    And User Validates Transaction Fee on IMT Screen
    And User Validates VAT on IMT Screen
    Then User Validates Total Amount with Fee and Vat Included on IMT Screen
    And User Clicks on Next Button on IMT Screen
    And User Clicks on Radio Button on Terms and Conditions on Pop Up Window
    Then User Clicks Accept Button on Pop Up Window
    And User Fills Form of IMT Transfer of Send to Myself on IMT Screen
    Then User Clicks on Next Button on IMT Screen
    And User Enters "full.kyc.pin" on Pin Field on IMT Screen
    And User Clicks on Confirm Button on IMT Screen
    And User Rejects Permission on IOS Device
    And User Validates Successful Message for IMT Transfer on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_053 @Sprint_2022.17
  Scenario: Verify User Performs Cash Pick Up IMT Transfer for No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "imt.option" Option on Dashboard Screen
    Then User Selects Country w.r.t "imt.cash.pickup.option" from Country Dropdown on IMT Screen
    And User Selects "imt.cash.pickup.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    Then User Validates "imt.insufficient.balance.msg" Insufficient Balance Message on IMT Screen

  @TC_054 @Sprint_2022.17
  Scenario: Verify User Performs Send to Bank IMT Transfer for No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "imt.option" Option on Dashboard Screen
    Then User Selects Country w.r.t "imt.send.to.bank.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.bank.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    Then User Validates "imt.insufficient.balance.msg" Insufficient Balance Message on IMT Screen

  @TC_055 @Sprint_2022.17
  Scenario: Verify User Performs Send to Mobile Wallet IMT Transfer for No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "imt.option" Option on Dashboard Screen
    Then User Selects Country w.r.t "imt.send.to.mobile.wallet.option" from Country Dropdown on IMT Screen
    And User Selects "imt.send.to.mobile.wallet.option" from Receiver Option on IMT Screen
    And User Enters "imt.transfer.amount" on Amount Field on IMT Screen
    Then User Validates "imt.insufficient.balance.msg" Insufficient Balance Message on IMT Screen

  @TC_056 @Sprint_2022.17
  Scenario: Verify Gifting Prices for Mintroute Billers of Amazon UAE

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "amazon.uae.option" Option on Gifting Screen
    Then User Validates "amazon.uae.prices" Prices on Gifting Screen

  @TC_057 @Sprint_2022.17
  Scenario: Verify Gifting Prices for Mintroute Billers of Shahid VIP

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "shahid.vip.option" Option on Gifting Screen
    Then User Validates "shahid.vip.prices" Prices on Gifting Screen

  @TC_058 @Sprint_2022.17
  Scenario: Verify Gifting Prices for Mintroute Billers of Starzplay

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "starzplay.option" Option on Gifting Screen
    Then User Validates "starzplay.prices" Prices on Gifting Screen

  @TC_059 @Sprint_2022.17
  Scenario: Verify User Performs Bill Payment of ADDC

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "pay.bills.option" Option on Dashboard Screen
    And User Clicks on "addc.list.option" Option on Pay Bills Screen
    Then User Clicks on Add Account Button on Pay Bills Screen
    And User Enters "testing.name" on Name Field on Pay Bills Screen
    And User Enters "addc.account.number" on Account Number Field on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Fetches Amount from Amount Field on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    Then User Validates Payment Method Balance on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Enters "full.kyc.pin" on Pin Field on Pay Bills Screen
    And User Clicks on Confirm Button on Pay Bills Screen
    Then User Validates Successful Message for Pay Bills of ADDC on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_060 @Sprint_2022.17
  Scenario: Verify User Performs Bill Payment of AADC

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Fetches Wallet Balance on Dashboard Screen
    And User Clicks on "pay.bills.option" Option on Dashboard Screen
    And User Clicks on "aadc.list.option" Option on Pay Bills Screen
    Then User Clicks on Add Account Button on Pay Bills Screen
    And User Enters "testing.name" on Name Field on Pay Bills Screen
    And User Enters "aadc.account.number" on Account Number Field on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Fetches Amount from Amount Field on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    Then User Validates Payment Method Balance on Pay Bills Screen
    Then User Validates Amount to be Deducted on Pay Bills Screen
    And User Clicks on Proceed Button on Pay Bills Screen
    And User Enters "full.kyc.pin" on Pin Field on Pay Bills Screen
    And User Clicks on Confirm Button on Pay Bills Screen
    Then User Validates Successful Message for Pay Bills of AADC on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Wallet Balance with Deducted Amount on Dashboard Screen

  @TC_061 @Sprint_2022.18
  Scenario: Verify Expandable Payment Services on Dashboard Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Validates Expandable Payment Services Option "show.more.expand" on Dashboard Screen
    And User Clicks on "show.more.expand" Expandable Button on Dashboard Screen
    And User Validates Expandable Payment Services Option "show.less.expand" on Dashboard Screen
    And User Clicks on "show.less.expand" Expandable Button on Dashboard Screen
    And User Validates Expandable Payment Services Option "show.more.expand" on Dashboard Screen

  @TC_062 @Sprint_2022.18
  Scenario: Verify User Navigate till Upgrade Flow for Non-KYC for Cash Gift Add Money via Debit Card

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "gifting.option" Option on Dashboard Screen
    And User Clicks on "cash.gift.option" Option on Gifting Screen
    Then User Clicks Add Money Button on Gifting Screen
    Then User Clicks on "debit.card.list.option" Option on Add Money Screen
    And User Enters "add.money.transaction.amount" on Amount Field on Add Money Screen
    And User Clicks the Saved Debit Card on Add Money Screen
    And User Clicks on Confirm Button on Add Money Screen
    Then User Validates Upgrade Account Flow Message on Pop Up
    And User Clicks on Upgrade Button on Pop Up
    And User Clicks on Camera Radio Button on Terms and Conditions on Pop Up Window
    And User Clicks on Open Camera Button on Pop Up
    And User Allows Permission on IOS Device
    Then User Validates Camera is Opened on Pop Up

  @TC_063 @Sprint_2022.18
  Scenario: Verify User Navigate till Upgrade Flow for Non-KYC for Direct Pay Add Money via Debit Card

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "direct.pay.option" Option on Dashboard Screen
    And User Selects Saved Account "saved.direct.pay.account" on Direct Pay Screen
    And User Clicks on Add Money Button on Direct Pay Screen
    Then User Clicks on "debit.card.list.option" Option on Add Money Screen
    And User Enters "add.money.transaction.amount" on Amount Field on Add Money Screen
    And User Clicks the Saved Debit Card on Add Money Screen
    And User Clicks on Confirm Button on Add Money Screen
    Then User Validates Upgrade Account Flow Message on Pop Up
    And User Clicks on Upgrade Button on Pop Up
    And User Clicks on Camera Radio Button on Terms and Conditions on Pop Up Window
    And User Clicks on Open Camera Button on Pop Up
    And User Allows Permission on IOS Device
    Then User Validates Camera is Opened on Pop Up

  @TC_064 @Sprint_2022.18
  Scenario: Verify User Performs Invite a Friend via Dashboard Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "show.more.expand" Expandable Button on Dashboard Screen
    And User Clicks on "invite.friend.option" Option on Dashboard Screen
#    Then User Calls API to Fetch Status of Rewarding Journey
    Then User Validates Reward Journey Screen as per Status on Invite Friend Screen
    And User Clicks on Send Invites Button on Invite Friend Screen
    And User Allows Permission on IOS Device
    And User Fetches Pending Count on Invite Friend Screen
    And User Clicks Invite Button for "unregistered.test.invite.account" on Invite Friend Screen
    And User Clicks on Yes Button on Invite Friend Screen
    Then User Validates Success Message for Invite Friend on Pop Up
    And User Clicks on Ok Button on Pop Up
    Then User Validates Pending Count Increased by One on Invite Friend Screen

  @TC_065 @Sprint_2022.18
  Scenario: Verify User Performs Registered Invite a Friend via Profile Screen

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "profile.option" Option on Bottom Navigation on Dashboard Screen
    And User Clicks on "invite.friend.p.option" from Profile Option on Dashboard Screen
#    Then User Calls API to Fetch Status of Rewarding Journey
    Then User Validates Reward Journey Screen as per Status on Invite Friend Screen
    And User Clicks on Send Invites Button on Invite Friend Screen
    And User Allows Permission on IOS Device
    And User Fetches Pending Count on Invite Friend Screen
    And User Clicks Invite Button for "registered.test.invite.account" on Invite Friend Screen
    And User Clicks on Yes Button on Invite Friend Screen
    Then User Validates Successful Message for Already Registered Account for Invite on Pop Up
    And User Clicks on Lets Try Again Button on Pop Up
    Then User Validates Pending Count Remains Same on Invite Friend Screen

  @TC_066 @Sprint_2022.18
  Scenario: Verify User Performs Request Money via Msisdn from Full KYC

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "request.money.option" Option on Dashboard Screen
    And User Enters "request.money.msisdn" on MSISDN on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    And User Enters "request.money.amount" on Amount Field on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    Then User Validates Requested Money Amount on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    Then User Validates Successful Message for Request Money on Pop Up

  @TC_067 @Sprint_2022.18
  Scenario: Verify User Performs Request Money via QR Code from Full KYC

    And User Enters "full.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "full.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "request.money.option" Option on Dashboard Screen
    And User Clicks on Request from QR Code Button on Request Money Screen
    Then User Validates QR Code is Displayed on Request Money Screen

  @TC_068 @Sprint_2022.18
  Scenario: Verify User Performs Request Money from No KYC

    And User Enters "no.kyc.msisdn" on MSISDN Field on Login Screen
    And User Clicks on Join Button on Login Screen
    And User Enters "by.pass.otp" Code on OTP Field on Login Screen
    And User Clicks on Confirm Button on Login Screen
    And User Enters "no.kyc.pin" on Pin Field on Login Screen
    And User Clicks on Login Confirm Button on Login Screen
    And User Closes Pop Up Window
    And User Allows Permission on IOS Device
    And User Clicks on "request.money.option" Option on Dashboard Screen
    And User Enters "request.money.msisdn" on MSISDN on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    And User Enters "request.money.amount" on Amount Field on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    Then User Validates Requested Money Amount on Request Money Screen
    And User Clicks on Next Button on Request Money Screen
    Then User Validates Upgrade Account Flow Message on Pop Up
    And User Clicks on Upgrade Button on Pop Up
    And User Clicks on Camera Radio Button on Terms and Conditions on Pop Up Window
    And User Clicks on Open Camera Button on Pop Up
    And User Allows Permission on IOS Device
    Then User Validates Camera is Opened on Pop Up