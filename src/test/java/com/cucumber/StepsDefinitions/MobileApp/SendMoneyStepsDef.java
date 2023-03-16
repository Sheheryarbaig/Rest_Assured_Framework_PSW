package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.SendMoneyPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SendMoneyStepsDef extends HarnessVariables {

    SendMoneyPageFactory sendMoneyPage;
    String navigateProp = "navigation.properties";
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public SendMoneyStepsDef() throws Exception {
        sendMoneyPage = new SendMoneyPageFactory();
    }

    @Then("User Clicks on {string} Option on Send Money Screen")
    public void userClicksOnOptionOnSendMoneyScreen(String textToSelect) throws Exception {
        textToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(textToSelect);
        sendMoneyPage.selectNavigationOption(textToSelect);
    }

    @And("User Clicks on Add Money Button on Send Money Screen")
    public void userClicksOnAddMoneyButtonOnSendMoneyScreen() {
        sendMoneyPage.clickAddMoneyButton();
    }

    @Then("User Clicks on Enter ID logo on Send Money Screen")
    public void userClicksOnEnterIDLogoOnSendMoneyScreen() {
        sendMoneyPage.clickEnterIdLogo();
    }

    @And("User Enters {string} on Agent ID Field on Send Money Screen")
    public void userEntersOnAgentIDFieldOnSendMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        sendMoneyPage.enterAgentId(textToEnter);
    }

    @And("User Clicks on Confirm Button on Send Money Screen")
    public void userClicksOnConfirmButtonOnSendMoneyScreen() {
        sendMoneyPage.clickConfirmButton();
    }

    @And("User Validates Total Amount with Fee and Vat Included on Send Money Screen")
    public void userValidatesTotalAmountWithFeeAndVatIncludedOnSendMoneyScreen() throws IOException {
        ENTERED_AMOUNT = sendMoneyPage.validateTotalAmountWithFeeAndVatIncluded(ENTERED_AMOUNT,SEND_MONEY_FEE,SEND_MONEY_VAT);
    }

    @And("User Enters {string} on Pin Field on Send Money Screen")
    public void userEntersOnPinFieldOnSendMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        sendMoneyPage.enterPin(textToEnter);
    }

    @Then("User Selects {string} from Pre-define Amount on Send Money Screen")
    public void userSelectsFromPreDefineAmountOnSendMoneyScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        ENTERED_AMOUNT = optionToSelect;
        sendMoneyPage.selectAmount(ENTERED_AMOUNT);
    }

    @And("User Selects Saved Bank Account on Send Money Screen")
    public void userSelectsSavedBankAccountOnSendMoneyScreen() {
        sendMoneyPage.selectSavedBankAccount();
    }

    @Then("User Validates Amount to be Deducted with Transaction Fee and Vat Included on Send Money Screen")
    public void userValidatesAmountToBeDeductedWithTransactionFeeAndVatIncludedOnSendMoneyScreen() throws IOException {
        ENTERED_AMOUNT = sendMoneyPage.validateTotalAmountWithFeeAndVatIncluded(ENTERED_AMOUNT,SEND_TO_BANK_FEE,SEND_TO_BANK_VAT);
    }
}
