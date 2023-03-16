package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.TransferPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class TransferStepsDef extends HarnessVariables {

    TransferPageFactory transferPage;
    String accountProp = "account.properties";

    public TransferStepsDef() throws Exception {
        transferPage = new TransferPageFactory();
    }

    @Then("User Validates Amount to be Deducted on Transfer Screen")
    public void userValidatesAmountToBeOnTransferScreen() throws IOException {
        transferPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @And("User Clicks on Confirm Button on Transfer Screen")
    public void userClicksOnConfirmButtonOnTransferScreen() {
        transferPage.clickConfirmButton();
    }

    @And("User Clicks on Proceed Button on Transfer Screen")
    public void userClicksOnProceedButtonOnTransferScreen() {
        transferPage.clickProceedButton();
    }

    @Then("User Validates Payment Method Balance on Transfer Screen")
    public void userValidatesPaymentMethodBalanceOnTransferScreen() throws IOException {
        transferPage.validatePaymentMethodBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Pin Field on Transfer Screen")
    public void userEntersOnPinFieldOnTransferScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        transferPage.enterPin(textToEnter);
    }

    @And("User Fetches Amount from Amount Field on Transfer Screen")
    public void userFetchesAmountFromAmountFieldOnTransferScreen() {
        ENTERED_AMOUNT = transferPage.fetchEnteredAmount();
    }
}
