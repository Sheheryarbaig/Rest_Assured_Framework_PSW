package com.cucumber.StepsDefinitions.APIs;

import PageObjectFactory.APIs.APIsBaseFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIsStepsDef extends HarnessVariables {

    APIsBaseFactory apisBase;
    String apiData = "APIData.properties";

    public APIsStepsDef() throws Exception {
        apisBase = new APIsBaseFactory();
    }

    @Given("User Setup APIs Environment")
    public void userSetupAPIsEnvironment() {
        deviceName = "API";
    }

    @And("User Sets {string} Base URL")
    public void userSetsBaseURL(String url) throws Exception {
        url = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(url);
        apisBase.setBaseURL(url);
    }

    @And("User Sets {string} Header Values")
    public void userSetsHeaderValues(String headerValues) throws Exception {
        headerValues = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(headerValues);
        apisBase.setHeader(headerValues);
    }

    @And("User Sets {string} Request Body with {string} Dynamic Parameters")
    public void userSetsRequestBodyWithDynamicParameters(String requestPath, String parameter) throws Exception {
        requestPath = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(requestPath);
        parameter = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(parameter);
        request = new PropertyLoaderFactory().getRequestFile(requestPath);
        request = apisBase.setJSONParameter(request,parameter);
        request = apisBase.setBuildNumber(request,BUILD_NUMBER);
    }

    @Then("User Posts the Request to {string} API Path")
    public void userPostsTheRequestToAPIPath(String apiPath) throws Exception {
        apiPath = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(apiPath);
        response = apisBase.postRequest(apiPath,request);
    }

    @And("User Validates {string} Response of the API with {string} Dynamic Parameters")
    public void userValidatesResponseOfTheAPIWithDynamicParameters(String responsePath, String parameter) throws Exception {
        responsePath = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(responsePath);
        parameter = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(parameter);
        expectedResponse = new PropertyLoaderFactory().getResponseFile(responsePath);
        apisBase.validateResponse(response,expectedResponse,parameter,responsePath);
    }

    @Then("User Fetches {string} Attributes Values from Response")
    public void userFetchesAttributesValuesFromResponse(String attributesToFetch) throws Exception {
        attributesToFetch = new PropertyLoaderFactory().getPropertyFile(apiData).getProperty(attributesToFetch);
        responseData = apisBase.getAttributeFromResponse(response,attributesToFetch);
    }
}
