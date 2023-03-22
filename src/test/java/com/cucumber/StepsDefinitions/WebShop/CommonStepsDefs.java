package com.cucumber.StepsDefinitions.WebShop;

import EnumFactory.WebShop.WebShopLogin;
import PageObjectFactory.PartnerPortal.DashboardPageFactory;
import PageObjectFactory.PartnerPortal.LoginPageFactory;
import PageObjectFactory.WebShop.CommonPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.UtilFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import java.util.Arrays;

public class CommonStepsDefs {
    CommonPageFactory commonPage;
    String kWebprop;

    public CommonStepsDefs() throws Exception {
        commonPage = new CommonPageFactory();
    }
    @When("User Enters {string} on {string} Field on {string} Page")
    public void user_enters_on_field_on_page(String testData, String locator, String screenName) throws Exception{
        screenName = commonPage.removeSpaces(screenName);
        testData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(testData);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.textEnterField(testData,locator,screenName);
    }

    @And("User Click on {string} Button on {string} Page")
    public void userClickOnButtonOnPage(String locator, String screenName) throws Exception{
        screenName = commonPage.removeSpaces(screenName);
        kWebprop = screenName+kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.clickButton(locator,screenName);
    }

    @Then("User Validate {string} Message for {string} on {string} Page")
    public void userValidateMessageForOnPage(String testData, String locator, String screenName) throws Exception{
        screenName = commonPage.removeSpaces(screenName);
        kWebprop = screenName+kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.clickButton(locator,screenName);
    }


    @Then("User Validate {string} Field Appeared on {string} Page")
    public void userValidateFieldAppearedOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.validateFieldonScreen(expectedValue,locator,screenName);
    }

    @Then("User Validate {string} of {string} Appeared on {string} Page")
    public void userValidateValueAppearedOnPage(String attribute,String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.validateValueAttributeScreen(attribute,expectedValue,locator,screenName);
    }

    @And("User JsClick on {string} Button on {string} Page")
    public void userJsClickOnButtonOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        kWebprop = screenName+kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.JsclickButton(locator,screenName);
    }
}
