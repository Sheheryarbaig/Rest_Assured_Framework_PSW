package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.TransactionReportPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class TransactionReportStepsDef extends HarnessVariables {

    TransactionReportPageFactory transactionReportPage;

    public TransactionReportStepsDef() throws Exception {
        transactionReportPage = new TransactionReportPageFactory();
    }

    @And("User Validates Transaction Report Heading Visibility {string} on Transaction Report Page")
    public void userValidatesTransactionReportHeadingVisibilityOnTransactionReportPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            transactionReportPage.validateTransactionReportHeadingVisibility(true);
        }else {
            transactionReportPage.validateTransactionReportHeadingVisibility(false);
        }
    }
}
