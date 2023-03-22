package com.cucumber.StepsDefinitions.WebShop;

import EnumFactory.WebShop.WebShopLogin;
import PageObjectFactory.PartnerPortal.DashboardPageFactory;
import PageObjectFactory.PartnerPortal.LoginPageFactory;
import PageObjectFactory.WebShop.CommonPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.UtilFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("User Hovers on {string} Button on {string} Page")
    public void userHoversOnButtonOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.hoverOnButton(locator,screenName);
    }

    @Then("User Validate {string} of {string} Appeared on {string} Page")
    public void userValidateValueAppearedOnPage(String attribute,String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.validateValueAttributeScreen(attribute,expectedValue,locator,screenName);
    }

    @Then("User Validates {string} Element Appeared on {string} Page")
    public void userValidatesElementAppearedOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String testData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        commonPage.validateDynamicElementOnScreen(locator,testData, screenName);
    }


    @Then("User Validates {string} of {string} On {string} Page")
    public void userValidatesOfOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(childLocator);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(childLocator);
        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(dynamicData);
        commonPage.validateDynamicString(parentLocator, dynamicData,childLocator, expectedValue ,screenName);
    }

    @When("User Clicks on {string} Button of {string} on {string} Page")
    public void userClicksOnButtonOfOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(childLocator);
        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(dynamicData);
        commonPage.clickOnDynamicElement(parentLocator, dynamicData, childLocator ,screenName);
    }

    @Then("User Validates {string} Color On Hover of {string} Button on {string} Page")
    public void userValidatesColorOnHoverOfButtonOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(childLocator);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(childLocator);

        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(dynamicData);
        commonPage.validateDynamicElementColorOnHover(parentLocator, dynamicData, childLocator, expectedValue ,screenName);
    }


    @Then("User Validates {string} URL on {string} Page")
    public void userValidatesURLOnPage(String expectedText, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        expectedText =  new PropertyLoaderFactory().getTestDataPropertyFile(screenName+".properties").getProperty(expectedText);
        commonPage.validatePageURL(expectedText, screenName);
    }
}
