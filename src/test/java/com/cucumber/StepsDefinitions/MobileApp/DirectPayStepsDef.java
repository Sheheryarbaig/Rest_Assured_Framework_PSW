package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.DirectPayPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class DirectPayStepsDef extends HarnessVariables {

    DirectPayPageFactory directPayPage;
    String testDataProp = "testData.properties";
    String accountProp = "account.properties";

    public DirectPayStepsDef() throws Exception {
        directPayPage = new DirectPayPageFactory();
    }

    @And("User Clicks on Add a New Account Button on Direct Pay Screen")
    public void userClicksOnAddANewAccountButtonOnDirectPayScreen() {
        directPayPage.clickOnAddNewAccountButton();
    }

    @Then("User Enters Random Text on Name Field on Direct Pay Screen")
    public void userEntersRandomTextOnNameFieldOnDirectPayScreen() {
        RANDOM_TEXT = getRandomStrings();
        directPayPage.enterName(RANDOM_TEXT);
    }

    @And("User Enters Random MSISDN on MSISDN Field on Direct Pay Screen")
    public void userEntersRandomMSISDNOnMSISDNFieldOnDirectPayScreen() {
        RANDOM_MSISDN = "54" + getRandomNumber();
        directPayPage.enterMsisdn(RANDOM_MSISDN);
    }

    @And("User Clicks Add Account Button on Direct Pay Screen")
    public void userClicksAddAccountButtonOnDirectPayScreen() {
        directPayPage.clickOnAddAccountButton();
    }

    @Then("User Validates Account Added on Direct Pay Screen")
    public void userValidatesAccountAddedOnDirectPayScreen() throws IOException {
        directPayPage.validateAccountAdded(RANDOM_TEXT,RANDOM_MSISDN);
    }

    @And("User Swipes Saved Account Except {string} on Direct Pay Screen")
    public void userSwipesSavedAccountExceptOnDirectPayScreen(String textToCheck) throws Exception {
        textToCheck = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToCheck);
        VALIDATION_TEXT = directPayPage.swipeSavedAccount(textToCheck);
    }

    @And("User Clicks Delete Button on Direct Pay Screen")
    public void userClicksDeleteButtonOnDirectPayScreen() {
        directPayPage.clickDeleteButton();
    }

    @Then("User Enters {string} on Pin Field on Direct Pay Screen")
    public void userEntersOnPinFieldOnDirectPayScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        directPayPage.enterPin(textToEnter);
    }

    @And("User Clicks on Confirm Button on Direct Pay Screen")
    public void userClicksOnConfirmButtonOnDirectPayScreen() {
        directPayPage.clickConfirmButton();
    }

    @Then("User Validates Account Deleted on Direct Pay Screen")
    public void userValidatesAccountDeletedOnDirectPayScreen() throws IOException {
        directPayPage.validateAccountDeleted(VALIDATION_TEXT);
    }

    @And("User Selects Saved Account {string} on Direct Pay Screen")
    public void userSelectsSavedAccountOnDirectPayScreen(String accountToSelect) throws Exception {
        accountToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(accountToSelect);
        directPayPage.selectAccount(accountToSelect);
    }

    @And("User Enters {string} on Amount Field on Direct Pay Screen")
    public void userEntersOnAmountFieldOnDirectPayScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        directPayPage.enterAmount(ENTERED_AMOUNT);
    }

    @And("User Validates Amount to be Deducted on Direct Pay Screen")
    public void userValidatesAmountToBeDeductedOnDirectPayScreen() throws IOException {
        directPayPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @And("User Clicks on Proceed Button on Direct Pay Screen")
    public void userClicksOnProceedButtonOnDirectPayScreen() {
        directPayPage.clickProceedButton();
    }

    @And("User Clicks on Login Proceed Button on Direct Pay Screen")
    public void userClicksOnLoginProceedButtonOnDirectPayScreen() {
        directPayPage.clickLoginProceedButton();
    }

    @And("User Clicks on Add Money Button on Direct Pay Screen")
    public void userClicksOnAddMoneyButtonOnDirectPayScreen() {
        directPayPage.clickAddMoneyButton();
    }

    @And("User Selects {string} Tag on Direct Pay Screen")
    public void userSelectsTagOnDirectPayScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        directPayPage.selectTag(optionToSelect);
    }
}
