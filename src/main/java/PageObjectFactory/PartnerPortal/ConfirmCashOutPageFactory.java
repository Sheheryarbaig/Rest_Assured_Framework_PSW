package PageObjectFactory.PartnerPortal;

import EnumFactory.PartnerPortal.ConfirmCashOutPageEnum;
import UtilitiesFactory.UtilFactory;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.NoSuchElementException;

public class ConfirmCashOutPageFactory extends UtilFactory {

    public ConfirmCashOutPageFactory() throws Exception {
    }

    public void validateConfirmCashOutHeadingVisibility(Boolean expectedCondition){
        String locator = ConfirmCashOutPageEnum.XPATH_CONFIRM_CASH_OUT_HEADING.getValue();
        String errorMsg = null;
        Boolean actualCondition;
        try{
            actualCondition = isVisibleAdv(locator);
            if (actualCondition && expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Confirm Cash Out Heading is Displayed as Expected on Confirm Cash Out Page");
            } else if (!actualCondition && !expectedCondition) {
                scenarioDef.log(Status.PASS, "Validated Confirm Cash Out Heading is not Displayed as Expected on Confirm Cash Out Page");
            } else if (actualCondition && !expectedCondition) {
                errorMsg = "Validated Confirm Cash Out Heading is Displayed Unexpectedly on Confirm Cash Out Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            } else if (!actualCondition && expectedCondition) {
                errorMsg = "Validated Confirm Cash Out Heading is not Displayed Unexpectedly on Confirm Cash Out Page";
                throw new NoSuchElementException("Element Visibility was Unexpected for Element: " + locator);
            }
        }catch (Exception e){
            failureException = e.toString();
            scenarioDef.log(Status.FAIL, errorMsg);
            throw e;
        }
    }
}
