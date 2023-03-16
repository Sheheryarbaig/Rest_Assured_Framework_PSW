package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.FundOutPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class FundOutStepsDef extends HarnessVariables {

    FundOutPageFactory fundOutPage;

    public FundOutStepsDef() throws Exception {
        fundOutPage = new FundOutPageFactory();
    }

    @And("User Validates Fund Out Heading Visibility {string} on Fund Out Page")
    public void userValidatesFundOutHeadingVisibilityOnFundOutPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            fundOutPage.validateFundOutHeadingVisibility(true);
        }else {
            fundOutPage.validateFundOutHeadingVisibility(false);
        }
    }
}
