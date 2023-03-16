package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.BalanceInquiryPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class BalanceInquiryStepsDef extends HarnessVariables {

    BalanceInquiryPageFactory balanceInquiryPage;

    public BalanceInquiryStepsDef() throws Exception {
        balanceInquiryPage = new BalanceInquiryPageFactory();
    }

    @And("User Validates Balance Inquiry Heading Visibility {string} on Balance Inquiry Page")
    public void userValidatesBalanceInquiryHeadingVisibilityOnBalanceInquiryPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            balanceInquiryPage.validateBalanceInquiryHeadingVisibility(true);
        }else {
            balanceInquiryPage.validateBalanceInquiryHeadingVisibility(false);
        }
    }
}
