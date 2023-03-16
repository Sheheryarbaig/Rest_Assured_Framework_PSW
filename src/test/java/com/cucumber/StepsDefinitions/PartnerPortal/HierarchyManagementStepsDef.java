package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.HierarchyManagementPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HierarchyManagementStepsDef extends HarnessVariables {

    HierarchyManagementPageFactory hierarchyManagementPage;
    String ppTestDataFile = "partnerPortalTestData.properties";

    public HierarchyManagementStepsDef() throws Exception {
        hierarchyManagementPage = new HierarchyManagementPageFactory();
    }

    @And("User Validates Hierarchy Management Heading Visibility {string} on Hierarchy Management Page")
    public void userValidatesHierarchyManagementHeadingVisibilityOnHierarchyManagementPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            hierarchyManagementPage.validateHierarchyManagementHeadingVisibility(true);
        }else {
            hierarchyManagementPage.validateHierarchyManagementHeadingVisibility(false);
        }
    }

    @Then("User Clicks on Node Name with Value {string} on Hierarchy Management Page")
    public void userClicksOnNodeNameWithValueOnHierarchyManagementPage(String valueToSelect) throws Exception {
        valueToSelect = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(valueToSelect);
        hierarchyManagementPage.clickNodeName(valueToSelect);
    }

    @And("User Clicks on Register Branch Button on Hierarchy Management Page")
    public void userClicksOnRegisterBranchButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickRegisterBranchButton();
    }

    @And("User Enters {string} on {string} Text Field on Hierarchy Management Page")
    public void userEntersOnTextFieldOnHierarchyManagementPage(String textToEnter, String fieldName) throws Exception {
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fieldName);
        textToEnter = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(textToEnter);
        if(textToEnter.equalsIgnoreCase("Username")
                || textToEnter.equalsIgnoreCase("Full Name")
                || textToEnter.equalsIgnoreCase("Till Name")){
            RANDOM_TEXT = getRandomStrings();
            hierarchyManagementPage.enterFieldValue(fieldName,RANDOM_TEXT);
        } else if (textToEnter.equalsIgnoreCase("Email")) {
            RANDOM_TEXT = getRandomStrings();
            hierarchyManagementPage.enterFieldValue(fieldName,RANDOM_TEXT + "@yopmail.com");
        } else {
            hierarchyManagementPage.enterFieldValue(fieldName,textToEnter);
        }
    }

    @And("User Selects {string} from {string} Dropdown Field on Hierarchy Management Page")
    public void userSelectsFromDropdownFieldOnHierarchyManagementPage(String valueToSelect, String fieldName) throws Exception {
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fieldName);
        valueToSelect = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(valueToSelect);
        hierarchyManagementPage.selectFieldValue(fieldName, valueToSelect);
    }

    @And("User Uploads {string} on {string} Field on Hierarchy Management Page")
    public void userUploadsOnFieldOnHierarchyManagementPage(String fileToUpload, String fieldName) throws Exception {
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fieldName);
        fileToUpload = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fileToUpload);
        hierarchyManagementPage.uploadFile(fieldName,fileToUpload);
    }

    @Then("User Clicks Register Button on Hierarchy Management Page")
    public void userClicksRegisterButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickRegisterButton();
    }

    @Then("User Clicks on Node Dropdown with Value {string} on Hierarchy Management Page")
    public void userClicksOnNodeDropdownWithValueOnHierarchyManagementPage(String valueToSelect) throws Exception {
        valueToSelect = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(valueToSelect);
        hierarchyManagementPage.clickNodeDropdown(valueToSelect);
    }

    @And("User Validates Node is Present {string} on Hierarchy Management Page")
    public void userValidatesNodePresentOnHierarchyManagementPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            hierarchyManagementPage.validateNodeNameVisibility(RANDOM_TEXT,true);
        }else {
            hierarchyManagementPage.validateNodeNameVisibility(RANDOM_TEXT,false);
        }
    }

    @And("User Clicks on Register Employee Button on Hierarchy Management Page")
    public void userClicksOnRegisterEmployeeButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickRegisterEmployeeButton();
    }

    @And("User Clicks on Register Till Button on Hierarchy Management Page")
    public void userClicksOnRegisterTillButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickRegisterTillButton();
    }

    @And("User Clicks on Remove Button on Hierarchy Management Page")
    public void userClicksOnRemoveButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickRemoveButton();
    }

    @Then("User Clicks on Random Node Name under {string} Excluding {string} on Hierarchy Management Page")
    public void userClicksOnRandomNodeNameUnderExcludingOnHierarchyManagementPage(String upperNodeName, String excludeNode) throws Exception {
        upperNodeName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(upperNodeName);
        excludeNode = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(excludeNode);
        RANDOM_TEXT=hierarchyManagementPage.clickRandomNode(upperNodeName,excludeNode);
    }

    @Then("User Clicks on Random Unblock Node Name under {string} Excluding {string} on Hierarchy Management Page")
    public void userClicksOnRandomUnblockNodeNameUnderExcludingOnHierarchyManagementPage(String upperNodeName, String excludeNode) throws Exception {
        upperNodeName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(upperNodeName);
        excludeNode = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(excludeNode);
        RANDOM_TEXT=hierarchyManagementPage.clickRandomUnBlockNode(upperNodeName,excludeNode);
    }

    @And("User Clicks on Block Button on Hierarchy Management Page")
    public void userClicksOnBlockButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickBlockButton();
    }

    @And("User Validates Node is Blocked {string} on Hierarchy Management Page")
    public void userValidatesNodeIsBlockedOnHierarchyManagementPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            hierarchyManagementPage.validateBlockedVisibility(RANDOM_TEXT,true);
        }else {
            hierarchyManagementPage.validateBlockedVisibility(RANDOM_TEXT,false);
        }
    }

    @Then("User Clicks on Random Block Node Name under {string} Excluding {string} on Hierarchy Management Page")
    public void userClicksOnRandomBlockNodeNameUnderExcludingOnHierarchyManagementPage(String upperNodeName, String excludeNode) throws Exception {
        upperNodeName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(upperNodeName);
        excludeNode = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(excludeNode);
        RANDOM_TEXT=hierarchyManagementPage.clickRandomBlockNode(upperNodeName,excludeNode);
    }

    @And("User Clicks on Unblock Button on Hierarchy Management Page")
    public void userClicksOnUnblockButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickUnblockButton();
    }

    @And("User Clicks on Update Button on Hierarchy Management Page")
    public void userClicksOnUpdateButtonOnHierarchyManagementPage() {
        hierarchyManagementPage.clickUpdateButton();
    }

    @And("User Updates {string} on {string} Text Field on Hierarchy Management Page")
    public void userUpdatesOnTextFieldOnHierarchyManagementPage(String textToEnter, String fieldName) throws Exception {
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fieldName);
        textToEnter = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(textToEnter);
        if (textToEnter.equalsIgnoreCase("Email")) {
            RANDOM_TEXT = getRandomStrings();
            hierarchyManagementPage.updateFieldValue(fieldName,RANDOM_TEXT + "@yopmail.com");
        } else {
            RANDOM_TEXT = getRandomStrings();
            hierarchyManagementPage.updateFieldValue(fieldName,RANDOM_TEXT);
        }
    }

    @And("User Clicks on Update Button of {string} Field on Hierarchy Management Page")
    public void userClicksOnUpdateButtonOfFieldOnHierarchyManagementPage(String fieldName) throws Exception {
        fieldName = new PropertyLoaderFactory().getPropertyFile(ppTestDataFile).getProperty(fieldName);
        hierarchyManagementPage.clickFieldUpdateButton(fieldName);
    }

    @And("User Clicks on Updated Node Name on Hierarchy Management Page")
    public void userClicksOnUpdatedNodeNameOnHierarchyManagementPage() {
        hierarchyManagementPage.clickNodeName(RANDOM_TEXT);
    }

    @Then("User Validates Name of the Node on Hierarchy Management Page")
    public void userValidatesNameOfTheNodeOnHierarchyManagementPage() {
        hierarchyManagementPage.validateNodeName(RANDOM_TEXT);
    }
}
