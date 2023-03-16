Feature: Partner Portal Regression Feature File
  Contains All Partner Portal Regression Module Test Cases

  Background:
    Given User Setup Web Browser Session
    Then User Navigates to "partner.portal.url" URL

  @TC_A_001 @Automation @ScreenNavigation @WEBTest
  Scenario: Verify Partner Portal Login Successfully

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Validates Logged In Successfully "true" on Login Page

  @TC_A_002 @Automation @ScreenNavigation
  Scenario: Verify Partner Portal Logout Successfully

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Logout Button on Header Page
    And User Validates Logged Out Successfully "true" on Login Page

  @TC_A_003 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Hierarchy Management Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    And User Validates Hierarchy Management Heading Visibility "true" on Hierarchy Management Page

  @TC_A_004 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Balance Inquiry Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "balance.inquiry.option" Option on Dashboard Page
    And User Validates Balance Inquiry Heading Visibility "true" on Balance Inquiry Page

  @TC_A_005 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Refund Payment Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "refund.payment.option" Option on Dashboard Page
    And User Validates Refund Payment Heading Visibility "true" on Refund Payment Page

  @TC_A_006 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Confirm CashOut Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "confirm.cashout.option" Option on Dashboard Page
    And User Validates Confirm CashOut Heading Visibility "true" on Confirm CashOut Page

  @TC_A_007 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Fund Out Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "fund.out.option" Start Option on Dashboard Page
    And User Validates Fund Out Heading Visibility "true" on Fund Out Page

  @TC_A_008 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Transaction History Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    And User Validates Transaction History Heading Visibility "true" on Transaction History Page

  @TC_A_009 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Bulk Consumer Payment Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "bulk.consumer.payment.option" Start Option on Dashboard Page
    And User Validates Bulk Consumer Payment Heading Visibility "true" on Bulk Consumer Payment Page

  @TC_A_010 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Bulk B2B Payment Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "bulk.b2b.payment.option" Start Option on Dashboard Page
    And User Validates Bulk BtB Payment Heading Visibility "true" on Bulk BtB Payment Page

  @TC_A_011 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Merchant Deposit Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "merchant.deposit.option" Option on Dashboard Page
    And User Validates Merchant Deposit Heading Visibility "true" on Merchant Deposit Page

  @TC_A_012 @Automation @ScreenNavigation
  Scenario: Verify Agent Admin User Can Visit Transaction Report Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.report.option" Option on Dashboard Page
    And User Validates Transaction Report Heading Visibility "true" on Transaction Report Page

  @TC_A_013 @Automation @ScreenNavigation
  Scenario: Verify Merchant Admin User Can Visit Hierarchy Management Page

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    And User Validates Hierarchy Management Heading Visibility "true" on Hierarchy Management Page

  @TC_A_014 @Automation @ScreenNavigation
  Scenario: Verify Merchant Admin User Can Visit Balance Inquiry Page

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "balance.inquiry.option" Option on Dashboard Page
    And User Validates Balance Inquiry Heading Visibility "true" on Balance Inquiry Page

  @TC_A_015 @Automation @ScreenNavigation
  Scenario: Verify Merchant Admin User Can Visit Transaction History Page

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    And User Validates Transaction History Heading Visibility "true" on Transaction History Page

  @TC_A_016 @Automation @ScreenNavigation
  Scenario: Verify Merchant Admin User Can Visit Transaction Report Page

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.report.option" Option on Dashboard Page
    And User Validates Transaction Report Heading Visibility "true" on Transaction Report Page

  @TC_A_017 @Automation @BulkUpload @Transaction
  Scenario: Verify Agent User Performs Bulk Consumer Payment on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "bulk.consumer.payment.option" Start Option on Dashboard Page
    And User Uploads "bulk.consumer.payment.excel" Excel on Bulk Consumer Payment Page
    And User Selects Scheduled Date on Bulk Consumer Payment Page
    And User Selects "normal.account.profile" Account on Bulk Consumer Payment Page
    And User Enters Random Text on Title Field on Bulk Consumer Payment Page
    Then User Clicks Submit Button on Bulk Consumer Payment Page
    Then User Clicks Yes on Pop Up
    And User Validates Request Created Successfully Heading Visibility "true" on Bulk Consumer Payment Page

  @TC_A_018 @Automation @BulkUpload @Transaction
  Scenario: Verify Agent User Performs Bulk B2B Payment on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "bulk.b2b.payment.option" Start Option on Dashboard Page
    And User Uploads "bulk.b2b.payment.excel" Excel on Bulk BtB Payment Page
    And User Selects "mobile.money.profile" Account on Bulk BtB Payment Page
    And User Enters Random Text on Title Field on Bulk BtB Payment Page
    Then User Clicks Submit Button on Bulk BtB Payment Page
    Then User Clicks Yes on Pop Up
    And User Validates Request Created Successfully Heading Visibility "true" on Bulk BtB Payment Page

  @TC_A_019 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page

  @TC_A_020 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter and Status on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page

  @TC_A_021 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter and Transaction ID on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Enters "agent.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Transaction Id is "agent.transaction.id.text" as "true" on Transaction History Page

  @TC_A_022 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter and Wallets on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "agent.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Wallet ID "agent.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_023 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter, Status and Transaction ID on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Enters "agent.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Transaction Id is "agent.transaction.id.text" as "true" on Transaction History Page

  @TC_A_024 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter, Status and Wallets on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Selects "agent.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Wallet ID "agent.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_025 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter, Transaction ID and Wallets on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Enters "agent.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    And User Selects "agent.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Transaction Id is "agent.transaction.id.text" as "true" on Transaction History Page
    And User Validates Wallet ID "agent.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_026 @Automation @TransactionHistory
  Scenario: Verify Agent User Performs Transaction History Search with Date Filter, Status, Transaction ID and Wallets on Partner Portal

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Enters "agent.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    And User Selects "agent.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Transaction Id is "agent.transaction.id.text" as "true" on Transaction History Page
    And User Validates Wallet ID "agent.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_027 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page

  @TC_A_028 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter and Status on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page

  @TC_A_029 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter and Transaction ID on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Enters "merchant.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Transaction Id is "merchant.transaction.id.text" as "true" on Transaction History Page

  @TC_A_030 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter and Wallets on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "merchant.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Wallet ID "merchant.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_031 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter, Status and Transaction ID on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Enters "merchant.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Transaction Id is "merchant.transaction.id.text" as "true" on Transaction History Page

  @TC_A_032 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter, Status and Wallets on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Selects "merchant.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Wallet ID "merchant.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_033 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter, Transaction ID and Wallets on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Enters "merchant.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    And User Selects "merchant.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Transaction Id is "merchant.transaction.id.text" as "true" on Transaction History Page
    And User Validates Wallet ID "merchant.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_034 @Automation @TransactionHistory
  Scenario: Verify Merchant User Performs Transaction History Search with Date Filter, Status, Transaction ID and Wallets on Partner Portal

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "transaction.history.option" Option on Dashboard Page
    Then User Clicks Reset Button on Transaction History Page
    And User Enters "date.from.text" on "date.from.field" Text Field on Transaction History Page
    And User Enters "date.to.text" on "date.to.field" Text Field on Transaction History Page
    And User Selects "status.option" on "status.field" Dropdown Field on Transaction History Page
    And User Enters "merchant.transaction.id.text" on "transaction.id.field" Text Field on Transaction History Page
    And User Selects "merchant.wallets.option" on "wallets.field" Dropdown Field on Transaction History Page
    Then User Clicks Search Button on Transaction History Page
    And User Validates Transaction Date Lies Between "date.from.text" and "date.to.text" as "true" on Transaction History Page
    And User Validates Status is "status.option" as "true" on Transaction History Page
    And User Validates Transaction Id is "merchant.transaction.id.text" as "true" on Transaction History Page
    And User Validates Wallet ID "merchant.wallets.option" Lies on Either From or To Account as "true" on Transaction History Page

  @TC_A_035 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Create a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Name with Value "agent.parent.name" on Hierarchy Management Page
    And User Clicks on Register Branch Button on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Enters "establishment.date.text" on "establishment.date.field" Text Field on Hierarchy Management Page
    And User Enters "identification.number.one" on "identification.number.one.field" Text Field on Hierarchy Management Page
    And User Selects "issuing.authority.value" from "issuing.authority.field" Dropdown Field on Hierarchy Management Page
    And User Enters "issue.date.text" on "issue.date.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    And User Uploads "file.one" on "file.one.field" Field on Hierarchy Management Page
    And User Enters "identification.number.two" on "identification.number.two.field" Text Field on Hierarchy Management Page
    And User Uploads "file.two" on "file.two.field" Field on Hierarchy Management Page
    And User Enters "street.address.text" on "street.address.field" Text Field on Hierarchy Management Page
    And User Enters "postal.code.text" on "postal.code.field" Text Field on Hierarchy Management Page
    And User Selects "city.value" from "city.field" Dropdown Field on Hierarchy Management Page
    And User Selects "industry.value" from "industry.field" Dropdown Field on Hierarchy Management Page
    And User Enters "gps.long.text" on "gps.long.field" Text Field on Hierarchy Management Page
    And User Enters "gps.lat.text" on "gps.lat.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_036 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Create a L0 Profile User on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "agent.profile.l0.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_037 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Create a L1 Profile User on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "agent.profile.l1.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_038 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Create a Operations Profile User on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "agent.profile.operations.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "iban.account.title.text" on "iban.account.title.field" Text Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    And User Enters "iban.number.text" on "iban.number.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_039 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Create a Till Profile User on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Register Till Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "till.name.text" on "till.name.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_040 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Create a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Name with Value "merchant.parent.name" on Hierarchy Management Page
    And User Clicks on Register Branch Button on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Enters "establishment.date.text" on "establishment.date.field" Text Field on Hierarchy Management Page
    And User Enters "identification.number.one" on "identification.number.one.field" Text Field on Hierarchy Management Page
    And User Selects "issuing.authority.value" from "issuing.authority.field" Dropdown Field on Hierarchy Management Page
    And User Enters "issue.date.text" on "issue.date.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    And User Uploads "file.one" on "file.one.field" Field on Hierarchy Management Page
    And User Enters "identification.number.two" on "identification.number.two.field" Text Field on Hierarchy Management Page
    And User Uploads "file.two" on "file.two.field" Field on Hierarchy Management Page
    And User Enters "street.address.text" on "street.address.field" Text Field on Hierarchy Management Page
    And User Enters "postal.code.text" on "postal.code.field" Text Field on Hierarchy Management Page
    And User Selects "city.value" from "city.field" Dropdown Field on Hierarchy Management Page
    And User Selects "industry.value" from "industry.field" Dropdown Field on Hierarchy Management Page
    And User Enters "gps.long.text" on "gps.long.field" Text Field on Hierarchy Management Page
    And User Enters "gps.lat.text" on "gps.lat.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_041 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Create a L0 Profile User on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "merchant.profile.l0.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_042 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Create a L1 Profile User on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "merchant.profile.l1.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_043 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Create a Operations Profile User on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Register Employee Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "email.text" on "email.field" Text Field on Hierarchy Management Page
    And User Enters "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Selects "merchant.profile.operations.value" from "profile.field" Dropdown Field on Hierarchy Management Page
    And User Enters "iban.account.title.text" on "iban.account.title.field" Text Field on Hierarchy Management Page
    And User Enters "emirates.id.text" on "emirates.id.field" Text Field on Hierarchy Management Page
    And User Enters "expiry.date.text" on "expiry.date.field" Text Field on Hierarchy Management Page
    And User Enters "iban.number.text" on "iban.number.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_044 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Create a Till Profile User on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Name with Value "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Register Till Button on Hierarchy Management Page
    And User Enters "username.text" on "username.field" Text Field on Hierarchy Management Page
    And User Enters "till.name.text" on "till.name.field" Text Field on Hierarchy Management Page
    Then User Clicks Register Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Present "true" on Hierarchy Management Page

  @TC_A_045 @Automation @HierarchyManagement
  Scenario: Verify Agent Master Admin User can Remove a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Node Name under "agent.parent.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Remove Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    And User Validates Node is Present "false" on Hierarchy Management Page

  @TC_A_046 @Automation @HierarchyManagement
  Scenario: Verify Merchant Master Admin User can Remove a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Node Name under "merchant.parent.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Remove Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    And User Validates Node is Present "false" on Hierarchy Management Page

  @TC_A_047 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Remove a Profile on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Node Name under "agent.branch.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Remove Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    And User Validates Node is Present "false" on Hierarchy Management Page

  @TC_A_048 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Remove a Profile on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Node Name under "merchant.branch.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Remove Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Close on Pop Up
    And User Validates Node is Present "false" on Hierarchy Management Page

  @TC_A_049 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Block a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "agent.parent.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Block Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    And User Validates Node is Blocked "true" on Hierarchy Management Page

  @TC_A_050 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Block a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "merchant.parent.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Block Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    And User Validates Node is Blocked "true" on Hierarchy Management Page

  @TC_A_051 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Unblock a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Block Node Name under "agent.parent.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Unblock Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    And User Validates Node is Blocked "false" on Hierarchy Management Page

  @TC_A_052 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Unblock a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Block Node Name under "merchant.parent.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Unblock Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    And User Validates Node is Blocked "false" on Hierarchy Management Page

  @TC_A_053 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Block a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "agent.branch.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Block Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Blocked "true" on Hierarchy Management Page

  @TC_A_054 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Block a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "merchant.branch.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Block Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Blocked "true" on Hierarchy Management Page

  @TC_A_055 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Unblock a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Block Node Name under "agent.branch.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Unblock Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Validates Node is Blocked "false" on Hierarchy Management Page

  @TC_A_056 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Unblock a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Block Node Name under "merchant.branch.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Unblock Button on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    And User Clicks Ok Button on Pop Up
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Validates Node is Blocked "false" on Hierarchy Management Page

  @TC_A_057 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Update a Branch on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "agent.branch.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Update Button on Hierarchy Management Page
    And User Updates "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Clicks on Update Button of "full.name.field" Field on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    Then User Refreshes the Browser
    And User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    And User Clicks on Updated Node Name on Hierarchy Management Page
    Then User Validates Name of the Node on Hierarchy Management Page

  @TC_A_058 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Update a Branch on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "merchant.branch.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Update Button on Hierarchy Management Page
    And User Updates "full.name.text" on "full.name.field" Text Field on Hierarchy Management Page
    And User Clicks on Update Button of "full.name.field" Field on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    Then User Refreshes the Browser
    And User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    And User Clicks on Updated Node Name on Hierarchy Management Page
    Then User Validates Name of the Node on Hierarchy Management Page

  @TC_A_059 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Update a Profile on Hierarchy Management Screen

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "agent.branch.name" Excluding "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Update Button on Hierarchy Management Page
    And User Updates "full.name.text" on "surname.field" Text Field on Hierarchy Management Page
    And User Clicks on Update Button of "surname.field" Field on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    Then User Refreshes the Browser
    And User Clicks on Node Dropdown with Value "agent.parent.name" on Hierarchy Management Page
    And User Clicks on Node Dropdown with Value "agent.branch.name" on Hierarchy Management Page
    And User Clicks on Updated Node Name on Hierarchy Management Page
    Then User Validates Name of the Node on Hierarchy Management Page

  @TC_A_060 @Automation @HierarchyManagement

  Scenario: Verify Merchant Master Admin User can Update a Profile on Hierarchy Management Screen

    And User Enters "pp.merchant.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.merchant.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "hierarchy.management.option" Option on Dashboard Page
    Then User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    Then User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    Then User Clicks on Random Unblock Node Name under "merchant.branch.name" Excluding "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Update Button on Hierarchy Management Page
    And User Updates "full.name.text" on "surname.field" Text Field on Hierarchy Management Page
    And User Clicks on Update Button of "surname.field" Field on Hierarchy Management Page
    And User Clicks Yes on Pop Up
    Then User Refreshes the Browser
    And User Clicks on Node Dropdown with Value "merchant.parent.name" on Hierarchy Management Page
    And User Clicks on Node Dropdown with Value "merchant.branch.name" on Hierarchy Management Page
    And User Clicks on Updated Node Name on Hierarchy Management Page
    Then User Validates Name of the Node on Hierarchy Management Page

  @TC_A_061 @Automation @HierarchyManagement

  Scenario: Verify Agent Master Admin User can Perform Refund Payment on Refund Payment Page

    And User Enters "pp.agent.admin.user" on Username Field on Partner Portal Login Page
    And User Enters "pp.agent.admin.pass" on Password Field on Partner Portal Login Page
    And User Clicks on Sign In Button on Partner Portal Login Page
    And User Clicks Navigation "refund.payment.option" Option on Dashboard Page
    Then User Enters "" Transaction ID on Refund Payment Page
    And User Enters "" Amount on Refund Payment Page
    And User Clicks Refund Button on Refund Payment Page


