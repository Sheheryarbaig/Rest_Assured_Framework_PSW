package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.IMTPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class IMTStepsDef extends HarnessVariables {

    IMTPageFactory imtPage;
    String imtDataProp = "imtData.properties";
    String accountProp = "account.properties";

    public IMTStepsDef() throws Exception {
        imtPage = new IMTPageFactory();
    }

    @And("User Clicks on Next Button on IMT Screen")
    public void userClicksOnNextButtonOnIMTScreen() {
        imtPage.clickNextButton();
    }

    @Then("User Selects Country w.r.t {string} from Country Dropdown on IMT Screen")
    public void userSelectsCountryWRTFromCountryDropdownOnIMTScreen(String optionToSelect) throws Exception {
        IMT_PRODUCT = new PropertyLoaderFactory().getPropertyFile(imtDataProp).getProperty(optionToSelect);
        if(PARTNER_NAME.equals("MONEYGRAM")){
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){//Done
                imtPage.selectCountry(IMT_PAKISTAN);
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){//Done
                imtPage.selectCountry(IMT_PHILIPPINES);
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){//Done
                imtPage.selectCountry(IMT_PAKISTAN);
            }
        }else {
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){//Done
                imtPage.selectCountry(IMT_PAKISTAN);
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){//Data needed
                imtPage.selectCountry(IMT_PHILIPPINES);
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){//Data needed
                imtPage.selectCountry(IMT_GHANA);
            }
        }
    }

    @And("User Selects {string} from Receiver Option on IMT Screen")
    public void userSelectsFromReceiverOptionOnIMTScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(imtDataProp).getProperty(optionToSelect);
        imtPage.selectReceiverOption(optionToSelect);
    }

    @And("User Enters {string} on Amount Field on IMT Screen")
    public void userEntersOnAmountFieldOnIMTScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(imtDataProp).getProperty(textToEnter);
        ENTERED_AMOUNT = textToEnter;
        imtPage.enterAmount(ENTERED_AMOUNT);
    }

    @And("User Validates Transaction Fee on IMT Screen")
    public void userValidatesTransactionFeeOnIMTScreen() throws IOException {
        imtPage.validateTransactionFee(IMT_TRANSACTION_FEE);
    }

    @And("User Validates VAT on IMT Screen")
    public void userValidatesVATOnIMTScreen() throws IOException {
        imtPage.validateVAT(IMT_VAT);
    }

    @Then("User Validates Total Amount with Fee and Vat Included on IMT Screen")
    public void userValidatesTotalAmountWithFeeAndVatIncludedOnIMTScreen() throws IOException {
        ENTERED_AMOUNT = String.valueOf(imtPage.validateTotalAmountWithCharges(ENTERED_AMOUNT,IMT_TRANSACTION_FEE,IMT_VAT));
    }

    @And("User Enters {string} on Pin Field on IMT Screen")
    public void userEntersOnPinFieldOnIMTScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        imtPage.enterPin(textToEnter);
    }

    @And("User Clicks on Confirm Button on IMT Screen")
    public void userClicksOnConfirmButtonOnIMTScreen() {
        imtPage.clickConfirmButton();
    }

    @And("User Fills Form of IMT Transfer on IMT Screen")
    public void userFillsFormOfIMTTransferOnIMTScreen() throws Exception {
        if(PARTNER_NAME.equals("MONEYGRAM")){
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_FIELD);
                if(isAndroid()){
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD);
                if(isAndroid()){
                    imtPage.selectDropDownValue(BANK_NAME_VALUE,"1");
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    imtPage.selectDropDownValue(BANK_NAME_VALUE,BANK_NAME_FIELD);
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD);
                if(isAndroid()){
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE,"1");
                    imtPage.enterFieldValue(RECEIVER_WALLET_NUMBER_VALUE,RECEIVER_WALLET_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE,MOBILE_WALLET_FIELD);
                    imtPage.enterFieldValue(RECEIVER_WALLET_NUMBER_VALUE,RECEIVER_WALLET_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }
        }else {
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.clickNextButton();
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){
                scrollDownToBottomMobile();
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD);
                if(isAndroid()){
                    imtPage.selectDropDownValue(BANK_NAME_VALUE_WU,"1");
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                }else{
                    imtPage.selectDropDownValue(BANK_NAME_VALUE_WU,BANK_NAME_FIELD);
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                }
                imtPage.clickNextButton();
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_FIRST_NAME_WITHOUT_SLASH_FIELD);
                imtPage.enterFieldValue(getRandomStrings(),RECEIVER_LAST_NAME_WITHOUT_SLASH_FIELD);
                scrollDownToBottomMobile();
                imtPage.enterFieldValue(RECEIVER_MOBILE_NUMBER_VALUE,RECEIVER_MOBILE_NUMBER_FIELD);
                if(isAndroid()){
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE_WU,"1");
                    imtPage.selectDropDownValue(PURPOSE_OF_REMITTANCE_VALUE,"3");
                }else{
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE_WU,MOBILE_WALLET_FIELD_WU);
                    imtPage.selectDropDownValue(PURPOSE_OF_REMITTANCE_VALUE,PURPOSE_OF_REMITTANCE_FIELD);
                }
                imtPage.clickNextButton();
            }
        }
    }

    @And("User Fills Form of IMT Transfer of Send to Myself on IMT Screen")
    public void userFillsFormOfIMTTransferOfSendToMyselfOnIMTScreen() throws Exception {
        if(PARTNER_NAME.equals("MONEYGRAM")){
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){
                imtPage.clickSendToMyselfButton();
                if(isAndroid()){
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){
                imtPage.clickSendToMyselfButton();
                if(isAndroid()){
                    imtPage.selectDropDownValue(BANK_NAME_VALUE,"1");
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    imtPage.selectDropDownValue(BANK_NAME_VALUE,BANK_NAME_FIELD);
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){
                imtPage.clickSendToMyselfButton();
                if(isAndroid()){
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE,"1");
                    imtPage.enterFieldValue(RECEIVER_WALLET_NUMBER_VALUE,RECEIVER_WALLET_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, "1");
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, "2");
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, "3");
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, "4");
                }else{
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE,MOBILE_WALLET_FIELD);
                    imtPage.enterFieldValue(RECEIVER_WALLET_NUMBER_VALUE,RECEIVER_WALLET_NUMBER_FIELD);
                    scrollDownToBottomMobile();
                    imtPage.selectDropDownValue(SENDER_OCCUPATION_VALUE, SENDER_OCCUPATION_FIELD);
                    imtPage.selectDropDownValue(PURPOSE_OF_TRANSACTION_VALUE, PURPOSE_OF_TRANSACTION_FIELD);
                    imtPage.selectDropDownValue(SOURCE_OF_FUNDS_VALUE, SOURCE_OF_FUNDS_FIELD);
                    imtPage.selectDropDownValue(RELATIONSHIP_TO_RECEIVER_VALUE, RELATIONSHIP_TO_RECEIVER_FIELD);
                }
                imtPage.clickNextButton();
            }
        }else {
            if(IMT_PRODUCT.equals(IMT_CASH_PICKUP)){
                imtPage.clickSendToMyselfButton();
                imtPage.clickNextButton();
            }else if(IMT_PRODUCT.equals(IMT_SEND_TO_BANK)){
                scrollDownToBottomMobile();
                imtPage.clickSendToMyselfButton();
                if(isAndroid()){
                    imtPage.selectDropDownValue(BANK_NAME_VALUE_WU,"1");
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                }else{
                    imtPage.selectDropDownValue(BANK_NAME_VALUE_WU,BANK_NAME_FIELD);
                    imtPage.enterFieldValue(BANK_ACCOUNT_NUMBER_VALUE,ACCOUNT_NUMBER_FIELD);
                }
                imtPage.clickNextButton();
            }else if (IMT_PRODUCT.equals(IMT_SEND_TO_MOBILE_WALLET)){
                imtPage.clickSendToMyselfButton();
                scrollDownToBottomMobile();
                imtPage.enterFieldValue(RECEIVER_MOBILE_NUMBER_VALUE,RECEIVER_MOBILE_NUMBER_FIELD);
                if(isAndroid()){
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE_WU,"1");
                    imtPage.selectDropDownValue(PURPOSE_OF_REMITTANCE_VALUE,"3");
                }else{
                    imtPage.selectDropDownValue(MOBILE_WALLET_VALUE_WU,MOBILE_WALLET_FIELD_WU);
                    imtPage.selectDropDownValue(PURPOSE_OF_REMITTANCE_VALUE,PURPOSE_OF_REMITTANCE_FIELD);
                }
                imtPage.clickNextButton();
            }
        }
    }

    @Then("User Validates {string} Insufficient Balance Message on IMT Screen")
    public void userValidatesInsufficientBalanceMessageOnIMTScreen(String textToValidate) throws Exception {
        textToValidate = new PropertyLoaderFactory().getPropertyFile(imtDataProp).getProperty(textToValidate);
        imtPage.validateInsufficientBalanceMessage(textToValidate);
    }
}
