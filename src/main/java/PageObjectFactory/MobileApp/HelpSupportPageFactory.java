package PageObjectFactory.MobileApp;

import EnumFactory.Android.HelpSupportPageEnumAndroid;
import EnumFactory.IOS.HelpSupportPageEnumIOS;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.IOException;

public class HelpSupportPageFactory extends UtilFactory {


    public HelpSupportPageFactory() throws Exception {
    }

    public void clickFAQsOption(String optionToSelect) {
        String locator;
        if (isAndroid()) {
            locator = HelpSupportPageEnumAndroid.XPATH_FAQS_OPTION_START.getValue()+ optionToSelect + HelpSupportPageEnumAndroid.XPATH_FAQS_OPTION_END.getValue();
        } else {
            locator = HelpSupportPageEnumIOS.XPATH_FAQS_OPTION_START.getValue()+ optionToSelect + HelpSupportPageEnumIOS.XPATH_FAQS_OPTION_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            click(locator);
            scenarioDef.log(Status.PASS, "Clicked on FAQs Option: "+optionToSelect+" on Help & Support Screen");
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Click on FAQs Option: "+optionToSelect+" on Help & Support Screen");
            throw e;
        }
    }

    public void validateFAQsHeading(String optionToValidate) throws IOException {
        String locator;
        if (isAndroid()) {
            locator = HelpSupportPageEnumAndroid.XPATH_FAQ_HEADING_START.getValue()+ optionToValidate + HelpSupportPageEnumAndroid.XPATH_FAQ_HEADING_END.getValue();
        } else {
            locator = HelpSupportPageEnumIOS.XPATH_FAQ_HEADING_START.getValue()+ optionToValidate +HelpSupportPageEnumIOS.XPATH_FAQ_HEADING_END.getValue();
        }
        try {
            waitFactory.waitForElementToBeClickable(locator);
            scenarioDef.log(Status.PASS, "Validated: " + optionToValidate + " Heading on Help & Support Screen <br> ",MediaEntityBuilder.createScreenCaptureFromBase64String(
                    UtilFactory.getBase64Screenshot()).build());
        } catch (Exception e) {
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, "Could not Select: " + optionToValidate + " Heading on Help & Support Screen");
            throw e;
        }
    }
}
