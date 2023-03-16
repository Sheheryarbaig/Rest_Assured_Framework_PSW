package PageObjectFactory.MobileApp;

import EnumFactory.Android.OtherServicesPageEnumAndroid;
import EnumFactory.IOS.OtherServicesPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class OtherServicesPageFactory extends UtilFactory {

    public OtherServicesPageFactory() throws Exception {

    }

    public void validateOption(String optionToValidate,Boolean expectedCondition) throws IOException {
        String locator, errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + optionToValidate + OtherServicesPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + optionToValidate + OtherServicesPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }

        try {
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Send Invite Message is Displayed on Other Service Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Send Invite Message is not Displayed as Expected on Other Service Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Send Invite Message is Displayed Unexpectedly on Other Service Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Send Invite Message is not Displayed Unexpectedly on Other Service Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    
    public void selectOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + OtherServicesPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + OtherServicesPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option on Other Services Screen");
            throw e;
        }
    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Other Services Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Other Services Screen");
            throw e;
        }
    }

    public void clickAddAccountButton(){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Account Button on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Account Button on Other Services Screen");
            throw e;
        }
    }

    public void validatePaymentMethodBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split("AED ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Payment Balance Balance is Equal: "+actualText+" on Other Services Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Payment Balance Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Other Services Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Balance Balance Element on Other Services Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void enterAccountNumber(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_ACCOUNT_NUMBER_FIELD.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_ACCOUNT_NUMBER_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Account Number Field on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Account Number Field on Other Services Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Pin Field on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Pin Field on Other Services Screen");
            throw e;
        }
    }

    public void enterAccountPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_ACCOUNT_PIN_FIELD.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_ACCOUNT_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Account Pin Field on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Account Pin Field on Other Services Screen");
            throw e;
        }
    }

    public void enterName(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_NAME_FIELD.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_NAME_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Name\\/NickName Field on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Name\\/NickName Field on Other Services Screen");
            throw e;
        }
    }

     public void selectAmount(String optionToSelect){
        String locator;
         if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +OtherServicesPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +OtherServicesPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Selected Amount: "+ optionToSelect +" from Pre-Define Amount Field on Other Services Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Amount: "+ optionToSelect +" from Pre-Define Amount Field on Other Services Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = OtherServicesPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = OtherServicesPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Other Services Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Other Services Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Other Services Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
