package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.HelpSupportPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HelpSupportStepsDef extends HarnessVariables {

    HelpSupportPageFactory helpSupportPage;
    String testDataProp = "testData.properties";

    public HelpSupportStepsDef() throws Exception {
        helpSupportPage = new HelpSupportPageFactory();
    }

    @And("User Clicks on {string} Option on Help and Support Screen")
    public void userClicksOnOptionOnHelpAndSupportScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        helpSupportPage.clickFAQsOption(optionToSelect);
    }

    @And("User Validates {string} Heading on Help and Support Screen")
    public void userValidatesHeadingOnHelpAndSupportScreen(String textToValidate) throws Exception {
        textToValidate = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToValidate);
        helpSupportPage.validateFAQsHeading(textToValidate);
    }
}
