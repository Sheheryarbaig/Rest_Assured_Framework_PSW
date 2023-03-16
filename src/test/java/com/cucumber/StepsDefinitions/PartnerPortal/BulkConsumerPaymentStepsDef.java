package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.BulkConsumerPaymentPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BulkConsumerPaymentStepsDef extends HarnessVariables {

    BulkConsumerPaymentPageFactory bulkConsumerPaymentPage;
    String ppTestDataFile = "partnerPortalTestData.properties";

    public BulkConsumerPaymentStepsDef() throws Exception {
        bulkConsumerPaymentPage= new BulkConsumerPaymentPageFactory();
    }

    @And("User Validates Bulk Consumer Payment Heading Visibility {string} on Bulk Consumer Payment Page")
    public void userValidatesBulkConsumerPaymentHeadingVisibilityOnBulkConsumerPaymentPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            bulkConsumerPaymentPage.validateBulkConsumerPaymentHeadingVisibility(true);
        }else {
            bulkConsumerPaymentPage.validateBulkConsumerPaymentHeadingVisibility(false);
        }
    }

    @And("User Uploads {string} Excel on Bulk Consumer Payment Page")
    public void userUploadsExcelOnBulkConsumerPaymentPage(String fileName) throws Exception {
        fileName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fileName);
        bulkConsumerPaymentPage.uploadExcelFile(fileName);
    }

    @And("User Selects Scheduled Date on Bulk Consumer Payment Page")
    public void userSelectsScheduledDateOnBulkConsumerPaymentPage() {
        bulkConsumerPaymentPage.selectScheduledDate();
    }

    @And("User Selects {string} Account on Bulk Consumer Payment Page")
    public void userSelectsAccountOnBulkConsumerPaymentPage(String account) throws Exception {
        account = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(account);
        bulkConsumerPaymentPage.selectAccount(account);
    }

    @And("User Enters Random Text on Title Field on Bulk Consumer Payment Page")
    public void userEntersRandomTextOnTitleFieldOnBulkConsumerPaymentPage() {
        bulkConsumerPaymentPage.enterTitle(getRandomStrings());
    }

    @Then("User Clicks Submit Button on Bulk Consumer Payment Page")
    public void userClicksSubmitButtonOnBulkConsumerPaymentPage() {
        bulkConsumerPaymentPage.clickSubmitButton();
    }

    @And("User Validates Request Created Successfully Heading Visibility {string} on Bulk Consumer Payment Page")
    public void userValidatesRequestCreatedSuccessfullyHeadingVisibilityOnBulkConsumerPaymentPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            bulkConsumerPaymentPage.validateRequestSuccessHeadingVisibility(true);
        }else {
            bulkConsumerPaymentPage.validateRequestSuccessHeadingVisibility(false);
        }
    }
}
