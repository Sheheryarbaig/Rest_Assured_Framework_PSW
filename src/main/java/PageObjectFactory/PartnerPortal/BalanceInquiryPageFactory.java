package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.BalanceInquiryPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class BalanceInquiryPageFactory extends UtilFactory {

    public BalanceInquiryPageFactory() throws Exception {
    }

    public void validateBalanceInquiryHeadingVisibility(Boolean expectedCondition){
        String locator = BalanceInquiryPageEnum.XPATH_BALANCE_INQUIRY_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Balance Inquiry Heading is Displayed as Expected on Balance Inquiry Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Balance Inquiry Heading is not Displayed as Expected on Balance Inquiry Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Balance Inquiry Heading is Displayed Unexpectedly on Balance Inquiry Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Balance Inquiry Heading is not Displayed Unexpectedly on Balance Inquiry Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
