package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.RequestMoneyPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class RequestMoneyStepsDef extends HarnessVariables {

    RequestMoneyPageFactory requestMoneyPage;
    String accountProp = "account.properties";
    String testDataProp = "testData.properties";

    public RequestMoneyStepsDef() throws Exception {
        requestMoneyPage = new RequestMoneyPageFactory();
    }

    @And("User Enters {string} on MSISDN on Request Money Screen")
    public void userEntersOnMSISDNOnRequestMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        requestMoneyPage.enterMsisdn(textToEnter);
    }

    @And("User Clicks on Next Button on Request Money Screen")
    public void userClicksOnNextButtonOnRequestMoneyScreen() {
        requestMoneyPage.clickNextButton();
    }

    @And("User Enters {string} on Amount Field on Request Money Screen")
    public void userEntersOnAmountFieldOnRequestMoneyScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        requestMoneyPage.enterAmount(textToEnter);
    }

    @Then("User Validates Requested Money Amount on Request Money Screen")
    public void userValidatesRequestedMoneyAmountOnRequestMoneyScreen() throws IOException {
        requestMoneyPage.validateRequestedMoney(ENTERED_AMOUNT);
    }

    @And("User Clicks on Request from QR Code Button on Request Money Screen")
    public void userClicksOnRequestFromQRCodeButtonOnRequestMoneyScreen() {
        requestMoneyPage.clickRequestFromQRCodeButton();
    }

    @Then("User Validates QR Code is Displayed on Request Money Screen")
    public void userValidatesQRCodeIsDisplayedOnRequestMoneyScreen() throws IOException {
        requestMoneyPage.validateQRCode();
    }
}
