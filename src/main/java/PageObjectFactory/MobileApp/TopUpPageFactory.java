package PageObjectFactory.MobileApp;

import EnumFactory.Android.TopUpPageEnumAndroid;
import EnumFactory.IOS.TopUpPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;

import java.io.IOException;

public class TopUpPageFactory extends UtilFactory {

    public TopUpPageFactory() throws Exception {

    }

    public void selectOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + TopUpPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + TopUpPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option on Top Up Screen");
            throw e;
        }
    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Top Up Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Top Up Screen");
            throw e;
        }
    }

    public void clickAddAccountButton(){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Account Button on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Account Button on Top Up Screen");
            throw e;
        }
    }

    public void validatePaymentMethodBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split("AED ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Payment Balance Balance is Equal: "+actualText+" on Top Up Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Payment Balance Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Top Up Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Balance Balance Element on Top Up Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void enterMsisdn(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_MSISDN_FIELD.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_MSISDN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on MSISDN Field on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on MSISDN Field on Top Up Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Pin Field on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Pin Field on Top Up Screen");
            throw e;
        }
    }

    public void enterName(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_NAME_FIELD.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_NAME_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Name\\/NickName Field on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Name\\/NickName Field on Top Up Screen");
            throw e;
        }
    }

     public void selectAmount(String optionToSelect){
        String locator;
         if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +TopUpPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +TopUpPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Selected Amount: "+ optionToSelect +" from Pre-Define Amount Field on Top Up Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Amount: "+ optionToSelect +" from Pre-Define Amount Field on Top Up Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = TopUpPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = TopUpPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Top Up Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Top Up Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Top Up Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
