package PageObjectFactory.WebShop;

import EnumFactory.PartnerPortal.DashboardPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Screencast;
import org.junit.Assert;

public class CommonPageFactory extends UtilFactory {

    public static String EnumDirectory = "EnumFactory.WebShop.*";
    public static String PageName;

    public CommonPageFactory() throws Exception {
    }

    //T0 Do Update Screen Name as to Read Properties
    public String removeSpaces(String ScreenName) {
        PageName = ScreenName;
        String propertyFileName = ScreenName.replace(" ","");
        return propertyFileName;
    }
    public void textEnterField(String textToEnter,String Locator,String ScreenName) throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            if(locator.contains("pass")){
                Locator = Locator.replace("XPATH","");
                Locator = Locator.replace("_"," ");
                scenarioDef.log(Status.PASS,"Entered: "+textToEnter.replaceAll(textToEnter,"****")+" on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            }else{
                Locator = Locator.replace("XPATH","");
                Locator = Locator.replace("_"," ");
                scenarioDef.log(Status.PASS,"Entered: "+getLocatorNameforLog(textToEnter)+" on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+getLocatorNameforLog(textToEnter)+" on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }
    public void clickButton(String Locator,String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            Locator = Locator.replace("XPATH","");
            Locator = Locator.replace("_"," ");
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }

    public void validateFieldonScreen(String textToValidate,String Locator,String ScreenName)throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            String actualText = getText(locator);
            Assert.assertEquals(textToValidate,actualText);
            Locator = Locator.replace("XPATH","");
            Locator = Locator.replace("_"," ");
            scenarioDef.log(Status.PASS,"Validated: "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }
}
