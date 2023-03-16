package PageObjectFactory.MobileApp;

import EnumFactory.Android.GiftingPageEnumAndroid;
import EnumFactory.IOS.GiftingPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class GiftingPageFactory extends UtilFactory {

    public GiftingPageFactory() throws Exception {

    }

    public void selectOption(String textToSelect){
        String locator,waitLocator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + GiftingPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
            waitLocator = GiftingPageEnumAndroid.XPATH_GIFTING_HEADING_MSG.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + GiftingPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
            waitLocator = GiftingPageEnumIOS.XPATH_GIFTING_HEADING_MSG.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(waitLocator);
            if(isAndroid()){
                scrollToElementMobile(locator);
                click(locator);
            }
            else{
                if(textToSelect.equalsIgnoreCase("Shahid VIP")){
                    scrollDownMobile();
                    click(locator);
                }else if(textToSelect.equalsIgnoreCase("Cash Gift")){
                    click(locator);
                }else {
                    click(locator);
                    if(isVisibleAdv(waitLocator)){
                        click(locator);
                    }else if(!isVisibleAdv(locator)){
                        goBack();
                        waitFactory.waitForElementToBeClickable(waitLocator);
                        click(locator);
                    }
                }
            }
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option of Navigation on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option of Navigation on Gifting Screen");
            throw e;
        }
    }

    public void selectVoucherOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_VOUCHER_OPTION_START.getValue() + textToSelect + GiftingPageEnumAndroid.XPATH_VOUCHER_OPTION_END.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_VOUCHER_OPTION_START.getValue() + textToSelect + GiftingPageEnumIOS.XPATH_VOUCHER_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option of Voucher on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option of Voucher on Gifting Screen");
            throw e;
        }
    }

    public void clickProceedButton(){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_PROCEED_BUTTON.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Gifting Screen");
            throw e;
        }
    }

    public void clickLoginProceedButton(){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_LOGIN_PROCEED_BUTTON.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_LOGIN_PROCEED_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Proceed Button on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Proceed Button on Gifting Screen");
            throw e;
        }
    }

    public void clickAddMoneyButton(){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_ADD_MONEY_BUTTON.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_ADD_MONEY_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Money Button on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Money Button on Gifting Screen");
            throw e;
        }
    }

    public String fetchVoucherAmount(String voucherOption){
        String locator,amount;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_VOUCHER_AMOUNT_START.getValue() +voucherOption+ GiftingPageEnumAndroid.XPATH_VOUCHER_AMOUNT_END.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_VOUCHER_AMOUNT_START.getValue() +voucherOption+ GiftingPageEnumIOS.XPATH_VOUCHER_AMOUNT_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            amount = getText(locator);
            scenarioDef.log(Status.PASS,"Fetches Voucher Amount: "+amount+" on Gifting Screen");
            return amount.replace("AED ","");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Voucher Amount on Gifting Screen");
            throw e;
        }
    }

    public void validateAvailableBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_AVAILABLE_BALANCE.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_AVAILABLE_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split("AED ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Available Balance is Equal: "+actualText+" on Gifting Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Available Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Gifting Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Available Balance Element on Gifting Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePaymentMethodBalance(String expectedText) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_PAYMENT_METHOD_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator).split(" ")[1];
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Payment Method Balance is Equal: "+actualText+" on Gifting Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Payment Method Balance is Equal: "+actualText+", Expected Value: "+expectedText+" on Gifting Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Payment Method Balance Element on Gifting Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void enterMsisdn(String textToEnter){
        String locator,permission = null;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_MSISDN_FIELD.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_MSISDN_FIELD.getValue();
            permission = GiftingPageEnumIOS.XPATH_ALLOW_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            if(isAndroid()) {
            }else {
                waitFactory.waitForElementToBeClickable(permission);
                click(permission);
            }
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on MSISDN Field on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on MSISDN Field on Gifting Screen");
            throw e;
        }
    }

    public void enterAmount(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_AMOUNT_FIELD.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_AMOUNT_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Amount Field on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Amount Field on Gifting Screen");
            throw e;
        }
    }

    public void enterPin(String textToEnter){
        String locator;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_PIN_FIELD.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_PIN_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS,"Entered "+ textToEnter +" on Pin Field on Gifting Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter "+ textToEnter +" on Pin Field on Gifting Screen");
            throw e;
        }
    }

    public void validateAmountToBeDeducted(String expectedAmount) throws IOException {
        String locator;
        String actualText;
        String errorMsg=null;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_AMOUNT_TO_BE_DEDUCTED.getValue();
        }
        try{
          waitFactory.waitForElementToBeClickable(locator);
            actualText = getText(locator);
            actualText = actualText.split(" ")[1];
            if(Float.parseFloat(actualText)==Float.parseFloat(expectedAmount)){
                scenarioDef.log(Status.PASS,"Validated Amount to be Deducted is Equal: "+actualText+" on Gifting Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Amount to be Deducted is Equal: "+actualText+", Expected Value: "+ expectedAmount +" on Gifting Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Amount to be Deducted Element on Gifting Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateOption(String textToSelect,Boolean expectedCondition) throws IOException {
        String locator, errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + GiftingPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + GiftingPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try {
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated "+textToSelect+" is Displayed on Other Service Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated "+textToSelect+" is not Displayed as Expected on Other Service Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated "+textToSelect+" is Displayed Unexpectedly on Other Service Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated "+textToSelect+" is not Displayed Unexpectedly on Other Service Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateBillersPrices(String expectedPrices) throws IOException {
        String locator, errorMsg = null,actualPrice;
        String[] expectedPrice;
        List<WebElement> priceElements;
        if(isAndroid()){
            locator = GiftingPageEnumAndroid.XPATH_BILLERS_PRICES.getValue();
        }else {
            locator = GiftingPageEnumIOS.XPATH_BILLERS_PRICES.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            priceElements = elementFactory.getElementsList(locator);
            expectedPrice = expectedPrices.split(",");
            for (int i=0;i< expectedPrice.length;i++){
                actualPrice = priceElements.get(i).getText().replace("AED ","");
                if(!expectedPrice[i].equals(actualPrice)){
                    errorMsg = "Could not Validate Pricing of Gifting Voucher: "+expectedPrice[i]+" on Gifting Screen, Actual Price: "+actualPrice;
                    throw new NoSuchContextException("Expected and Actual Value is Different");
                }
            }
            scenarioDef.log(Status.PASS, "Validated Pricing of Gifting Vouchers are Correct on Gifting Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
