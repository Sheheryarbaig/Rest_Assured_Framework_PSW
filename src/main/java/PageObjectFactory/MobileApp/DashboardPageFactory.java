package PageObjectFactory.MobileApp;

import EnumFactory.Android.DashboardPageEnumAndroid;
import EnumFactory.IOS.DashboardPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DashboardPageFactory extends UtilFactory {

    public DashboardPageFactory() throws Exception {

    }

    public void clickNavigateOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + DashboardPageEnumAndroid.XPATH_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_NAVIGATION_OPTION_START.getValue() + textToSelect + DashboardPageEnumIOS.XPATH_NAVIGATION_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option of Navigation on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option of Navigation on Dashboard Screen");
            throw e;
        }
    }

    public void clickBottomNavigateOption(String textToSelect){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_BOTTOM_NAVIGATION_OPTION_START.getValue() + textToSelect + DashboardPageEnumAndroid.XPATH_BOTTOM_NAVIGATION_OPTION_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_BOTTOM_NAVIGATION_OPTION_START.getValue() + textToSelect + DashboardPageEnumIOS.XPATH_BOTTOM_NAVIGATION_OPTION_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+textToSelect+" Option of Bottom Navigation on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+textToSelect+" Option of Bottom Navigation on Dashboard Screen");
            throw e;
        }
    }

    public void clickLogoutButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_LOGOUT_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_LOGOUT_BUTTON.getValue();
        }
        try{
            scrollDownToBottomMobile();
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Logout Button on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Logout Button on Dashboard Screen");
            throw e;
        }
    }

    public void clickBankAddNewButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_BANK_ADD_NEW_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_BANK_ADD_NEW_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add New Button of Saved Bank on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add New Button of Saved Bank on Dashboard Screen");
            throw e;
        }
    }

    public void clickCardAddNewButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_CARD_ADD_NEW_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_CARD_ADD_NEW_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add New Button of Saved Card on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add New Button of Saved Card on Dashboard Screen");
            throw e;
        }
    }

    public void clickBankDeleteButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_BANK_DELETE_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_BANK_DELETE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Delete Button of Saved Bank on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Delete Button of Saved Bank on Dashboard Screen");
            throw e;
        }
    }

    public void clickCardDeleteButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_CARD_DELETE_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_CARD_DELETE_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Delete Button of Saved Bank on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Delete Button of Saved Bank on Dashboard Screen");
            throw e;
        }
    }

    public void clickExpandableButton(String optionToSelect){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_EXPANDABLE_BUTTON_START.getValue()+ optionToSelect +DashboardPageEnumAndroid.XPATH_EXPANDABLE_BUTTON_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_EXPANDABLE_BUTTON_START.getValue()+ optionToSelect +DashboardPageEnumIOS.XPATH_EXPANDABLE_BUTTON_END.getValue();
        }
        try{
            scrollToElementMobile(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Expandable Button with Option: "+ optionToSelect +" on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on on Expandable Button with Option: "+ optionToSelect +" on Dashboard Screen");
            throw e;
        }
    }

    public void clickResendButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_RESEND_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_RESEND_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Resend Button of Transaction on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Resend Button of Transaction on Dashboard Screen");
            throw e;
        }
    }

    public void clickTransferEntity(){
        String locator,waitLocator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_TRANSFER_ENTITY.getValue();
            waitLocator = DashboardPageEnumAndroid.XPATH_TABLE_LOADER.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_TRANSFER_ENTITY.getValue();
            waitLocator = DashboardPageEnumIOS.XPATH_TABLE_LOADER.getValue();
        }
        try{
            waitFactory.waitForElementToBeInVisible(waitLocator);
            scrollToElementMobile(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Transfer Entity on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Transfer Entity on Dashboard Screen");
            throw e;
        }
    }

    public void swipeSavedBank(String savedBank){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_BANK_START.getValue()+ savedBank +DashboardPageEnumAndroid.XPATH_SAVED_BANK_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_BANK_START.getValue()+ savedBank +DashboardPageEnumIOS.XPATH_SAVED_BANK_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            swipeElement(elementFactory.getElement(locator),"LEFT");
            scenarioDef.log(Status.PASS,"Swiped Saved Bank on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Swipe Saved Bank on Dashboard Screen");
            throw e;
        }
    }

    public void swipeSavedCard(String savedCard){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_CARD_START.getValue()+ savedCard +DashboardPageEnumAndroid.XPATH_SAVED_CARD_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_CARD_START.getValue()+ savedCard +DashboardPageEnumIOS.XPATH_SAVED_CARD_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            swipeElement(elementFactory.getElement(locator),"LEFT");
            scenarioDef.log(Status.PASS,"Swiped Saved Card on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Swipe Saved Card on Dashboard Screen");
            throw e;
        }
    }

    public void clickAddMoneyButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_ADD_MONEY_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_ADD_MONEY_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Add Money Button on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Add Money Button on Dashboard Screen");
            throw e;
        }
    }

    public void clickSendMoneyButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SEND_MONEY_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SEND_MONEY_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Send Money Button on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Send Money Button on Dashboard Screen");
            throw e;
        }
    }

    public List<String> getAgentsNamesFromTable(){
        String locator;
        List<String> agentNames = new ArrayList<String>();
        List<WebElement> agentNamesElement;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENT_NAME_IN_TABLE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENT_NAME_IN_TABLE.getValue();
        }
        try{
            scrollDownToBottomMobile();
            waitFactory.waitForElementToBeClickable(locator);
            agentNamesElement = elementFactory.getElementsList(locator);
            for (int i=0;i<agentNamesElement.size();i++){
                agentNames.add(agentNamesElement.get(i).getText());
            }
            scenarioDef.log(Status.PASS,"Successfully Fetched Agents Names from Table on Dashboard Screen");
            return agentNames;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Agents Names from Table on Dashboard Screen");
            throw e;
        }
    }

    public List<String> getMerchantsNamesFromTable(){
        String locator,scrollLocator;
        List<String> merchantNames = new ArrayList<String>();
        List<WebElement> merchantNamesElement;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANT_NAME_IN_TABLE.getValue();
            scrollLocator = DashboardPageEnumAndroid.XPATH_AGENT_VIEW_ALL_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANT_NAME_IN_TABLE.getValue();
            scrollLocator = DashboardPageEnumIOS.XPATH_AGENT_VIEW_ALL_BUTTON.getValue();
        }
        try{
            scrollToElementMobile(scrollLocator);
            waitFactory.waitForElementToBeClickable(locator);
            merchantNamesElement = elementFactory.getElementsList(locator);
            for (int i=0;i<merchantNamesElement.size();i++){
                merchantNames.add(merchantNamesElement.get(i).getText());
            }
            scenarioDef.log(Status.PASS,"Successfully Fetched Merchants Names from Table on Dashboard Screen");
            return merchantNames;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Merchants Names from Table on Dashboard Screen");
            throw e;
        }
    }

    public void clickBalanceCard(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_BALANCE_CARD.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_BALANCE_CARD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Balance Card on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Balance Card on Dashboard Screen");
            throw e;
        }
    }

    public void clickAgentViewAllButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENT_VIEW_ALL_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENT_VIEW_ALL_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeVisible(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Agent View All Button on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Agent View All Button on Dashboard Screen");
            throw e;
        }
    }

    public void clickProfileOption(String optionToSelect){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_PROFILE_OPTION_START.getValue()+ optionToSelect +DashboardPageEnumAndroid.XPATH_PROFILE_OPTION_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_PROFILE_OPTION_START.getValue()+ optionToSelect +DashboardPageEnumIOS.XPATH_PROFILE_OPTION_END.getValue();
        }
        try{
            if(optionToSelect.equalsIgnoreCase("international remittance beneficiaries") || optionToSelect.equalsIgnoreCase("domestic helper transfer")
                    || optionToSelect.equalsIgnoreCase("services & utilities") || optionToSelect.equalsIgnoreCase("faq") || optionToSelect.equalsIgnoreCase("contact us")){
                scrollDownToBottomMobile();
            }
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Profile Option: "+optionToSelect+" on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Profile Option: "+optionToSelect+" on Dashboard Screen");
            throw e;
        }
    }

    public void clickMerchantViewAllButton(){
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANTS_VIEW_ALL_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANTS_VIEW_ALL_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Merchant View All Button on Dashboard Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Merchant View All Button on Dashboard Screen");
            throw e;
        }
    }

    public void validatePromotionBanner() throws IOException {
        String locator,waitLocator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_PROMOTION_BANNER.getValue();
            waitLocator = DashboardPageEnumAndroid.XPATH_PROMOTION_BANNER.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_PROMOTION_BANNER.getValue();
            waitLocator = DashboardPageEnumIOS.XPATH_PROMOTION_BANNER.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(waitLocator);
            scrollToElementMobile(locator);
            scenarioDef.log(Status.PASS,"Validated Promotion Banner on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Promotion Banner on Dashboard Screen");
            throw e;
        }
    }

    public void validateAgentListing() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENT_LISTING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENT_LISTING.getValue();
        }
        try{
            scrollToElementMobile(locator);
            scenarioDef.log(Status.PASS,"Validated Agent Listing on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Agent Listing on Dashboard Screen");
            throw e;
        }
    }

    public void validateMerchantListing() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANT_LISTING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANT_LISTING.getValue();
        }
        try{
            scrollToElementMobile(locator);
            scenarioDef.log(Status.PASS,"Validated Merchant Listing on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Merchant Listing on Dashboard Screen");
            throw e;
        }
    }

    public void validateListViewTab() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_LIST_VIEW_TAB.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_LIST_VIEW_TAB.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Validated List View Tab on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate List View Tab on Dashboard Screen");
            throw e;
        }
    }

    public void validateMapViewTab() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MAP_VIEW_TAB.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MAP_VIEW_TAB.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Validated Map View Tab on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Map View Tab on Dashboard Screen");
            throw e;
        }
    }

    public void validateMyDocumentsHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MY_DOCUMENTS_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MY_DOCUMENTS_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated My Document Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate My Document Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateBankAccountsHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_BANK_ACCOUNTS_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_BANK_ACCOUNTS_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated Bank Accounts Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Bank Accounts Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateAccountAccessHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_ACCOUNT_ACCESS_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_ACCOUNT_ACCESS_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated Account Access Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Account Access Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateInternationalRemittanceBeneficiariesHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_IMT_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_IMT_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated International Remittance Beneficiaries Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate International Remittance Beneficiaries Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateDirectPayHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_DIRECT_PAY_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_DIRECT_PAY_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated Direct Pay Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Direct Pay Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateServicesAndUtilitiesHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SERVICES_AND_UTILITIES_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SERVICES_AND_UTILITIES_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated Services & Utilities Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate Services & Utilities Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateFAQsHeading() throws IOException {
        String locator;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_FAQ_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_FAQ_HEADING.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS,"Validated FAQ Heading on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Validate FAQ Heading on Dashboard Screen");
            throw e;
        }
    }

    public void validateMobileNumber(String expectedText) throws IOException {
        String locator,actualText,errorMsg = null;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MOBILE_NUMBER_FIELD.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MOBILE_NUMBER_FIELD.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualText=getText(locator).replaceAll("[^0-9]+","");
            if(actualText.equals(expectedText)){
                scenarioDef.log(Status.PASS,"Validated Actual Mobile Number: "+actualText+" on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Actual Mobile Number: "+actualText+" on Dashboard Screen, Expected Value: "+expectedText;
                throw new NoSuchContextException("Actual and Expected Values are different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Mobile Number Field on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateAddMoneyButtonState(Boolean expectedState) throws IOException {
        String locator;
        Boolean actualState;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_ADD_MONEY_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_ADD_MONEY_BUTTON.getValue();
        }
        try{
            if(isAndroid()){
                waitFactory.waitForElementToBeVisible(locator);
                actualState = Boolean.valueOf(getAttribute(locator,"enabled"));
            }else{
                waitFactory.waitForElementToBeVisible(locator);
                click(locator);
                actualState = isVisibleAdv(locator);
                actualState = !actualState;
            }
            if (actualState == expectedState){
                scenarioDef.log(Status.PASS,"Add Money Button State is as expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else {
                throw new NoSuchContextException("Expected and Actual State is different");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Add Money Button State is not as expected on Dashboard Screen");
            throw e;
        }
    }

    public void validateSendMoneyButtonState(Boolean expectedState) throws IOException {
        String locator;
        Boolean actualState;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SEND_MONEY_BUTTON.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SEND_MONEY_BUTTON.getValue();
        }
        try{
            if(isAndroid()){
                waitFactory.waitForElementToBeVisible(locator);
                actualState = Boolean.valueOf(getAttribute(locator,"enabled"));
            }else{
                waitFactory.waitForElementToBeVisible(locator);
                click(locator);
                actualState = isVisibleAdv(locator);
                actualState = !actualState;
            }
            if (actualState == expectedState){
                scenarioDef.log(Status.PASS,"Send Money Button State is as expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else {
                throw new NoSuchContextException("Expected and Actual State is different");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Send Money Button State is not as expected on Dashboard Screen");
            throw e;
        }
    }

    public String getWalletBalance(){
        String locator;
        String balance;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_WALLET_BALANCE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_WALLET_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            balance = getText(locator);
            scenarioDef.log(Status.PASS,"Fetched Wallet Balance: "+balance+" on Dashboard Screen");
            return balance;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetch Wallet Balance on Dashboard Screen");
            throw e;
        }
    }

    public void validateWalletBalanceWithDeductedAmount(String oldBalance,String amountToBeDeducted) throws IOException {
        String locator;
        String balance,errorMsg=null;
        float expectedBalance;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_WALLET_BALANCE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_WALLET_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            balance = getText(locator).replace(",","");
            expectedBalance = Float.parseFloat(oldBalance.replace(",","")) - Float.parseFloat(amountToBeDeducted);
            expectedBalance = roundUpAmount(expectedBalance);
            if(Float.parseFloat(balance) == expectedBalance){
                scenarioDef.log(Status.PASS,"Validated Balance Deducted Correctly and Current Balance is: "+balance+" on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Balance Deducted Correctly, Current Balance: "+balance+", Expected Value: "+expectedBalance+" on Dashboard Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Balance Element on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateWalletBalanceWithAddedAmount(String oldBalance,String amountToBeAdded) throws IOException {
        String locator;
        String balance,errorMsg=null;
        float expectedBalance;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_WALLET_BALANCE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_WALLET_BALANCE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            balance = getText(locator).replace(",","");
            expectedBalance = Float.parseFloat(oldBalance.replace(",","")) + Float.parseFloat(amountToBeAdded);
            if(Float.parseFloat(balance) == expectedBalance){
                scenarioDef.log(Status.PASS,"Validated Balance Added Correctly and Current Balance is: "+balance+" on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Balance Added Correctly, Current Balance: "+balance+", Expected Value: "+expectedBalance+" on Dashboard Screen";
                throw new NoSuchContextException("Expected and Actual Value is Different");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Balance Element on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateAgentTableInAscending() throws IOException {
        String locator,errorMsg=null;
        List<WebElement> agentsList;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENTS_DISTANCE_IN_TABLE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENTS_DISTANCE_IN_TABLE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            agentsList = elementFactory.getElementsList(locator);
            if(elementInAscending(agentsList)){
                scenarioDef.log(Status.PASS,"Validated Agents Present in Table is in Ascending Order on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Agents Present in Table is in Ascending Order on Dashboard Screen";
                throw new NoSuchContextException("Expected Condition does not Meet the Actual Criteria");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Agents Element of Agent Table on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateAgentListViewInAscending() throws IOException {
        String locator,errorMsg=null;
        List<WebElement> agentsList;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENTS_IN_LIST_VIEW.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENTS_IN_LIST_VIEW.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            agentsList = elementFactory.getElementsList(locator);
            if(elementInAscending(agentsList)){
                scenarioDef.log(Status.PASS,"Validated Agents Present in List View is in Ascending Order on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Agents Present in List View is in Ascending Order on Dashboard Screen";
                throw new NoSuchContextException("Expected Condition does not Meet the Actual Criteria");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Agents Element of Agents List View on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateMerchantTableInAscending() throws IOException {
        String locator,errorMsg=null;
        List<WebElement> merchantsList;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANTS_DISTANCE_IN_TABLE.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANTS_DISTANCE_IN_TABLE.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            merchantsList = elementFactory.getElementsList(locator);
            if(elementInAscending(merchantsList)){
                scenarioDef.log(Status.PASS,"Validated Merchants Present in Table is in Ascending Order on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Merchants Present in Table is in Ascending Order on Dashboard Screen";
                throw new NoSuchContextException("Expected Condition does not Meet the Actual Criteria");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Merchants Element of Merchant Table on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateMerchantListViewInAscending() throws IOException {
        String locator,errorMsg=null;
        List<WebElement> merchantsList;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANTS_IN_LIST_VIEW.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANTS_IN_LIST_VIEW.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            merchantsList = elementFactory.getElementsList(locator);
            if(elementInAscending(merchantsList)){
                scenarioDef.log(Status.PASS,"Validated Merchants Present in List View is in Ascending Order on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Merchants Present in List View is in Ascending Order on Dashboard Screen";
                throw new NoSuchContextException("Expected Condition does not Meet the Actual Criteria");
            }
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Merchants Element of Merchants List View on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateAgentsNameList(List<String> expectedList) throws IOException {
        String locator,errorMsg=null;
        List<WebElement> agentsList;
        String expectedText,actualText;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_AGENTS_NAME_IN_LIST_VIEW.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_AGENTS_NAME_IN_LIST_VIEW.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            agentsList = elementFactory.getElementsList(locator);
            for(int i=0;i<3;i++){
                expectedText=expectedList.get(i);
                actualText=agentsList.get(i).getText();
                if (actualText.equals(expectedText)){
                    scenarioDef.log(Status.PASS,"Validated Agent Name: "+expectedText+" as Expected on Dashboard Screen");
                }else{
                    errorMsg = "Could not Validate Agent Name: "+expectedText+" on Dashboard Screen, Actual Value: "+actualText;
                    throw new NoSuchContextException("Actual and Expected Value is Different");
                }
            }
            scenarioDef.log(Status.PASS,"Validated Agents Names are in Expected Order on Agents List View on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Agents Name Element of Agents List View on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateMerchantsNameList(List<String> expectedList) throws IOException {
        String locator,errorMsg=null;
        List<WebElement> merchantsList;
        String expectedText,actualText;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_MERCHANTS_NAME_IN_LIST_VIEW.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_MERCHANTS_NAME_IN_LIST_VIEW.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            merchantsList = elementFactory.getElementsList(locator);
            for(int i=0;i<3;i++){
                expectedText=expectedList.get(i);
                actualText= merchantsList.get(i).getText();
                if (actualText.equals(expectedText)){
                    scenarioDef.log(Status.PASS,"Validated Merchant Name: "+expectedText+" as Expected on Dashboard Screen");
                }else{
                    errorMsg = "Could not Validate Merchant Name: "+expectedText+" on Dashboard Screen, Actual Value: "+actualText;
                    throw new NoSuchContextException("Actual and Expected Value is Different");
                }
            }
            scenarioDef.log(Status.PASS,"Validated Merchants Names are in Expected Order on Merchants List View on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            if(errorMsg==null){
                errorMsg="Unable to get Merchants Name Element of Merchants List View on Dashboard Screen";
            }
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,errorMsg);
            throw e;
        }
    }

    public void validateTransactionHistoryHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_TRANSACTION_HISTORY_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_TRANSACTION_HISTORY_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction History Heading is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Transaction History Heading is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Transaction History Heading is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Transaction History Heading is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateWalletHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_WALLET_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_WALLET_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Wallet Heading is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Wallet Heading is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Wallet Heading is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Wallet Heading is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateSavedCardsHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_CARDS_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_CARDS_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Saved Cards Heading is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Saved Cards Heading is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Saved Cards Heading is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Saved Cards Heading is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateProfileHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_PROFILE_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_PROFILE_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Profile Heading is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Profile Heading is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Profile Heading is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Profile Heading is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateSavedBankVisibility(String savedBank,Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_BANK_START.getValue()+ savedBank +DashboardPageEnumAndroid.XPATH_SAVED_BANK_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_BANK_START.getValue()+ savedBank +DashboardPageEnumIOS.XPATH_SAVED_BANK_END.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated "+savedBank+" Bank is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated "+savedBank+" Bank is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated "+savedBank+" Bank is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated "+savedBank+" Bank is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateSavedCardVisibility(String savedCard, Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_CARD_START.getValue()+ savedCard +DashboardPageEnumAndroid.XPATH_SAVED_CARD_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_CARD_START.getValue()+ savedCard +DashboardPageEnumIOS.XPATH_SAVED_CARD_END.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Card Except "+ savedCard +" Card is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Card Except "+ savedCard +" Card is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Card Except "+ savedCard +" Card is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Card Except "+ savedCard +" Card is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateSavedBanksHeadingVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_SAVED_BANKS_HEADING.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_SAVED_BANKS_HEADING.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Saved Banks Heading is Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Saved Banks Heading is not Displayed as Expected on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Saved Banks Heading is Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Saved Banks Heading is not Displayed Unexpectedly on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateExpandablePaymentServicesOption(String optionToValidate) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = DashboardPageEnumAndroid.XPATH_EXPANDABLE_BUTTON_START.getValue()+ optionToValidate +DashboardPageEnumAndroid.XPATH_EXPANDABLE_BUTTON_END.getValue();
        }else {
            locator = DashboardPageEnumIOS.XPATH_EXPANDABLE_BUTTON_START.getValue()+ optionToValidate +DashboardPageEnumIOS.XPATH_EXPANDABLE_BUTTON_END.getValue();
        }
        try{
            scrollToElementMobile(locator);
            actualCondition = isVisibleAdv(locator);
            if (actualCondition) {
                scenarioDef.log(Status.PASS, "Validated Expandable Payment Service Button is "+ optionToValidate +" State on Dashboard Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else {
                errorMsg = "Could not Validate Expandable Payment Service Button is "+ optionToValidate +" State on Dashboard Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
