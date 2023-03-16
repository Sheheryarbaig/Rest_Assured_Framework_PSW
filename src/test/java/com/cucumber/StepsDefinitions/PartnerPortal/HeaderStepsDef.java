package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.HeaderPageFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class HeaderStepsDef extends HarnessVariables {

    HeaderPageFactory headerPage;

    public HeaderStepsDef() throws Exception {
        headerPage = new HeaderPageFactory();
    }

    @And("User Clicks Logout Button on Header Page")
    public void userClicksLogoutButtonOnHeaderPage() {
        headerPage.clickLogoutButton();
    }
}
