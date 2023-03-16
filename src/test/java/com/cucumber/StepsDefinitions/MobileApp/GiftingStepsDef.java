package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.GiftingPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class GiftingStepsDef extends HarnessVariables {

    GiftingPageFactory giftingPage;
    String navigateProp = "navigation.properties";
    String accountProp = "account.properties";
    String testDataProp = "testData.properties";

    public GiftingStepsDef() throws Exception {
        giftingPage = new GiftingPageFactory();
    }

    @And("User Clicks on {string} Option on Gifting Screen")
    public void userClicksOnOptionOnGiftingScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToSelect);
        giftingPage.selectOption(optionToSelect);
    }

    @Then("User Validates Available Balance is Correct on Gifting Screen")
    public void userValidatesAvailableBalanceIsCorrectOnGiftingScreen() throws IOException {
        giftingPage.validateAvailableBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Mobile Number Field on Gifting Screen")
    public void userEntersOnMobileNumberFieldOnGiftingScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        giftingPage.enterMsisdn(textToEnter);
    }

    @And("User Enters {string} on Amount Field on Gifting Screen")
    public void userEntersOnAmountFieldOnGiftingScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        giftingPage.enterAmount(textToEnter);
    }

    @Then("User Validates Amount to be Deducted on Gifting Screen")
    public void userValidatesAmountToBeOnGiftingScreen() throws IOException {
        giftingPage.validateAmountToBeDeducted(ENTERED_AMOUNT);
    }

    @And("User Clicks Proceed Button on Gifting Screen")
    public void userClicksProceedButtonOnGiftingScreen() {
        giftingPage.clickProceedButton();
    }

    @Then("User Validates Payment Method Balance on Gifting Screen")
    public void userValidatesPaymentMethodBalanceOnGiftingScreen() throws IOException {
        giftingPage.validatePaymentMethodBalance(WALLET_BALANCE);
    }

    @And("User Enters {string} on Pin Field on Gifting Screen")
    public void userEntersOnPinFieldOnGiftingScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        giftingPage.enterPin(textToEnter);
    }

    @And("User Clicks Login Proceed Button on Gifting Screen")
    public void userClicksLoginProceedButtonOnGiftingScreen() {
        giftingPage.clickLoginProceedButton();
    }

    @Then("User Clicks Add Money Button on Gifting Screen")
    public void userClicksAddMoneyButtonOnGiftingScreen() {
        giftingPage.clickAddMoneyButton();
    }

    @And("User Fetches Amount of {string} Voucher Option on Gifting Screen")
    public void userFetchesAmountOfVoucherOptionOnGiftingScreen(String voucherOption) throws Exception {
        voucherOption = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(voucherOption);
        ENTERED_AMOUNT = giftingPage.fetchVoucherAmount(voucherOption);
    }

    @And("User Clicks on {string} Voucher Option on Gifting Screen")
    public void userClicksOnVoucherOptionOnGiftingScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        giftingPage.selectVoucherOption(optionToSelect);
    }

    @Then("User Validates {string} Option Visibility {string} on Gifting Screen")
    public void userValidatesOptionVisibilityOnGiftingScreen(String optionToValidate, String expectedCondition) throws Exception {
        optionToValidate = new PropertyLoaderFactory().getPropertyFile(navigateProp).getProperty(optionToValidate);
        giftingPage.validateOption(optionToValidate, expectedCondition.equals("true"));
    }

    @Then("User Validates {string} Prices on Gifting Screen")
    public void userValidatesPricesOnGiftingScreen(String billersPrice) throws Exception {
        billersPrice = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(billersPrice);
        giftingPage.validateBillersPrices(billersPrice);
    }
}
