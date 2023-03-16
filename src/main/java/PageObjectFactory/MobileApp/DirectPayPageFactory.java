package PageObjectFactory.MobileApp;

import EnumFactory.Android.DirectPayPageEnumAndroid;
import EnumFactory.IOS.DirectPayPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;

import java.io.IOException;

public class DirectPayPageFactory extends UtilFactory {


    public DirectPayPageFactory() throws Exception {
    }

    public void clickOnAddNewAccountButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_ADD_NEW_ACCOUNT_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_ADD_NEW_ACCOUNT_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add New Account Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add New Account Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickOnAddAccountButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add Account Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add Account Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickDeleteButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_DELETE_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_DELETE_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Delete Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Delete Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickConfirmButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Confirm Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Confirm Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickProceedButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Proceed Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Proceed Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickLoginProceedButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_LOGIN_PROCEED_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_LOGIN_PROCEED_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Login Proceed Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Login Proceed Button on Direct Pay Screen");
            throw e;
        }
    }

    public void clickAddMoneyButton() {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_ADD_MONEY_BUTTON.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_ADD_MONEY_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Add Money Button on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Add Money Button on Direct Pay Screen");
            throw e;
        }
    }

    public void selectAccount(String accountToSelect) {
        String locator;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_ACCOUNT_START.getValue() + accountToSelect + DirectPayPageEnumAndroid.XPATH_ACCOUNT_END.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_ACCOUNT_START.getValue() + accountToSelect + DirectPayPageEnumIOS.XPATH_ACCOUNT_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Account: "+accountToSelect+" on Direct Pay Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Account: "+accountToSelect+" on Direct Pay Screen");
            throw e;
        }
    }

    public String swipeSavedAccount(String accountToIgnore) {
        String locator,text;
        if (isAndroid()) {
            locator = DirectPayPageEnumAndroid.XPATH_SAVED_ACCOUNT_START.getValue() + accountToIgnore + DirectPayPageEnumAndroid.XPATH_SAVED_ACCOUNT_END.getValue();
        } else {
            locator = DirectPayPageEnumIOS.XPATH_SAVED_ACCOUNT_START.getValue() + accountToIgnore + DirectPayPageEnumIOS.XPATH_SAVED_ACCOUNT_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            text = getText(locator);
            swipeElement(elementFactory.getElement(locator), "LEFT");
            scenarioDef.log(Status.PASS, "Swiped Saved Account: "+ text +" on Direct Pay Screen");
            return text;
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Swipe Saved Account on Direct Pay Screen");
            throw e;
        }
    }

    public void validateAccountAdded(String expectedName,String expectedNumber) throws IOException {
        String locatorName,locatorNumber;
        expectedNumber = expectedNumber.substring(0,2) + " " + expectedNumber.substring(2,5) + " " + expectedNumber.substring(5);
        if (isAndroid()) {
            locatorName = DirectPayPageEnumAndroid.XPATH_ACCOUNT_NAME_START.getValue()+ expectedName + DirectPayPageEnumAndroid.XPATH_ACCOUNT_NAME_END.getValue();
            locatorNumber = DirectPayPageEnumAndroid.XPATH_ACCOUNT_NUMBER_START.getValue()+ expectedNumber + DirectPayPageEnumAndroid.XPATH_ACCOUNT_NUMBER_END.getValue();
        } else {
            locatorName = DirectPayPageEnumIOS.XPATH_ACCOUNT_NAME_START.getValue()+ expectedName + DirectPayPageEnumIOS.XPATH_ACCOUNT_NAME_END.getValue();
            locatorNumber = DirectPayPageEnumIOS.XPATH_ACCOUNT_NUMBER_START.getValue()+ expectedNumber + DirectPayPageEnumIOS.XPATH_ACCOUNT_NUMBER_END.getValue();;
        }
        try {
            isVisibleAdv(locatorName);
            isVisibleAdv(locatorNumber);
            scenarioDef.log(Status.PASS, "Validated Account Name: "+expectedName+" and Account Number: "+expectedNumber+" is Added on Direct Pay Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate Account Name: "+expectedName+" and Account Number: "+expectedNumber+" is Added on Direct Pay Screen");
            throw e;
        }
    }

    public void validateAccountDeleted(String expectedNumber) throws IOException {
        String locatorNumber;
        if (isAndroid()) {
            locatorNumber = DirectPayPageEnumAndroid.XPATH_ACCOUNT_START.getValue()+ expectedNumber + DirectPayPageEnumAndroid.XPATH_ACCOUNT_END.getValue();
        } else {
            locatorNumber = DirectPayPageEnumIOS.XPATH_ACCOUNT_START.getValue()+ expectedNumber + DirectPayPageEnumIOS.XPATH_ACCOUNT_END.getValue();;
        }
        try {
            waitFactory.waitForElementToBeInVisible(locatorNumber);
            scenarioDef.log(Status.PASS, "Validated Account: "+expectedNumber+" is Deleted on Direct Pay Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Validate Account: "+expectedNumber+" is Deleted on Direct Pay Screen");
            throw e;
        }
    }

    public void enterName(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_NAME_FIELD.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_NAME_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Name Field on Direct Pay Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Name Field on Direct Pay Screen");
            throw e;
        }
    }

    public void enterMsisdn(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_MSISDN_FIELD.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_MSISDN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Name Field on Direct Pay Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Name Field on Direct Pay Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Pin Field on Direct Pay Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Pin Field on Direct Pay Screen");
            throw e;
        }
    }

    public void enterAmount(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Amount Field on Direct Pay Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Amount Field on Direct Pay Screen");
            throw e;
        }
    }

    public void selectTag(String optionToSelect){
        String locator,locatorVal;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_TAG_FIELD.getValue();
            locatorVal = DirectPayPageEnumAndroid.XPATH_TAG_VALUE_START.getValue()+ optionToSelect +DirectPayPageEnumAndroid.XPATH_TAG_VALUE_END.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_TAG_FIELD.getValue();
            locatorVal = DirectPayPageEnumIOS.XPATH_TAG_VALUE_START.getValue()+ optionToSelect +DirectPayPageEnumIOS.XPATH_TAG_VALUE_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            if(isAndroid()){
                waitFactory.waitForElementToBeClickable(locatorVal);
                click(locatorVal);
            }else{
                selectDropdownOptionIOS(optionToSelect);
            }
            scenarioDef.log(Status.PASS,"Selected "+optionToSelect+" from Tag Field on Direct Pay Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select "+optionToSelect+" from Tag Field on Direct Pay Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = DirectPayPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = DirectPayPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Direct Pay Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Direct Pay Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Direct Pay Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
