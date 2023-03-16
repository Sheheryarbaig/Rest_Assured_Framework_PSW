package PageObjectFactory.MobileApp;

import EnumFactory.Android.AddMoneyPageEnumAndroid;
import EnumFactory.IOS.AddMoneyPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class AddMoneyPageFactory extends UtilFactory {

    public AddMoneyPageFactory() throws Exception {
    }

    public void selectNavigationOption(String textToSelect) {
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + AddMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + AddMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked: " + textToSelect + " Option on Add Money Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click: " + textToSelect + " Option on Add Money Screen");
            throw e;

        }
    }

    public void clickSavedDebitCard(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_SAVED_DEBIT_CARD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_SAVED_DEBIT_CARD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Saved Debit Card on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Saved Debit Card on Add Money Screen");
            throw e;
        }
    }

    public void clickContinueButton(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_CONTINUE_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_CONTINUE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Continue Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Continue Button on Add Money Screen");
            throw e;
        }
    }

    public void clickSubmitButton(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_SUBMIT_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_SUBMIT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Submit Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Submit Button on Add Money Screen");
            throw e;
        }
    }

    public void clickRadioButton(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_RADIO_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_RADIO_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Radio Button of Terms and Conditions on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Radio Button of Terms and Conditions on Add Money Screen");
            throw e;
        }
    }

    public void clickGenerateHashButton(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_GENERATE_HASH_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_GENERATE_HASH_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Generate Hash Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Generate Hash Button on Add Money Screen");
            throw e;
        }
    }

    public void clickReturnPGButton(){
        String locator;
         if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_RETURN_TO_PG_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_RETURN_TO_PG_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Return to PG Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Return to PG Button on Add Money Screen");
            throw e;
        }
    }

    public void selectBankFromDropdown(String optionToSelect){
        String locator,locatorVal;
        if (isAndroid()) {
            locator = AddMoneyPageEnumAndroid.XPATH_BANK_FIELD.getValue();
            locatorVal = AddMoneyPageEnumAndroid.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + AddMoneyPageEnumAndroid.XPATH_DROPDOWN_VALUE_END.getValue();
        } else {
            locator = AddMoneyPageEnumIOS.XPATH_BANK_FIELD.getValue();
            locatorVal = AddMoneyPageEnumIOS.XPATH_DROPDOWN_VALUE_START.getValue()+ optionToSelect + AddMoneyPageEnumIOS.XPATH_DROPDOWN_VALUE_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scrollToElementMobile(locatorVal);
            click(locatorVal);
            customWait(2000);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " Bank on Add Money Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " Bank on Add Money Screen");
            throw e;
        }
    }

    public void enterTransactionAmount(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Amount Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Amount Field on Add Money Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Pin Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Pin Field on Add Money Screen");
            throw e;
        }
    }

    public void enterResponseCode(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_RESPONSE_CODE_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_RESPONSE_CODE_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Response Code Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Response Code Field on Add Money Screen");
            throw e;
        }
    }

    public void enterResponseMessage(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_RESPONSE_MESSAGE_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_RESPONSE_MESSAGE_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Response Message Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Response Message Field on Add Money Screen");
            throw e;
        }
    }

    public void enterAuthCode(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_AUTH_CODE_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_AUTH_CODE_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Auth Code Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Auth Code Field on Add Money Screen");
            throw e;
        }
    }

    public void enterBankId(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_BANK_ID_FIELD.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_BANK_ID_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Bank ID Field on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Bank ID Field on Add Money Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Confirm Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Confirm Button on Add Money Screen");
            throw e;
        }
    }

    public void clickLoginConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_LOGIN_CONFIRM_BUTTON.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_LOGIN_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Login Confirm Button on Add Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Login Confirm Button on Add Money Screen");
            throw e;
        }
    }

    public void validatePaymentMachineStepsText(String expectedText) throws IOException {
        String locator,actualText,errorMsg = null;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_PAYMENT_MACHINES_STEPS_TEXT.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_PAYMENT_MACHINES_STEPS_TEXT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText=getText(locator).replace("\n","");
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Actual Payment Machines Steps Text: "+actualText+" on Add Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Actual Payment Machines Steps Text: "+actualText+" on Add Money Screen, Expected Value: "+expectedText;
                throw new NoSuchContextException("Actual and Expected Values are different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Machines Steps Text on Add Money Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateAddMoneyHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_ADD_MONEY_HEADING.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_ADD_MONEY_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Add Money Heading is Displayed as Expected on Add Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Add Money Heading is not Displayed as Expected on Add Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Add Money Heading is Displayed Unexpectedly on Add Money Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Add Money Heading is not Displayed Unexpectedly on Add Money Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateAddMoneyOptionVisibility(String fieldToValidated,Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = AddMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue()+ fieldToValidated + AddMoneyPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = AddMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue()+ fieldToValidated + AddMoneyPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Add Money Option: "+fieldToValidated+" is Displayed as Expected on Add Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Add Money Option: "+fieldToValidated+" is not Displayed as Expected on Add Money Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Add Money Option: "+fieldToValidated+" is Displayed Unexpectedly on Add Money Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Add Money Option: "+fieldToValidated+" is not Displayed Unexpectedly on Add Money Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
