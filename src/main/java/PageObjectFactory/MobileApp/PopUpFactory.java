package PageObjectFactory.MobileApp;

import EnumFactory.Android.PopUpEnumAndroid;
import EnumFactory.IOS.PopUpEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class PopUpFactory extends UtilFactory {

    public PopUpFactory() throws Exception {
    }

    public void closePopUpWindow(){
        String locator;
        if(isAndroid()){
            locator = PopUpEnumAndroid.XPATH_POP_UP_CROSS_BUTTON.getValue();
        }else {
            locator = PopUpEnumIOS.XPATH_POP_UP_CROSS_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Successfully Closed Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Close Pop Up Window");
            throw e;
        }
    }
    public void clickOkButton(){
        String locator;
        if(isAndroid()){
            locator = PopUpEnumAndroid.XPATH_POP_UP_OK_BUTTON.getValue();
        }else {
            locator = PopUpEnumIOS.XPATH_POP_UP_OK_BUTTON.getValue();
        }
        try{
            customWait(2000);
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Successfully Clicked on Ok Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Ok Button on Pop Up Window");
            throw e;
        }
    }
    public void acceptTermsAndConditions(){
        String locator;
        if(isAndroid()){
            locator = PopUpEnumAndroid.XPATH_ACCEPT_AND_CONTINUE_BUTTON.getValue();
        }else {
            locator = PopUpEnumIOS.XPATH_ACCEPT_AND_CONTINUE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Successfully Accepted Terms and Conditions on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Accept Terms and Conditions on Pop Up Window");
            throw e;
        }
    }
    public void validateSendInviteMessageVisibility(Boolean expectedVisibility) throws IOException {
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SEND_INVITE_MSG.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SEND_INVITE_MSG.getValue();
        }
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisibleAdv(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Send Invite Message is Displayed on PopUp Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Send Invite Message is not Displayed as Expected on PopUp Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Send Invite Message is Displayed Unexpectedly on PopUp Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Send Invite Message is not Displayed Unexpectedly on PopUp Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateQuickerAccessPopUpVisibility(Boolean expectedVisibility) throws IOException {
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_QUICKER_ACCESS_POP_UP.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_QUICKER_ACCESS_POP_UP.getValue();
        }
        String errorMsg = null;
        Boolean actualVisibility;
        try {
            actualVisibility = isVisibleAdv(locator);
            if (actualVisibility && expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Quicker Access Pop Up is Displayed on PopUp Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualVisibility && !expectedVisibility) {
                scenarioDef.log(Status.PASS, "Validated Quicker Access Pop Up is not Displayed as Expected on PopUp Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualVisibility && !expectedVisibility) {
                errorMsg = "Validated Quicker Access Pop Up is Displayed Unexpectedly on PopUp Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualVisibility && expectedVisibility) {
                errorMsg = "Validated Quicker Access Pop Up is not Displayed Unexpectedly on PopUp Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void allowPermission(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_ALLOW_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_ALLOW_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
//            scenarioDef.log(Status.PASS,"Successfully Allowed Permission");
        }catch (Exception e){
//            failureException = e.toString();
//            scenarioDef.log(Status.FAIL,"Could not Allow Permission");
//            throw e;
        }
    }

    public void rejectPermission(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_REJECT_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_REJECT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
//            scenarioDef.log(Status.PASS,"Successfully Allowed Permission");
        }catch (Exception e){
//            failureException = e.toString();
//            scenarioDef.log(Status.FAIL,"Could not Allow Permission");
//            throw e;
        }
    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Proceed Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Proceed Button on Pop Up Window");
            throw e;
        }
    }

    public void clickUpgradeButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_UPGRADE_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_UPGRADE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Upgrade Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Upgrade Button on Pop Up Window");
            throw e;
        }
    }

    public void clickLetsTryAgainButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_LETS_TRY_AGAIN_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_LETS_TRY_AGAIN_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Let's Try Again Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Let's Try Again Button on Pop Up Window");
            throw e;
        }
    }

    public void clickOpenCameraButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_OPEN_CAMERA_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_OPEN_CAMERA_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Open Camera Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Open Camera Button on Pop Up Window");
            throw e;
        }
    }

    public void clickNotNowButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_NOT_NOW_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_NOT_NOW_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Not Now Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Not Now Button on Pop Up Window");
            throw e;
        }
    }

    public void clickRadioButtonOfTermsAndConditions(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_RADIO_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_RADIO_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Terms and Conditions Radio Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Terms and Conditions Radio Button on Pop Up Window");
            throw e;
        }
    }

    public void clickCameraRadioButtonOfTermsAndConditions(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_CAMERA_RADIO_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_CAMERA_RADIO_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Open Camera Terms and Conditions Radio Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Open Camera Terms and Conditions Radio Button on Pop Up Window");
            throw e;
        }
    }

    public void clickAcceptButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_ACCEPT_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_ACCEPT_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Accept Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Accept Button on Pop Up Window");
            throw e;
        }
    }
    public void clickCloseButton(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_CLOSE_BUTTON.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_CLOSE_BUTTON.getValue();
        }
        try{
            scrollDownToBottomMobile();
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked Close Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Close Button on Pop Up Window");
            throw e;
        }
    }
    public void waitForLoaderToDisappear(){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_LOADER.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_LOADER.getValue();
        }
        try{
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Successfully Loaded Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Screen Taking More Time to Load Unexpectedly");
            throw e;
        }
    }

    public void clickAddMoneyButton(){
        String locator,waitLocator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_CASH_IN_BUTTON.getValue();
            waitLocator =  PopUpEnumAndroid.XPATH_PROCESSING_TEXT.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_CASH_IN_BUTTON.getValue();
            waitLocator =  PopUpEnumIOS.XPATH_PROCESSING_TEXT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(waitLocator);
            scenarioDef.log(Status.PASS,"Clicked Cash In Button on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click Cash In Button on Pop Up Window");
            throw e;
        }
    }
    public void enterCvvCode(String textToEnter){
        String locator;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_CVV_FIELD.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_CVV_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(isAndroid()){
                click(locator);
                customWait(2000);
                enterNumberByForce(textToEnter);
            }else{
                enterString(locator,textToEnter);
                hideDoneKeyboardIOS();
            }
            scenarioDef.log(Status.PASS,"Entered CVV Number: "+textToEnter+" on Pop Up Window");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter CVV Number: "+textToEnter+" on Pop Up Window");
            throw e;
        }
    }
    public void validateSuccessfulMessage(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            if(actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Successful Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Successful Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateSuccessMessage(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESS_MSG.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESS_MSG.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            if(actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Success Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Success Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateSuccessfulMessageDouble(String expectedText) throws IOException {
        String locator,locatorVal;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG.getValue();
            locatorVal =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG_DESC.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG.getValue();
            locatorVal =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG_DESC.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator)+" "+getText(locatorVal);
            if(actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Successful Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Successful Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateSuccessfulMessageTwo(String expectedText) throws IOException {
        String locator,locatorVal;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG_FIRST.getValue();
            locatorVal =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG_SECOND.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG_FIRST.getValue();
            locatorVal =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG_SECOND.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator)+" "+getText(locatorVal);
            if(actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Successful Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Successful Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateSuccessfulMessageDoubleBank(String expectedText) throws IOException {
        String locator,locatorVal;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG.getValue();
            locatorVal =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG_DESC.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESSFUL_BANK_MSG.getValue();
            locatorVal =  PopUpEnumIOS.XPATH_SUCCESSFUL_BANK_MSG_DESC.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator)+" "+getText(locatorVal);
            if(actualText.contains(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Successful Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Successful Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateSuccessfulMessageAdv(String expectedText) throws IOException {
        String locator;
        String actualText,expectedArray[];
        String errorMsg=null;
        Boolean checkFlag = false;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_SUCCESSFUL_MSG.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_SUCCESSFUL_MSG.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            expectedArray = expectedText.split(",");
            for(int i=0;i<expectedArray.length;i++){
                checkFlag = actualText.contains(expectedArray[i]);
            }
            if(checkFlag){
                scenarioDef.log(Status.PASS,"Validated Successful Message: "+actualText+" on Pop Up Window <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Successful Message: "+actualText+", Expected Value: "+expectedText+" on Pop Up Window";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Successful Message Element on Pop Up Window";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
    public void validateCameraIsOpened() throws IOException {
        String locator,errorMsg=null;
        if(isAndroid()){
            locator =  PopUpEnumAndroid.XPATH_CAMERA_ELEMENT.getValue();
        }else {
            locator =  PopUpEnumIOS.XPATH_CAMERA_ELEMENT.getValue();
        }
        try{
            if(isVisibleAdv(locator)){
                scenarioDef.log(Status.PASS,"Validated Camera Element is Visible on Pop Up <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Camera Element is not Visible on Pop Up Window";
                throw new NoSuchContextException("Element is not Visible");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
