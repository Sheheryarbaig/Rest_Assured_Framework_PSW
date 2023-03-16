package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.TransactionHistoryPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TransactionHistoryStepsDef extends HarnessVariables {

    TransactionHistoryPageFactory transactionHistoryPage;
    String ppTestDataFile = "partnerPortalTestData.properties";
    String ppNavigation = "partnerPortalNavigation.properties";

    public TransactionHistoryStepsDef() throws Exception {
        transactionHistoryPage = new TransactionHistoryPageFactory();
    }

    @And("User Validates Transaction History Heading Visibility {string} on Transaction History Page")
    public void userValidatesTransactionHistoryHeadingVisibilityOnTransactionHistoryPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            transactionHistoryPage.validateTransactionHistoryHeadingVisibility(true);
        }else {
            transactionHistoryPage.validateTransactionHistoryHeadingVisibility(false);
        }
    }

    @And("User Enters {string} on {string} Text Field on Transaction History Page")
    public void userEntersOnTextFieldOnTransactionHistoryPage(String textToEnter, String fieldName) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(textToEnter);
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppNavigation).getProperty(fieldName);
        transactionHistoryPage.enterFieldValue(fieldName,textToEnter);
    }

    @Then("User Clicks Search Button on Transaction History Page")
    public void userClicksSearchButtonOnTransactionHistoryPage() {
        transactionHistoryPage.clickSearchButton();
    }

    @And("User Selects {string} on {string} Dropdown Field on Transaction History Page")
    public void userSelectsOnDropdownFieldOnTransactionHistoryPage(String textToSelect, String fieldName) throws Exception {
        textToSelect = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(textToSelect);
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppNavigation).getProperty(fieldName);
        transactionHistoryPage.selectFieldValue(fieldName,textToSelect);
    }

    @And("User Validates Transaction Date Lies Between {string} and {string} as {string} on Transaction History Page")
    public void userValidatesTransactionDateLiesBetweenAndAsOnTransactionHistoryPage(String startDate, String endDate, String expectedCondition) throws Exception {
        startDate = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(startDate);
        endDate = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(endDate);
        if(expectedCondition.equals("true")){
            transactionHistoryPage.validateTransactionDateHistory(startDate,endDate,true);
        }else {
            transactionHistoryPage.validateTransactionDateHistory(startDate,endDate,false);
        }
    }

    @And("User Validates Status is {string} as {string} on Transaction History Page")
    public void userValidatesStatusIsAsOnTransactionHistoryPage(String statusOption, String expectedCondition) throws Exception {
        statusOption = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(statusOption);
        if(expectedCondition.equals("true")){
            transactionHistoryPage.validateStatusHistory(statusOption,true);
        }else {
            transactionHistoryPage.validateStatusHistory(statusOption,false);
        }
    }

    @And("User Validates Transaction Id is {string} as {string} on Transaction History Page")
    public void userValidatesTransactionIdIsAsOnTransactionHistoryPage(String transactionId, String expectedCondition) throws Exception {
        transactionId = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(transactionId);
        if(expectedCondition.equals("true")){
            transactionHistoryPage.validateTransactionIdHistory(transactionId,true);
        }else {
            transactionHistoryPage.validateTransactionIdHistory(transactionId,false);
        }
    }

    @Then("User Clicks Reset Button on Transaction History Page")
    public void userClicksResetButtonOnTransactionHistoryPage() {
        transactionHistoryPage.clickResetButton();
    }

    @And("User Validates Wallet ID {string} Lies on Either From or To Account as {string} on Transaction History Page")
    public void userValidatesWalletIDLiesOnEitherFromOrToAccountAsOnTransactionHistoryPage(String walletId, String expectedCondition) throws Exception {
        walletId = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(walletId);
        if(expectedCondition.equals("true")){
            transactionHistoryPage.validateWalletIdHistory(walletId,true);
        }else {
            transactionHistoryPage.validateWalletIdHistory(walletId,false);
        }
    }
}
