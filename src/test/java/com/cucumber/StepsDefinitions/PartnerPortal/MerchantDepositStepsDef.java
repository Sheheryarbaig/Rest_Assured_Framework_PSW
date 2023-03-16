package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.MerchantDepositPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class MerchantDepositStepsDef extends HarnessVariables {

    MerchantDepositPageFactory merchantDepositPage;

    public MerchantDepositStepsDef() throws Exception {
        merchantDepositPage = new MerchantDepositPageFactory();
    }

    @And("User Validates Merchant Deposit Heading Visibility {string} on Merchant Deposit Page")
    public void userValidatesMerchantDepositHeadingVisibilityOnMerchantDepositPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            merchantDepositPage.validateMerchantDepositHeadingVisibility(true);
        }else {
            merchantDepositPage.validateMerchantDepositHeadingVisibility(false);
        }
    }
}
