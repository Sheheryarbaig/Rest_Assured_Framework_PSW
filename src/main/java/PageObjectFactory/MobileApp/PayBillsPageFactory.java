package PageObjectFactory.MobileApp;

import EnumFactory.Android.PayBillsPageEnumAndroid;
import EnumFactory.IOS.PayBillsPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;

import java.io.IOException;

public class PayBillsPageFactory extends UtilFactory {

    public PayBillsPageFactory() throws Exception {

    }
    
    public void selectOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + PayBillsPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + PayBillsPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option on Pay Bills Screen");
            throw e;
        }
    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Pay Bills Screen");
            throw e;
        }
    }

    public void clickPayNewAccountButton(){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_PAY_A_NEW_ACCOUNT_BUTTON.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_PAY_A_NEW_ACCOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Pay a New Account Button on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Pay a New Account Button on Pay Bills Screen");
            throw e;
        }
    }

    public String fetchAmountFromAmountField(){
        String locator,amount;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeVisible(locator);
            amount = getText(locator);
            scenarioDef.log(Status.PASS,"Fetched Amount: "+amount+" from Amount Field on Pay Bills Screen");
            return amount;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Amount from Amount Field on Pay Bills Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Pay Bills Screen");
            throw e;
        }
    }

    public void clickEditAmountButton(){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_EDIT_AMOUNT_BUTTON.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_EDIT_AMOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Edit Amount Button on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Edit Amount Button on Pay Bills Screen");
            throw e;
        }
    }

    public void clickAddAccountButton(){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_ADD_ACCOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Account Button on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Account Button on Pay Bills Screen");
            throw e;
        }
    }

    public void validatePaymentMethodBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split("AED ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Payment Balance Balance is Equal: "+actualText+" on Pay Bills Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Payment Balance Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Pay Bills Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Balance Balance Element on Pay Bills Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void enterAccountNumber(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_ACCOUNT_NUMBER_FIELD.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_ACCOUNT_NUMBER_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Account Number Field on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Account Number Field on Pay Bills Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Pin Field on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Pin Field on Pay Bills Screen");
            throw e;
        }
    }

    public void enterName(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_NAME_FIELD.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_NAME_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Name\\/NickName Field on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Name\\/NickName Field on Pay Bills Screen");
            throw e;
        }
    }

     public void enterAmount(String textToEnter) throws Exception {
        String locator;
         if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            clearField(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered Amount: "+ textToEnter +" on Amount Field on Pay Bills Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter Amount: "+ textToEnter +" on Amount Field on Pay Bills Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = PayBillsPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = PayBillsPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Pay Bills Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Pay Bills Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Pay Bills Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
