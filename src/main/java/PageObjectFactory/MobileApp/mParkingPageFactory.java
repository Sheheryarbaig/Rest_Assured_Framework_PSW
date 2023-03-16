package PageObjectFactory.MobileApp;

import EnumFactory.Android.mParkingPageEnumAndroid;
import EnumFactory.IOS.mParkingPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;

public class mParkingPageFactory extends UtilFactory {


    public mParkingPageFactory() throws Exception {
    }

    public void clickPayParkingButton() {
        String locator;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_PAY_PARKING_BUTTON.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_PAY_PARKING_BUTTON.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on Pay Parking Button on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on Pay Parking Button on mParking Screen");
            throw e;
        }
    }

    public void enterPlateNumber(String textToEnter) {
        String locator;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_PLATE_NUMBER_FIELD.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_PLATE_NUMBER_FIELD.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS, "Entered: " + textToEnter + " on Plate Number Field on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter: " + textToEnter + " on Plate Number Field on mParking Screen");
            throw e;
        }
    }

    public void enterParkingZone(String textToEnter) {
        String locator;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_PARKING_ZONE_FIELD.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_PARKING_ZONE_FIELD.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            enterString(locator,textToEnter);
            hideDoneKeyboardIOS();
            scenarioDef.log(Status.PASS, "Entered: " + textToEnter + " on Parking Zone Field on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Enter: " + textToEnter + " on Parking Zone Field on mParking Screen");
            throw e;
        }
    }

    public void selectLicensePlateSource(String optionToSelect) {
        String locator,locatorVal = null;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_LICENSE_PLATE_SOURCE_FIELD.getValue();
            locatorVal = mParkingPageEnumAndroid.XPATH_LICENSE_PLATE_SOURCE_VALUE_START.getValue()+ optionToSelect + mParkingPageEnumAndroid.XPATH_LICENSE_PLATE_SOURCE_VALUE_END.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_LICENSE_PLATE_SOURCE_FIELD.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            if(isAndroid()){
                scrollToElementMobile(locatorVal);
                click(locatorVal);
            }
            selectDropdownOptionIOS(optionToSelect);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " on License Plate Source on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " on License Plate Source on mParking Screen");
            throw e;
        }
    }

    public void selectDuration(String optionToSelect) {
        String locator;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_DURATION_HOUR_START.getValue()+ optionToSelect + mParkingPageEnumAndroid.XPATH_DURATION_HOUR_END.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_DURATION_HOUR_START.getValue()+ optionToSelect +mParkingPageEnumIOS.XPATH_DURATION_HOUR_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " as Duration Hour on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " as Duration Hour on mParking Screen");
            throw e;
        }
    }

    public void selectCity(String optionToSelect) {
        String locator;
        if (isAndroid()) {
            locator = mParkingPageEnumAndroid.XPATH_CITY_LIST_START.getValue()+ optionToSelect + mParkingPageEnumAndroid.XPATH_CITY_LIST_END.getValue();
        } else {
            locator = mParkingPageEnumIOS.XPATH_CITY_LIST_START.getValue()+ optionToSelect +mParkingPageEnumIOS.XPATH_CITY_LIST_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Selected: " + optionToSelect + " from City List on mParking Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToSelect + " from City List on mParking Screen");
            throw e;
        }
    }
}
