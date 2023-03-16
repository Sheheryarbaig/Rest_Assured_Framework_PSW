package PageObjectFactory.MobileApp;

import EnumFactory.Android.TransferPageEnumAndroid;
import EnumFactory.IOS.TransferPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class TransferPageFactory extends UtilFactory {

    public TransferPageFactory() throws Exception {

    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Transfer Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Transfer Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Transfer Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Transfer Screen");
            throw e;
        }
    }

    public void validatePaymentMethodBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).split(" ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Payment Method Balance is Equal: "+actualText+" on Transfer Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Payment Method Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Transfer Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Method Balance Element on Transfer Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public String fetchEnteredAmount(){
        String locator,amount;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            amount=getText(locator);
            scenarioDef.log(Status.PASS,"Fetched "+ amount +" from Amount Field on Transfer Screen");
            return amount;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch from Amount Field on Transfer Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Pin Field on Transfer Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Pin Field on Transfer Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = TransferPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = TransferPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Transfer Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Transfer Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Transfer Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
