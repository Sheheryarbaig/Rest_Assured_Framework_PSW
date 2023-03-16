package com.cucumber.StepsDefinitions.PartnerPortal;

import PageObjectFactory.PartnerPortal.DashboardPageFactory;
import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import com.cucumber.StepsDefinitions.HarnessVariables;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardStepsDef extends HarnessVariables {

    DashboardPageFactory dashboardPage;
    String navigationPropFile = "partnerPortalNavigation.properties";

    public DashboardStepsDef() throws Exception {
        dashboardPage = new DashboardPageFactory();
    }

    @And("User Clicks Navigation {string} Option on Dashboard Page")
    public void userClicksNavigationOptionOnDashboardPage(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigationPropFile).getProperty(optionToSelect);
        dashboardPage.clickNavigationOption(optionToSelect);
    }

    @And("User Clicks Navigation {string} Start Option on Dashboard Page")
    public void userClicksNavigationStartOptionOnDashboardPage(String optionToSelect) throws Exception {
        optionToSelect = new PropertyLoaderFactory().getPropertyFile(navigationPropFile).getProperty(optionToSelect);
        dashboardPage.clickNavigationStartOption(optionToSelect);
    }

    @Then("User Clicks Yes on Pop Up")
    public void userClicksYesOnPopUp() {
        dashboardPage.clickYes();
    }

    @And("User Clicks Close on Pop Up")
    public void userClicksCloseOnPopUp() {
        dashboardPage.clickClose();
    }

    @And("User Clicks Ok Button on Pop Up")
    public void userClicksOkButtonOnPopUp() {
        dashboardPage.clickOk();
    }

    @Then("User Refreshes the Browser")
    public void userRefreshesTheBrowser() {
        customWait(2000);
        ServiceFactory.getDriver().navigate().refresh();
        waitFactory.waitForPageToFinishLoading(ServiceFactory.getDriver());
    }
}
