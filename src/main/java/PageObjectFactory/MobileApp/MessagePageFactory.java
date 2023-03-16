package PageObjectFactory.MobileApp;

import EnumFactory.Android.MessagePageEnumAndroid;
import EnumFactory.IOS.MessagePageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

public class MessagePageFactory extends UtilFactory {


    public MessagePageFactory() throws Exception {
    }

    public void validateMessageMessageScreen(String expectedPlateNumber, String expectedDuration, String expectedToNumber) throws IOException {
        String textMsgLocator,toNumberLocator,actualPlateNumber,actualDuration,actualToNumber,errorMsg=null;
        if (isAndroid()) {
            textMsgLocator = MessagePageEnumAndroid.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumAndroid.XPATH_TO_NUMBER_TEXT.getValue();
        } else {
            textMsgLocator = MessagePageEnumIOS.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumIOS.XPATH_TO_NUMBER_TEXT.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(toNumberLocator);
            actualToNumber = getText(toNumberLocator);
            actualPlateNumber = (getText(textMsgLocator).split(" "))[0];
            actualDuration = (getText(textMsgLocator).split(" "))[2];
            if(actualToNumber.contains(expectedToNumber) && actualDuration.equals(expectedDuration) && actualPlateNumber.equals(expectedPlateNumber)){
                scenarioDef.log(Status.PASS, "Validated Plate Number: "+actualPlateNumber+", Duration: "+actualDuration+" and To Number: "+actualToNumber+" as Expected on Message Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Plate Number: "+expectedPlateNumber+", Duration: "+expectedDuration+" and To Number: "+expectedToNumber+" as Expected on Message Screen, Actual Plate Number:"+actualPlateNumber+", Actual Duration: "+actualDuration+" and Actual To Number: "+actualToNumber;
                throw new NoSuchElementException("Expected and Actual is different");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if(errorMsg!=null){
                scenarioDef.log(Status.FAIL, errorMsg);
            }else{
                scenarioDef.log(Status.FAIL, "Unable to Fetch Message and To Number Elements on Message Screen");
            }
            throw e;
        }
    }

    public void validateMessageScreen(String expectedCityCode, String expectedPlateNumber, String expectedToNumber) throws IOException {
        String textMsgLocator,toNumberLocator,actualPlateNumber,actualCityCode,actualToNumber,errorMsg=null;
        if (isAndroid()) {
            textMsgLocator = MessagePageEnumAndroid.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumAndroid.XPATH_TO_NUMBER_TEXT.getValue();
        } else {
            textMsgLocator = MessagePageEnumIOS.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumIOS.XPATH_TO_NUMBER_TEXT.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(toNumberLocator);
            actualToNumber = getText(toNumberLocator);
            actualPlateNumber = (getText(textMsgLocator).split(" "))[1];
            actualCityCode = (getText(textMsgLocator).split(" "))[0];
            if(actualToNumber.contains(expectedToNumber) && actualPlateNumber.equals(expectedPlateNumber) && actualCityCode.equals(expectedCityCode)){
                scenarioDef.log(Status.PASS, "Validated City Code: "+actualPlateNumber+", Plate Number: "+actualPlateNumber+" and To Number: "+actualToNumber+" as Expected on Message Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate City Code: "+ expectedCityCode +", Plate Number: "+ expectedPlateNumber +" and To Number: "+expectedToNumber+" as Expected on Message Screen, Actual City Code:"+actualCityCode+", Actual Plate Number: "+actualPlateNumber+" and Actual To Number: "+actualToNumber;
                throw new NoSuchElementException("Expected and Actual is different");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if(errorMsg!=null){
                scenarioDef.log(Status.FAIL, errorMsg);
            }else{
                scenarioDef.log(Status.FAIL, "Unable to Fetch Message and To Number Elements on Message Screen");
            }
            throw e;
        }
    }

    public void validateMessageMessageScreen(String expectedPlateNumber,String expectedParkingZone, String expectedDuration, String expectedToNumber) throws IOException {
        String textMsgLocator,toNumberLocator,actualPlateNumber,actualParkingZone,actualDuration,actualToNumber,errorMsg=null;
        if (isAndroid()) {
            textMsgLocator = MessagePageEnumAndroid.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumAndroid.XPATH_TO_NUMBER_TEXT.getValue();
        } else {
            textMsgLocator = MessagePageEnumIOS.XPATH_MSG_FIELD.getValue();
            toNumberLocator = MessagePageEnumIOS.XPATH_TO_NUMBER_TEXT.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(toNumberLocator);
            actualToNumber = getText(toNumberLocator);
            actualPlateNumber = (getText(textMsgLocator).split(" "))[0];
            actualParkingZone = (getText(textMsgLocator).split(" "))[1];
            actualDuration = (getText(textMsgLocator).split(" "))[2];
            if(actualToNumber.contains(expectedToNumber) && actualDuration.equals(expectedDuration) && actualPlateNumber.equals(expectedPlateNumber) && actualParkingZone.equals(expectedParkingZone)){
                scenarioDef.log(Status.PASS, "Validated Plate Number: "+actualPlateNumber+", Parking Zone: "+expectedParkingZone+", Duration: "+actualDuration+" and To Number: "+actualToNumber+" as Expected on Message Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                        UtilFactory.getBase64Screenshot()).build());
            }else{
                errorMsg = "Could not Validate Plate Number: "+expectedPlateNumber+", Parking Zone: "+expectedParkingZone+" Duration: "+expectedDuration+" and To Number: "+expectedToNumber+" as Expected on Message Screen, Actual Plate Number:"+actualPlateNumber+", Actual Parking Zone: "+actualParkingZone+", Actual Duration: "+actualDuration+" and Actual To Number: "+actualToNumber;
                throw new NoSuchElementException("Expected and Actual is different");
            }
        } catch (Exception e) {
            failureException = e.toString();
            if(errorMsg!=null){
                scenarioDef.log(Status.FAIL, errorMsg);
            }else{
                scenarioDef.log(Status.FAIL, "Unable to Fetch Message and To Number Elements on Message Screen");
            }
            throw e;
        }
    }
}
