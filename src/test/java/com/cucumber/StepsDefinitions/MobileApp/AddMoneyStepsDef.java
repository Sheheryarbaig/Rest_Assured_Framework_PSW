package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.AddMoneyPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class AddMoneyStepsDef extends HarnessVariables {

    AddMoneyPageFactory addMoneyPage;
    String navigateProp = "navigation.properties";
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public AddMoneyStepsDef() throws Exception {
        addMoneyPage = new AddMoneyPageFactory();
    }

    @Then("User Clicks on {string} Option on Add Money Screen")
    public void userClicksOnOptionOnAddMoneyScreen(String textToSelect) throws Exception {
        textToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(textToSelect);
        addMoneyPage.selectNavigationOption(textToSelect);
    }

    @And("User Clicks the Saved Debit Card on Add Money Screen")
    public void userClicksTheSavedDebitCardOnAddMoneyScreen() {
        addMoneyPage.clickSavedDebitCard();
    }

    @And("User Enters {string} on Amount Field on Add Money Screen")
    public void userEntersOnAmountFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        addMoneyPage.enterTransactionAmount(ENTERED_AMOUNT);
    }

    @And("User Clicks on Confirm Button on Add Money Screen")
    public void userClicksOnConfirmButtonOnAddMoneyScreen() {
        addMoneyPage.clickConfirmButton();
    }

    @And("User Enters {string} on Pin Field on Add Money Screen")
    public void userEntersOnPinFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        addMoneyPage.enterPin(textToEnter);
    }

    @And("User Clicks on Login Confirm Button on Add Money Screen")
    public void userClicksOnLoginConfirmButtonOnAddMoneyScreen() {
        addMoneyPage.clickLoginConfirmButton();
    }

    @Then("User Validates Payment Machines Steps Text on Add Money Screen")
    public void userValidatesPaymentMachinesStepsTextOnAddMoneyScreen() throws Exception {
        addMoneyPage.validatePaymentMachineStepsText(PAYMENT_MACHINES_TEXT);
    }

    @And("User Validates Add Money Heading Visibility {string} on Add Money Screen")
    public void userValidatesAddMoneyHeadingVisibilityOnAddMoneyScreen(String expectedCondition) throws IOException {
        addMoneyPage.validateAddMoneyHeadingVisibility(expectedCondition.equals("true"));
    }

    @Then("User Validates {string} Option Visibility {string} on Add Money Screen")
    public void userValidatesOptionVisibilityOnAddMoneyScreen(String expectedCondition,String fieldToValidate) throws Exception {
        fieldToValidate = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(fieldToValidate);
        addMoneyPage.validateAddMoneyOptionVisibility(fieldToValidate, expectedCondition.equals("true"));
    }

    @Then("User Clicks on Continue Button on Add Money Screen")
    public void userClicksOnContinueButtonOnAddMoneyScreen() {
        addMoneyPage.clickContinueButton();
    }

    @Then("User Selects {string} from Bank Dropdown on Add Money Screen")
    public void userSelectsFromBankDropdownOnAddMoneyScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        addMoneyPage.selectBankFromDropdown(optionToSelect);
    }

    @And("User Clicks on Submit Button on Add Money Screen")
    public void userClicksOnSubmitButtonOnAddMoneyScreen() {
        addMoneyPage.clickSubmitButton();
    }

    @And("User Clicks on Radio Button on Terms and Conditions on Add Money Screen")
    public void userClicksOnRadioButtonOnTermsAndConditionsOnAddMoneyScreen() {
        addMoneyPage.clickRadioButton();
    }

    @And("User Enters {string} on Response Code Field on Add Money Screen")
    public void userEntersOnResponseCodeFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        addMoneyPage.enterResponseCode(textToEnter);
    }

    @And("User Enters {string} on Response Message Field on Add Money Screen")
    public void userEntersOnResponseMessageFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        addMoneyPage.enterResponseMessage(textToEnter);
    }

    @And("User Enters {string} on Auth Code Field on Add Money Screen")
    public void userEntersOnAuthCodeFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        addMoneyPage.enterAuthCode(textToEnter);
    }

    @And("User Enters {string} on Bank ID Field on Add Money Screen")
    public void userEntersOnBankIDFieldOnAddMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        addMoneyPage.enterBankId(textToEnter);
    }

    @And("User Clicks on Generate Hash Button on Add Money Screen")
    public void userClicksOnGenerateHashButtonOnAddMoneyScreen() {
        addMoneyPage.clickGenerateHashButton();
    }

    @And("User Clicks on Return to PG Button on Add Money Screen")
    public void userClicksOnReturnToPGButtonOnAddMoneyScreen() {
        addMoneyPage.clickReturnPGButton();
    }
}
