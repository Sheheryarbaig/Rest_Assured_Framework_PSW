package com.cucumber.StepsDefinitions.WebShop;

import EnumFactory.WebShop.GetAPI;
import EnumFactory.WebShop.PatchAPI;
import EnumFactory.WebShop.PostAPI;
import PageObjectFactory.WebShop.CommonPageFactory;
import UtilitiesFactory.*;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.picocontainer.behaviors.Stored;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import java.util.Arrays;
import java.util.Objects;

import static UtilitiesFactory.UtilFactory.serviceFactoryInstance;
import static org.testng.AssertJUnit.assertEquals;

public class CommonStepsDefs extends HarnessVariables {

    CommonPageFactory commonPage;
    String kWebprop;
    String runPropFile = "run.properties";
    String runPropFile1 = "post_request.json";
    public static String OrderID = "";
    public static String paymentid = "";

    public CommonStepsDefs() throws Exception {
        commonPage = new CommonPageFactory();
    }

    @Given("User Setup Web Browser Session")
    public void userSetupWebBrowserSession() throws Exception {
        serviceFactoryInstance.setDriver(serviceFactoryInstance.getBrowser());
        deviceName = "WEB";
        waitFactory = new WaitFactory(ServiceFactory.getDriver());
        elementFactory = new ElementFactory(ServiceFactory.getDriver());
    }

    @Then("User Navigates to {string} URL")
    public void userNavigatesToURL(String url) throws Exception {
        // if(url.equals("Krannich Dynamics Application")){
        //Thread.sleep(160000)
        //}else if(url.equals("Online Store Transactions")){
//            Thread.sleep(160000);
//
//        }
        url = commonPage.getpropertyName(url);
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(url);

        ServiceFactory.getDriver().get(url);
    }

    @Then("User Validates {string} Title")
    public void userValidatesTitle(String expectedTitle) throws Exception {
        expectedTitle = commonPage.getpropertyName(expectedTitle);
        expectedTitle = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(expectedTitle);
        String actualTitle = ServiceFactory.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User Enters {string} on {string} Field on {string} Page")
    public void user_enters_on_field_on_page(String testData, String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
//NTN Number //NTN //PSW page
        System.out.println(testData + locator + screenName);
        if (testData.equals("Sales Order Number")) {
            testData = OrderID;
//            testData = "18E742BJOHNC";
        } else {
            testData = commonPage.getpropertyName(testData);
            testData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(testData);
        }
        locator = commonPage.getpropertyName(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.textEnterField(testData, locator, screenName);
    }

    @And("User Click on {string} Button on {string} Page")
    public void userClickOnButtonOnPage(String locator, String screenName) throws Exception {
        System.out.println(locator + screenName);
        screenName = commonPage.removeSpaces(screenName);//pswPage
        System.out.println(locator + screenName);
        locator = commonPage.getpropertyName(locator);//subscribe
        System.out.println(locator + screenName);
        kWebprop = screenName + kWebprop;
        System.out.println(locator + screenName);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        System.out.println(locator + screenName);
        commonPage.clickButton(locator, screenName);
    }

    @And("User Press Enter")
    public void userPressEnter() throws Exception {
        UtilFactory.pressEnter();

    }

    @Then("User Validate {string} Message for {string} on {string} Page")
    public void userValidateMessageForOnPage(String testData, String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        kWebprop = screenName + kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.clickButton(locator, screenName);
    }


    @Then("User Validate {string} Field Appeared on {string} Page")
    public void userValidateFieldAppearedOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = commonPage.getpropertyName(locator);
        String expectedValue = null;
        if (locator.equals("Sales.Order.Number")) {
            expectedValue = OrderID;
        } else {
            expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(locator);
        }
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.validateFieldonScreen(expectedValue, locator, screenName);
    }


    @When("User Hovers on {string} Button on {string} Page")
    public void userHoversOnButtonOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.hoverOnButton(locator, screenName);
    }

