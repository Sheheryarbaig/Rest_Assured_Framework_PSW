package PageObjectFactory.MobileApp;

import EnumFactory.Android.RequestMoneyPageEnumAndroid;
import EnumFactory.IOS.RequestMoneyPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class RequestMoneyPageFactory extends UtilFactory {

    public RequestMoneyPageFactory() throws Exception {
    }

    public void clickNextButton(){
        String locator;
         if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_NEXT_BUTTON.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_NEXT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Yes Button on Request Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Yes Button on Request Money Screen");
            throw e;
        }
    }

    public void clickRequestFromQRCodeButton(){
        String locator;
         if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_REQUEST_FROM_QR_CODE_BUTTON.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_REQUEST_FROM_QR_CODE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Request from QR Code Button on Request Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Request from QR Code Button on Request Money Screen");
            throw e;
        }
    }

    public void enterMsisdn(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_MSISDN_FIELD.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_MSISDN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered MSISDN: "+textToEnter+" on MSISDN Field on Request Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter MSISDN: "+textToEnter+" on MSISDN Field on Request Money Screen");
            throw e;
        }
    }

    public void enterAmount(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered Amount: "+textToEnter+" on Amount Field on Request Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Amount: "+textToEnter+" on Amount Field on Request Money Screen");
            throw e;
        }
    }

    public void validateRequestedMoney(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_REQUESTED_MONEY.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_REQUESTED_MONEY.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).split(" ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Requested Money is Equal: "+actualText+" on Request Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Requested Money is Equal: "+actualText+", Expected Value: "+expectedText+" on Request Money Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Requested Money Element on Request Money Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateQRCode() throws IOException {
        String locator;
        String errorMsg=null;
        if(isAndroid()){
            locator = RequestMoneyPageEnumAndroid.XPATH_QR_CODE.getValue();
        }else {
            locator = RequestMoneyPageEnumIOS.XPATH_QR_CODE.getValue();
        }
        try{
            if(isVisibleAdv(locator)){
                scenarioDef.log(Status.PASS,"Validated QR Code is Displayed on Request Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate QR Code is Displayed on Request Money Screen";
                throw new NoSuchContextException("Unexpected invisibility of the element: "+locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
