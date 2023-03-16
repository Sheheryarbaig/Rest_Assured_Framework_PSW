package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.FundOutPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class FundOutPageFactory extends UtilFactory {

    public FundOutPageFactory() throws Exception {
    }

    public void validateFundOutHeadingVisibility(Boolean expectedCondition){
        String locator = FundOutPageEnum.XPATH_FUND_OUT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Fund Out Heading is Displayed as Expected on Fund Out Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Fund Out Heading is not Displayed as Expected on Fund Out Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Fund Out Heading is Displayed Unexpectedly on Fund Out Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Fund Out Heading is not Displayed Unexpectedly on Fund Out Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
