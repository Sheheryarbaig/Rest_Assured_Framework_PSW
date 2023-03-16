package PageObjectFactory.MobileApp;

import EnumFactory.Android.IMTPageEnumAndroid;
import EnumFactory.IOS.IMTPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;

import java.io.IOException;

public class IMTPageFactory extends UtilFactory {


    public IMTPageFactory() throws Exception {
    }

    public void selectCountry(String optionToSelect) throws Exception {
        String locator,locatorVal,waitLocator;
        if (isAndroid()) {
            waitLocator = IMTPageEnumAndroid.XPATH_WAIT_ELEMENT.getValue();
            locator = IMTPageEnumAndroid.XPATH_COUNTRY_FIELD.getValue();
            locatorVal = IMTPageEnumAndroid.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + IMTPageEnumAndroid.XPATH_DROPDOWN_VALUE_END.getValue();
        } else {
            waitLocator = IMTPageEnumIOS.XPATH_WAIT_ELEMENT.getValue();
            locator = IMTPageEnumIOS.XPATH_COUNTRY_FIELD.getValue();
            locatorVal = IMTPageEnumIOS.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + IMTPageEnumIOS.XPATH_DROPDOWN_VALUE_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeClickable(waitLocator);
            if(isAndroid()){
                scrollToElementMobile(locatorVal);
            }
            click(locatorVal);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " Country on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " Country on IMT Screen");
            throw e;
        }
    }

