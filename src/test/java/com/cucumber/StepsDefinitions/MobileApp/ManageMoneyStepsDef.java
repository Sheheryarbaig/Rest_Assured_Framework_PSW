package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.ManageMoneyPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ManageMoneyStepsDef extends HarnessVariables {

    ManageMoneyPageFactory manageMoneyPage;
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public ManageMoneyStepsDef() throws Exception {
        manageMoneyPage = new ManageMoneyPageFactory();
    }

    @And("User Clicks on Confirm Button on Manage e& Money Screen")
    public void userClicksOnConfirmButtonOnManageMoneyScreen() {
        manageMoneyPage.clickConfirmButton();
    }

    @And("User Enters {string} on Pin Field on Manage e& Money Screen")
    public void userEntersOnPinFieldOnManageMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        manageMoneyPage.enterPin(textToEnter);
    }

    @And("User Enters {string} on Bank Name Field on Manage e& Money Screen")
    public void userEntersOnBankNameFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterBankName(textToEnter);
    }

    @And("User Enters {string} on IBAN Field on Manage e& Money Screen")
    public void userEntersOnIBANFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterIban(textToEnter);
    }

    @And("User Enters {string} on Beneficiary Field on Manage e& Money Screen")
    public void userEntersOnBeneficiaryFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        SAVED_BANK = textToEnter;
        manageMoneyPage.enterBeneficiary(textToEnter);
    }

    @And("User Enters {string} on Alias Field on Manage e& Money Screen")
    public void userEntersOnAliasFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterAlias(textToEnter);
    }

    @And("User Clicks on Link Bank Account Button on Manage e& Money Screen")
    public void userClicksOnLinkBankAccountButtonOnManageEMoneyScreen() {
        manageMoneyPage.clickLinkBankAccountButton();
    }

    @And("User Enters {string} on Card Number Field on Manage e& Money Screen")
    public void userEntersOnCardNumberFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterCardNumber(textToEnter);
    }

    @And("User Enters {string} on Expiry Date Field on Manage e& Money Screen")
    public void userEntersOnExpiryDateFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterExpiryDate(textToEnter);
    }

    @And("User Enters {string} on CVV Field on Manage e& Money Screen")
    public void userEntersOnCVVFieldOnManageEMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        manageMoneyPage.enterCvvNumber(textToEnter);
    }

    @And("User Clicks on Verify Card on Manage e& Money Screen")
    public void userClicksOnVerifyCardOnManageEMoneyScreen() {
        manageMoneyPage.clickVerifyCardButton();
    }
}