    @Then("User Validate {string} of {string} Appeared on {string} Page")
    public void userValidateValueAppearedOnPage(String attribute, String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = commonPage.getpropertyName(locator);
        String expectedValue = null;
        if (locator.equals("Sales.Order.Number")) {
            expectedValue = OrderID;
        } else {
            expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(locator);
        }
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.validateValueAttributeScreen(attribute, expectedValue, locator, screenName);
    }

    @Then("User Validates {string} Element Appeared on {string} Page")
    public void userValidatesElementAppearedOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String testData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(locator);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.validateDynamicElementOnScreen(locator, testData, screenName);
    }

    @Then("User Validates {string} Element Displayed on {string} Page")
    public void userValidatesElementDisplayedOnPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.validateElementOnScreen(locator, screenName);
        String Value = "";
        Value = commonPage.getElementValue(locator, screenName, Value);
        if (locator.equals("XPATH_SALES_ORDER_ID")) {
            OrderID = Value;
            System.out.println("Dynamics Order ID is - " + OrderID);
        }
    }


    @Then("User Validates {string} of {string} On {string} Page")
    public void userValidatesOfOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(childLocator);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(childLocator);
        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(dynamicData);
        commonPage.validateDynamicString(parentLocator, dynamicData, childLocator, expectedValue, screenName);
    }

    @When("User Clicks on {string} Button of {string} on {string} Page")
    public void userClicksOnButtonOfOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(childLocator);
        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(dynamicData);
        commonPage.clickOnDynamicElement(parentLocator, dynamicData, childLocator, screenName);
    }

    @Then("User Validates {string} Color On Hover of {string} Button on {string} Page")
    public void userValidatesColorOnHoverOfButtonOnPage(String childLocator, String dynamicData, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        String expectedValue = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(childLocator);
        childLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(childLocator);

        String parentLocator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(dynamicData);
        dynamicData = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(dynamicData);
        commonPage.validateDynamicElementColorOnHover(parentLocator, dynamicData, childLocator, expectedValue, screenName);
    }


    @Then("User Validates {string} URL on {string} Page")
    public void userValidatesURLOnPage(String expectedText, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        expectedText = new PropertyLoaderFactory().getTestDataPropertyFile(screenName + ".properties").getProperty(expectedText);
        commonPage.validatePageURL(expectedText, screenName);
    }


    @And("User Clicks on {string} Button on {string} Page")
    public void userClicksOnButtonOnPage(String locator, String screenName) throws Exception {
//        if(locator.equals("Apply")){
//            Thread.sleep(30000);
//        }
        screenName = commonPage.removeSpaces(screenName);
        locator = commonPage.getpropertyName(locator);
        kWebprop = screenName + kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        commonPage.JsclickButton(locator, screenName);
    }

    @Then("User Get {string} from {string} Page")
    public void userGetFromPage(String locator, String screenName) throws Exception {
        screenName = commonPage.removeSpaces(screenName);
        locator = commonPage.getpropertyName(locator);
        kWebprop = screenName + kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName + ".properties").getProperty(locator);
        String Value = "";
        Value = commonPage.getElementValue(locator, screenName, Value);
        if (locator.equals("XPATH_ORDER_REQUEST_ID")) {
            OrderID = Value;
            System.out.println("Order ID is - " + OrderID);
        }
    }

    private String endpoint;
    private int expectedHttpCode;
    private Response response;

    @ParameterType(".*?")
    public int httpCode(String code) {
        return Integer.parseInt(code.trim());
    }

    @Given("I should see response code {int} for the requested API {string}")
    public void setEndpointAndExpectedHttpCode(int httpCode, String url) throws Exception {
        url = commonPage.getpropertyName(url);
        url = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(url);
        expectedHttpCode = httpCode;
        endpoint = url;
        System.out.println(httpCode + url);
    }

    @When("I send a GET request to the API")
    public void sendGetRequestToApi() {
        response = RestAssured.get(endpoint);
    }

    @Then("I should receive the expected response code")
    public void verifyResponseCode() {
        int actualHttpCode = response.getStatusCode();
        System.out.println("HELLO");
        assert actualHttpCode == expectedHttpCode : "Expected HTTP code: " + expectedHttpCode + ", Actual HTTP code: " + actualHttpCode;
        System.out.println("HELLO");
    }
