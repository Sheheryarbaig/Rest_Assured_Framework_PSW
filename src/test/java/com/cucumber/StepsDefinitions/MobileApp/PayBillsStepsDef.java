package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.PayBillsPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class PayBillsStepsDef extends HarnessVariables {

    PayBillsPageFactory payBillsPage;
    String navigateProp = "navigation.properties";
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public PayBillsStepsDef() throws Exception {
        payBillsPage = new PayBillsPageFactory();
    }

    @And("User Clicks on {string} Option on Pay Bills Screen")
    public void userClicksOnOptionOnPayBillsScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        payBillsPage.selectOption(optionToSelect);
    }

    @Then("User Clicks on Add Account Button on Pay Bills Screen")
    public void userClicksOnAddAccountButtonOnPayBillsScreen() {
        payBillsPage.clickAddAccountButton();
    }

    @And("User Enters {string} on Name Field on Pay Bills Screen")
    public void userEntersOnNameFieldOnPayBillsScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        payBillsPage.enterName(textToEnter);
    }

    @And("User Enters {string} on Account Number Field on Pay Bills Screen")
    public void userEntersOnAccountNumberFieldOnPayBillsScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        payBillsPage.enterAccountNumber(textToEnter);
    }

    @And("User Clicks on Proceed Button on Pay Bills Screen")
    public void userClicksOnProceedButtonOnPayBillsScreen() {
        payBillsPage.clickProceedButton();
    }

    @And("User Enters {string} on Amount Field on Pay Bills Screen")
    public void userEntersOnAmountFieldOnPayBillsScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        payBillsPage.enterAmount(ENTERED_AMOUNT);
    }

    @Then("User Validates Amount to be Deducted on Pay Bills Screen")
    public void userValidatesAmountToBeDeductedOnPayBillsScreen() throws IOException {
        payBillsPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @Then("User Validates Payment Method Balance on Pay Bills Screen")
    public void userValidatesPaymentMethodBalanceOnPayBillsScreen() throws IOException {
        payBillsPage.validatePaymentMethodBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Pin Field on Pay Bills Screen")
    public void userEntersOnPinFieldOnPayBillsScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        payBillsPage.enterPin(textToEnter);
    }

    @And("User Clicks on Confirm Button on Pay Bills Screen")
    public void userClicksOnConfirmButtonOnPayBillsScreen() {
        payBillsPage.clickConfirmButton();
    }

    @And("User Clicks on Edit Amount Button on Pay Bills Screen")
    public void userClicksOnEditAmountButtonOnPayBillsScreen() {
        payBillsPage.clickEditAmountButton();
    }

    @Then("User Clicks on Pay a New Account Button on Pay Bills Screen")
    public void userClicksOnPayANewAccountButtonOnPayBillsScreen() {
        payBillsPage.clickPayNewAccountButton();
    }

    @And("User Fetches Amount from Amount Field on Pay Bills Screen")
    public void userFetchesAmountFromAmountFieldOnPayBillsScreen() {
        ENTERED_AMOUNT = payBillsPage.fetchAmountFromAmountField();
    }
}
