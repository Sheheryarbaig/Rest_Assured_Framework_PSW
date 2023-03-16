package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.ConfirmCashOutPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class ConfirmCashOutStepsDef extends HarnessVariables {

    ConfirmCashOutPageFactory confirmCashOutPage;

    public ConfirmCashOutStepsDef() throws Exception {
        confirmCashOutPage = new ConfirmCashOutPageFactory();
    }

    @And("User Validates Confirm CashOut Heading Visibility {string} on Confirm CashOut Page")
    public void userValidatesConfirmCashOutHeadingVisibilityOnConfirmCashOutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            confirmCashOutPage.validateConfirmCashOutHeadingVisibility(true);
        }else {
            confirmCashOutPage.validateConfirmCashOutHeadingVisibility(false);
        }
    }
}