//[1:09 PM] Muhammed Hamza Shahab

    @And("I send a GET Request to {string} on {string}")
    public void userSendGETRequest(String endPoint, String baseURL) throws Exception {
        //User //QA API Base Url

        String baseUrl = commonPage.getpropertyName(baseURL);
        //QA.API.Base.Url
        baseUrl = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(baseUrl);

        String endpoint = commonPage.getpropertyName(endPoint);
        System.out.println(endPoint);
        String url = new PropertyLoaderFactory().getTestDataPropertyFile("EndPoints.properties").getProperty(endpoint);
        System.out.println(url);
        CommonPageFactory.GETRequest(baseUrl + url);
    }

    @And("I verify the status code {string}")
    public void userVerifyStatusCode(String statusCode) throws Exception {

        CommonPageFactory.getStatusCode(statusCode);

    }


    @And("I send a POST Request to {string} on {string} having request body {string}")
    public void userSendPOSTRequest(String endPoint, String baseURL, String requestBody) throws Exception {


        String baseUrl = commonPage.getpropertyName(baseURL);
        String bodyRequest = commonPage.removeSpaces(requestBody);
        System.out.println(bodyRequest);
        baseUrl = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(baseUrl);

        String endpoint = commonPage.getpropertyName(endPoint);
        System.out.println(endPoint);
        String url = new PropertyLoaderFactory().getTestDataPropertyFile("EndPoints.properties").getProperty(endpoint);
        System.out.println("URL" + url);
        if (Objects.equals(endPoint, "psw endpoint")) {
            commonPage.PSWPOSTRequest(baseUrl+url,bodyRequest);
        }
        else {
            commonPage.POSTRequest(baseUrl + url, bodyRequest);
        }
    }


    @And("I send a POST psw Request to {string} on {string} having request body {string}")
    public void userSendPOSTPSWRequest(String endPoint , String baseURL , String requestBody) throws Exception {


        String baseUrl = commonPage.getpropertyName(baseURL);
        String bodyRequest = commonPage.removeSpaces(requestBody);
        System.out.println(bodyRequest);
        baseUrl = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(baseUrl);

        String endpoint = commonPage.getpropertyName(endPoint);
        System.out.println(endPoint);
        String url = new PropertyLoaderFactory().getTestDataPropertyFile("EndPoints.properties").getProperty(endpoint);
        System.out.println(url);
        commonPage.PSWPOSTRequest(baseUrl+url,bodyRequest);
    }
    @And("I send a PATCH Request to {string} on {string} having request body {string}")
    public void userSendPATCHRequest(String endPoint , String baseURL , String requestBody) throws Exception {


        String baseUrl = commonPage.getpropertyName(baseURL);
        String bodyRequest = commonPage.removeSpaces(requestBody);
        System.out.println(bodyRequest);
        baseUrl = new PropertyLoaderFactory().getPropertyFile(runPropFile).getProperty(baseUrl);

        String endpoint = commonPage.getpropertyName(endPoint);
        System.out.println(endPoint);
        String url = new PropertyLoaderFactory().getTestDataPropertyFile("EndPoints.properties").getProperty(endpoint);
        System.out.println(url);
        commonPage.PATCHRequest(baseUrl+url,bodyRequest);
    }
    @And("Save {string} on {string}")
    public void saveText(String locator,String screenName) throws Exception {

        screenName = commonPage.removeSpaces(screenName);
        locator=commonPage.getpropertyName(locator);
        kWebprop = screenName+kWebprop;
        locator = new PropertyLoaderFactory().getLocatorPropertyFile(screenName+".properties").getProperty(locator);
        String Value = "";
        Value = commonPage.getElementValue(locator,screenName,Value);
        if(locator.equals("XPATH_PAYMENT_SLIP")){
            paymentid = Value;
            System.out.println("Payment ID is - "+paymentid);
        }


    }







    }
