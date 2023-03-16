package PageObjectFactory.MobileApp;

import EnumFactory.Android.LoginPageEnumAndroid;
import EnumFactory.IOS.LoginPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;

public class LoginPageFactory extends UtilFactory {


    public LoginPageFactory() throws Exception {
    }

    public void enterPin(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on Pin Field on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on Pin Field on Login Screen");
            throw e;
        }
    }

    public void enterMsisdn(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_MSISDN_FIELD.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_MSISDN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on MSISDN Field on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on MSISDN Field on Login Screen");
            throw e;
        }
    }

    public void enterOTP(String textToEnter){
        String locator;
         if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_OTP_FIELD.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_OTP_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on OTP Field on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on OTP Field on Login Screen");
            throw e;
        }
    }

    public void clickConfirmButton(){
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_CONFIRM_BUTTON.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_CONFIRM_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Button on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Button on Login Screen");
            throw e;
        }
    }

    public void clickSignInButton(){
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_SIGN_IN_BUTTON.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_SIGN_IN_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Sign In Button on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Sign In Button on Login Screen");
            throw e;
        }
    }

    public void clickJoinButton(){
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_JOIN_BUTTON.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_JOIN_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Join e& money Button on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Join e& money Button on Login Screen");
            throw e;
        }
    }

    public void clickTryAgainButton(){
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_TRY_AGAIN_BUTTON.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_TRY_AGAIN_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Let's Try Again Button on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Let's Try Again Button on Login Screen");
            throw e;
        }
    }

    public void clickLoginConfirm(){
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_CONFIRM_LOGIN_BUTTON.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_CONFIRM_LOGIN_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Confirm Login Button on Login Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Confirm Login Button on Login Screen");
            throw e;
        }
    }

    public void validateLoginPage() throws IOException {
        String locator;
        if(isAndroid()){
            locator = LoginPageEnumAndroid.XPATH_WELCOME_HEADING.getValue();
        }else {
            locator = LoginPageEnumIOS.XPATH_WELCOME_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated User is on Login Screen <br> ", MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate User is on Login Screen");
            throw e;
        }
    }
}
