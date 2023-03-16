package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.DashboardPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class DashboardPageFactory extends UtilFactory {

    public DashboardPageFactory() throws Exception {
    }

    public void clickNavigationOption(String optionToSelect){
        String locator = DashboardPageEnum.XPATH_NAVIGATION_OPTION_START.getValue()+ optionToSelect +DashboardPageEnum.XPATH_NAVIGATION_OPTION_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+optionToSelect+" Navigation Option on Dashboard Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+optionToSelect+" Navigation Option on Dashboard Page");
            throw e;
        }
    }

    public void clickNavigationStartOption(String optionToSelect){
        String hoverLocator = DashboardPageEnum.XPATH_NAVIGATION_OPTION_START.getValue()+ optionToSelect +DashboardPageEnum.XPATH_NAVIGATION_OPTION_END.getValue();
        String locator = DashboardPageEnum.XPATH_NAVIGATION_START_OPTION_START.getValue()+ optionToSelect +DashboardPageEnum.XPATH_NAVIGATION_START_OPTION_END.getValue();
        try{
            waitFactory.waitForElementToBeClickable(hoverLocator);
            hover(hoverLocator);
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+optionToSelect+" Navigation Start Option on Dashboard Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+optionToSelect+" Navigation Start Option on Dashboard Page");
            throw e;
        }
    }

    public void clickYes(){
        String locator = DashboardPageEnum.XPATH_YES_BUTTON.getValue();
        String locatorWait = DashboardPageEnum.XPATH_WAIT.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            try{
                isVisibleAdv(locatorWait);
            }catch (Exception e){

            }
            waitFactory.waitForElementToBeInVisible(locatorWait);
            scenarioDef.log(Status.PASS,"Clicked on Yes Button on Dashboard Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Yes Button on Dashboard Page");
            throw e;
        }
    }

    public void clickClose(){
        String locator = DashboardPageEnum.XPATH_CLOSE_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Clicked on Close Button on Dashboard Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Close Button on Dashboard Page");
            throw e;
        }
    }

    public void clickOk(){
        String locator = DashboardPageEnum.XPATH_OK_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            waitFactory.waitForElementToBeInVisible(locator);
            scenarioDef.log(Status.PASS,"Clicked on OK Button on Dashboard Page");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on OK Button on Dashboard Page");
            throw e;
        }
    }
}
