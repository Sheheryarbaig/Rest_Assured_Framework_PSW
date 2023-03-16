package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.mParkingPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class mPakringStepsDef extends HarnessVariables {

    mParkingPageFactory mParkingPage;
    String navigationProp = "navigation.properties";
    String testDataProp = "testData.properties";

    public mPakringStepsDef() throws Exception {
        mParkingPage = new mParkingPageFactory();
    }

    @And("User Selects {string} Option on mParking Screen")
    public void userSelectsOptionOnMParkingScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigationProp).getProperty(optionToSelect);
        mParkingPage.selectCity(optionToSelect);
    }

    @Then("User Enters {string} on Plate Number Field on mParking Screen")
    public void userEntersOnPlateNumberFieldOnMParkingScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        mParkingPage.enterPlateNumber(textToEnter);
    }

    @Then("User Selects {string} from Duration Option on mParking Screen")
    public void userSelectsFromDurationOptionOnMParkingScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        mParkingPage.selectDuration(optionToSelect);
    }

    @And("User Clicks on Pay Parking Button on mParking Screen")
    public void userClicksOnPayParkingButtonOnMParkingScreen() {
        mParkingPage.clickPayParkingButton();
    }

    @Then("User Enters {string} on Parking Zone Field on mParking Screen")
    public void userEntersOnParkingZoneFieldOnMParkingScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(textToEnter);
        mParkingPage.enterParkingZone(textToEnter);
    }

    @Then("User Selects {string} from License Plate Source on mParking Screen")
    public void userSelectsFromLicensePlateSourceOnMParkingScreen(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(optionToSelect);
        mParkingPage.selectLicensePlateSource(optionToSelect);
    }
}
