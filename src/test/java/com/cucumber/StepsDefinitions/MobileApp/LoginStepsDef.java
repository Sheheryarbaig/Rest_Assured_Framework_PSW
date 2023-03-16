package com.cucumber.StepsDefinitions.MobileApp;

import PageObjectFactory.MobileApp.LoginPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class LoginStepsDef extends HarnessVariables {

    LoginPageFactory loginPage;
    String accountProp = "account.properties";

    public LoginStepsDef() throws Exception {
        loginPage = new LoginPageFactory();
    }

    @And("User Enters {string} on Pin Field on Login Screen")
    public void userEntersOnLoginScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        loginPage.enterPin(textToEnter);
    }

    @And("User Clicks on Confirm Button on Login Screen")
    public void userClicksOnConfirmButtonOnLoginScreen() {
        loginPage.clickConfirmButton();
    }

    @Then("User Clicks on Sign In Button on Login Screen")
    public void userClicksOnSignInButtonOnLoginScreen() {
        loginPage.clickSignInButton();
    }

    @And("User Enters {string} on MSISDN Field on Login Screen")
    public void userEntersOnMSISDNFieldOnLoginScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        loginPage.enterMsisdn(textToEnter);
    }

    @And("User Clicks on Join Button on Login Screen")
    public void userClicksOnJoinButtonOnLoginScreen() {
        loginPage.clickJoinButton();
    }

    @And("User Enters {string} Code on OTP Field on Login Screen")
    public void userEntersCodeOnOTPFieldOnLoginScreen(String textToEnter) throws Exception {
        textToEnter = new PropertyLoaderFactory().getPropertyFile(accountProp).getProperty(textToEnter);
        loginPage.enterOTP(textToEnter);
    }

    @And("User Clicks on Lets Try Again Button on Login Screen")
    public void userClicksOnLetsTryAgainButtonOnLoginScreen() {
        loginPage.clickTryAgainButton();
    }

    @And("User Clicks on Login Confirm Button on Login Screen")
    public void userClicksOnLoginConfirmButtonOnLoginScreen() {
        loginPage.clickLoginConfirm();
    }

    @Then("User Validates Account has been Logged Out")
    public void userValidatesAccountHasBeenLoggedOut() throws IOException {
        loginPage.validateLoginPage();
    }
}