    public void selectDropDownValue(String optionToSelect,String dropdownName) {
        String locator,locatorVal;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_IMT_DROPDOWN_START.getValue()+ dropdownName +IMTPageEnumAndroid.XPATH_IMT_DROPDOWN_END.getValue();
            locatorVal = IMTPageEnumAndroid.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + IMTPageEnumAndroid.XPATH_DROPDOWN_VALUE_END.getValue();
        } else {
            locator = IMTPageEnumIOS.XPATH_IMT_DROPDOWN_START.getValue()+ dropdownName +IMTPageEnumIOS.XPATH_IMT_DROPDOWN_END.getValue();
            locatorVal = IMTPageEnumIOS.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + IMTPageEnumIOS.XPATH_DROPDOWN_VALUE_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            if(isAndroid()){
                scrollToElementMobile(locatorVal);
                click(locatorVal);
            }
            selectDropdownOptionIOS(optionToSelect);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " of Dropdown: "+dropdownName+" on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " of Dropdown: "+dropdownName+" on IMT Screen");
            throw e;
        }
    }

    public void selectReceiverOption(String optionToSelect) {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_RECEIVER_OPTION_START.getValue()+ optionToSelect + IMTPageEnumAndroid.XPATH_RECEIVER_OPTION_END.getValue();
        } else {
            locator = IMTPageEnumIOS.XPATH_RECEIVER_OPTION_START.getValue()+ optionToSelect + IMTPageEnumIOS.XPATH_RECEIVER_OPTION_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " Option for IMT Receiver on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " Option for IMT Receiver on IMT Screen");
            throw e;
        }
    }

    public void enterAmount(String textToEnter) {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_UAE_AMOUNT_FIELD.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_UAE_AMOUNT_FIELD.getValue();
            }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS, "Entered: " + textToEnter + " IMT UAE Amount on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter: " + textToEnter + " IMT UAE Amount on IMT Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter) {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_PIN_FIELD.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_PIN_FIELD.getValue();
            }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS, "Entered: " + textToEnter + " on Pin Field on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter: " + textToEnter + " Pin Field on IMT Screen");
            throw e;
        }
    }

    public void enterFieldValue(String textToEnter,String fieldName) {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_IMT_FIELD_START.getValue()+ fieldName +IMTPageEnumAndroid.XPATH_IMT_FIELD_END.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_IMT_FIELD_START.getValue()+ fieldName +IMTPageEnumIOS.XPATH_IMT_FIELD_END.getValue();
            }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            customWait(400);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS, "Entered: " + textToEnter + " on IMT Field: "+ fieldName +" on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter: " + textToEnter + " on IMT Field: "+ fieldName +" on IMT Screen");
            throw e;
        }
    }

    public void clickNextButton() {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_NEXT_BUTTON.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_NEXT_BUTTON.getValue();
            }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked Next Button on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click Next Button on IMT Screen");
            throw e;
        }
    }

    public void clickConfirmButton() {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
            }
        try {
            scrollToElementMobile(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked Confirm Button on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click Confirm Button on IMT Screen");
            throw e;
        }
    }

    public void clickSendToMyselfButton() {
        String locator;
        if (isAndroid()) {
            locator = IMTPageEnumAndroid.XPATH_SEND_TO_MYSELF_BUTTON.getValue();
            } else {
            locator = IMTPageEnumIOS.XPATH_SEND_TO_MYSELF_BUTTON.getValue();
            }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Send to Myself Button on IMT Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Send to Myself Button on IMT Screen");
            throw e;
        }
    }

    public void validateTransactionFee(String expectedValue) throws IOException {
        String locator;
        String actualValue,errorMsg=null;
        if(isAndroid()){
            locator = IMTPageEnumAndroid.XPATH_TRANSACTION_FEE.getValue();
        }else {
            locator = IMTPageEnumIOS.XPATH_TRANSACTION_FEE.getValue();
        }
        try{
            scrollDownToBottomMobile();
            actualValue = getText(locator).replace("AED ","");
            if(Float.parseFloat(actualValue) == Float.parseFloat(expectedValue)){
                scenarioDef.log(Status.PASS,"Validated Transaction Fee is: "+expectedValue+" on IMT Screen <br> ", MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Transaction Fee, Current Fee: "+actualValue+", Expected Fee: "+expectedValue+" on IMT Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Transaction Fee on IMT Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateVAT(String expectedValue) throws IOException {
        String locator;
        String actualValue,errorMsg=null;
        if(isAndroid()){
            locator = IMTPageEnumAndroid.XPATH_VAT.getValue();
        }else {
            locator = IMTPageEnumIOS.XPATH_VAT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator).replace("AED ","");
            if(Float.parseFloat(actualValue) == Float.parseFloat(expectedValue)){
                scenarioDef.log(Status.PASS,"Validated VAT is: "+expectedValue+" on IMT Screen <br> ", MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate VAT, Current Fee: "+actualValue+", Expected Fee: "+expectedValue+" on IMT Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get VAT on IMT Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateInsufficientBalanceMessage(String expectedText) throws IOException {
        String locator;
        String actualText,errorMsg=null;
        if(isAndroid()){
            locator = IMTPageEnumAndroid.XPATH_INSUFFICIENT_BALANCE_MSG.getValue();
        }else {
            locator = IMTPageEnumIOS.XPATH_INSUFFICIENT_BALANCE_MSG.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Error Message: "+expectedText+" on IMT Screen <br> ", MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Error Message: "+expectedText+" on IMT Screen, Actual Value: " +actualText;
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Insufficient Balance Error Message on IMT Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public float validateTotalAmountWithCharges(String enteredAmount,String transactionFee, String vat) throws IOException {
        String locator;
        String actualValue,errorMsg=null;
        Float expectedValue;
        if(isAndroid()){
            locator = IMTPageEnumAndroid.XPATH_TOTAL_AMOUNT.getValue();
        }else {
            locator = IMTPageEnumIOS.XPATH_TOTAL_AMOUNT.getValue();
        }
        try{
            expectedValue = Float.parseFloat(enteredAmount) + Float.parseFloat(transactionFee) + Float.parseFloat(vat);
            waitFactory.waitForElementToBeClickable(locator);
            actualValue = getText(locator).replace("AED ","");
            if(Float.parseFloat(actualValue) == expectedValue){
                scenarioDef.log(Status.PASS,"Validated Total Amount: "+expectedValue+" on IMT Screen <br> ", MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Total Amount, Current Fee: "+actualValue+", Expected Fee: "+expectedValue+" on IMT Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
            return expectedValue;
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get VAT on IMT Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }
}
