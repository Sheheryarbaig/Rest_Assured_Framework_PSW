package PageObjectFactory.MobileApp;

import EnumFactory.Android.SendMoneyPageEnumAndroid;
import EnumFactory.IOS.SendMoneyPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;

import java.io.IOException;

public class SendMoneyPageFactory extends UtilFactory {

    public SendMoneyPageFactory() throws Exception {
    }

    public void selectNavigationOption(String textToSelect) {
        String locator;
        if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + SendMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + SendMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked: " + textToSelect + " Option on Send Money Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click: " + textToSelect + " Option on Send Money Screen");
            throw e;

        }
    }

    public void clickAddMoneyButton(){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_ADD_MONEY_BUTTON.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_ADD_MONEY_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Money Button on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Money Button on Send Money Screen");
            throw e;
        }
    }

    public void clickEnterIdLogo(){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_ENTER_ID_LOGO.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_ENTER_ID_LOGO.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Enter Id Logo on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Enter Id Logo on Send Money Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Send Money Screen");
            throw e;
        }
    }

    public void enterAgentId(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_AGENT_ID_FIELD.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_AGENT_ID_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered Agent ID: "+textToEnter+" on Agent ID Field on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Agent ID: "+textToEnter+" on Agent ID Field on Send Money Screen");
            throw e;
        }
    }

    public void selectAmount(String optionToSelect){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +SendMoneyPageEnumAndroid.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_START.getValue()+ optionToSelect +SendMoneyPageEnumIOS.XPATH_PRE_DEFINE_AMOUNT_FIELD_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Selected Amount: "+ optionToSelect +" from Pre-Define Amount Field on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Amount: "+ optionToSelect +" from Pre-Define Amount Field on Send Money Screen");
            throw e;
        }
    }

    public void selectSavedBankAccount(){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_SAVED_BANK_ACCOUNT.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_SAVED_BANK_ACCOUNT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Selected Saved Back Account Card on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Select Saved Back Account Card on Send Money Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered Pin: "+textToEnter+" on Pin Field on Send Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Pin: "+textToEnter+" on Pin Field on Send Money Screen");
            throw e;
        }
    }

    public String validateTotalAmountWithFeeAndVatIncluded(String enteredAmount,String fee,String vat) throws IOException {
        String locator,actualText,errorMsg=null;
        float expectedAmount;
        if(isAndroid()){
            locator = SendMoneyPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = SendMoneyPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            expectedAmount = Float.parseFloat(enteredAmount) + Float.parseFloat(fee) + Float.parseFloat(vat);
            if(Float.parseFloat(actualText)==expectedAmount){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Send Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Send Money Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
            return actualText;
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Gifting Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
