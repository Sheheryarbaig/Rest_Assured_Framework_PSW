package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.HeaderPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class HeaderPageFactory extends UtilFactory {

    public HeaderPageFactory() throws Exception {
    }

    public void clickLogoutButton(){
        String locator = HeaderPageEnum.XPATH_LOG_OUT_BUTTON.getValue();
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on Log Out Button on Header Bar");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on Log Out Button on Header Bar");
            throw e;
        }
    }
}
