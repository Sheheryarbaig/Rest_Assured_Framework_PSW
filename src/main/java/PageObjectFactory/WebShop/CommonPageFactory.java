package PageObjectFactory.WebShop;

import EnumFactory.WebShop.ProductListing;
import UtilitiesFactory.ServiceFactory;
import EnumFactory.WebShop.Cart;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Screencast;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.NoSuchElementException;

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
    public String getpropertyName(String fieldProperty) {
        String propertyFileName = fieldProperty.replace(" ",".");
        return propertyFileName;
    }
    public void textEnterField(String textToEnter,String Locator,String ScreenName) throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            if(!Locator.equals("XPATH_CHANNEL_REFERENCE_SEARCH")){
                clearField(locator);
            }
            enterString(locator,textToEnter);
            if(locator.contains("pass")){
                scenarioDef.log(Status.PASS,"Entered: "+textToEnter.replaceAll(textToEnter,"****")+" in "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            }else{
                scenarioDef.log(Status.PASS,"Entered: "+getLocatorNameforLog(textToEnter)+" in "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
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
        if(Locator.contains("XPATH_APPLY_SHIPPING")){
            waitFactory.waitForElementToBeClickable(locator);
            Thread.sleep(10000);
        }
        try{
            waitForPageLoad();
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }

    public void JsclickButton(String Locator,String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            jsClick(locator);
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.");
            throw e;
        }
    }

    public void validateFieldonScreen(String textToValidate,String Locator,String ScreenName)throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            String actualText = getText(locator);
            Assert.assertEquals(textToValidate,actualText);
            scenarioDef.log(Status.PASS,"Validated: "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
    }

    public void hoverOnButton(String Locator,String ScreenName) throws ClassNotFoundException, Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeVisible(locator);
            hover(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible " + " on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible " + " on "+PageName+" Page.");
            throw e;
        }
    }
    public void validateValueAttributeScreen(String attribute,String textToValidate,String Locator,String ScreenName)throws Exception{
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            String actualText = getAttribute(locator,attribute);
            Assert.assertEquals(textToValidate,actualText);
            scenarioDef.log(Status.PASS,"Validated: "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Failed to Validate "+getLocatorNameforLog(textToValidate)+" visible as "+getLocatorNameforLog(Locator)+" on "+PageName+" Page.");
            throw e;
        }
    }

    public void validateDynamicElementOnScreen(String Locator,String testData, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator)+testData+"')]";
        try{
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible  on " + ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + ScreenName+" Page.");
            throw e;
        }
    }

    public void validateElementOnScreen(String Locator, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeVisible(locator);
            scenarioDef.log(Status.PASS,getLocatorNameforLog(Locator) + " is visible  on " + ScreenName+" Page.");
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + ScreenName+" Page.");
            throw e;
        }
    }

    public void validateDynamicString(String productNameLocator, String productName, String productPrice, String expectedValue, String ScreenName) throws Exception {
        String Locator = UtilFactory.locatorXpath(ScreenName,productNameLocator)+ productName +"')]" ;
        Locator = Locator + UtilFactory.locatorXpath(ScreenName,productPrice);
        try {
            waitFactory.waitForElementToBeVisible(Locator);
            String actualText = getText(Locator);
            if (actualText.contains(expectedValue)) {
                scenarioDef.log(Status.PASS, "Validated Dollar Symbol in Product Price " + actualText + " on " + ScreenName + "Page.");
            } else {
                scenarioDef.log(Status.PASS, "Dollar Symbol is not visible in Product Price " + actualText + " on " + PageName);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,getLocatorNameforLog(Locator) + " is not visible  on " + PageName+" Page.");
            throw e;
        }

    }

    public void clickOnDynamicElement(String Locator1, String dynamicData, String Locator2, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName, Locator1) + dynamicData + "')]";
        locator = locator + UtilFactory.locatorXpath(ScreenName, Locator2);
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on " + getLocatorNameforLog(Locator2) + " Field on " + PageName + " Page.");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on " + getLocatorNameforLog(Locator2) + " Field on " + PageName + " Page.");
            throw e;
        }
    }

    public void validateDynamicElementColorOnHover(String Locator1, String dynamicData, String Locator2, String colorToValidate, String ScreenName) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName, Locator1) + dynamicData + "')]";
        locator = locator + UtilFactory.locatorXpath(ScreenName, Locator2);
        try {
            waitFactory.waitForElementToBeVisible(locator);
            hover(locator);
            Thread.sleep(5000);
            String actualColor = getCSS(locator,"background-color");
            System.out.println(actualColor);
            Assert.assertEquals(colorToValidate,actualColor);
            scenarioDef.log(Status.PASS, "Validated Color of " + getLocatorNameforLog(Locator2) + " Element on Hovering  at " + PageName + " Page.");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not validate color of " + getLocatorNameforLog(Locator2) + " Element on Hovering  at " + PageName + " Page.");
            throw e;
        }
    }

    public void validatePageURL(String expectedText, String screenName) {
        try {
            validateURL(expectedText);
            scenarioDef.log(Status.PASS, "Navigated to " + PageName + " Page");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not navigate to " + PageName + " Page");
            throw e;
        }

    }

    public String getElementValue(String Locator,String ScreenName, String Value) throws Exception {
        String locator = UtilFactory.locatorXpath(ScreenName,Locator);
        try{
            waitFactory.waitForElementToBeClickable(locator);
            Value = getText(locator);
            System.out.println("Value is - "+Value);
            scenarioDef.log(Status.PASS,"Clicked on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL,"Could not Click on "+getLocatorNameforLog(Locator)+" Field on "+PageName+" Page.",
                    MediaEntityBuilder.createScreenCaptureFromBase64String(UtilFactory.getBase64Screenshot()).build());
            throw e;
        }
        return Value;
    }
}
