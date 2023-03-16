package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.OtherServicesPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class OtherServicesStepsDef extends HarnessVariables {

    OtherServicesPageFactory otherServicesPage;
    String navigateProp = "navigation.properties";
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public OtherServicesStepsDef() throws Exception {
        otherServicesPage = new OtherServicesPageFactory();
    }

    @Then("User Validates {string} Option Visibility {string} on Other Services Screen")
    public void userValidatesOptionVisibilityOnOtherServicesScreen(String optionToValidate, String expectedCondition) throws Exception {
        optionToValidate = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToValidate);
        otherServicesPage.validateOption(optionToValidate, expectedCondition.equals("true"));
    }

    @And("User Clicks on {string} Option on Other Services Screen")
    public void userClicksOnOptionOnOtherServicesScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        otherServicesPage.selectOption(optionToSelect);
    }

    @Then("User Clicks on Add Account Button on Other Services Screen")
    public void userClicksOnAddAccountButtonOnOtherServicesScreen() {
        otherServicesPage.clickAddAccountButton();
    }

    @And("User Enters {string} on Name Field on Other Services Screen")
    public void userEntersOnNameFieldOnOtherServicesScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        otherServicesPage.enterName(textToEnter);
    }

    @And("User Enters {string} on Account Number Field on Other Services Screen")
    public void userEntersOnAccountNumberFieldOnOtherServicesScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        otherServicesPage.enterAccountNumber(textToEnter);
    }

    @And("User Clicks on Proceed Button on Other Services Screen")
    public void userClicksOnProceedButtonOnOtherServicesScreen() {
        otherServicesPage.clickProceedButton();
    }

    @And("User Selects {string} from Pre-Defined Amount on Other Services Screen")
    public void userSelectsFromPreDefinedAmountOnOtherServicesScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        ENTERED_AMOUNT = optionToSelect;
        otherServicesPage.selectAmount(ENTERED_AMOUNT);
    }

    @Then("User Validates Amount to be Deducted on Other Services Screen")
    public void userValidatesAmountToBeDeductedOnOtherServicesScreen() throws IOException {
        otherServicesPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @Then("User Validates Payment Method Balance on Other Services Screen")
    public void userValidatesPaymentMethodBalanceOnOtherServicesScreen() throws IOException {
        otherServicesPage.validatePaymentMethodBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Pin Field on Other Services Screen")
    public void userEntersOnPinFieldOnOtherServicesScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        otherServicesPage.enterPin(textToEnter);
    }

    @And("User Clicks on Confirm Button on Other Services Screen")
    public void userClicksOnConfirmButtonOnOtherServicesScreen() {
        otherServicesPage.clickConfirmButton();
    }

    @And("User Enters {string} on Account Pin Field on Other Services Screen")
    public void userEntersOnAccountPinFieldOnOtherServicesScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        otherServicesPage.enterAccountPin(textToEnter);
    }
}
