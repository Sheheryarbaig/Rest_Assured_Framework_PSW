package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.RefundPaymentPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class RefundPaymentStepsDef extends HarnessVariables {

    RefundPaymentPageFactory refundPaymentPage;

    public RefundPaymentStepsDef() throws Exception {
        refundPaymentPage = new RefundPaymentPageFactory();
    }

    @And("User Validates Refund Payment Heading Visibility {string} on Refund Payment Page")
    public void userValidatesRefundPaymentHeadingVisibilityOnRefundPaymentPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            refundPaymentPage.validateRefundPaymentHeadingVisibility(true);
        }else {
            refundPaymentPage.validateRefundPaymentHeadingVisibility(false);
        }
    }
}
