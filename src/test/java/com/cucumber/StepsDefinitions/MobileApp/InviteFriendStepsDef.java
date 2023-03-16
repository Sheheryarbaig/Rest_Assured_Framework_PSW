package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.InviteFriendPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class InviteFriendStepsDef extends HarnessVariables {

    InviteFriendPageFactory inviteFriendPage;
    String accountProp = "account.properties";

    public InviteFriendStepsDef() throws Exception {
        inviteFriendPage = new InviteFriendPageFactory();
    }

    @Then("User Validates Reward Journey Screen as per Status on Invite Friend Screen")
    public void userValidatesRewardJourneyScreenAsPerStatusOnInviteFriendScreen() throws IOException {
        inviteFriendPage.validateRewardJourneyScreenVisibility(REWARD_FLAG);
    }

    @And("User Clicks on Send Invites Button on Invite Friend Screen")
    public void userClicksOnSendInvitesButtonOnInviteFriendScreen() {
        if(REWARD_FLAG){
            inviteFriendPage.clickSendInvitesButton();
        }
    }

    @And("User Fetches Pending Count on Invite Friend Screen")
    public void userFetchesPendingCountOnInviteFriendScreen() {
        INVITE_PENDING_COUNT = inviteFriendPage.getPendingCount();
    }

    @And("User Clicks Invite Button for {string} on Invite Friend Screen")
    public void userClicksInviteButtonForOnInviteFriendScreen(String accountToInvite) throws Exception {
        accountToInvite = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(accountToInvite);
        inviteFriendPage.clickInviteButton(accountToInvite);
    }

    @And("User Clicks on Yes Button on Invite Friend Screen")
    public void userClicksOnYesButtonOnInviteFriendScreen() {
        inviteFriendPage.clickYesButton();
    }

    @Then("User Validates Pending Count Increased by One on Invite Friend Screen")
    public void userValidatesPendingCountIncreasedByOneOnInviteFriendScreen() throws IOException {
        inviteFriendPage.validatePendingCount(INVITE_PENDING_COUNT);
    }

    @Then("User Validates Pending Count Remains Same on Invite Friend Screen")
    public void userValidatesPendingCountRemainsSameOnInviteFriendScreen() throws IOException {
        inviteFriendPage.validateConstantPendingCount(INVITE_PENDING_COUNT);
    }
}
