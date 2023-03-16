package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.MessagePageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.Then;

public class MessageStepsDef {

    MessagePageFactory MessagePage;
    String testDataProp = "testData.properties";

    public MessageStepsDef() throws Exception {
        MessagePage = new MessagePageFactory();
    }

    @Then("User Validates Entered {string} and {string} and {string} on Message Screen")
    public void userValidatesEnteredAndAndOnMessageScreen(String plateNumber, String duration, String toNumber) throws Exception {
        plateNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(plateNumber);
        duration = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(duration);
        toNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(toNumber);
        MessagePage.validateMessageMessageScreen(plateNumber,duration,toNumber);
    }

    @Then("User Validates Entered {string} and {string} and {string} and {string} on Message Screen")
    public void userValidatesEnteredAndAndAndOnMessageScreen(String plateNumber, String parkingZone, String duration, String toNumber) throws Exception {
        plateNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(plateNumber);
        parkingZone = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(parkingZone);
        duration = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(duration);
        toNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(toNumber);
        MessagePage.validateMessageMessageScreen(plateNumber,parkingZone,duration,toNumber);
    }

    @Then("User Validates {string} and {string} and {string} on Message Screen")
    public void userValidatesAndAndOnMessageScreen(String cityCode, String plateNumber, String toNumber) throws Exception {
        plateNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(plateNumber);
        cityCode = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(cityCode);
        toNumber = new PropertyLoaderFactory().getPropertyFile(testDataProp).getProperty(toNumber);
        MessagePage.validateMessageScreen(cityCode,plateNumber,toNumber);
    }
}
