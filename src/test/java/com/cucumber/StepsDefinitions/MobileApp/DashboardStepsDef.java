package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.DashboardPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class DashboardStepsDef extends HarnessVariables {

    DashboardPageFactory dashboardPage;
    String navigateProp = "navigation.properties";

    public DashboardStepsDef() throws Exception {
        dashboardPage = new DashboardPageFactory();
    }

    @And("User Clicks on {string} Option on Dashboard Screen")
    public void userClicksOnOptionOnDashboardScreen(String textToSelect) throws Exception {
        textToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(textToSelect);
        dashboardPage.clickNavigateOption(textToSelect);
    }

    @And("User Fetches Wallet Balance on Dashboard Screen")
    public void userFetchesWalletBalanceOnDashboardScreen() {
        WALLET_BALANCE = dashboardPage.getWalletBalance();
    }

    @Then("User Validates Wallet Balance with Deducted Amount on Dashboard Screen")
    public void userValidatesWalletBalanceWithDeductedAmountOnDashboardScreen() throws IOException {
        dashboardPage.validateWalletBalanceWithDeductedAmount(WALLET_BALANCE,ENTERED_AMOUNT);
    }

    @And("User Clicks on {string} Option on Bottom Navigation on Dashboard Screen")
    public void userClicksOnOptionOnBottomNavigationOnDashboardScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        dashboardPage.clickBottomNavigateOption(optionToSelect);
    }

    @Then("User Validates Wallet Balance with Added Amount on Dashboard Screen")
    public void userValidatesWalletBalanceWithAddedAmountOnDashboardScreen() throws IOException {
        dashboardPage.validateWalletBalanceWithAddedAmount(WALLET_BALANCE,ENTERED_AMOUNT);
    }

    @And("User Clicks Logout Button on Dashboard Screen")
    public void userClicksLogoutButtonOnDashboardScreen() {
        dashboardPage.clickLogoutButton();
    }

    @And("User Clicks on Add Money Button on Dashboard Screen")
    public void userClicksOnAddMoneyButtonOnDashboardScreen() {
        dashboardPage.clickAddMoneyButton();
    }

    @And("User Validates Add Money Button {string} on Dashboard Screen")
    public void userValidatesAddMoneyButtonOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateAddMoneyButtonState(!expectedCondition.equals("disabled"));
    }

    @And("User Validates Send Money Button {string} on Dashboard Screen")
    public void userValidatesSendMoneyButtonOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateSendMoneyButtonState(!expectedCondition.equals("disabled"));
    }

    @And("User Clicks Balance Card on Dashboard Screen")
    public void userClicksBalanceCardOnDashboardScreen() {
        dashboardPage.clickBalanceCard();
    }

    @And("User Validates Transaction History Heading Visibility {string} on Dashboard Screen")
    public void userValidatesTransactionHistoryHeadingVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateTransactionHistoryHeadingVisibility(expectedCondition.equals("true"));
    }

    @And("User Validates Promotion Banner on Dashboard Screen")
    public void userValidatesPromotionBannerOnDashboardScreen() throws IOException {
        dashboardPage.validatePromotionBanner();
    }

    @And("User Validates Agents Listing on Dashboard Screen")
    public void userValidatesAgentsListingOnDashboardScreen() throws IOException {
        dashboardPage.validateAgentListing();
    }

    @Then("User Clicks on Agents View All on Dashboard Screen")
    public void userClicksOnAgentsViewAllOnDashboardScreen() {
        dashboardPage.clickAgentViewAllButton();
    }

    @And("User Validates Merchants Listing on Dashboard Screen")
    public void userValidatesMerchantsListingOnDashboardScreen() throws IOException {
        dashboardPage.validateMerchantListing();
    }

    @Then("User Clicks on Merchants View All on Dashboard Screen")
    public void userClicksOnMerchantsViewAllOnDashboardScreen() {
        dashboardPage.clickMerchantViewAllButton();
    }

    @And("User Validates List View Tab on Dashboard Screen")
    public void userValidatesListViewTabOnDashboardScreen() throws IOException {
        dashboardPage.validateListViewTab();
    }

    @And("User Validates Map View on Dashboard Screen")
    public void userValidatesMapViewOnDashboardScreen() throws IOException {
        dashboardPage.validateMapViewTab();
    }

    @And("User Validates Wallet Heading Visibility {string} on Dashboard Screen")
    public void userValidatesWalletHeadingVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateWalletHeadingVisibility(expectedCondition.equals("true"));
    }

    @And("User Validates Saved Cards Heading Visibility {string} on Dashboard Screen")
    public void userValidatesSavedCardsHeadingVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateSavedCardsHeadingVisibility(expectedCondition.equals("true"));
    }

    @And("User Validates Saved Banks Heading Visibility {string} on Dashboard Screen")
    public void userValidatesSavedBanksHeadingVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateSavedBanksHeadingVisibility(expectedCondition.equals("true"));
    }

    @And("User Validates Profile Heading Visibility {string} on Dashboard Screen")
    public void userValidatesProfileHeadingVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateProfileHeadingVisibility(expectedCondition.equals("true"));
    }

    @And("User Clicks on {string} from Profile Option on Dashboard Screen")
    public void userClicksOnFromProfileOptionOnDashboardScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        dashboardPage.clickProfileOption(optionToSelect);
    }

    @Then("User Validates My Documents Heading on Dashboard Screen")
    public void userValidatesMyDocumentsHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateMyDocumentsHeading();
    }

    @Then("User Validates Bank Accounts Heading on Dashboard Screen")
    public void userValidatesBankAccountsHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateBankAccountsHeading();
    }

    @Then("User Validates Account Access Heading on Dashboard Screen")
    public void userValidatesAccountAccessHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateAccountAccessHeading();
    }

    @Then("User Validates International Remittance Beneficiaries Heading on Dashboard Screen")
    public void userValidatesInternationalRemittanceBeneficiariesHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateInternationalRemittanceBeneficiariesHeading();
    }

    @Then("User Validates Direct Pay Heading on Dashboard Screen")
    public void userValidatesDirectPayHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateDirectPayHeading();
    }

    @Then("User Validates Services and Utilities Heading on Dashboard Screen")
    public void userValidatesServicesAndUtilitiesHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateServicesAndUtilitiesHeading();
    }

    @Then("User Validates FAQs Heading on Dashboard Screen")
    public void userValidatesFAQsHeadingOnDashboardScreen() throws IOException {
        dashboardPage.validateFAQsHeading();
    }

    @Then("User Validates Contact Us Mobile Number on Dashboard Screen")
    public void userValidatesContactUsMobileNumberOnDashboardScreen() throws Exception {
        dashboardPage.validateMobileNumber(CONTACT_US_MOBILE_NUMBER);
    }

    @Then("User Clicks on Send Money Button on Dashboard Screen")
    public void userClicksOnSendMoneyButtonOnDashboardScreen() {
        dashboardPage.clickSendMoneyButton();
    }

    @Then("User Validates Agents Table is in Ascending Order on Dashboard Screen")
    public void userValidatesAgentsTableIsInAscendingOrderOnDashboardScreen() throws IOException {
        dashboardPage.validateAgentTableInAscending();
    }

    @Then("User Validates Agents List View is in Ascending Order on Dashboard Screen")
    public void userValidatesAgentsListViewIsInAscendingOrderOnDashboardScreen() throws IOException {
        dashboardPage.validateAgentListViewInAscending();
    }

    @And("User Fetches Agents Names from Agents Table on Dashboard Screen")
    public void userFetchesAgentsNamesFromAgentsTableOnDashboardScreen() {
        AGENTS = dashboardPage.getAgentsNamesFromTable();
    }

    @And("User Validates Names Order on Agents List View on Dashboard Screen")
    public void userValidatesNamesOrderOnAgentsListViewOnDashboardScreen() throws IOException {
        dashboardPage.validateAgentsNameList(AGENTS);
    }

    @And("User Fetches Merchants Names from Agents Table on Dashboard Screen")
    public void userFetchesMerchantsNamesFromAgentsTableOnDashboardScreen() {
        MERCHANTS = dashboardPage.getMerchantsNamesFromTable();
    }

    @Then("User Validates Merchants Table is in Ascending Order on Dashboard Screen")
    public void userValidatesMerchantsTableIsInAscendingOrderOnDashboardScreen() throws IOException {
        dashboardPage.validateMerchantTableInAscending();
    }

    @Then("User Validates Merchants List View is in Ascending Order on Dashboard Screen")
    public void userValidatesMerchantsListViewIsInAscendingOrderOnDashboardScreen() throws IOException {
        dashboardPage.validateMerchantListViewInAscending();
    }

    @And("User Validates Merchants Order on Agents List View on Dashboard Screen")
    public void userValidatesMerchantsOrderOnAgentsListViewOnDashboardScreen() throws IOException {
        dashboardPage.validateMerchantsNameList(MERCHANTS);
    }

    @And("User Clicks on Add New of Saved Bank Accounts on Dashboard Screen")
    public void userClicksOnAddNewOfSavedBankAccountsOnDashboardScreen() {
        dashboardPage.clickBankAddNewButton();
    }

    @Then("User Validates Saved Bank Account Visibility {string} on Dashboard Screen")
    public void userValidatesSavedBankAccountVisibilityOnDashboardScreen(String expectedCondition) throws IOException {
        dashboardPage.validateSavedBankVisibility(SAVED_BANK,expectedCondition.equals("true"));
    }

    @And("User Swipe Saved Bank Account on Dashboard Screen")
    public void userSwipeSavedBankAccountOnDashboardScreen() {
        dashboardPage.swipeSavedBank(SAVED_BANK);
    }

    @And("User Clicks on Bank Delete Button on Dashboard Screen")
    public void userClicksOnBankDeleteButtonOnDashboardScreen() {
        dashboardPage.clickBankDeleteButton();
    }

    @And("User Clicks on Transfer Entity from Dashboard Screen")
    public void userClicksOnTransferEntityFromDashboardScreen() {
        dashboardPage.clickTransferEntity();
    }

    @And("User Clicks on Resend Button on Dashboard Screen")
    public void userClicksOnResendButtonOnDashboardScreen() {
        dashboardPage.clickResendButton();
    }

    @And("User Clicks on Add New of Saved Card on Dashboard Screen")
    public void userClicksOnAddNewOfSavedCardOnDashboardScreen() {
        dashboardPage.clickCardAddNewButton();
    }

    @Then("User Validates Saved Card Visibility {string} on Dashboard Screen")
    public void userValidatesSavedCardVisibilityOnDashboardScreen(String expectedCondition) throws Exception {
        dashboardPage.validateSavedCardVisibility(SAVED_CARD,expectedCondition.equals("true"));
    }

    @And("User Swipe Saved Debit Card on Dashboard Screen")
    public void userSwipeSavedDebitCardOnDashboardScreen() {
        dashboardPage.swipeSavedCard(SAVED_CARD);
    }

    @And("User Clicks on Card Delete Button on Dashboard Screen")
    public void userClicksOnCardDeleteButtonOnDashboardScreen() {
        dashboardPage.clickCardDeleteButton();
    }

    @And("User Validates Expandable Payment Services Option {string} on Dashboard Screen")
    public void userValidatesExpandablePaymentServicesOptionOnDashboardScreen(String optionToValidate) throws Exception {
        optionToValidate = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToValidate);
        dashboardPage.validateExpandablePaymentServicesOption(optionToValidate);
    }

    @And("User Clicks on {string} Expandable Button on Dashboard Screen")
    public void userClicksOnExpandableButtonOnDashboardScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        dashboardPage.clickExpandableButton(optionToSelect);
    }
}
