package PageObjectFactory.WebShop;

import EnumFactory.PartnerPortal.DashboardPageEnum;
import UtilitiesFactory.ServiceFactory;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonPageFactory extends UtilFactory {

    public static String EnumDirectory = "EnumFactory.WebShop.*";

    public CommonPageFactory() throws Exception {
    }

    //T0 Do Update Screen Name as to Read Properties
    public String removeSpaces(String ScreenName) {
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
                scenarioDef.log(Status.PASS,"Entered: "+textToEnter.replaceAll(textToEnter,"****")+" on "+Locator+" Field on "+ScreenName+" Page.");
            }else{
                Locator = Locator.replace("XPATH","");
                Locator = Locator.replace("_"," ");
                scenarioDef.log(Status.PASS,"Entered: "+textToEnter+" on "+Locator+" Field on "+ScreenName+" Page.");
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Enter: "+textToEnter+" on "+Locator+" Field on "+ScreenName+" Page.");
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
            scenarioDef.log(Status.PASS,"Clicked on "+Locator+" Field on "+ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+Locator+" Field on "+ScreenName+" Page.");
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
            scenarioDef.log(Status.PASS,"Validated: "+textToValidate+" visible as "+Locator+" on "+ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+textToValidate+" visible as "+Locator+" on "+ScreenName+" Page.");
            throw e;
        }
    }

    public void hoverOnButton(String Locator,String ScreenName) throws ClassNotFoundException {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeVisible(locator);
            hover(locator);
            Locator = Locator.replace("XPATH","");
            Locator = Locator.replace("_"," ");
            scenarioDef.log(Status.PASS,Locator + " is visible " + " on "+ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,Locator + " is not visible " + " on "+ScreenName+" Page.");
            throw e;
        }
    }
}
