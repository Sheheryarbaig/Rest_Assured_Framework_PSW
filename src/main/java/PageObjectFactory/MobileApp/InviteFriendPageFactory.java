package PageObjectFactory.MobileApp;

import EnumFactory.Android.InviteFriendPageEnumAndroid;
import EnumFactory.IOS.InviteFriendPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class InviteFriendPageFactory extends UtilFactory {

    public InviteFriendPageFactory() throws Exception {
    }

    public int getPendingCount(){
        String locator;
        int pendingCount;
         if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_PENDING_COUNT.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_PENDING_COUNT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            pendingCount = Integer.parseInt(getText(locator));
            scenarioDef.log(Status.PASS,"Fetched Pending Count: "+pendingCount+" from Invite Friend Screen");
            return pendingCount;
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Fetched Pending Count from on Invite Friend Screen");
            throw e;
        }
    }

    public void clickSendInvitesButton(){
        String locator;
         if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_SEND_INVITES_BUTTON.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_SEND_INVITES_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Send Invites Button on Invite Friend Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Send Invites Button on Invite Friend Screen");
            throw e;
        }
    }

    public void clickYesButton(){
        String locator;
         if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_YES_BUTTON.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_YES_BUTTON.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Yes Button on Invite Friend Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Yes Button on Invite Friend Screen");
            throw e;
        }
    }

    public void clickInviteButton(String accountToInvite){
        String locator;
         if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_INVITE_BUTTON_START.getValue()+ accountToInvite +InviteFriendPageEnumAndroid.XPATH_INVITE_BUTTON_END.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_INVITE_BUTTON_START.getValue()+ accountToInvite +InviteFriendPageEnumIOS.XPATH_INVITE_BUTTON_END.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+ accountToInvite +" Account Invite Button on Invite Friend Screen");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+ accountToInvite +" Account Invite Button on Invite Friend Screen");
            throw e;
        }
    }

    public void validateRewardJourneyScreenVisibility(Boolean expectedCondition) throws IOException {
        String locator,errorMsg = null;
        Boolean actualCondition;
        if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_REWARD_JOURNEY_MSG.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_REWARD_JOURNEY_MSG.getValue();
        }
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Reward Journey Screen is Displayed as Expected on Invite Friend Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Reward Journey Screen is not Displayed as Expected on Invite Friend Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Reward Journey Screen is Displayed Unexpectedly on Invite Friend Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Reward Journey Screen is not Displayed Unexpectedly on Invite Friend Screen";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validatePendingCount(int expectedCount) throws IOException {
        String locator,errorMsg = null;
        int actualCount;
        if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_PENDING_COUNT.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_PENDING_COUNT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualCount = Integer.parseInt(getText(locator));
            if (actualCount == expectedCount + 1) {
                scenarioDef.log(Status.PASS, "Validated Pending Count is Increased by One on Invite Friend Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else {
                errorMsg = "Could not Validate Pending Count is Increased by One, Expected Count: "+ expectedCount +", Actual Count: "+ actualCount +" on Invite Friend Screen";
                throw new NoSuchContextException("Actual and Expected Value is Different");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }

    public void validateConstantPendingCount(int expectedCount) throws IOException {
        String locator,errorMsg = null;
        int actualCount;
        if(isAndroid()){
            locator = InviteFriendPageEnumAndroid.XPATH_PENDING_COUNT.getValue();
        }else {
            locator = InviteFriendPageEnumIOS.XPATH_PENDING_COUNT.getValue();
        }
        try{
            waitFactory.waitForElementToBeClickable(locator);
            actualCount = Integer.parseInt(getText(locator));
            if (actualCount == expectedCount) {
                scenarioDef.log(Status.PASS, "Validated Pending Count Remains Same on Invite Friend Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            } else {
                errorMsg = "Could not Validate Pending Remains Same, Expected Count: "+ expectedCount +", Actual Count: "+ actualCount +" on Invite Friend Screen";
                throw new NoSuchContextException("Actual and Expected Value is Different");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
