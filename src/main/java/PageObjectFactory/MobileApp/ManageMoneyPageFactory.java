package PageObjectFactory.MobileApp;

import EnumFactory.Android.ManageMoneyPageEnumAndroid;
import EnumFactory.IOS.ManageMoneyPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class ManageMoneyPageFactory extends UtilFactory {

    public ManageMoneyPageFactory() throws Exception {
    }

    public void enterBankName(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_BANK_NAME_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_BANK_NAME_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Bank Name Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Bank Name Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterIban(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_IBAN_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_IBAN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on IBAN Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on IBAN Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterBeneficiary(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_BENEFICIARY_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_BENEFICIARY_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Beneficiary Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Beneficiary Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterAlias(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_ALIAS_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_ALIAS_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Alias Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Alias Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterCardNumber(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_CARD_NUMBER_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_CARD_NUMBER_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(isAndroid()){
                click(locator);
                customWait(500);
                enterNumberByForce(textToEnter);
            }else{
                enterString(locator,textToEnter);
                hideDoneKeyboardIOS();
            }
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Card Number Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Card Number Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterExpiryDate(String textToEnter){
        String locator,secondLocator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_EXPIRY_DATE_FIELD.getValue();
            secondLocator = ManageMoneyPageEnumAndroid.XPATH_EXPIRY_YEAR_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_EXPIRY_DATE_FIELD_START.getValue() + (Integer.parseInt(getCurrentMonth()) - 1) +ManageMoneyPageEnumIOS.XPATH_EXPIRY_DATE_FIELD_END.getValue();
            secondLocator = ManageMoneyPageEnumIOS.XPATH_EXPIRY_YEAR_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(isAndroid()){
                click(locator);
                customWait(500);
                enterNumberByForce(textToEnter.split("/")[0]);
                click(secondLocator);
                customWait(500);
                enterNumberByForce(textToEnter.split("/")[1]);
            }else{
                enterString(locator,textToEnter.split("/")[0]);
                enterString(secondLocator,textToEnter.split("/")[1]);
                hideDoneKeyboardIOS();
            }
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Expiry Date Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Expiry Date Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterCvvNumber(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_CVV_NUMBER_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_CVV_NUMBER_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(isAndroid()){
                click(locator);
                customWait(1000);
                enterNumberByForce(textToEnter);
            }else{
                enterString(locator,textToEnter);
                hideDoneKeyboardIOS();
            }
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on CVV Number Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on CVV Number Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Pin Field on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Pin Field on Manage e& Money Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Confirm Button on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Confirm Button on Manage e& Money Screen");
            throw e;
        }
    }

    public void clickLinkBankAccountButton(){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_LINK_BANK_ACCOUNT_BUTTON.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_LINK_BANK_ACCOUNT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Confirm Button on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Confirm Button on Manage e& Money Screen");
            throw e;
        }
    }

    public void clickVerifyCardButton(){
        String locator;
        if(isAndroid()){
            locator = ManageMoneyPageEnumAndroid.XPATH_VERIFY_CARD_BUTTON.getValue();
        }else {
            locator = ManageMoneyPageEnumIOS.XPATH_VERIFY_CARD_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Verify Card Button on Manage e& Money Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Verify Card Button on Manage e& Money Screen");
            throw e;
        }
    }
}
