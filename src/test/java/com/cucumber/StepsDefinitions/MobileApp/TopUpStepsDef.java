package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.TopUpPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class TopUpStepsDef extends HarnessVariables {

    TopUpPageFactory topUpPage;
    String navigateProp = "navigation.properties";
    String accountProp = "account.properties";
    String testDataProp = "testData.properties";

    public TopUpStepsDef() throws Exception {
        topUpPage = new TopUpPageFactory();
    }

    @And("User Clicks on {string} Option on Top Up Screen")
    public void userClicksOnOptionOnTopUpScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        topUpPage.selectOption(optionToSelect);
    }

    @Then("User Validates Payment Method Balance on Top Up Screen")
    public void userValidatesPaymentMethodBalanceOnTopUpScreen() throws IOException {
        topUpPage.validatePaymentMethodBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Msisdn Field on Top Up Screen")
    public void userEntersOnMsisdnFieldOnTopUpScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        topUpPage.enterMsisdn(textToEnter);
    }

    @Then("User Validates Amount to be Deducted on Top Up Screen")
    public void userValidatesAmountToBeOnTopUpScreen() throws IOException {
        topUpPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @And("User Clicks on Proceed Button on Top Up Screen")
    public void userClicksOnProceedButtonOnTopUpScreen() {
        topUpPage.clickProceedButton();
    }

    @And("User Enters {string} on Pin Field on Top Up Screen")
    public void userEntersOnPinFieldOnTopUpScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        topUpPage.enterPin(textToEnter);
    }

    @Then("User Clicks on Add Account Button on Top Up Screen")
    public void userClicksOnAddAccountButtonOnTopUpScreen() {
        topUpPage.clickAddAccountButton();
    }

    @And("User Enters {string} on Name Field on Top Up Screen")
    public void userEntersOnNameNicknameFieldOnTopUpScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        topUpPage.enterName(textToEnter);
    }

    @And("User Selects {string} from Pre-Defined Amount on Top Up Screen")
    public void userSelectsFromPreDefinedAmountOnTopUpScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        ENTERED_AMOUNT = optionToSelect;
        topUpPage.selectAmount(ENTERED_AMOUNT);
    }

    @And("User Clicks on Confirm Button on Top Up Screen")
    public void userClicksOnConfirmButtonOnTopUpScreen() {
        topUpPage.clickConfirmButton();
    }
}
