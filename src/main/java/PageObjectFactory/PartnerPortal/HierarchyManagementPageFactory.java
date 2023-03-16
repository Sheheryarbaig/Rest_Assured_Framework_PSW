package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.DashboardPageEnum;
import EnumFactory.PartnerPortal.HierarchyManagementPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HierarchyManagementPageFactory extends UtilFactory {

    public HierarchyManagementPageFactory() throws Exception {
    }

    public void validateHierarchyManagementHeadingVisibility(Boolean expectedCondition){
        String locator = HierarchyManagementPageEnum.XPATH_HIERARCHY_MANAGEMENT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Hierarchy Management Heading is Displayed as Expected on Hierarchy Management Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Hierarchy Management Heading is not Displayed as Expected on Hierarchy Management Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Hierarchy Management Heading is Displayed Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Hierarchy Management Heading is not Displayed Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickNodeName(String valueToSelect){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + valueToSelect + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Node Name: "+valueToSelect+" on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Node Name: "+valueToSelect+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickNodeDropdown(String valueToSelect){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_DROPDOWN_START.getValue() + valueToSelect + HierarchyManagementPageEnum.XPATH_NODE_DROPDOWN_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Node Dropdown: "+valueToSelect+" on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Node Dropdown: "+valueToSelect+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void validateNodeName(String expectedText){
        String locator = HierarchyManagementPageEnum.XPATH_NAME_VALUE.getValue();
        String actualValue;
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator);
            if (expectedText.equals(actualValue)){
                scenarioDef.log(Status.PASS,"Validated Node Name Value: "+expectedText+" on Hierarchy Management Page");
            }else {
                scenarioDef.log(Status.FAIL,"Could not Validate Node Name Value: "+expectedText+" on Hierarchy Management Page. Actual Value: "+actualValue);
                throw new NoSuchContextException("Expected and Actual Value Differ Unexpectedly");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Node Name on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickRegisterBranchButton(){
        String locator = HierarchyManagementPageEnum.XPATH_REGISTER_BRANCH_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Register Branch Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Register Branch Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void enterFieldValue(String fieldName,String textToEnter) throws Exception {
        String locator = HierarchyManagementPageEnum.XPATH_TEXT_FIELD_START.getValue() + fieldName + HierarchyManagementPageEnum.XPATH_TEXT_FIELD_END.getValue();
        try{
            if(fieldName.equalsIgnoreCase("Identification Two")){
                locator = HierarchyManagementPageEnum.XPATH_IDENTIFICATION_NUMBER_ALTERNATE.getValue();
            }
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Field: "+fieldName+" on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Field: "+fieldName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void updateFieldValue(String fieldName,String textToEnter) throws Exception {
        String locator = HierarchyManagementPageEnum.XPATH_TEXT_FIELD_START.getValue() + fieldName + HierarchyManagementPageEnum.XPATH_TEXT_FIELD_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            customWait(2000);
            clearField(locator);
            enterString(locator,textToEnter);
            scenarioDef.log(Status.PASS,"Updated: "+textToEnter+" on Field: "+fieldName+" on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Update: "+textToEnter+" on Field: "+fieldName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void selectFieldValue(String fieldName,String valueToSelect){
        String locator = HierarchyManagementPageEnum.XPATH_DROPDOWN_FIELD_START.getValue() + fieldName + HierarchyManagementPageEnum.XPATH_DROPDOWN_FIELD_END.getValue();
        String locatorVal = HierarchyManagementPageEnum.XPATH_DROPDOWN_VALUE_START.getValue() + valueToSelect + HierarchyManagementPageEnum.XPATH_DROPDOWN_VALUE_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(locatorVal);
            click(locatorVal);
            scenarioDef.log(Status.PASS,"Selected: "+valueToSelect+" on Field: "+fieldName+" on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select: "+valueToSelect+" on Field: "+fieldName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void uploadFile(String fieldName,String fileToUpload){
        String locator = HierarchyManagementPageEnum.XPATH_FILE_UPLOAD_FIELD_START.getValue() + fieldName + HierarchyManagementPageEnum.XPATH_FILE_UPLOAD_FIELD_END.getValue();
        try{
            enterString(locator,fileToUpload);
            scenarioDef.log(Status.PASS,"Uploaded File on Form on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Upload File on Form on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickRegisterButton(){
        String locator = HierarchyManagementPageEnum.XPATH_REGISTER_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Register Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Register Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void validateNodeNameVisibility(String nodeName,Boolean expectedCondition){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue()+ nodeName +HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Node: "+nodeName+" is Present as Expected on Hierarchy Management Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Node: "+nodeName+" is not Present as Expected on Hierarchy Management Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Node: "+nodeName+" is Present Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Node: "+nodeName+" is not Present Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickRegisterEmployeeButton(){
        String locator = HierarchyManagementPageEnum.XPATH_REGISTER_EMPLOYEE_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Register Employee Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Register Employee Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickRegisterTillButton(){
        String locator = HierarchyManagementPageEnum.XPATH_REGISTER_TILL_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Register Till Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Register Till Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickRemoveButton(){
        String locator = HierarchyManagementPageEnum.XPATH_REMOVE_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Remove Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Remove Button on Hierarchy Management Page");
            throw e;
        }
    }

    public String clickRandomNode(String upperNodeName,String excludeNode){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + upperNodeName + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue() + HierarchyManagementPageEnum.XPATH_UNDER_NODE.getValue();
        List<WebElement> elementList;
        String text = "";
        try{
            customWait(1000);
            waitFactory.waitForElementToBeClickable(locator);
            elementList = elementFactory.getElementsList(locator);
            for (int i=0;i<elementList.size(); i++){
                text = getText(elementList.get(i));
                if(!text.equalsIgnoreCase(excludeNode)){
                    click(elementList.get(i));
                    i=elementList.size()+1;
                }
            }
            scenarioDef.log(Status.PASS,"Clicked on Random Node Under: "+upperNodeName+" on Hierarchy Management Page");
            return text;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Random Node Under: "+upperNodeName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public String clickRandomUnBlockNode(String upperNodeName,String excludeNode){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + upperNodeName + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue() + HierarchyManagementPageEnum.XPATH_UNDER_NODE.getValue();
        String checkLocator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + upperNodeName + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue() + HierarchyManagementPageEnum.XPATH_UNDER_NODE_CHECK.getValue();
        List<WebElement> elementList;
        List<WebElement> elementCheck;
        String text = "";
        String attribute = "";
        try{
            customWait(1000);
            waitFactory.waitForElementToBeClickable(locator);
            elementList = elementFactory.getElementsList(locator);
            elementCheck = elementFactory.getElementsList(checkLocator);
            for (int i=0;i<elementList.size(); i++){
                attribute = getAttribute(elementCheck.get(i),"class");
                text = getText(elementList.get(i));
                if(!text.equalsIgnoreCase(excludeNode) && !attribute.contains("blocked")){
                    click(elementList.get(i));
                    i=elementList.size()+1;
                }
            }
            scenarioDef.log(Status.PASS,"Clicked on Random Unblocked Node:"+text+" Under: "+upperNodeName+" on Hierarchy Management Page");
            return text;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Random Unblocked Node Under: "+upperNodeName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public String clickRandomBlockNode(String upperNodeName,String excludeNode){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + upperNodeName + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue() + HierarchyManagementPageEnum.XPATH_UNDER_NODE.getValue();
        String checkLocator = HierarchyManagementPageEnum.XPATH_NODE_NAME_START.getValue() + upperNodeName + HierarchyManagementPageEnum.XPATH_NODE_NAME_END.getValue() + HierarchyManagementPageEnum.XPATH_UNDER_NODE_CHECK.getValue();
        List<WebElement> elementList;
        List<WebElement> elementCheck;
        String text = "";
        String attribute = "";
        try{
            customWait(1000);
            waitFactory.waitForElementToBeClickable(locator);
            elementList = elementFactory.getElementsList(locator);
            elementCheck = elementFactory.getElementsList(checkLocator);
            for (int i=0;i<elementList.size(); i++){
                attribute = getAttribute(elementCheck.get(i),"class");
                text = getText(elementList.get(i));
                if(!text.equalsIgnoreCase(excludeNode) && attribute.contains("blocked")){
                    click(elementList.get(i));
                    i=elementList.size()+1;
                }
            }
            scenarioDef.log(Status.PASS,"Clicked on Random Blocked Node:"+text+" Under: "+upperNodeName+" on Hierarchy Management Page");
            return text;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Random Blocked Node Under: "+upperNodeName+" on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickBlockButton(){
        String locator = HierarchyManagementPageEnum.XPATH_BLOCK_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Block Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Block Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickUnblockButton(){
        String locator = HierarchyManagementPageEnum.XPATH_UNBLOCK_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Unblock Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Unblock Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void validateBlockedVisibility(String nodeName,Boolean expectedCondition){
        String locator = HierarchyManagementPageEnum.XPATH_NODE_CSS_START.getValue()+ nodeName +HierarchyManagementPageEnum.XPATH_NODE_CSS_END.getValue();
        String wait= DashboardPageEnum.XPATH_WAIT.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            waitFactory.waitForElementToBeInVisible(wait);
            actualCondition = getAttribute(locator,"class").contains("blocked");
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Node: "+nodeName+" is Blocked as Expected on Hierarchy Management Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Node: "+nodeName+" is not Blocked as Expected on Hierarchy Management Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Node: "+nodeName+" is Blocked Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Node: "+nodeName+" is not Blocked Unexpectedly on Hierarchy Management Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void clickUpdateButton(){
        String locator = HierarchyManagementPageEnum.XPATH_UPDATE_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Update Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Update Button on Hierarchy Management Page");
            throw e;
        }
    }

    public void clickFieldUpdateButton(String fieldName){
        String locator = HierarchyManagementPageEnum.XPATH_FIELD_UPDATE_BUTTON_START.getValue()+ fieldName +HierarchyManagementPageEnum.XPATH_FIELD_UPDATE_BUTTON_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+fieldName+" Update Button on Hierarchy Management Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+fieldName+" Update Button on Hierarchy Management Page");
            throw e;
        }
    }
}
