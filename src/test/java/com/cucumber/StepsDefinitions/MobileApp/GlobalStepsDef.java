package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.PopUpFactory;
import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.ElementFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.WaitFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class GlobalStepsDef extends HarnessVariables {

    PopUpFactory popUp;
    String runPropFile = "run.properties";
    String testDataProp = "testData.properties";

    public GlobalStepsDef() throws Exception {
        popUp = new PopUpFactory();
    }

    @Given("User Setup Web Browser Session")
    public void userSetupWebBrowserSession() throws Exception {
        serviceFactoryInstance.setDriver(serviceFactoryInstance.getBrowser());
        deviceName = "WEB";
        waitFactory = new WaitFactory(ServiceFactory.getDriver());
        elementFactory = new ElementFactory(ServiceFactory.getDriver());
    }

    @Given("User Setup Android Application Session")
    public void userSetupAndroidApplicationSession() throws Exception {
        serviceFactoryInstance.setAndroidDriver();
        deviceName = "ANDROID";
        waitFactory = new WaitFactory(ServiceFactory.getAndroidDriver());
        elementFactory = new ElementFactory(ServiceFactory.getAndroidDriver());
    }

    @Given("User Setup IOS Application Session")
    public void userSetupIOSApplicationSession() throws Exception {
        serviceFactoryInstance.setIOSDriver();
        deviceName = "IOS";
        waitFactory = new WaitFactory(ServiceFactory.getIOSDriver());
        elementFactory = new ElementFactory(ServiceFactory.getIOSDriver());
    }

    @Then("User Closes Pop Up Window")
    public void userClosesPopUpWindow() {
        popUp.closePopUpWindow();
    }

    @And("User Clicks on Ok Button on Pop Up")
    public void userClicksOnOkButtonOnPopUp() {
        popUp.clickOkButton();
    }

    @Then("User Accept Terms and Conditions on Pop Up")
    public void userAcceptTermsAndConditionsOnPopUp() {
        popUp.acceptTermsAndConditions();
    }

    @And("User Fetches Transaction Time")
    public void userFetchesTransactionTime() {
        TRANSACTION_TIME = getCurrentTime();
    }

    @Then("User Navigates to {string} URL")
    public void userNavigatesToURL(String url) throws Exception {
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(url);
        ServiceFactory.getDriver().get(url);
    }

    @Then("User Validates {string} Title")
    public void userValidatesTitle(String expectedTitle) throws Exception {
        expectedTitle = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(expectedTitle);
        String actualTitle = ServiceFactory.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User Goes Back from Current Screen")
    public void userGoesBackFromCurrentScreen() {
        goBack();
    }

    @And("User Allows Permission on IOS Device")
    public void userAllowsPermissionOnIOSDevice() {
         popUp.allowPermission();
    }

    @And("User Rejects Permission on IOS Device")
    public void userRejectsPermissionOnIOSDevice() {
         popUp.rejectPermission();
    }

    @Then("User Validates Send Invite Message Visibility {string} on PopUp")
    public void userValidatesSendInviteMessageVisibilityOnPopUp(String expectedCondition) throws IOException {
        popUp.validateSendInviteMessageVisibility(expectedCondition.equals("true"));
    }

    @And("User Validates Successful Message for Cash Gift on Pop Up")
    public void userValidatesSuccessfulMessageForCashGiftOnPopUp() throws IOException {
         popUp.validateSuccessfulMessage(SUCCESSFUL_CASH_GIFT_MSG);
    }

    @And("User Clicks Proceed Button on PopUp")
    public void userClicksProceedButtonOnPopUp() {
         popUp.clickProceedButton();
    }

    @And("User Enters {string} on Validation Code Field on Pop Up")
    public void userEntersOnValidationCodeFieldOnPopUp(String textToSelect) throws Exception {
        textToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToSelect);
         popUp.enterCvvCode(textToSelect);
    }

    @Then("User Clicks Add Money Button on Pop Up")
    public void userClicksAddMoneyButtonOnPopUp() {
         popUp.clickAddMoneyButton();
    }

    @Then("User Validates Successful Message for Add Money on Pop Up")
    public void userValidatesSuccessfulMessageForAddMoneyOnPopUp() throws IOException {
         popUp.validateSuccessfulMessageDouble(SUCCESSFUL_ADD_MONEY_MSG);
    }

    @And("User Validates Successful Message for Purchase Voucher on Pop Up")
    public void userValidatesSuccessfulMessageForPurchaseVoucherOnPopUp() throws IOException {
         popUp.validateSuccessfulMessageAdv(SUCCESSFUL_VOUCHER_PURCHASE_MSG);
    }

    @Then("User Validates Successful Message for Direct Pay Account Added on Pop Up")
    public void userValidatesSuccessfulMessageForDirectPayAccountAddedOnPopUp() throws IOException {
         popUp.validateSuccessfulMessage(SUCCESSFUL_ADD_ACCOUNT_MSG);
    }

    @Then("User Validates Successful Message for Direct Pay Account Deleted on Pop Up")
    public void userValidatesSuccessfulMessageForDirectPayAccountDeletedOnPopUp() throws IOException {
         popUp.validateSuccessfulMessage(SUCCESSFUL_DELETE_ACCOUNT_MSG);
    }

    @Then("User Validates Successful Message for Transfer Money of Direct Pay on Pop Up")
    public void userValidatesSuccessfulMessageForTransferMoneyOfDirectPayOnPopUp() throws IOException {
         popUp.validateSuccessfulMessage(SUCCESSFUL_DIRECT_PAY_TRANSFER_MSG);
    }

    @Then("User Validates Quicker Access Pop Up Visibility {string} on Pop Up Window")
    public void userValidatesQuickerAccessPopUpVisibilityOnPopUpWindow(String expectedCondition) throws IOException {
        popUp.validateQuickerAccessPopUpVisibility(expectedCondition.equals("true"));
    }

    @Then("User Clicks on Not Now Button on Pop Up Window")
    public void userClicksOnNotNowButtonOnPopUpWindow() {
        popUp.clickNotNowButton();
    }

    @And("User Waits for Loader to Disappear")
    public void userWaitsForLoaderToDisappear() {
        popUp.waitForLoaderToDisappear();
    }

    @And("User Clicks on Radio Button on Terms and Conditions on Pop Up Window")
    public void userClicksOnRadioButtonOnTermsAndConditionsOnPopUpWindow() {
        popUp.clickRadioButtonOfTermsAndConditions();
    }

    @Then("User Clicks Accept Button on Pop Up Window")
    public void userClicksAcceptButtonOnPopUpWindow() {
        popUp.clickAcceptButton();
    }

    @Then("User Validates Successful Message for Send Money to Agent on Pop Up")
    public void userValidatesSuccessfulMessageForSendMoneyToAgentOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_SEND_MONEY_AGENT_MSG);
    }

    @Then("User Validates Successful Message for Top Up of Etisalat on Pop Up")
    public void userValidatesSuccessfulMessageForTopUpOfEtisalatOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_TOP_UP_ETISALAT_MSG);
    }

    @Then("User Validates Successful Message for Top Up of Du on Pop Up")
    public void userValidatesSuccessfulMessageForTopUpOfDuOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_TOP_UP_DU_MSG);
    }

    @Then("User Validates Successful Message for Top Up of National Bond on Pop Up")
    public void userValidatesSuccessfulMessageForTopUpOfNationalBondOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_TOP_UP_NATIONAL_BOND_MSG);
    }

    @Then("User Validates Successful Message for Top Up of Salik on Pop Up")
    public void userValidatesSuccessfulMessageForTopUpOfSalikOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_TOP_UP_SALIK_MSG);
    }

    @Then("User Validates Successful Message for Pay Bills of Ajman Sewerage on Pop Up")
    public void userValidatesSuccessfulMessageForPayBillsOfAjmanSewerageOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_PAY_BILLS_AJMAN_MSG);
    }

    @Then("User Validates Successful Message for Send Money to Bank on Pop Up")
    public void userValidatesSuccessfulMessageForSendMoneyToBankOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_SEND_TO_BANK_MSG);
    }

    @Then("User Validates Successful Message for Add Money from Bank on Pop Up")
    public void userValidatesSuccessfulMessageForAddMoneyFromBankOnPopUp() throws IOException {
        popUp.validateSuccessfulMessageDoubleBank(SUCCESSFUL_ADD_MONEY_FROM_BANK_MSG);
    }

    @And("User Clicks on Close Button on Pop Up")
    public void userClicksOnCloseButtonOnPopUp() {
        popUp.clickCloseButton();
    }

    @Then("User Validates Successful Message for Linked a Bank on Pop Up")
    public void userValidatesSuccessfulMessageForLinkedABankOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_LINKED_BANK_MSG);
    }

    @Then("User Validates Successful Message for Unlinked a Bank on Pop Up")
    public void userValidatesSuccessfulMessageForUnlinkedABankOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_UNLINKED_BANK_MSG);
    }

    @Then("User Validates Successful Message for Transfer Money of Transfer on Pop Up")
    public void userValidatesSuccessfulMessageForTransferMoneyOfTransferOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_TRANSFER_MSG);
    }

    @Then("User Validates Successful Message for Linked a Card on Pop Up")
    public void userValidatesSuccessfulMessageForLinkedACardOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_LINKED_CARD_MSG);
    }

    @Then("User Validates Successful Message for Unlinked a Card on Pop Up")
    public void userValidatesSuccessfulMessageForUnlinkedACardOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_UNLINKED_CARD_MSG);
    }

    @And("User Validates Successful Message for IMT Transfer on Pop Up")
    public void userValidatesSuccessfulMessageForIMTTransferOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_IMT_TRANSFER_MSG);
    }

    @Then("User Validates Successful Message for Pay Bills of ADDC on Pop Up")
    public void userValidatesSuccessfulMessageForPayBillsOfADDCOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_PAY_BILLS_ADDC_MSG);
    }

    @Then("User Validates Successful Message for Pay Bills of AADC on Pop Up")
    public void userValidatesSuccessfulMessageForPayBillsOfAADCOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(SUCCESSFUL_PAY_BILLS_AADC_MSG);
    }

    @Then("User Validates Upgrade Account Flow Message on Pop Up")
    public void userValidatesUpgradeAccountFlowMessageOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(UPGRADE_ACCOUNT_FLOW_MSG);
    }

    @And("User Clicks on Upgrade Button on Pop Up")
    public void userClicksOnUpgradeButtonOnPopUp() {
        popUp.clickUpgradeButton();
    }

    @And("User Clicks on Open Camera Button on Pop Up")
    public void userClicksOnOpenCameraButtonOnPopUp() {
        popUp.clickOpenCameraButton();
    }

    @Then("User Validates Camera is Opened on Pop Up")
    public void userValidatesCameraIsOpenedOnPopUp() throws IOException {
        popUp.validateCameraIsOpened();
    }

    @And("User Clicks on Camera Radio Button on Terms and Conditions on Pop Up Window")
    public void userClicksOnCameraRadioButtonOnTermsAndConditionsOnPopUpWindow() {
        popUp.clickCameraRadioButtonOfTermsAndConditions();
    }

    @Then("User Validates Success Message for Invite Friend on Pop Up")
    public void userValidatesSuccessMessageForInviteFriendOnPopUp() throws IOException {
        popUp.validateSuccessMessage(SUCCESSFUL_INVITE_MSG);
    }

    @Then("User Validates Successful Message for Already Registered Account for Invite on Pop Up")
    public void userValidatesSuccessfulMessageForAlreadyRegisteredAccountForInviteOnPopUp() throws IOException {
        popUp.validateSuccessfulMessage(ALREADY_REGISTERED_INVITE_MSG);
    }

    @And("User Clicks on Lets Try Again Button on Pop Up")
    public void userClicksOnLetsTryAgainButtonOnPopUp() {
        popUp.clickLetsTryAgainButton();
    }

    @Then("User Validates Successful Message for Request Money on Pop Up")
    public void userValidatesSuccessfulMessageForRequestMoneyOnPopUp() throws IOException {
        popUp.validateSuccessfulMessageTwo(SUCCESSFUL_REQUEST_MONEY_MSG);
    }
}
