package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.BulkB2BPaymentPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BulkB2BPaymentStepsDef extends HarnessVariables {

    BulkB2BPaymentPageFactory bulkB2BPaymentPage;
    String ppTestDataFile = "partnerPortalTestData.properties";

    public BulkB2BPaymentStepsDef() throws Exception {
        bulkB2BPaymentPage = new BulkB2BPaymentPageFactory();
    }

    @And("User Validates Bulk BtB Payment Heading Visibility {string} on Bulk BtB Payment Page")
    public void userValidatesBulkBtBPaymentHeadingVisibilityOnBulkBtBPaymentPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            bulkB2BPaymentPage.validateBulkB2BPaymentHeadingVisibility(true);
        }else {
            bulkB2BPaymentPage.validateBulkB2BPaymentHeadingVisibility(false);
        }
    }

    @And("User Uploads {string} Excel on Bulk BtB Payment Page")
    public void userUploadsExcelOnBulkBtBPaymentPage(String fileName) throws Exception {
        fileName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fileName);
        bulkB2BPaymentPage.uploadExcelFile(fileName);
    }

    @And("User Selects {string} Account on Bulk BtB Payment Page")
    public void userSelectsAccountOnBulkBtBPaymentPage(String account) throws Exception {
        account = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(account);
        bulkB2BPaymentPage.selectAccount(account);
    }

    @And("User Enters Random Text on Title Field on Bulk BtB Payment Page")
    public void userEntersRandomTextOnTitleFieldOnBulkBtBPaymentPage() {
        bulkB2BPaymentPage.enterTitle(getRandomStrings());
    }

    @Then("User Clicks Submit Button on Bulk BtB Payment Page")
    public void userClicksSubmitButtonOnBulkBtBPaymentPage() {
        bulkB2BPaymentPage.clickSubmitButton();
    }

    @And("User Validates Request Created Successfully Heading Visibility {string} on Bulk BtB Payment Page")
    public void userValidatesRequestCreatedSuccessfullyHeadingVisibilityOnBulkBtBPaymentPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            bulkB2BPaymentPage.validateRequestSuccessHeadingVisibility(true);
        }else {
            bulkB2BPaymentPage.validateRequestSuccessHeadingVisibility(false);
        }
    }
}
