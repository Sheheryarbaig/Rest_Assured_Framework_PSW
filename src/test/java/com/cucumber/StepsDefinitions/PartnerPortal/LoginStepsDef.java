package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.LoginPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;

public class LoginStepsDef extends HarnessVariables {

    LoginPageFactory loginPage;
    String ppAccountFile = "partnerPortalAccount.properties";

    public LoginStepsDef() throws Exception {
        loginPage = new LoginPageFactory();
    }

    @And("User Enters {string} on Username Field on Partner Portal Login Page")
    public void userEntersOnUsernameFieldOnPartnerPortalLoginPage(String username) throws Exception {
        username = new PropertyLoaderFactory().getPropertyFile(ppAccountFile).getProperty(username);
        loginPage.enterUsername(username);
    }

    @And("User Enters {string} on Password Field on Partner Portal Login Page")
    public void userEntersOnPasswordFieldOnPartnerPortalLoginPage(String password) throws Exception {
        password = new PropertyLoaderFactory().getPropertyFile(ppAccountFile).getProperty(password);
        loginPage.enterPassword(password);
    }

    @And("User Clicks on Sign In Button on Partner Portal Login Page")
    public void userClicksOnSignInButtonOnPartnerPortalLoginPage() {
        loginPage.clickSignInButton();
    }

    @And("User Validates Logged In Successfully {string} on Login Page")
    public void userValidatesLoggedInSuccessfullyOnLoginPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            loginPage.validateLoginSuccess(true);
        }else {
            loginPage.validateLoginSuccess(false);
        }
    }

    @And("User Validates Logged Out Successfully {string} on Login Page")
    public void userValidatesLoggedOutSuccessfullyOnLoginPage(String expectedCondition) {
        if(expectedCondition.equals("true")){
            loginPage.validateLogOutSuccess(true);
        }else {
            loginPage.validateLogOutSuccess(false);
        }
    }
}
